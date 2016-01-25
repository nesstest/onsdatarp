package gov.ons.ness.datarp.session.population;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gov.ons.ness.datarp.data.DataTableRequest;
import gov.ons.ness.datarp.entity.Population;
import gov.ons.ness.datarp.session.AbstractFacade;

@Stateless
public class PopulationFacade extends AbstractFacade<Population>
{
	@PersistenceContext(unitName = "NessDataRpEJB")
	private EntityManager em;

	private Logger logger = Logger
			.getLogger(PopulationFacade.class.getSimpleName());

	public PopulationFacade()
	{
		super(Population.class);
	}

	@Override
	protected EntityManager getEntityManager()
	{
		return em;
	}

	@Override
	public List<Population> find(DataTableRequest request)
	{
		logger.log(Level.INFO, "find: DataTableRequest = " + request);

		@SuppressWarnings("unchecked")
		List<Population> response = (List<Population>) getEntityManager()
			.createNamedQuery("Population.find").setParameter("ids", request.getAreas())
			.getResultList();

		return response;
	}
}
