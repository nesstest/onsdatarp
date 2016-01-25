package gov.ons.ness.datarp.data;

import java.util.List;

public class DataTableRequest
{

	public String table;

	public List<String> areas;

	public DataTableRequest()
	{
		super();
	}

	public DataTableRequest(String table, List<String> areas)
	{
		super();
		this.table = table;
		this.areas = areas;
	}

	public List<String> getAreas()
	{
		return areas;
	}

	public void setAreas(List<String> areas)
	{
		this.areas = areas;
	}

	public String getTable()
	{
		return table;
	}

	public void setTable(String table)
	{
		this.table = table;
	}

	@Override
	public String toString()
	{
		return "DataTableRequest [table=" + table + ", areas=" + areas + "]";
	}
}
