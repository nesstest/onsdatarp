package gov.ons.ness.datarp.data;

import java.util.List;

public class UserDefinedTableRequest
{
	public String table;
	
	private String areaCode;
	
	private List<DataItem> dataItems;

	public UserDefinedTableRequest()
	{
		super();
	}

	public UserDefinedTableRequest(String table, String areaCode,
			List<DataItem> dataItems)
	{
		super();
		this.table = table;
		this.areaCode = areaCode;
		this.dataItems = dataItems;
	}

	public String getAreaCode()
	{
		return areaCode;
	}

	public void setAreaCode(String areaCode)
	{
		this.areaCode = areaCode;
	}

	public List<DataItem> getDataItems()
	{
		return dataItems;
	}

	public void setDataItems(List<DataItem> dataItems)
	{
		this.dataItems = dataItems;
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
		return "UserDefinedTableRequest [table=" + table + ", areaCode="
			+ areaCode + ", dataItems=" + dataItems + "]";
	}
}
