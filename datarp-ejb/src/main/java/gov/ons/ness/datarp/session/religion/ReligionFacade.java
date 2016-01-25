package gov.ons.ness.datarp.session.religion;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gov.ons.ness.datarp.data.DataTableRequest;
import gov.ons.ness.datarp.entity.Religion;
import gov.ons.ness.datarp.session.AbstractFacade;

@Stateless
public class ReligionFacade extends AbstractFacade<Religion>
{
	@PersistenceContext(unitName = "NessDataRpEJB")
	private EntityManager em;

	private Logger logger = Logger
			.getLogger(ReligionFacade.class.getSimpleName());

	public ReligionFacade()
	{
		super(Religion.class);
	}

	@Override
	protected EntityManager getEntityManager()
	{
		return em;
	}

	@Override
	public List<Religion> find(DataTableRequest request)
	{
		logger.log(Level.INFO, "find: DataTableRequest = " + request);

		@SuppressWarnings("unchecked")
		List<Religion> response = (List<Religion>) getEntityManager()
			.createNamedQuery("Religion.find")
			.setParameter("ids", request.getAreas()).getResultList();

		return response;
	}
}