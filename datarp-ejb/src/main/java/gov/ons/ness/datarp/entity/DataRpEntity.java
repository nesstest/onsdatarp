package gov.ons.ness.datarp.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class DataRpEntity
{
	@Id
	private int id;
	
	private String geographic_Area;

	private String geographic_ID;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getGeographic_Area()
	{
		return geographic_Area;
	}

	public void setGeographic_Area(String geographic_Area)
	{
		this.geographic_Area = geographic_Area;
	}

	public String getGeographic_ID()
	{
		return geographic_ID;
	}

	public void setGeographic_ID(String geographic_ID)
	{
		this.geographic_ID = geographic_ID;
	}
}
