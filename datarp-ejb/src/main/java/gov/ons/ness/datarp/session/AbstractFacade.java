package gov.ons.ness.datarp.session;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.persistence.EntityManager;

import gov.ons.ness.datarp.data.DataItem;
import gov.ons.ness.datarp.data.DataTableRequest;
import gov.ons.ness.datarp.data.UserDefinedTableRequest;

public abstract class AbstractFacade<T>
{
	private Class<T> entityClass;

	public AbstractFacade(Class<T> entityClass)
	{
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	public void create(T entity)
	{
		getEntityManager().persist(entity);
		getEntityManager().getEntityManagerFactory().getCache().evictAll();
	}

	public void edit(T entity)
	{
		getEntityManager().merge(entity);
	}

	public void remove(T entity)
	{
		getEntityManager().remove(getEntityManager().merge(entity));
		getEntityManager().getEntityManagerFactory().getCache().evictAll();
	}

	public T find(Object id)
	{
		return getEntityManager().find(entityClass, id);
	}

	public List<T> findAll()
	{
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager()
			.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return getEntityManager().createQuery(cq).getResultList();
	}

	public List<T> findRange(int[] range)
	{
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager()
			.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		javax.persistence.Query q = getEntityManager().createQuery(cq);
		q.setMaxResults(range[1] - range[0]);
		q.setFirstResult(range[0]);
		return q.getResultList();
	}

	public int count()
	{
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager()
			.getCriteriaBuilder().createQuery();
		javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
		cq.select(getEntityManager().getCriteriaBuilder().count(rt));
		javax.persistence.Query q = getEntityManager().createQuery(cq);
		return ((Long) q.getSingleResult()).intValue();
	}

	public abstract List<T> find(DataTableRequest request);

	public JsonObject find(UserDefinedTableRequest udtr)
	{
		Map<String, Integer> results = new HashMap<String, Integer>();

		for (DataItem di : udtr.getDataItems())
		{
			Integer result = ((Number) getEntityManager()
				.createNativeQuery(
						createQuery(udtr.getTable(), udtr.getAreaCode(), di))
				.getSingleResult()).intValue();

			results.put(di.getUserDefinedCol(), result);
		}

		return buildOutput(results, udtr.getAreaCode());
	}

	public String createQuery(String table, String areaCode, DataItem di)
	{
		StringBuilder sb = new StringBuilder();

		sb.append("SELECT ");

		for (String c : di.getColumns())
		{
			sb.append(c).append(" + ");
		}

		sb.delete(sb.length() - 2, sb.length());

		sb.append("AS '").append(di.getUserDefinedCol()).append("' ")
			.append("FROM ").append(table).append(" WHERE Geographic_ID = '")
			.append(areaCode).append("'");

		return sb.toString();
	}

	public JsonObject buildOutput(Map<String, Integer> input,
			String areaCode)
	{		
		JsonObjectBuilder objBuilder = Json.createObjectBuilder();

		for (String s : input.keySet())
		{			
			objBuilder.add(s, input.get(s));
		}
		
		JsonObject output = Json.createObjectBuilder().add("areaCode", areaCode)
				.add("results", objBuilder.build()).build();

		return output;
	}
}
