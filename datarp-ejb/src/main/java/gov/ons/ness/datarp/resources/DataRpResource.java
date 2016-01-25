package gov.ons.ness.datarp.resources;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import gov.ons.ness.datarp.data.DataTableRequest;
import gov.ons.ness.datarp.data.UserDefinedTableRequest;
import gov.ons.ness.datarp.entity.DataRpEntity;
import gov.ons.ness.datarp.session.population.PopulationFacade;
import gov.ons.ness.datarp.session.religion.ReligionFacade;

@Path("nessdatarp")
public class DataRpResource
{
	@Inject
	private PopulationFacade populationFacade;

	@Inject
	private ReligionFacade religionFacade;

	private Logger logger = Logger
			.getLogger(DataRpResource.class.getSimpleName());

	@POST
	@Path("/getdatatable")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getDataTable(DataTableRequest dtr)
	{
		logger.log(Level.INFO, "getDataTable: " + dtr.toString());
		
		List<? extends DataRpEntity> results = null;

		if (dtr.getTable().equals("population"))
		{
			results = populationFacade.find(dtr);
		}
		else if (dtr.getTable().equals("religion"))
		{
			results = religionFacade.find(dtr);
		}

		return Response.status(Response.Status.OK).entity(results).build();
	}

	@POST
	@Path("/getuserdefinedtable")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUserDefinedTable(UserDefinedTableRequest udt)
	{
		logger.log(Level.INFO, "getDataTable: " + udt.toString());
		
		JsonObject result = null;

		if (udt.getTable().equals("population"))
		{
			result = populationFacade.find(udt);
		}
		else if (udt.getTable().equals("religion"))
		{
			result = religionFacade.find(udt);
		}

		return Response.status(Response.Status.OK).entity(result).build();
	}
}
