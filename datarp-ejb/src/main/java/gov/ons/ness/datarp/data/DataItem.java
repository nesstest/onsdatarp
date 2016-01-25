package gov.ons.ness.datarp.data;

import java.util.List;

public class DataItem
{
	private String userDefinedCol;

	private List<String> columns;

	public DataItem()
	{
		super();
	}

	public DataItem(String userDefinedCol, List<String> columns)
	{
		super();
		this.userDefinedCol = userDefinedCol;
		this.columns = columns;
	}

	public String getUserDefinedCol()
	{
		return userDefinedCol;
	}

	public void setUserDefinedCol(String userDefinedCol)
	{
		this.userDefinedCol = userDefinedCol;
	}

	public List<String> getColumns()
	{
		return columns;
	}

	public void setColumns(List<String> columns)
	{
		this.columns = columns;
	}

	@Override
	public String toString()
	{
		return "DataItem [userDefinedCol=" + userDefinedCol + ", columns="
			+ columns + "]";
	}
}
