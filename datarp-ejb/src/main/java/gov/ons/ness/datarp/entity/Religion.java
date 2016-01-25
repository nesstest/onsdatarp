package gov.ons.ness.datarp.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the religion database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "Religion.findAll", query = "SELECT r FROM Religion r"),
		@NamedQuery(name = "Religion.find", query = "SELECT r FROM Religion r WHERE r.geographic_ID IN (:ids)") })
public class Religion extends DataRpEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int females_Age_0_to_15_Buddhist;

	private int females_Age_0_to_15_Christian;

	private int females_Age_0_to_15_Hindu;

	private int females_Age_0_to_15_Jewish;

	private int females_Age_0_to_15_Muslim;

	private int females_Age_0_to_15_No_rel;

	private int females_Age_0_to_15_Other_rel;

	private int females_Age_0_to_15_rel_not_stated;

	private int females_Age_0_to_15_Sikh;

	private int females_Age_0_to_15_T_All_cat_rel;

	private int females_Age_16_to_24_Buddhist;

	private int females_Age_16_to_24_Christian;

	private int females_Age_16_to_24_Hindu;

	private int females_Age_16_to_24_Jewish;

	private int females_Age_16_to_24_Muslim;

	private int females_Age_16_to_24_No_rel;

	private int females_Age_16_to_24_Other_rel;

	private int females_Age_16_to_24_rel_not_stated;

	private int females_Age_16_to_24_Sikh;

	private int females_Age_16_to_24_T_All_cat_rel;

	private int females_Age_25_to_34_Buddhist;

	private int females_Age_25_to_34_Christian;

	private int females_Age_25_to_34_Hindu;

	private int females_Age_25_to_34_Jewish;

	private int females_Age_25_to_34_Muslim;

	private int females_Age_25_to_34_No_rel;

	private int females_Age_25_to_34_Other_rel;

	private int females_Age_25_to_34_rel_not_stated;

	private int females_Age_25_to_34_Sikh;

	private int females_Age_25_to_34_T_All_cat_rel;

	private int females_Age_35_to_49_Buddhist;

	private int females_Age_35_to_49_Christian;

	private int females_Age_35_to_49_Hindu;

	private int females_Age_35_to_49_Jewish;

	private int females_Age_35_to_49_Muslim;

	private int females_Age_35_to_49_No_rel;

	private int females_Age_35_to_49_Other_rel;

	private int females_Age_35_to_49_rel_not_stated;

	private int females_Age_35_to_49_Sikh;

	private int females_Age_35_to_49_T_All_cat_rel;

	private int females_Age_50_to_64_Buddhist;

	private int females_Age_50_to_64_Christian;

	private int females_Age_50_to_64_Hindu;

	private int females_Age_50_to_64_Jewish;

	private int females_Age_50_to_64_Muslim;

	private int females_Age_50_to_64_No_rel;

	private int females_Age_50_to_64_Other_rel;

	private int females_Age_50_to_64_rel_not_stated;

	private int females_Age_50_to_64_Sikh;

	private int females_Age_50_to_64_T_All_cat_rel;

	private int females_Age_65_to_74_Buddhist;

	private int females_Age_65_to_74_Christian;

	private int females_Age_65_to_74_Hindu;

	private int females_Age_65_to_74_Jewish;

	private int females_Age_65_to_74_Muslim;

	private int females_Age_65_to_74_No_rel;

	private int females_Age_65_to_74_Other_rel;

	private int females_Age_65_to_74_rel_not_stated;

	private int females_Age_65_to_74_Sikh;

	private int females_Age_65_to_74_T_All_cat_rel;

	private int females_Age_75_and_over_Buddhist;

	private int females_Age_75_and_over_Christian;

	private int females_Age_75_and_over_Hindu;

	private int females_Age_75_and_over_Jewish;

	private int females_Age_75_and_over_Muslim;

	private int females_Age_75_and_over_No_rel;

	private int females_Age_75_and_over_Other_rel;

	private int females_Age_75_and_over_rel_not_stated;

	private int females_Age_75_and_over_Sikh;

	private int females_Age_75_and_over_T_All_cat_rel;

	private int females_T_All_cat_Age_Buddhist;

	private int females_T_All_cat_Age_Christian;

	private int females_T_All_cat_Age_Hindu;

	private int females_T_All_cat_Age_Jewish;

	private int females_T_All_cat_Age_Muslim;

	private int females_T_All_cat_Age_No_rel;

	private int females_T_All_cat_Age_Other_rel;

	private int females_T_All_cat_Age_rel_not_stated;

	private int females_T_All_cat_Age_Sikh;

	private int females_T_All_cat_Age_T_All_cat_rel;

	private int males_Age_0_to_15_Buddhist;

	private int males_Age_0_to_15_Christian;

	private int males_Age_0_to_15_Hindu;

	private int males_Age_0_to_15_Jewish;

	private int males_Age_0_to_15_Muslim;

	private int males_Age_0_to_15_No_rel;

	private int males_Age_0_to_15_Other_rel;

	private int males_Age_0_to_15_rel_not_stated;

	private int males_Age_0_to_15_Sikh;

	private int males_Age_0_to_15_T_All_cat_rel;

	private int males_Age_16_to_24_Buddhist;

	private int males_Age_16_to_24_Christian;

	private int males_Age_16_to_24_Hindu;

	private int males_Age_16_to_24_Jewish;

	private int males_Age_16_to_24_Muslim;

	private int males_Age_16_to_24_No_rel;

	private int males_Age_16_to_24_Other_rel;

	private int males_Age_16_to_24_rel_not_stated;

	private int males_Age_16_to_24_Sikh;

	private int males_Age_16_to_24_T_All_cat_rel;

	private int males_Age_25_to_34_Buddhist;

	private int males_Age_25_to_34_Christian;

	private int males_Age_25_to_34_Hindu;

	private int males_Age_25_to_34_Jewish;

	private int males_Age_25_to_34_Muslim;

	private int males_Age_25_to_34_No_rel;

	private int males_Age_25_to_34_Other_rel;

	private int males_Age_25_to_34_rel_not_stated;

	private int males_Age_25_to_34_Sikh;

	private int males_Age_25_to_34_T_All_cat_rel;

	private int males_Age_35_to_49_Buddhist;

	private int males_Age_35_to_49_Christian;

	private int males_Age_35_to_49_Hindu;

	private int males_Age_35_to_49_Jewish;

	private int males_Age_35_to_49_Muslim;

	private int males_Age_35_to_49_No_rel;

	private int males_Age_35_to_49_Other_rel;

	private int males_Age_35_to_49_rel_not_stated;

	private int males_Age_35_to_49_Sikh;

	private int males_Age_35_to_49_T_All_cat_rel;

	private int males_Age_50_to_64_Buddhist;

	private int males_Age_50_to_64_Christian;

	private int males_Age_50_to_64_Hindu;

	private int males_Age_50_to_64_Jewish;

	private int males_Age_50_to_64_Muslim;

	private int males_Age_50_to_64_No_rel;

	private int males_Age_50_to_64_Other_rel;

	private int males_Age_50_to_64_rel_not_stated;

	private int males_Age_50_to_64_Sikh;

	private int males_Age_50_to_64_T_All_cat_rel;

	private int males_Age_65_to_74_Buddhist;

	private int males_Age_65_to_74_Christian;

	private int males_Age_65_to_74_Hindu;

	private int males_Age_65_to_74_Jewish;

	private int males_Age_65_to_74_Muslim;

	private int males_Age_65_to_74_No_rel;

	private int males_Age_65_to_74_Other_rel;

	private int males_Age_65_to_74_rel_not_stated;

	private int males_Age_65_to_74_Sikh;

	private int males_Age_65_to_74_T_All_cat_rel;

	private int males_Age_75_and_over_Buddhist;

	private int males_Age_75_and_over_Christian;

	private int males_Age_75_and_over_Hindu;

	private int males_Age_75_and_over_Jewish;

	private int males_Age_75_and_over_Muslim;

	private int males_Age_75_and_over_No_rel;

	private int males_Age_75_and_over_Other_rel;

	private int males_Age_75_and_over_rel_not_stated;

	private int males_Age_75_and_over_Sikh;

	private int males_Age_75_and_over_T_All_cat_rel;

	private int males_T_All_cat_Age_Buddhist;

	private int males_T_All_cat_Age_Christian;

	private int males_T_All_cat_Age_Hindu;

	private int males_T_All_cat_Age_Jewish;

	private int males_T_All_cat_Age_Muslim;

	private int males_T_All_cat_Age_No_rel;

	private int males_T_All_cat_Age_Other_rel;

	private int males_T_All_cat_Age_rel_not_stated;

	private int males_T_All_cat_Age_Sikh;

	private int males_T_All_cat_Age_T_All_cat_rel;

	private int t_All_cat_Sex_Age_0_to_15_Buddhist;

	private int t_All_cat_Sex_Age_0_to_15_Christian;

	private int t_All_cat_Sex_Age_0_to_15_Hindu;

	private int t_All_cat_Sex_Age_0_to_15_Jewish;

	private int t_All_cat_Sex_Age_0_to_15_Muslim;

	private int t_All_cat_Sex_Age_0_to_15_No_rel;

	private int t_All_cat_Sex_Age_0_to_15_Other_rel;

	private int t_All_cat_Sex_Age_0_to_15_rel_not_stated;

	private int t_All_cat_Sex_Age_0_to_15_Sikh;

	private int t_All_cat_Sex_Age_0_to_15_T_All_cat_rel;

	private int t_All_cat_Sex_Age_16_to_24_Buddhist;

	private int t_All_cat_Sex_Age_16_to_24_Christian;

	private int t_All_cat_Sex_Age_16_to_24_Hindu;

	private int t_All_cat_Sex_Age_16_to_24_Jewish;

	private int t_All_cat_Sex_Age_16_to_24_Muslim;

	private int t_All_cat_Sex_Age_16_to_24_No_rel;

	private int t_All_cat_Sex_Age_16_to_24_Other_rel;

	private int t_All_cat_Sex_Age_16_to_24_rel_not_stated;

	private int t_All_cat_Sex_Age_16_to_24_Sikh;

	private int t_All_cat_Sex_Age_16_to_24_T_All_cat_rel;

	private int t_All_cat_Sex_Age_25_to_34_Buddhist;

	private int t_All_cat_Sex_Age_25_to_34_Christian;

	private int t_All_cat_Sex_Age_25_to_34_Hindu;

	private int t_All_cat_Sex_Age_25_to_34_Jewish;

	private int t_All_cat_Sex_Age_25_to_34_Muslim;

	private int t_All_cat_Sex_Age_25_to_34_No_rel;

	private int t_All_cat_Sex_Age_25_to_34_Other_rel;

	private int t_All_cat_Sex_Age_25_to_34_rel_not_stated;

	private int t_All_cat_Sex_Age_25_to_34_Sikh;

	private int t_All_cat_Sex_Age_25_to_34_T_All_cat_rel;

	private int t_All_cat_Sex_Age_35_to_49_Buddhist;

	private int t_All_cat_Sex_Age_35_to_49_Christian;

	private int t_All_cat_Sex_Age_35_to_49_Hindu;

	private int t_All_cat_Sex_Age_35_to_49_Jewish;

	private int t_All_cat_Sex_Age_35_to_49_Muslim;

	private int t_All_cat_Sex_Age_35_to_49_No_rel;

	private int t_All_cat_Sex_Age_35_to_49_Other_rel;

	private int t_All_cat_Sex_Age_35_to_49_rel_not_stated;

	private int t_All_cat_Sex_Age_35_to_49_Sikh;

	private int t_All_cat_Sex_Age_35_to_49_T_All_cat_rel;

	private int t_All_cat_Sex_Age_50_to_64_Buddhist;

	private int t_All_cat_Sex_Age_50_to_64_Christian;

	private int t_All_cat_Sex_Age_50_to_64_Hindu;

	private int t_All_cat_Sex_Age_50_to_64_Jewish;

	private int t_All_cat_Sex_Age_50_to_64_Muslim;

	private int t_All_cat_Sex_Age_50_to_64_No_rel;

	private int t_All_cat_Sex_Age_50_to_64_Other_rel;

	private int t_All_cat_Sex_Age_50_to_64_rel_not_stated;

	private int t_All_cat_Sex_Age_50_to_64_Sikh;

	private int t_All_cat_Sex_Age_50_to_64_T_All_cat_rel;

	private int t_All_cat_Sex_Age_65_to_74_Buddhist;

	private int t_All_cat_Sex_Age_65_to_74_Christian;

	private int t_All_cat_Sex_Age_65_to_74_Hindu;

	private int t_All_cat_Sex_Age_65_to_74_Jewish;

	private int t_All_cat_Sex_Age_65_to_74_Muslim;

	private int t_All_cat_Sex_Age_65_to_74_No_rel;

	private int t_All_cat_Sex_Age_65_to_74_Other_rel;

	private int t_All_cat_Sex_Age_65_to_74_rel_not_stated;

	private int t_All_cat_Sex_Age_65_to_74_Sikh;

	private int t_All_cat_Sex_Age_65_to_74_T_All_cat_rel;

	private int t_All_cat_Sex_Age_75_and_over_Buddhist;

	private int t_All_cat_Sex_Age_75_and_over_Christian;

	private int t_All_cat_Sex_Age_75_and_over_Hindu;

	private int t_All_cat_Sex_Age_75_and_over_Jewish;

	private int t_All_cat_Sex_Age_75_and_over_Muslim;

	private int t_All_cat_Sex_Age_75_and_over_No_rel;

	private int t_All_cat_Sex_Age_75_and_over_Other_rel;

	private int t_All_cat_Sex_Age_75_and_over_rel_not_stated;

	private int t_All_cat_Sex_Age_75_and_over_Sikh;

	private int t_All_cat_Sex_Age_75_and_over_T_All_cat_rel;

	private int t_All_cat_Sex_T_All_cat_Age_Buddhist;

	private int t_All_cat_Sex_T_All_cat_Age_Christian;

	private int t_All_cat_Sex_T_All_cat_Age_Hindu;

	private int t_All_cat_Sex_T_All_cat_Age_Jewish;

	private int t_All_cat_Sex_T_All_cat_Age_Muslim;

	private int t_All_cat_Sex_T_All_cat_Age_No_rel;

	private int t_All_cat_Sex_T_All_cat_Age_Other_rel;

	private int t_All_cat_Sex_T_All_cat_Age_rel_not_stated;

	private int t_All_cat_Sex_T_All_cat_Age_Sikh;

	private int t_All_cat_Sex_T_All_cat_Age_T_All_cat_rel;

	public Religion()
	{
	}

	public int getFemales_Age_0_to_15_Buddhist()
	{
		return this.females_Age_0_to_15_Buddhist;
	}

	public void setFemales_Age_0_to_15_Buddhist(
			int females_Age_0_to_15_Buddhist)
	{
		this.females_Age_0_to_15_Buddhist = females_Age_0_to_15_Buddhist;
	}

	public int getFemales_Age_0_to_15_Christian()
	{
		return this.females_Age_0_to_15_Christian;
	}

	public void setFemales_Age_0_to_15_Christian(
			int females_Age_0_to_15_Christian)
	{
		this.females_Age_0_to_15_Christian = females_Age_0_to_15_Christian;
	}

	public int getFemales_Age_0_to_15_Hindu()
	{
		return this.females_Age_0_to_15_Hindu;
	}

	public void setFemales_Age_0_to_15_Hindu(int females_Age_0_to_15_Hindu)
	{
		this.females_Age_0_to_15_Hindu = females_Age_0_to_15_Hindu;
	}

	public int getFemales_Age_0_to_15_Jewish()
	{
		return this.females_Age_0_to_15_Jewish;
	}

	public void setFemales_Age_0_to_15_Jewish(int females_Age_0_to_15_Jewish)
	{
		this.females_Age_0_to_15_Jewish = females_Age_0_to_15_Jewish;
	}

	public int getFemales_Age_0_to_15_Muslim()
	{
		return this.females_Age_0_to_15_Muslim;
	}

	public void setFemales_Age_0_to_15_Muslim(int females_Age_0_to_15_Muslim)
	{
		this.females_Age_0_to_15_Muslim = females_Age_0_to_15_Muslim;
	}

	public int getFemales_Age_0_to_15_No_rel()
	{
		return this.females_Age_0_to_15_No_rel;
	}

	public void setFemales_Age_0_to_15_No_rel(int females_Age_0_to_15_No_rel)
	{
		this.females_Age_0_to_15_No_rel = females_Age_0_to_15_No_rel;
	}

	public int getFemales_Age_0_to_15_Other_rel()
	{
		return this.females_Age_0_to_15_Other_rel;
	}

	public void setFemales_Age_0_to_15_Other_rel(
			int females_Age_0_to_15_Other_rel)
	{
		this.females_Age_0_to_15_Other_rel = females_Age_0_to_15_Other_rel;
	}

	public int getFemales_Age_0_to_15_rel_not_stated()
	{
		return this.females_Age_0_to_15_rel_not_stated;
	}

	public void setFemales_Age_0_to_15_rel_not_stated(
			int females_Age_0_to_15_rel_not_stated)
	{
		this.females_Age_0_to_15_rel_not_stated = females_Age_0_to_15_rel_not_stated;
	}

	public int getFemales_Age_0_to_15_Sikh()
	{
		return this.females_Age_0_to_15_Sikh;
	}

	public void setFemales_Age_0_to_15_Sikh(int females_Age_0_to_15_Sikh)
	{
		this.females_Age_0_to_15_Sikh = females_Age_0_to_15_Sikh;
	}

	public int getFemales_Age_0_to_15_T_All_cat_rel()
	{
		return this.females_Age_0_to_15_T_All_cat_rel;
	}

	public void setFemales_Age_0_to_15_T_All_cat_rel(
			int females_Age_0_to_15_T_All_cat_rel)
	{
		this.females_Age_0_to_15_T_All_cat_rel = females_Age_0_to_15_T_All_cat_rel;
	}

	public int getFemales_Age_16_to_24_Buddhist()
	{
		return this.females_Age_16_to_24_Buddhist;
	}

	public void setFemales_Age_16_to_24_Buddhist(
			int females_Age_16_to_24_Buddhist)
	{
		this.females_Age_16_to_24_Buddhist = females_Age_16_to_24_Buddhist;
	}

	public int getFemales_Age_16_to_24_Christian()
	{
		return this.females_Age_16_to_24_Christian;
	}

	public void setFemales_Age_16_to_24_Christian(
			int females_Age_16_to_24_Christian)
	{
		this.females_Age_16_to_24_Christian = females_Age_16_to_24_Christian;
	}

	public int getFemales_Age_16_to_24_Hindu()
	{
		return this.females_Age_16_to_24_Hindu;
	}

	public void setFemales_Age_16_to_24_Hindu(int females_Age_16_to_24_Hindu)
	{
		this.females_Age_16_to_24_Hindu = females_Age_16_to_24_Hindu;
	}

	public int getFemales_Age_16_to_24_Jewish()
	{
		return this.females_Age_16_to_24_Jewish;
	}

	public void setFemales_Age_16_to_24_Jewish(int females_Age_16_to_24_Jewish)
	{
		this.females_Age_16_to_24_Jewish = females_Age_16_to_24_Jewish;
	}

	public int getFemales_Age_16_to_24_Muslim()
	{
		return this.females_Age_16_to_24_Muslim;
	}

	public void setFemales_Age_16_to_24_Muslim(int females_Age_16_to_24_Muslim)
	{
		this.females_Age_16_to_24_Muslim = females_Age_16_to_24_Muslim;
	}

	public int getFemales_Age_16_to_24_No_rel()
	{
		return this.females_Age_16_to_24_No_rel;
	}

	public void setFemales_Age_16_to_24_No_rel(int females_Age_16_to_24_No_rel)
	{
		this.females_Age_16_to_24_No_rel = females_Age_16_to_24_No_rel;
	}

	public int getFemales_Age_16_to_24_Other_rel()
	{
		return this.females_Age_16_to_24_Other_rel;
	}

	public void setFemales_Age_16_to_24_Other_rel(
			int females_Age_16_to_24_Other_rel)
	{
		this.females_Age_16_to_24_Other_rel = females_Age_16_to_24_Other_rel;
	}

	public int getFemales_Age_16_to_24_rel_not_stated()
	{
		return this.females_Age_16_to_24_rel_not_stated;
	}

	public void setFemales_Age_16_to_24_rel_not_stated(
			int females_Age_16_to_24_rel_not_stated)
	{
		this.females_Age_16_to_24_rel_not_stated = females_Age_16_to_24_rel_not_stated;
	}

	public int getFemales_Age_16_to_24_Sikh()
	{
		return this.females_Age_16_to_24_Sikh;
	}

	public void setFemales_Age_16_to_24_Sikh(int females_Age_16_to_24_Sikh)
	{
		this.females_Age_16_to_24_Sikh = females_Age_16_to_24_Sikh;
	}

	public int getFemales_Age_16_to_24_T_All_cat_rel()
	{
		return this.females_Age_16_to_24_T_All_cat_rel;
	}

	public void setFemales_Age_16_to_24_T_All_cat_rel(
			int females_Age_16_to_24_T_All_cat_rel)
	{
		this.females_Age_16_to_24_T_All_cat_rel = females_Age_16_to_24_T_All_cat_rel;
	}

	public int getFemales_Age_25_to_34_Buddhist()
	{
		return this.females_Age_25_to_34_Buddhist;
	}

	public void setFemales_Age_25_to_34_Buddhist(
			int females_Age_25_to_34_Buddhist)
	{
		this.females_Age_25_to_34_Buddhist = females_Age_25_to_34_Buddhist;
	}

	public int getFemales_Age_25_to_34_Christian()
	{
		return this.females_Age_25_to_34_Christian;
	}

	public void setFemales_Age_25_to_34_Christian(
			int females_Age_25_to_34_Christian)
	{
		this.females_Age_25_to_34_Christian = females_Age_25_to_34_Christian;
	}

	public int getFemales_Age_25_to_34_Hindu()
	{
		return this.females_Age_25_to_34_Hindu;
	}

	public void setFemales_Age_25_to_34_Hindu(int females_Age_25_to_34_Hindu)
	{
		this.females_Age_25_to_34_Hindu = females_Age_25_to_34_Hindu;
	}

	public int getFemales_Age_25_to_34_Jewish()
	{
		return this.females_Age_25_to_34_Jewish;
	}

	public void setFemales_Age_25_to_34_Jewish(int females_Age_25_to_34_Jewish)
	{
		this.females_Age_25_to_34_Jewish = females_Age_25_to_34_Jewish;
	}

	public int getFemales_Age_25_to_34_Muslim()
	{
		return this.females_Age_25_to_34_Muslim;
	}

	public void setFemales_Age_25_to_34_Muslim(int females_Age_25_to_34_Muslim)
	{
		this.females_Age_25_to_34_Muslim = females_Age_25_to_34_Muslim;
	}

	public int getFemales_Age_25_to_34_No_rel()
	{
		return this.females_Age_25_to_34_No_rel;
	}

	public void setFemales_Age_25_to_34_No_rel(int females_Age_25_to_34_No_rel)
	{
		this.females_Age_25_to_34_No_rel = females_Age_25_to_34_No_rel;
	}

	public int getFemales_Age_25_to_34_Other_rel()
	{
		return this.females_Age_25_to_34_Other_rel;
	}

	public void setFemales_Age_25_to_34_Other_rel(
			int females_Age_25_to_34_Other_rel)
	{
		this.females_Age_25_to_34_Other_rel = females_Age_25_to_34_Other_rel;
	}

	public int getFemales_Age_25_to_34_rel_not_stated()
	{
		return this.females_Age_25_to_34_rel_not_stated;
	}

	public void setFemales_Age_25_to_34_rel_not_stated(
			int females_Age_25_to_34_rel_not_stated)
	{
		this.females_Age_25_to_34_rel_not_stated = females_Age_25_to_34_rel_not_stated;
	}

	public int getFemales_Age_25_to_34_Sikh()
	{
		return this.females_Age_25_to_34_Sikh;
	}

	public void setFemales_Age_25_to_34_Sikh(int females_Age_25_to_34_Sikh)
	{
		this.females_Age_25_to_34_Sikh = females_Age_25_to_34_Sikh;
	}

	public int getFemales_Age_25_to_34_T_All_cat_rel()
	{
		return this.females_Age_25_to_34_T_All_cat_rel;
	}

	public void setFemales_Age_25_to_34_T_All_cat_rel(
			int females_Age_25_to_34_T_All_cat_rel)
	{
		this.females_Age_25_to_34_T_All_cat_rel = females_Age_25_to_34_T_All_cat_rel;
	}

	public int getFemales_Age_35_to_49_Buddhist()
	{
		return this.females_Age_35_to_49_Buddhist;
	}

	public void setFemales_Age_35_to_49_Buddhist(
			int females_Age_35_to_49_Buddhist)
	{
		this.females_Age_35_to_49_Buddhist = females_Age_35_to_49_Buddhist;
	}

	public int getFemales_Age_35_to_49_Christian()
	{
		return this.females_Age_35_to_49_Christian;
	}

	public void setFemales_Age_35_to_49_Christian(
			int females_Age_35_to_49_Christian)
	{
		this.females_Age_35_to_49_Christian = females_Age_35_to_49_Christian;
	}

	public int getFemales_Age_35_to_49_Hindu()
	{
		return this.females_Age_35_to_49_Hindu;
	}

	public void setFemales_Age_35_to_49_Hindu(int females_Age_35_to_49_Hindu)
	{
		this.females_Age_35_to_49_Hindu = females_Age_35_to_49_Hindu;
	}

	public int getFemales_Age_35_to_49_Jewish()
	{
		return this.females_Age_35_to_49_Jewish;
	}

	public void setFemales_Age_35_to_49_Jewish(int females_Age_35_to_49_Jewish)
	{
		this.females_Age_35_to_49_Jewish = females_Age_35_to_49_Jewish;
	}

	public int getFemales_Age_35_to_49_Muslim()
	{
		return this.females_Age_35_to_49_Muslim;
	}

	public void setFemales_Age_35_to_49_Muslim(int females_Age_35_to_49_Muslim)
	{
		this.females_Age_35_to_49_Muslim = females_Age_35_to_49_Muslim;
	}

	public int getFemales_Age_35_to_49_No_rel()
	{
		return this.females_Age_35_to_49_No_rel;
	}

	public void setFemales_Age_35_to_49_No_rel(int females_Age_35_to_49_No_rel)
	{
		this.females_Age_35_to_49_No_rel = females_Age_35_to_49_No_rel;
	}

	public int getFemales_Age_35_to_49_Other_rel()
	{
		return this.females_Age_35_to_49_Other_rel;
	}

	public void setFemales_Age_35_to_49_Other_rel(
			int females_Age_35_to_49_Other_rel)
	{
		this.females_Age_35_to_49_Other_rel = females_Age_35_to_49_Other_rel;
	}

	public int getFemales_Age_35_to_49_rel_not_stated()
	{
		return this.females_Age_35_to_49_rel_not_stated;
	}

	public void setFemales_Age_35_to_49_rel_not_stated(
			int females_Age_35_to_49_rel_not_stated)
	{
		this.females_Age_35_to_49_rel_not_stated = females_Age_35_to_49_rel_not_stated;
	}

	public int getFemales_Age_35_to_49_Sikh()
	{
		return this.females_Age_35_to_49_Sikh;
	}

	public void setFemales_Age_35_to_49_Sikh(int females_Age_35_to_49_Sikh)
	{
		this.females_Age_35_to_49_Sikh = females_Age_35_to_49_Sikh;
	}

	public int getFemales_Age_35_to_49_T_All_cat_rel()
	{
		return this.females_Age_35_to_49_T_All_cat_rel;
	}

	public void setFemales_Age_35_to_49_T_All_cat_rel(
			int females_Age_35_to_49_T_All_cat_rel)
	{
		this.females_Age_35_to_49_T_All_cat_rel = females_Age_35_to_49_T_All_cat_rel;
	}

	public int getFemales_Age_50_to_64_Buddhist()
	{
		return this.females_Age_50_to_64_Buddhist;
	}

	public void setFemales_Age_50_to_64_Buddhist(
			int females_Age_50_to_64_Buddhist)
	{
		this.females_Age_50_to_64_Buddhist = females_Age_50_to_64_Buddhist;
	}

	public int getFemales_Age_50_to_64_Christian()
	{
		return this.females_Age_50_to_64_Christian;
	}

	public void setFemales_Age_50_to_64_Christian(
			int females_Age_50_to_64_Christian)
	{
		this.females_Age_50_to_64_Christian = females_Age_50_to_64_Christian;
	}

	public int getFemales_Age_50_to_64_Hindu()
	{
		return this.females_Age_50_to_64_Hindu;
	}

	public void setFemales_Age_50_to_64_Hindu(int females_Age_50_to_64_Hindu)
	{
		this.females_Age_50_to_64_Hindu = females_Age_50_to_64_Hindu;
	}

	public int getFemales_Age_50_to_64_Jewish()
	{
		return this.females_Age_50_to_64_Jewish;
	}

	public void setFemales_Age_50_to_64_Jewish(int females_Age_50_to_64_Jewish)
	{
		this.females_Age_50_to_64_Jewish = females_Age_50_to_64_Jewish;
	}

	public int getFemales_Age_50_to_64_Muslim()
	{
		return this.females_Age_50_to_64_Muslim;
	}

	public void setFemales_Age_50_to_64_Muslim(int females_Age_50_to_64_Muslim)
	{
		this.females_Age_50_to_64_Muslim = females_Age_50_to_64_Muslim;
	}

	public int getFemales_Age_50_to_64_No_rel()
	{
		return this.females_Age_50_to_64_No_rel;
	}

	public void setFemales_Age_50_to_64_No_rel(int females_Age_50_to_64_No_rel)
	{
		this.females_Age_50_to_64_No_rel = females_Age_50_to_64_No_rel;
	}

	public int getFemales_Age_50_to_64_Other_rel()
	{
		return this.females_Age_50_to_64_Other_rel;
	}

	public void setFemales_Age_50_to_64_Other_rel(
			int females_Age_50_to_64_Other_rel)
	{
		this.females_Age_50_to_64_Other_rel = females_Age_50_to_64_Other_rel;
	}

	public int getFemales_Age_50_to_64_rel_not_stated()
	{
		return this.females_Age_50_to_64_rel_not_stated;
	}

	public void setFemales_Age_50_to_64_rel_not_stated(
			int females_Age_50_to_64_rel_not_stated)
	{
		this.females_Age_50_to_64_rel_not_stated = females_Age_50_to_64_rel_not_stated;
	}

	public int getFemales_Age_50_to_64_Sikh()
	{
		return this.females_Age_50_to_64_Sikh;
	}

	public void setFemales_Age_50_to_64_Sikh(int females_Age_50_to_64_Sikh)
	{
		this.females_Age_50_to_64_Sikh = females_Age_50_to_64_Sikh;
	}

	public int getFemales_Age_50_to_64_T_All_cat_rel()
	{
		return this.females_Age_50_to_64_T_All_cat_rel;
	}

	public void setFemales_Age_50_to_64_T_All_cat_rel(
			int females_Age_50_to_64_T_All_cat_rel)
	{
		this.females_Age_50_to_64_T_All_cat_rel = females_Age_50_to_64_T_All_cat_rel;
	}

	public int getFemales_Age_65_to_74_Buddhist()
	{
		return this.females_Age_65_to_74_Buddhist;
	}

	public void setFemales_Age_65_to_74_Buddhist(
			int females_Age_65_to_74_Buddhist)
	{
		this.females_Age_65_to_74_Buddhist = females_Age_65_to_74_Buddhist;
	}

	public int getFemales_Age_65_to_74_Christian()
	{
		return this.females_Age_65_to_74_Christian;
	}

	public void setFemales_Age_65_to_74_Christian(
			int females_Age_65_to_74_Christian)
	{
		this.females_Age_65_to_74_Christian = females_Age_65_to_74_Christian;
	}

	public int getFemales_Age_65_to_74_Hindu()
	{
		return this.females_Age_65_to_74_Hindu;
	}

	public void setFemales_Age_65_to_74_Hindu(int females_Age_65_to_74_Hindu)
	{
		this.females_Age_65_to_74_Hindu = females_Age_65_to_74_Hindu;
	}

	public int getFemales_Age_65_to_74_Jewish()
	{
		return this.females_Age_65_to_74_Jewish;
	}

	public void setFemales_Age_65_to_74_Jewish(int females_Age_65_to_74_Jewish)
	{
		this.females_Age_65_to_74_Jewish = females_Age_65_to_74_Jewish;
	}

	public int getFemales_Age_65_to_74_Muslim()
	{
		return this.females_Age_65_to_74_Muslim;
	}

	public void setFemales_Age_65_to_74_Muslim(int females_Age_65_to_74_Muslim)
	{
		this.females_Age_65_to_74_Muslim = females_Age_65_to_74_Muslim;
	}

	public int getFemales_Age_65_to_74_No_rel()
	{
		return this.females_Age_65_to_74_No_rel;
	}

	public void setFemales_Age_65_to_74_No_rel(int females_Age_65_to_74_No_rel)
	{
		this.females_Age_65_to_74_No_rel = females_Age_65_to_74_No_rel;
	}

	public int getFemales_Age_65_to_74_Other_rel()
	{
		return this.females_Age_65_to_74_Other_rel;
	}

	public void setFemales_Age_65_to_74_Other_rel(
			int females_Age_65_to_74_Other_rel)
	{
		this.females_Age_65_to_74_Other_rel = females_Age_65_to_74_Other_rel;
	}

	public int getFemales_Age_65_to_74_rel_not_stated()
	{
		return this.females_Age_65_to_74_rel_not_stated;
	}

	public void setFemales_Age_65_to_74_rel_not_stated(
			int females_Age_65_to_74_rel_not_stated)
	{
		this.females_Age_65_to_74_rel_not_stated = females_Age_65_to_74_rel_not_stated;
	}

	public int getFemales_Age_65_to_74_Sikh()
	{
		return this.females_Age_65_to_74_Sikh;
	}

	public void setFemales_Age_65_to_74_Sikh(int females_Age_65_to_74_Sikh)
	{
		this.females_Age_65_to_74_Sikh = females_Age_65_to_74_Sikh;
	}

	public int getFemales_Age_65_to_74_T_All_cat_rel()
	{
		return this.females_Age_65_to_74_T_All_cat_rel;
	}

	public void setFemales_Age_65_to_74_T_All_cat_rel(
			int females_Age_65_to_74_T_All_cat_rel)
	{
		this.females_Age_65_to_74_T_All_cat_rel = females_Age_65_to_74_T_All_cat_rel;
	}

	public int getFemales_Age_75_and_over_Buddhist()
	{
		return this.females_Age_75_and_over_Buddhist;
	}

	public void setFemales_Age_75_and_over_Buddhist(
			int females_Age_75_and_over_Buddhist)
	{
		this.females_Age_75_and_over_Buddhist = females_Age_75_and_over_Buddhist;
	}

	public int getFemales_Age_75_and_over_Christian()
	{
		return this.females_Age_75_and_over_Christian;
	}

	public void setFemales_Age_75_and_over_Christian(
			int females_Age_75_and_over_Christian)
	{
		this.females_Age_75_and_over_Christian = females_Age_75_and_over_Christian;
	}

	public int getFemales_Age_75_and_over_Hindu()
	{
		return this.females_Age_75_and_over_Hindu;
	}

	public void setFemales_Age_75_and_over_Hindu(
			int females_Age_75_and_over_Hindu)
	{
		this.females_Age_75_and_over_Hindu = females_Age_75_and_over_Hindu;
	}

	public int getFemales_Age_75_and_over_Jewish()
	{
		return this.females_Age_75_and_over_Jewish;
	}

	public void setFemales_Age_75_and_over_Jewish(
			int females_Age_75_and_over_Jewish)
	{
		this.females_Age_75_and_over_Jewish = females_Age_75_and_over_Jewish;
	}

	public int getFemales_Age_75_and_over_Muslim()
	{
		return this.females_Age_75_and_over_Muslim;
	}

	public void setFemales_Age_75_and_over_Muslim(
			int females_Age_75_and_over_Muslim)
	{
		this.females_Age_75_and_over_Muslim = females_Age_75_and_over_Muslim;
	}

	public int getFemales_Age_75_and_over_No_rel()
	{
		return this.females_Age_75_and_over_No_rel;
	}

	public void setFemales_Age_75_and_over_No_rel(
			int females_Age_75_and_over_No_rel)
	{
		this.females_Age_75_and_over_No_rel = females_Age_75_and_over_No_rel;
	}

	public int getFemales_Age_75_and_over_Other_rel()
	{
		return this.females_Age_75_and_over_Other_rel;
	}

	public void setFemales_Age_75_and_over_Other_rel(
			int females_Age_75_and_over_Other_rel)
	{
		this.females_Age_75_and_over_Other_rel = females_Age_75_and_over_Other_rel;
	}

	public int getFemales_Age_75_and_over_rel_not_stated()
	{
		return this.females_Age_75_and_over_rel_not_stated;
	}

	public void setFemales_Age_75_and_over_rel_not_stated(
			int females_Age_75_and_over_rel_not_stated)
	{
		this.females_Age_75_and_over_rel_not_stated = females_Age_75_and_over_rel_not_stated;
	}

	public int getFemales_Age_75_and_over_Sikh()
	{
		return this.females_Age_75_and_over_Sikh;
	}

	public void setFemales_Age_75_and_over_Sikh(
			int females_Age_75_and_over_Sikh)
	{
		this.females_Age_75_and_over_Sikh = females_Age_75_and_over_Sikh;
	}

	public int getFemales_Age_75_and_over_T_All_cat_rel()
	{
		return this.females_Age_75_and_over_T_All_cat_rel;
	}

	public void setFemales_Age_75_and_over_T_All_cat_rel(
			int females_Age_75_and_over_T_All_cat_rel)
	{
		this.females_Age_75_and_over_T_All_cat_rel = females_Age_75_and_over_T_All_cat_rel;
	}

	public int getFemales_T_All_cat_Age_Buddhist()
	{
		return this.females_T_All_cat_Age_Buddhist;
	}

	public void setFemales_T_All_cat_Age_Buddhist(
			int females_T_All_cat_Age_Buddhist)
	{
		this.females_T_All_cat_Age_Buddhist = females_T_All_cat_Age_Buddhist;
	}

	public int getFemales_T_All_cat_Age_Christian()
	{
		return this.females_T_All_cat_Age_Christian;
	}

	public void setFemales_T_All_cat_Age_Christian(
			int females_T_All_cat_Age_Christian)
	{
		this.females_T_All_cat_Age_Christian = females_T_All_cat_Age_Christian;
	}

	public int getFemales_T_All_cat_Age_Hindu()
	{
		return this.females_T_All_cat_Age_Hindu;
	}

	public void setFemales_T_All_cat_Age_Hindu(int females_T_All_cat_Age_Hindu)
	{
		this.females_T_All_cat_Age_Hindu = females_T_All_cat_Age_Hindu;
	}

	public int getFemales_T_All_cat_Age_Jewish()
	{
		return this.females_T_All_cat_Age_Jewish;
	}

	public void setFemales_T_All_cat_Age_Jewish(
			int females_T_All_cat_Age_Jewish)
	{
		this.females_T_All_cat_Age_Jewish = females_T_All_cat_Age_Jewish;
	}

	public int getFemales_T_All_cat_Age_Muslim()
	{
		return this.females_T_All_cat_Age_Muslim;
	}

	public void setFemales_T_All_cat_Age_Muslim(
			int females_T_All_cat_Age_Muslim)
	{
		this.females_T_All_cat_Age_Muslim = females_T_All_cat_Age_Muslim;
	}

	public int getFemales_T_All_cat_Age_No_rel()
	{
		return this.females_T_All_cat_Age_No_rel;
	}

	public void setFemales_T_All_cat_Age_No_rel(
			int females_T_All_cat_Age_No_rel)
	{
		this.females_T_All_cat_Age_No_rel = females_T_All_cat_Age_No_rel;
	}

	public int getFemales_T_All_cat_Age_Other_rel()
	{
		return this.females_T_All_cat_Age_Other_rel;
	}

	public void setFemales_T_All_cat_Age_Other_rel(
			int females_T_All_cat_Age_Other_rel)
	{
		this.females_T_All_cat_Age_Other_rel = females_T_All_cat_Age_Other_rel;
	}

	public int getFemales_T_All_cat_Age_rel_not_stated()
	{
		return this.females_T_All_cat_Age_rel_not_stated;
	}

	public void setFemales_T_All_cat_Age_rel_not_stated(
			int females_T_All_cat_Age_rel_not_stated)
	{
		this.females_T_All_cat_Age_rel_not_stated = females_T_All_cat_Age_rel_not_stated;
	}

	public int getFemales_T_All_cat_Age_Sikh()
	{
		return this.females_T_All_cat_Age_Sikh;
	}

	public void setFemales_T_All_cat_Age_Sikh(int females_T_All_cat_Age_Sikh)
	{
		this.females_T_All_cat_Age_Sikh = females_T_All_cat_Age_Sikh;
	}

	public int getFemales_T_All_cat_Age_T_All_cat_rel()
	{
		return this.females_T_All_cat_Age_T_All_cat_rel;
	}

	public void setFemales_T_All_cat_Age_T_All_cat_rel(
			int females_T_All_cat_Age_T_All_cat_rel)
	{
		this.females_T_All_cat_Age_T_All_cat_rel = females_T_All_cat_Age_T_All_cat_rel;
	}

	public int getMales_Age_0_to_15_Buddhist()
	{
		return this.males_Age_0_to_15_Buddhist;
	}

	public void setMales_Age_0_to_15_Buddhist(int males_Age_0_to_15_Buddhist)
	{
		this.males_Age_0_to_15_Buddhist = males_Age_0_to_15_Buddhist;
	}

	public int getMales_Age_0_to_15_Christian()
	{
		return this.males_Age_0_to_15_Christian;
	}

	public void setMales_Age_0_to_15_Christian(int males_Age_0_to_15_Christian)
	{
		this.males_Age_0_to_15_Christian = males_Age_0_to_15_Christian;
	}

	public int getMales_Age_0_to_15_Hindu()
	{
		return this.males_Age_0_to_15_Hindu;
	}

	public void setMales_Age_0_to_15_Hindu(int males_Age_0_to_15_Hindu)
	{
		this.males_Age_0_to_15_Hindu = males_Age_0_to_15_Hindu;
	}

	public int getMales_Age_0_to_15_Jewish()
	{
		return this.males_Age_0_to_15_Jewish;
	}

	public void setMales_Age_0_to_15_Jewish(int males_Age_0_to_15_Jewish)
	{
		this.males_Age_0_to_15_Jewish = males_Age_0_to_15_Jewish;
	}

	public int getMales_Age_0_to_15_Muslim()
	{
		return this.males_Age_0_to_15_Muslim;
	}

	public void setMales_Age_0_to_15_Muslim(int males_Age_0_to_15_Muslim)
	{
		this.males_Age_0_to_15_Muslim = males_Age_0_to_15_Muslim;
	}

	public int getMales_Age_0_to_15_No_rel()
	{
		return this.males_Age_0_to_15_No_rel;
	}

	public void setMales_Age_0_to_15_No_rel(int males_Age_0_to_15_No_rel)
	{
		this.males_Age_0_to_15_No_rel = males_Age_0_to_15_No_rel;
	}

	public int getMales_Age_0_to_15_Other_rel()
	{
		return this.males_Age_0_to_15_Other_rel;
	}

	public void setMales_Age_0_to_15_Other_rel(int males_Age_0_to_15_Other_rel)
	{
		this.males_Age_0_to_15_Other_rel = males_Age_0_to_15_Other_rel;
	}

	public int getMales_Age_0_to_15_rel_not_stated()
	{
		return this.males_Age_0_to_15_rel_not_stated;
	}

	public void setMales_Age_0_to_15_rel_not_stated(
			int males_Age_0_to_15_rel_not_stated)
	{
		this.males_Age_0_to_15_rel_not_stated = males_Age_0_to_15_rel_not_stated;
	}

	public int getMales_Age_0_to_15_Sikh()
	{
		return this.males_Age_0_to_15_Sikh;
	}

	public void setMales_Age_0_to_15_Sikh(int males_Age_0_to_15_Sikh)
	{
		this.males_Age_0_to_15_Sikh = males_Age_0_to_15_Sikh;
	}

	public int getMales_Age_0_to_15_T_All_cat_rel()
	{
		return this.males_Age_0_to_15_T_All_cat_rel;
	}

	public void setMales_Age_0_to_15_T_All_cat_rel(
			int males_Age_0_to_15_T_All_cat_rel)
	{
		this.males_Age_0_to_15_T_All_cat_rel = males_Age_0_to_15_T_All_cat_rel;
	}

	public int getMales_Age_16_to_24_Buddhist()
	{
		return this.males_Age_16_to_24_Buddhist;
	}

	public void setMales_Age_16_to_24_Buddhist(int males_Age_16_to_24_Buddhist)
	{
		this.males_Age_16_to_24_Buddhist = males_Age_16_to_24_Buddhist;
	}

	public int getMales_Age_16_to_24_Christian()
	{
		return this.males_Age_16_to_24_Christian;
	}

	public void setMales_Age_16_to_24_Christian(
			int males_Age_16_to_24_Christian)
	{
		this.males_Age_16_to_24_Christian = males_Age_16_to_24_Christian;
	}

	public int getMales_Age_16_to_24_Hindu()
	{
		return this.males_Age_16_to_24_Hindu;
	}

	public void setMales_Age_16_to_24_Hindu(int males_Age_16_to_24_Hindu)
	{
		this.males_Age_16_to_24_Hindu = males_Age_16_to_24_Hindu;
	}

	public int getMales_Age_16_to_24_Jewish()
	{
		return this.males_Age_16_to_24_Jewish;
	}

	public void setMales_Age_16_to_24_Jewish(int males_Age_16_to_24_Jewish)
	{
		this.males_Age_16_to_24_Jewish = males_Age_16_to_24_Jewish;
	}

	public int getMales_Age_16_to_24_Muslim()
	{
		return this.males_Age_16_to_24_Muslim;
	}

	public void setMales_Age_16_to_24_Muslim(int males_Age_16_to_24_Muslim)
	{
		this.males_Age_16_to_24_Muslim = males_Age_16_to_24_Muslim;
	}

	public int getMales_Age_16_to_24_No_rel()
	{
		return this.males_Age_16_to_24_No_rel;
	}

	public void setMales_Age_16_to_24_No_rel(int males_Age_16_to_24_No_rel)
	{
		this.males_Age_16_to_24_No_rel = males_Age_16_to_24_No_rel;
	}

	public int getMales_Age_16_to_24_Other_rel()
	{
		return this.males_Age_16_to_24_Other_rel;
	}

	public void setMales_Age_16_to_24_Other_rel(
			int males_Age_16_to_24_Other_rel)
	{
		this.males_Age_16_to_24_Other_rel = males_Age_16_to_24_Other_rel;
	}

	public int getMales_Age_16_to_24_rel_not_stated()
	{
		return this.males_Age_16_to_24_rel_not_stated;
	}

	public void setMales_Age_16_to_24_rel_not_stated(
			int males_Age_16_to_24_rel_not_stated)
	{
		this.males_Age_16_to_24_rel_not_stated = males_Age_16_to_24_rel_not_stated;
	}

	public int getMales_Age_16_to_24_Sikh()
	{
		return this.males_Age_16_to_24_Sikh;
	}

	public void setMales_Age_16_to_24_Sikh(int males_Age_16_to_24_Sikh)
	{
		this.males_Age_16_to_24_Sikh = males_Age_16_to_24_Sikh;
	}

	public int getMales_Age_16_to_24_T_All_cat_rel()
	{
		return this.males_Age_16_to_24_T_All_cat_rel;
	}

	public void setMales_Age_16_to_24_T_All_cat_rel(
			int males_Age_16_to_24_T_All_cat_rel)
	{
		this.males_Age_16_to_24_T_All_cat_rel = males_Age_16_to_24_T_All_cat_rel;
	}

	public int getMales_Age_25_to_34_Buddhist()
	{
		return this.males_Age_25_to_34_Buddhist;
	}

	public void setMales_Age_25_to_34_Buddhist(int males_Age_25_to_34_Buddhist)
	{
		this.males_Age_25_to_34_Buddhist = males_Age_25_to_34_Buddhist;
	}

	public int getMales_Age_25_to_34_Christian()
	{
		return this.males_Age_25_to_34_Christian;
	}

	public void setMales_Age_25_to_34_Christian(
			int males_Age_25_to_34_Christian)
	{
		this.males_Age_25_to_34_Christian = males_Age_25_to_34_Christian;
	}

	public int getMales_Age_25_to_34_Hindu()
	{
		return this.males_Age_25_to_34_Hindu;
	}

	public void setMales_Age_25_to_34_Hindu(int males_Age_25_to_34_Hindu)
	{
		this.males_Age_25_to_34_Hindu = males_Age_25_to_34_Hindu;
	}

	public int getMales_Age_25_to_34_Jewish()
	{
		return this.males_Age_25_to_34_Jewish;
	}

	public void setMales_Age_25_to_34_Jewish(int males_Age_25_to_34_Jewish)
	{
		this.males_Age_25_to_34_Jewish = males_Age_25_to_34_Jewish;
	}

	public int getMales_Age_25_to_34_Muslim()
	{
		return this.males_Age_25_to_34_Muslim;
	}

	public void setMales_Age_25_to_34_Muslim(int males_Age_25_to_34_Muslim)
	{
		this.males_Age_25_to_34_Muslim = males_Age_25_to_34_Muslim;
	}

	public int getMales_Age_25_to_34_No_rel()
	{
		return this.males_Age_25_to_34_No_rel;
	}

	public void setMales_Age_25_to_34_No_rel(int males_Age_25_to_34_No_rel)
	{
		this.males_Age_25_to_34_No_rel = males_Age_25_to_34_No_rel;
	}

	public int getMales_Age_25_to_34_Other_rel()
	{
		return this.males_Age_25_to_34_Other_rel;
	}

	public void setMales_Age_25_to_34_Other_rel(
			int males_Age_25_to_34_Other_rel)
	{
		this.males_Age_25_to_34_Other_rel = males_Age_25_to_34_Other_rel;
	}

	public int getMales_Age_25_to_34_rel_not_stated()
	{
		return this.males_Age_25_to_34_rel_not_stated;
	}

	public void setMales_Age_25_to_34_rel_not_stated(
			int males_Age_25_to_34_rel_not_stated)
	{
		this.males_Age_25_to_34_rel_not_stated = males_Age_25_to_34_rel_not_stated;
	}

	public int getMales_Age_25_to_34_Sikh()
	{
		return this.males_Age_25_to_34_Sikh;
	}

	public void setMales_Age_25_to_34_Sikh(int males_Age_25_to_34_Sikh)
	{
		this.males_Age_25_to_34_Sikh = males_Age_25_to_34_Sikh;
	}

	public int getMales_Age_25_to_34_T_All_cat_rel()
	{
		return this.males_Age_25_to_34_T_All_cat_rel;
	}

	public void setMales_Age_25_to_34_T_All_cat_rel(
			int males_Age_25_to_34_T_All_cat_rel)
	{
		this.males_Age_25_to_34_T_All_cat_rel = males_Age_25_to_34_T_All_cat_rel;
	}

	public int getMales_Age_35_to_49_Buddhist()
	{
		return this.males_Age_35_to_49_Buddhist;
	}

	public void setMales_Age_35_to_49_Buddhist(int males_Age_35_to_49_Buddhist)
	{
		this.males_Age_35_to_49_Buddhist = males_Age_35_to_49_Buddhist;
	}

	public int getMales_Age_35_to_49_Christian()
	{
		return this.males_Age_35_to_49_Christian;
	}

	public void setMales_Age_35_to_49_Christian(
			int males_Age_35_to_49_Christian)
	{
		this.males_Age_35_to_49_Christian = males_Age_35_to_49_Christian;
	}

	public int getMales_Age_35_to_49_Hindu()
	{
		return this.males_Age_35_to_49_Hindu;
	}

	public void setMales_Age_35_to_49_Hindu(int males_Age_35_to_49_Hindu)
	{
		this.males_Age_35_to_49_Hindu = males_Age_35_to_49_Hindu;
	}

	public int getMales_Age_35_to_49_Jewish()
	{
		return this.males_Age_35_to_49_Jewish;
	}

	public void setMales_Age_35_to_49_Jewish(int males_Age_35_to_49_Jewish)
	{
		this.males_Age_35_to_49_Jewish = males_Age_35_to_49_Jewish;
	}

	public int getMales_Age_35_to_49_Muslim()
	{
		return this.males_Age_35_to_49_Muslim;
	}

	public void setMales_Age_35_to_49_Muslim(int males_Age_35_to_49_Muslim)
	{
		this.males_Age_35_to_49_Muslim = males_Age_35_to_49_Muslim;
	}

	public int getMales_Age_35_to_49_No_rel()
	{
		return this.males_Age_35_to_49_No_rel;
	}

	public void setMales_Age_35_to_49_No_rel(int males_Age_35_to_49_No_rel)
	{
		this.males_Age_35_to_49_No_rel = males_Age_35_to_49_No_rel;
	}

	public int getMales_Age_35_to_49_Other_rel()
	{
		return this.males_Age_35_to_49_Other_rel;
	}

	public void setMales_Age_35_to_49_Other_rel(
			int males_Age_35_to_49_Other_rel)
	{
		this.males_Age_35_to_49_Other_rel = males_Age_35_to_49_Other_rel;
	}

	public int getMales_Age_35_to_49_rel_not_stated()
	{
		return this.males_Age_35_to_49_rel_not_stated;
	}

	public void setMales_Age_35_to_49_rel_not_stated(
			int males_Age_35_to_49_rel_not_stated)
	{
		this.males_Age_35_to_49_rel_not_stated = males_Age_35_to_49_rel_not_stated;
	}

	public int getMales_Age_35_to_49_Sikh()
	{
		return this.males_Age_35_to_49_Sikh;
	}

	public void setMales_Age_35_to_49_Sikh(int males_Age_35_to_49_Sikh)
	{
		this.males_Age_35_to_49_Sikh = males_Age_35_to_49_Sikh;
	}

	public int getMales_Age_35_to_49_T_All_cat_rel()
	{
		return this.males_Age_35_to_49_T_All_cat_rel;
	}

	public void setMales_Age_35_to_49_T_All_cat_rel(
			int males_Age_35_to_49_T_All_cat_rel)
	{
		this.males_Age_35_to_49_T_All_cat_rel = males_Age_35_to_49_T_All_cat_rel;
	}

	public int getMales_Age_50_to_64_Buddhist()
	{
		return this.males_Age_50_to_64_Buddhist;
	}

	public void setMales_Age_50_to_64_Buddhist(int males_Age_50_to_64_Buddhist)
	{
		this.males_Age_50_to_64_Buddhist = males_Age_50_to_64_Buddhist;
	}

	public int getMales_Age_50_to_64_Christian()
	{
		return this.males_Age_50_to_64_Christian;
	}

	public void setMales_Age_50_to_64_Christian(
			int males_Age_50_to_64_Christian)
	{
		this.males_Age_50_to_64_Christian = males_Age_50_to_64_Christian;
	}

	public int getMales_Age_50_to_64_Hindu()
	{
		return this.males_Age_50_to_64_Hindu;
	}

	public void setMales_Age_50_to_64_Hindu(int males_Age_50_to_64_Hindu)
	{
		this.males_Age_50_to_64_Hindu = males_Age_50_to_64_Hindu;
	}

	public int getMales_Age_50_to_64_Jewish()
	{
		return this.males_Age_50_to_64_Jewish;
	}

	public void setMales_Age_50_to_64_Jewish(int males_Age_50_to_64_Jewish)
	{
		this.males_Age_50_to_64_Jewish = males_Age_50_to_64_Jewish;
	}

	public int getMales_Age_50_to_64_Muslim()
	{
		return this.males_Age_50_to_64_Muslim;
	}

	public void setMales_Age_50_to_64_Muslim(int males_Age_50_to_64_Muslim)
	{
		this.males_Age_50_to_64_Muslim = males_Age_50_to_64_Muslim;
	}

	public int getMales_Age_50_to_64_No_rel()
	{
		return this.males_Age_50_to_64_No_rel;
	}

	public void setMales_Age_50_to_64_No_rel(int males_Age_50_to_64_No_rel)
	{
		this.males_Age_50_to_64_No_rel = males_Age_50_to_64_No_rel;
	}

	public int getMales_Age_50_to_64_Other_rel()
	{
		return this.males_Age_50_to_64_Other_rel;
	}

	public void setMales_Age_50_to_64_Other_rel(
			int males_Age_50_to_64_Other_rel)
	{
		this.males_Age_50_to_64_Other_rel = males_Age_50_to_64_Other_rel;
	}

	public int getMales_Age_50_to_64_rel_not_stated()
	{
		return this.males_Age_50_to_64_rel_not_stated;
	}

	public void setMales_Age_50_to_64_rel_not_stated(
			int males_Age_50_to_64_rel_not_stated)
	{
		this.males_Age_50_to_64_rel_not_stated = males_Age_50_to_64_rel_not_stated;
	}

	public int getMales_Age_50_to_64_Sikh()
	{
		return this.males_Age_50_to_64_Sikh;
	}

	public void setMales_Age_50_to_64_Sikh(int males_Age_50_to_64_Sikh)
	{
		this.males_Age_50_to_64_Sikh = males_Age_50_to_64_Sikh;
	}

	public int getMales_Age_50_to_64_T_All_cat_rel()
	{
		return this.males_Age_50_to_64_T_All_cat_rel;
	}

	public void setMales_Age_50_to_64_T_All_cat_rel(
			int males_Age_50_to_64_T_All_cat_rel)
	{
		this.males_Age_50_to_64_T_All_cat_rel = males_Age_50_to_64_T_All_cat_rel;
	}

	public int getMales_Age_65_to_74_Buddhist()
	{
		return this.males_Age_65_to_74_Buddhist;
	}

	public void setMales_Age_65_to_74_Buddhist(int males_Age_65_to_74_Buddhist)
	{
		this.males_Age_65_to_74_Buddhist = males_Age_65_to_74_Buddhist;
	}

	public int getMales_Age_65_to_74_Christian()
	{
		return this.males_Age_65_to_74_Christian;
	}

	public void setMales_Age_65_to_74_Christian(
			int males_Age_65_to_74_Christian)
	{
		this.males_Age_65_to_74_Christian = males_Age_65_to_74_Christian;
	}

	public int getMales_Age_65_to_74_Hindu()
	{
		return this.males_Age_65_to_74_Hindu;
	}

	public void setMales_Age_65_to_74_Hindu(int males_Age_65_to_74_Hindu)
	{
		this.males_Age_65_to_74_Hindu = males_Age_65_to_74_Hindu;
	}

	public int getMales_Age_65_to_74_Jewish()
	{
		return this.males_Age_65_to_74_Jewish;
	}

	public void setMales_Age_65_to_74_Jewish(int males_Age_65_to_74_Jewish)
	{
		this.males_Age_65_to_74_Jewish = males_Age_65_to_74_Jewish;
	}

	public int getMales_Age_65_to_74_Muslim()
	{
		return this.males_Age_65_to_74_Muslim;
	}

	public void setMales_Age_65_to_74_Muslim(int males_Age_65_to_74_Muslim)
	{
		this.males_Age_65_to_74_Muslim = males_Age_65_to_74_Muslim;
	}

	public int getMales_Age_65_to_74_No_rel()
	{
		return this.males_Age_65_to_74_No_rel;
	}

	public void setMales_Age_65_to_74_No_rel(int males_Age_65_to_74_No_rel)
	{
		this.males_Age_65_to_74_No_rel = males_Age_65_to_74_No_rel;
	}

	public int getMales_Age_65_to_74_Other_rel()
	{
		return this.males_Age_65_to_74_Other_rel;
	}

	public void setMales_Age_65_to_74_Other_rel(
			int males_Age_65_to_74_Other_rel)
	{
		this.males_Age_65_to_74_Other_rel = males_Age_65_to_74_Other_rel;
	}

	public int getMales_Age_65_to_74_rel_not_stated()
	{
		return this.males_Age_65_to_74_rel_not_stated;
	}

	public void setMales_Age_65_to_74_rel_not_stated(
			int males_Age_65_to_74_rel_not_stated)
	{
		this.males_Age_65_to_74_rel_not_stated = males_Age_65_to_74_rel_not_stated;
	}

	public int getMales_Age_65_to_74_Sikh()
	{
		return this.males_Age_65_to_74_Sikh;
	}

	public void setMales_Age_65_to_74_Sikh(int males_Age_65_to_74_Sikh)
	{
		this.males_Age_65_to_74_Sikh = males_Age_65_to_74_Sikh;
	}

	public int getMales_Age_65_to_74_T_All_cat_rel()
	{
		return this.males_Age_65_to_74_T_All_cat_rel;
	}

	public void setMales_Age_65_to_74_T_All_cat_rel(
			int males_Age_65_to_74_T_All_cat_rel)
	{
		this.males_Age_65_to_74_T_All_cat_rel = males_Age_65_to_74_T_All_cat_rel;
	}

	public int getMales_Age_75_and_over_Buddhist()
	{
		return this.males_Age_75_and_over_Buddhist;
	}

	public void setMales_Age_75_and_over_Buddhist(
			int males_Age_75_and_over_Buddhist)
	{
		this.males_Age_75_and_over_Buddhist = males_Age_75_and_over_Buddhist;
	}

	public int getMales_Age_75_and_over_Christian()
	{
		return this.males_Age_75_and_over_Christian;
	}

	public void setMales_Age_75_and_over_Christian(
			int males_Age_75_and_over_Christian)
	{
		this.males_Age_75_and_over_Christian = males_Age_75_and_over_Christian;
	}

	public int getMales_Age_75_and_over_Hindu()
	{
		return this.males_Age_75_and_over_Hindu;
	}

	public void setMales_Age_75_and_over_Hindu(int males_Age_75_and_over_Hindu)
	{
		this.males_Age_75_and_over_Hindu = males_Age_75_and_over_Hindu;
	}

	public int getMales_Age_75_and_over_Jewish()
	{
		return this.males_Age_75_and_over_Jewish;
	}

	public void setMales_Age_75_and_over_Jewish(
			int males_Age_75_and_over_Jewish)
	{
		this.males_Age_75_and_over_Jewish = males_Age_75_and_over_Jewish;
	}

	public int getMales_Age_75_and_over_Muslim()
	{
		return this.males_Age_75_and_over_Muslim;
	}

	public void setMales_Age_75_and_over_Muslim(
			int males_Age_75_and_over_Muslim)
	{
		this.males_Age_75_and_over_Muslim = males_Age_75_and_over_Muslim;
	}

	public int getMales_Age_75_and_over_No_rel()
	{
		return this.males_Age_75_and_over_No_rel;
	}

	public void setMales_Age_75_and_over_No_rel(
			int males_Age_75_and_over_No_rel)
	{
		this.males_Age_75_and_over_No_rel = males_Age_75_and_over_No_rel;
	}

	public int getMales_Age_75_and_over_Other_rel()
	{
		return this.males_Age_75_and_over_Other_rel;
	}

	public void setMales_Age_75_and_over_Other_rel(
			int males_Age_75_and_over_Other_rel)
	{
		this.males_Age_75_and_over_Other_rel = males_Age_75_and_over_Other_rel;
	}

	public int getMales_Age_75_and_over_rel_not_stated()
	{
		return this.males_Age_75_and_over_rel_not_stated;
	}

	public void setMales_Age_75_and_over_rel_not_stated(
			int males_Age_75_and_over_rel_not_stated)
	{
		this.males_Age_75_and_over_rel_not_stated = males_Age_75_and_over_rel_not_stated;
	}

	public int getMales_Age_75_and_over_Sikh()
	{
		return this.males_Age_75_and_over_Sikh;
	}

	public void setMales_Age_75_and_over_Sikh(int males_Age_75_and_over_Sikh)
	{
		this.males_Age_75_and_over_Sikh = males_Age_75_and_over_Sikh;
	}

	public int getMales_Age_75_and_over_T_All_cat_rel()
	{
		return this.males_Age_75_and_over_T_All_cat_rel;
	}

	public void setMales_Age_75_and_over_T_All_cat_rel(
			int males_Age_75_and_over_T_All_cat_rel)
	{
		this.males_Age_75_and_over_T_All_cat_rel = males_Age_75_and_over_T_All_cat_rel;
	}

	public int getMales_T_All_cat_Age_Buddhist()
	{
		return this.males_T_All_cat_Age_Buddhist;
	}

	public void setMales_T_All_cat_Age_Buddhist(
			int males_T_All_cat_Age_Buddhist)
	{
		this.males_T_All_cat_Age_Buddhist = males_T_All_cat_Age_Buddhist;
	}

	public int getMales_T_All_cat_Age_Christian()
	{
		return this.males_T_All_cat_Age_Christian;
	}

	public void setMales_T_All_cat_Age_Christian(
			int males_T_All_cat_Age_Christian)
	{
		this.males_T_All_cat_Age_Christian = males_T_All_cat_Age_Christian;
	}

	public int getMales_T_All_cat_Age_Hindu()
	{
		return this.males_T_All_cat_Age_Hindu;
	}

	public void setMales_T_All_cat_Age_Hindu(int males_T_All_cat_Age_Hindu)
	{
		this.males_T_All_cat_Age_Hindu = males_T_All_cat_Age_Hindu;
	}

	public int getMales_T_All_cat_Age_Jewish()
	{
		return this.males_T_All_cat_Age_Jewish;
	}

	public void setMales_T_All_cat_Age_Jewish(int males_T_All_cat_Age_Jewish)
	{
		this.males_T_All_cat_Age_Jewish = males_T_All_cat_Age_Jewish;
	}

	public int getMales_T_All_cat_Age_Muslim()
	{
		return this.males_T_All_cat_Age_Muslim;
	}

	public void setMales_T_All_cat_Age_Muslim(int males_T_All_cat_Age_Muslim)
	{
		this.males_T_All_cat_Age_Muslim = males_T_All_cat_Age_Muslim;
	}

	public int getMales_T_All_cat_Age_No_rel()
	{
		return this.males_T_All_cat_Age_No_rel;
	}

	public void setMales_T_All_cat_Age_No_rel(int males_T_All_cat_Age_No_rel)
	{
		this.males_T_All_cat_Age_No_rel = males_T_All_cat_Age_No_rel;
	}

	public int getMales_T_All_cat_Age_Other_rel()
	{
		return this.males_T_All_cat_Age_Other_rel;
	}

	public void setMales_T_All_cat_Age_Other_rel(
			int males_T_All_cat_Age_Other_rel)
	{
		this.males_T_All_cat_Age_Other_rel = males_T_All_cat_Age_Other_rel;
	}

	public int getMales_T_All_cat_Age_rel_not_stated()
	{
		return this.males_T_All_cat_Age_rel_not_stated;
	}

	public void setMales_T_All_cat_Age_rel_not_stated(
			int males_T_All_cat_Age_rel_not_stated)
	{
		this.males_T_All_cat_Age_rel_not_stated = males_T_All_cat_Age_rel_not_stated;
	}

	public int getMales_T_All_cat_Age_Sikh()
	{
		return this.males_T_All_cat_Age_Sikh;
	}

	public void setMales_T_All_cat_Age_Sikh(int males_T_All_cat_Age_Sikh)
	{
		this.males_T_All_cat_Age_Sikh = males_T_All_cat_Age_Sikh;
	}

	public int getMales_T_All_cat_Age_T_All_cat_rel()
	{
		return this.males_T_All_cat_Age_T_All_cat_rel;
	}

	public void setMales_T_All_cat_Age_T_All_cat_rel(
			int males_T_All_cat_Age_T_All_cat_rel)
	{
		this.males_T_All_cat_Age_T_All_cat_rel = males_T_All_cat_Age_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_Age_0_to_15_Buddhist()
	{
		return this.t_All_cat_Sex_Age_0_to_15_Buddhist;
	}

	public void setT_All_cat_Sex_Age_0_to_15_Buddhist(
			int t_All_cat_Sex_Age_0_to_15_Buddhist)
	{
		this.t_All_cat_Sex_Age_0_to_15_Buddhist = t_All_cat_Sex_Age_0_to_15_Buddhist;
	}

	public int getT_All_cat_Sex_Age_0_to_15_Christian()
	{
		return this.t_All_cat_Sex_Age_0_to_15_Christian;
	}

	public void setT_All_cat_Sex_Age_0_to_15_Christian(
			int t_All_cat_Sex_Age_0_to_15_Christian)
	{
		this.t_All_cat_Sex_Age_0_to_15_Christian = t_All_cat_Sex_Age_0_to_15_Christian;
	}

	public int getT_All_cat_Sex_Age_0_to_15_Hindu()
	{
		return this.t_All_cat_Sex_Age_0_to_15_Hindu;
	}

	public void setT_All_cat_Sex_Age_0_to_15_Hindu(
			int t_All_cat_Sex_Age_0_to_15_Hindu)
	{
		this.t_All_cat_Sex_Age_0_to_15_Hindu = t_All_cat_Sex_Age_0_to_15_Hindu;
	}

	public int getT_All_cat_Sex_Age_0_to_15_Jewish()
	{
		return this.t_All_cat_Sex_Age_0_to_15_Jewish;
	}

	public void setT_All_cat_Sex_Age_0_to_15_Jewish(
			int t_All_cat_Sex_Age_0_to_15_Jewish)
	{
		this.t_All_cat_Sex_Age_0_to_15_Jewish = t_All_cat_Sex_Age_0_to_15_Jewish;
	}

	public int getT_All_cat_Sex_Age_0_to_15_Muslim()
	{
		return this.t_All_cat_Sex_Age_0_to_15_Muslim;
	}

	public void setT_All_cat_Sex_Age_0_to_15_Muslim(
			int t_All_cat_Sex_Age_0_to_15_Muslim)
	{
		this.t_All_cat_Sex_Age_0_to_15_Muslim = t_All_cat_Sex_Age_0_to_15_Muslim;
	}

	public int getT_All_cat_Sex_Age_0_to_15_No_rel()
	{
		return this.t_All_cat_Sex_Age_0_to_15_No_rel;
	}

	public void setT_All_cat_Sex_Age_0_to_15_No_rel(
			int t_All_cat_Sex_Age_0_to_15_No_rel)
	{
		this.t_All_cat_Sex_Age_0_to_15_No_rel = t_All_cat_Sex_Age_0_to_15_No_rel;
	}

	public int getT_All_cat_Sex_Age_0_to_15_Other_rel()
	{
		return this.t_All_cat_Sex_Age_0_to_15_Other_rel;
	}

	public void setT_All_cat_Sex_Age_0_to_15_Other_rel(
			int t_All_cat_Sex_Age_0_to_15_Other_rel)
	{
		this.t_All_cat_Sex_Age_0_to_15_Other_rel = t_All_cat_Sex_Age_0_to_15_Other_rel;
	}

	public int getT_All_cat_Sex_Age_0_to_15_rel_not_stated()
	{
		return this.t_All_cat_Sex_Age_0_to_15_rel_not_stated;
	}

	public void setT_All_cat_Sex_Age_0_to_15_rel_not_stated(
			int t_All_cat_Sex_Age_0_to_15_rel_not_stated)
	{
		this.t_All_cat_Sex_Age_0_to_15_rel_not_stated = t_All_cat_Sex_Age_0_to_15_rel_not_stated;
	}

	public int getT_All_cat_Sex_Age_0_to_15_Sikh()
	{
		return this.t_All_cat_Sex_Age_0_to_15_Sikh;
	}

	public void setT_All_cat_Sex_Age_0_to_15_Sikh(
			int t_All_cat_Sex_Age_0_to_15_Sikh)
	{
		this.t_All_cat_Sex_Age_0_to_15_Sikh = t_All_cat_Sex_Age_0_to_15_Sikh;
	}

	public int getT_All_cat_Sex_Age_0_to_15_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_Age_0_to_15_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_Age_0_to_15_T_All_cat_rel(
			int t_All_cat_Sex_Age_0_to_15_T_All_cat_rel)
	{
		this.t_All_cat_Sex_Age_0_to_15_T_All_cat_rel = t_All_cat_Sex_Age_0_to_15_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_Age_16_to_24_Buddhist()
	{
		return this.t_All_cat_Sex_Age_16_to_24_Buddhist;
	}

	public void setT_All_cat_Sex_Age_16_to_24_Buddhist(
			int t_All_cat_Sex_Age_16_to_24_Buddhist)
	{
		this.t_All_cat_Sex_Age_16_to_24_Buddhist = t_All_cat_Sex_Age_16_to_24_Buddhist;
	}

	public int getT_All_cat_Sex_Age_16_to_24_Christian()
	{
		return this.t_All_cat_Sex_Age_16_to_24_Christian;
	}

	public void setT_All_cat_Sex_Age_16_to_24_Christian(
			int t_All_cat_Sex_Age_16_to_24_Christian)
	{
		this.t_All_cat_Sex_Age_16_to_24_Christian = t_All_cat_Sex_Age_16_to_24_Christian;
	}

	public int getT_All_cat_Sex_Age_16_to_24_Hindu()
	{
		return this.t_All_cat_Sex_Age_16_to_24_Hindu;
	}

	public void setT_All_cat_Sex_Age_16_to_24_Hindu(
			int t_All_cat_Sex_Age_16_to_24_Hindu)
	{
		this.t_All_cat_Sex_Age_16_to_24_Hindu = t_All_cat_Sex_Age_16_to_24_Hindu;
	}

	public int getT_All_cat_Sex_Age_16_to_24_Jewish()
	{
		return this.t_All_cat_Sex_Age_16_to_24_Jewish;
	}

	public void setT_All_cat_Sex_Age_16_to_24_Jewish(
			int t_All_cat_Sex_Age_16_to_24_Jewish)
	{
		this.t_All_cat_Sex_Age_16_to_24_Jewish = t_All_cat_Sex_Age_16_to_24_Jewish;
	}

	public int getT_All_cat_Sex_Age_16_to_24_Muslim()
	{
		return this.t_All_cat_Sex_Age_16_to_24_Muslim;
	}

	public void setT_All_cat_Sex_Age_16_to_24_Muslim(
			int t_All_cat_Sex_Age_16_to_24_Muslim)
	{
		this.t_All_cat_Sex_Age_16_to_24_Muslim = t_All_cat_Sex_Age_16_to_24_Muslim;
	}

	public int getT_All_cat_Sex_Age_16_to_24_No_rel()
	{
		return this.t_All_cat_Sex_Age_16_to_24_No_rel;
	}

	public void setT_All_cat_Sex_Age_16_to_24_No_rel(
			int t_All_cat_Sex_Age_16_to_24_No_rel)
	{
		this.t_All_cat_Sex_Age_16_to_24_No_rel = t_All_cat_Sex_Age_16_to_24_No_rel;
	}

	public int getT_All_cat_Sex_Age_16_to_24_Other_rel()
	{
		return this.t_All_cat_Sex_Age_16_to_24_Other_rel;
	}

	public void setT_All_cat_Sex_Age_16_to_24_Other_rel(
			int t_All_cat_Sex_Age_16_to_24_Other_rel)
	{
		this.t_All_cat_Sex_Age_16_to_24_Other_rel = t_All_cat_Sex_Age_16_to_24_Other_rel;
	}

	public int getT_All_cat_Sex_Age_16_to_24_rel_not_stated()
	{
		return this.t_All_cat_Sex_Age_16_to_24_rel_not_stated;
	}

	public void setT_All_cat_Sex_Age_16_to_24_rel_not_stated(
			int t_All_cat_Sex_Age_16_to_24_rel_not_stated)
	{
		this.t_All_cat_Sex_Age_16_to_24_rel_not_stated = t_All_cat_Sex_Age_16_to_24_rel_not_stated;
	}

	public int getT_All_cat_Sex_Age_16_to_24_Sikh()
	{
		return this.t_All_cat_Sex_Age_16_to_24_Sikh;
	}

	public void setT_All_cat_Sex_Age_16_to_24_Sikh(
			int t_All_cat_Sex_Age_16_to_24_Sikh)
	{
		this.t_All_cat_Sex_Age_16_to_24_Sikh = t_All_cat_Sex_Age_16_to_24_Sikh;
	}

	public int getT_All_cat_Sex_Age_16_to_24_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_Age_16_to_24_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_Age_16_to_24_T_All_cat_rel(
			int t_All_cat_Sex_Age_16_to_24_T_All_cat_rel)
	{
		this.t_All_cat_Sex_Age_16_to_24_T_All_cat_rel = t_All_cat_Sex_Age_16_to_24_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_Age_25_to_34_Buddhist()
	{
		return this.t_All_cat_Sex_Age_25_to_34_Buddhist;
	}

	public void setT_All_cat_Sex_Age_25_to_34_Buddhist(
			int t_All_cat_Sex_Age_25_to_34_Buddhist)
	{
		this.t_All_cat_Sex_Age_25_to_34_Buddhist = t_All_cat_Sex_Age_25_to_34_Buddhist;
	}

	public int getT_All_cat_Sex_Age_25_to_34_Christian()
	{
		return this.t_All_cat_Sex_Age_25_to_34_Christian;
	}

	public void setT_All_cat_Sex_Age_25_to_34_Christian(
			int t_All_cat_Sex_Age_25_to_34_Christian)
	{
		this.t_All_cat_Sex_Age_25_to_34_Christian = t_All_cat_Sex_Age_25_to_34_Christian;
	}

	public int getT_All_cat_Sex_Age_25_to_34_Hindu()
	{
		return this.t_All_cat_Sex_Age_25_to_34_Hindu;
	}

	public void setT_All_cat_Sex_Age_25_to_34_Hindu(
			int t_All_cat_Sex_Age_25_to_34_Hindu)
	{
		this.t_All_cat_Sex_Age_25_to_34_Hindu = t_All_cat_Sex_Age_25_to_34_Hindu;
	}

	public int getT_All_cat_Sex_Age_25_to_34_Jewish()
	{
		return this.t_All_cat_Sex_Age_25_to_34_Jewish;
	}

	public void setT_All_cat_Sex_Age_25_to_34_Jewish(
			int t_All_cat_Sex_Age_25_to_34_Jewish)
	{
		this.t_All_cat_Sex_Age_25_to_34_Jewish = t_All_cat_Sex_Age_25_to_34_Jewish;
	}

	public int getT_All_cat_Sex_Age_25_to_34_Muslim()
	{
		return this.t_All_cat_Sex_Age_25_to_34_Muslim;
	}

	public void setT_All_cat_Sex_Age_25_to_34_Muslim(
			int t_All_cat_Sex_Age_25_to_34_Muslim)
	{
		this.t_All_cat_Sex_Age_25_to_34_Muslim = t_All_cat_Sex_Age_25_to_34_Muslim;
	}

	public int getT_All_cat_Sex_Age_25_to_34_No_rel()
	{
		return this.t_All_cat_Sex_Age_25_to_34_No_rel;
	}

	public void setT_All_cat_Sex_Age_25_to_34_No_rel(
			int t_All_cat_Sex_Age_25_to_34_No_rel)
	{
		this.t_All_cat_Sex_Age_25_to_34_No_rel = t_All_cat_Sex_Age_25_to_34_No_rel;
	}

	public int getT_All_cat_Sex_Age_25_to_34_Other_rel()
	{
		return this.t_All_cat_Sex_Age_25_to_34_Other_rel;
	}

	public void setT_All_cat_Sex_Age_25_to_34_Other_rel(
			int t_All_cat_Sex_Age_25_to_34_Other_rel)
	{
		this.t_All_cat_Sex_Age_25_to_34_Other_rel = t_All_cat_Sex_Age_25_to_34_Other_rel;
	}

	public int getT_All_cat_Sex_Age_25_to_34_rel_not_stated()
	{
		return this.t_All_cat_Sex_Age_25_to_34_rel_not_stated;
	}

	public void setT_All_cat_Sex_Age_25_to_34_rel_not_stated(
			int t_All_cat_Sex_Age_25_to_34_rel_not_stated)
	{
		this.t_All_cat_Sex_Age_25_to_34_rel_not_stated = t_All_cat_Sex_Age_25_to_34_rel_not_stated;
	}

	public int getT_All_cat_Sex_Age_25_to_34_Sikh()
	{
		return this.t_All_cat_Sex_Age_25_to_34_Sikh;
	}

	public void setT_All_cat_Sex_Age_25_to_34_Sikh(
			int t_All_cat_Sex_Age_25_to_34_Sikh)
	{
		this.t_All_cat_Sex_Age_25_to_34_Sikh = t_All_cat_Sex_Age_25_to_34_Sikh;
	}

	public int getT_All_cat_Sex_Age_25_to_34_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_Age_25_to_34_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_Age_25_to_34_T_All_cat_rel(
			int t_All_cat_Sex_Age_25_to_34_T_All_cat_rel)
	{
		this.t_All_cat_Sex_Age_25_to_34_T_All_cat_rel = t_All_cat_Sex_Age_25_to_34_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_Age_35_to_49_Buddhist()
	{
		return this.t_All_cat_Sex_Age_35_to_49_Buddhist;
	}

	public void setT_All_cat_Sex_Age_35_to_49_Buddhist(
			int t_All_cat_Sex_Age_35_to_49_Buddhist)
	{
		this.t_All_cat_Sex_Age_35_to_49_Buddhist = t_All_cat_Sex_Age_35_to_49_Buddhist;
	}

	public int getT_All_cat_Sex_Age_35_to_49_Christian()
	{
		return this.t_All_cat_Sex_Age_35_to_49_Christian;
	}

	public void setT_All_cat_Sex_Age_35_to_49_Christian(
			int t_All_cat_Sex_Age_35_to_49_Christian)
	{
		this.t_All_cat_Sex_Age_35_to_49_Christian = t_All_cat_Sex_Age_35_to_49_Christian;
	}

	public int getT_All_cat_Sex_Age_35_to_49_Hindu()
	{
		return this.t_All_cat_Sex_Age_35_to_49_Hindu;
	}

	public void setT_All_cat_Sex_Age_35_to_49_Hindu(
			int t_All_cat_Sex_Age_35_to_49_Hindu)
	{
		this.t_All_cat_Sex_Age_35_to_49_Hindu = t_All_cat_Sex_Age_35_to_49_Hindu;
	}

	public int getT_All_cat_Sex_Age_35_to_49_Jewish()
	{
		return this.t_All_cat_Sex_Age_35_to_49_Jewish;
	}

	public void setT_All_cat_Sex_Age_35_to_49_Jewish(
			int t_All_cat_Sex_Age_35_to_49_Jewish)
	{
		this.t_All_cat_Sex_Age_35_to_49_Jewish = t_All_cat_Sex_Age_35_to_49_Jewish;
	}

	public int getT_All_cat_Sex_Age_35_to_49_Muslim()
	{
		return this.t_All_cat_Sex_Age_35_to_49_Muslim;
	}

	public void setT_All_cat_Sex_Age_35_to_49_Muslim(
			int t_All_cat_Sex_Age_35_to_49_Muslim)
	{
		this.t_All_cat_Sex_Age_35_to_49_Muslim = t_All_cat_Sex_Age_35_to_49_Muslim;
	}

	public int getT_All_cat_Sex_Age_35_to_49_No_rel()
	{
		return this.t_All_cat_Sex_Age_35_to_49_No_rel;
	}

	public void setT_All_cat_Sex_Age_35_to_49_No_rel(
			int t_All_cat_Sex_Age_35_to_49_No_rel)
	{
		this.t_All_cat_Sex_Age_35_to_49_No_rel = t_All_cat_Sex_Age_35_to_49_No_rel;
	}

	public int getT_All_cat_Sex_Age_35_to_49_Other_rel()
	{
		return this.t_All_cat_Sex_Age_35_to_49_Other_rel;
	}

	public void setT_All_cat_Sex_Age_35_to_49_Other_rel(
			int t_All_cat_Sex_Age_35_to_49_Other_rel)
	{
		this.t_All_cat_Sex_Age_35_to_49_Other_rel = t_All_cat_Sex_Age_35_to_49_Other_rel;
	}

	public int getT_All_cat_Sex_Age_35_to_49_rel_not_stated()
	{
		return this.t_All_cat_Sex_Age_35_to_49_rel_not_stated;
	}

	public void setT_All_cat_Sex_Age_35_to_49_rel_not_stated(
			int t_All_cat_Sex_Age_35_to_49_rel_not_stated)
	{
		this.t_All_cat_Sex_Age_35_to_49_rel_not_stated = t_All_cat_Sex_Age_35_to_49_rel_not_stated;
	}

	public int getT_All_cat_Sex_Age_35_to_49_Sikh()
	{
		return this.t_All_cat_Sex_Age_35_to_49_Sikh;
	}

	public void setT_All_cat_Sex_Age_35_to_49_Sikh(
			int t_All_cat_Sex_Age_35_to_49_Sikh)
	{
		this.t_All_cat_Sex_Age_35_to_49_Sikh = t_All_cat_Sex_Age_35_to_49_Sikh;
	}

	public int getT_All_cat_Sex_Age_35_to_49_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_Age_35_to_49_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_Age_35_to_49_T_All_cat_rel(
			int t_All_cat_Sex_Age_35_to_49_T_All_cat_rel)
	{
		this.t_All_cat_Sex_Age_35_to_49_T_All_cat_rel = t_All_cat_Sex_Age_35_to_49_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_Age_50_to_64_Buddhist()
	{
		return this.t_All_cat_Sex_Age_50_to_64_Buddhist;
	}

	public void setT_All_cat_Sex_Age_50_to_64_Buddhist(
			int t_All_cat_Sex_Age_50_to_64_Buddhist)
	{
		this.t_All_cat_Sex_Age_50_to_64_Buddhist = t_All_cat_Sex_Age_50_to_64_Buddhist;
	}

	public int getT_All_cat_Sex_Age_50_to_64_Christian()
	{
		return this.t_All_cat_Sex_Age_50_to_64_Christian;
	}

	public void setT_All_cat_Sex_Age_50_to_64_Christian(
			int t_All_cat_Sex_Age_50_to_64_Christian)
	{
		this.t_All_cat_Sex_Age_50_to_64_Christian = t_All_cat_Sex_Age_50_to_64_Christian;
	}

	public int getT_All_cat_Sex_Age_50_to_64_Hindu()
	{
		return this.t_All_cat_Sex_Age_50_to_64_Hindu;
	}

	public void setT_All_cat_Sex_Age_50_to_64_Hindu(
			int t_All_cat_Sex_Age_50_to_64_Hindu)
	{
		this.t_All_cat_Sex_Age_50_to_64_Hindu = t_All_cat_Sex_Age_50_to_64_Hindu;
	}

	public int getT_All_cat_Sex_Age_50_to_64_Jewish()
	{
		return this.t_All_cat_Sex_Age_50_to_64_Jewish;
	}

	public void setT_All_cat_Sex_Age_50_to_64_Jewish(
			int t_All_cat_Sex_Age_50_to_64_Jewish)
	{
		this.t_All_cat_Sex_Age_50_to_64_Jewish = t_All_cat_Sex_Age_50_to_64_Jewish;
	}

	public int getT_All_cat_Sex_Age_50_to_64_Muslim()
	{
		return this.t_All_cat_Sex_Age_50_to_64_Muslim;
	}

	public void setT_All_cat_Sex_Age_50_to_64_Muslim(
			int t_All_cat_Sex_Age_50_to_64_Muslim)
	{
		this.t_All_cat_Sex_Age_50_to_64_Muslim = t_All_cat_Sex_Age_50_to_64_Muslim;
	}

	public int getT_All_cat_Sex_Age_50_to_64_No_rel()
	{
		return this.t_All_cat_Sex_Age_50_to_64_No_rel;
	}

	public void setT_All_cat_Sex_Age_50_to_64_No_rel(
			int t_All_cat_Sex_Age_50_to_64_No_rel)
	{
		this.t_All_cat_Sex_Age_50_to_64_No_rel = t_All_cat_Sex_Age_50_to_64_No_rel;
	}

	public int getT_All_cat_Sex_Age_50_to_64_Other_rel()
	{
		return this.t_All_cat_Sex_Age_50_to_64_Other_rel;
	}

	public void setT_All_cat_Sex_Age_50_to_64_Other_rel(
			int t_All_cat_Sex_Age_50_to_64_Other_rel)
	{
		this.t_All_cat_Sex_Age_50_to_64_Other_rel = t_All_cat_Sex_Age_50_to_64_Other_rel;
	}

	public int getT_All_cat_Sex_Age_50_to_64_rel_not_stated()
	{
		return this.t_All_cat_Sex_Age_50_to_64_rel_not_stated;
	}

	public void setT_All_cat_Sex_Age_50_to_64_rel_not_stated(
			int t_All_cat_Sex_Age_50_to_64_rel_not_stated)
	{
		this.t_All_cat_Sex_Age_50_to_64_rel_not_stated = t_All_cat_Sex_Age_50_to_64_rel_not_stated;
	}

	public int getT_All_cat_Sex_Age_50_to_64_Sikh()
	{
		return this.t_All_cat_Sex_Age_50_to_64_Sikh;
	}

	public void setT_All_cat_Sex_Age_50_to_64_Sikh(
			int t_All_cat_Sex_Age_50_to_64_Sikh)
	{
		this.t_All_cat_Sex_Age_50_to_64_Sikh = t_All_cat_Sex_Age_50_to_64_Sikh;
	}

	public int getT_All_cat_Sex_Age_50_to_64_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_Age_50_to_64_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_Age_50_to_64_T_All_cat_rel(
			int t_All_cat_Sex_Age_50_to_64_T_All_cat_rel)
	{
		this.t_All_cat_Sex_Age_50_to_64_T_All_cat_rel = t_All_cat_Sex_Age_50_to_64_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_Age_65_to_74_Buddhist()
	{
		return this.t_All_cat_Sex_Age_65_to_74_Buddhist;
	}

	public void setT_All_cat_Sex_Age_65_to_74_Buddhist(
			int t_All_cat_Sex_Age_65_to_74_Buddhist)
	{
		this.t_All_cat_Sex_Age_65_to_74_Buddhist = t_All_cat_Sex_Age_65_to_74_Buddhist;
	}

	public int getT_All_cat_Sex_Age_65_to_74_Christian()
	{
		return this.t_All_cat_Sex_Age_65_to_74_Christian;
	}

	public void setT_All_cat_Sex_Age_65_to_74_Christian(
			int t_All_cat_Sex_Age_65_to_74_Christian)
	{
		this.t_All_cat_Sex_Age_65_to_74_Christian = t_All_cat_Sex_Age_65_to_74_Christian;
	}

	public int getT_All_cat_Sex_Age_65_to_74_Hindu()
	{
		return this.t_All_cat_Sex_Age_65_to_74_Hindu;
	}

	public void setT_All_cat_Sex_Age_65_to_74_Hindu(
			int t_All_cat_Sex_Age_65_to_74_Hindu)
	{
		this.t_All_cat_Sex_Age_65_to_74_Hindu = t_All_cat_Sex_Age_65_to_74_Hindu;
	}

	public int getT_All_cat_Sex_Age_65_to_74_Jewish()
	{
		return this.t_All_cat_Sex_Age_65_to_74_Jewish;
	}

	public void setT_All_cat_Sex_Age_65_to_74_Jewish(
			int t_All_cat_Sex_Age_65_to_74_Jewish)
	{
		this.t_All_cat_Sex_Age_65_to_74_Jewish = t_All_cat_Sex_Age_65_to_74_Jewish;
	}

	public int getT_All_cat_Sex_Age_65_to_74_Muslim()
	{
		return this.t_All_cat_Sex_Age_65_to_74_Muslim;
	}

	public void setT_All_cat_Sex_Age_65_to_74_Muslim(
			int t_All_cat_Sex_Age_65_to_74_Muslim)
	{
		this.t_All_cat_Sex_Age_65_to_74_Muslim = t_All_cat_Sex_Age_65_to_74_Muslim;
	}

	public int getT_All_cat_Sex_Age_65_to_74_No_rel()
	{
		return this.t_All_cat_Sex_Age_65_to_74_No_rel;
	}

	public void setT_All_cat_Sex_Age_65_to_74_No_rel(
			int t_All_cat_Sex_Age_65_to_74_No_rel)
	{
		this.t_All_cat_Sex_Age_65_to_74_No_rel = t_All_cat_Sex_Age_65_to_74_No_rel;
	}

	public int getT_All_cat_Sex_Age_65_to_74_Other_rel()
	{
		return this.t_All_cat_Sex_Age_65_to_74_Other_rel;
	}

	public void setT_All_cat_Sex_Age_65_to_74_Other_rel(
			int t_All_cat_Sex_Age_65_to_74_Other_rel)
	{
		this.t_All_cat_Sex_Age_65_to_74_Other_rel = t_All_cat_Sex_Age_65_to_74_Other_rel;
	}

	public int getT_All_cat_Sex_Age_65_to_74_rel_not_stated()
	{
		return this.t_All_cat_Sex_Age_65_to_74_rel_not_stated;
	}

	public void setT_All_cat_Sex_Age_65_to_74_rel_not_stated(
			int t_All_cat_Sex_Age_65_to_74_rel_not_stated)
	{
		this.t_All_cat_Sex_Age_65_to_74_rel_not_stated = t_All_cat_Sex_Age_65_to_74_rel_not_stated;
	}

	public int getT_All_cat_Sex_Age_65_to_74_Sikh()
	{
		return this.t_All_cat_Sex_Age_65_to_74_Sikh;
	}

	public void setT_All_cat_Sex_Age_65_to_74_Sikh(
			int t_All_cat_Sex_Age_65_to_74_Sikh)
	{
		this.t_All_cat_Sex_Age_65_to_74_Sikh = t_All_cat_Sex_Age_65_to_74_Sikh;
	}

	public int getT_All_cat_Sex_Age_65_to_74_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_Age_65_to_74_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_Age_65_to_74_T_All_cat_rel(
			int t_All_cat_Sex_Age_65_to_74_T_All_cat_rel)
	{
		this.t_All_cat_Sex_Age_65_to_74_T_All_cat_rel = t_All_cat_Sex_Age_65_to_74_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_Age_75_and_over_Buddhist()
	{
		return this.t_All_cat_Sex_Age_75_and_over_Buddhist;
	}

	public void setT_All_cat_Sex_Age_75_and_over_Buddhist(
			int t_All_cat_Sex_Age_75_and_over_Buddhist)
	{
		this.t_All_cat_Sex_Age_75_and_over_Buddhist = t_All_cat_Sex_Age_75_and_over_Buddhist;
	}

	public int getT_All_cat_Sex_Age_75_and_over_Christian()
	{
		return this.t_All_cat_Sex_Age_75_and_over_Christian;
	}

	public void setT_All_cat_Sex_Age_75_and_over_Christian(
			int t_All_cat_Sex_Age_75_and_over_Christian)
	{
		this.t_All_cat_Sex_Age_75_and_over_Christian = t_All_cat_Sex_Age_75_and_over_Christian;
	}

	public int getT_All_cat_Sex_Age_75_and_over_Hindu()
	{
		return this.t_All_cat_Sex_Age_75_and_over_Hindu;
	}

	public void setT_All_cat_Sex_Age_75_and_over_Hindu(
			int t_All_cat_Sex_Age_75_and_over_Hindu)
	{
		this.t_All_cat_Sex_Age_75_and_over_Hindu = t_All_cat_Sex_Age_75_and_over_Hindu;
	}

	public int getT_All_cat_Sex_Age_75_and_over_Jewish()
	{
		return this.t_All_cat_Sex_Age_75_and_over_Jewish;
	}

	public void setT_All_cat_Sex_Age_75_and_over_Jewish(
			int t_All_cat_Sex_Age_75_and_over_Jewish)
	{
		this.t_All_cat_Sex_Age_75_and_over_Jewish = t_All_cat_Sex_Age_75_and_over_Jewish;
	}

	public int getT_All_cat_Sex_Age_75_and_over_Muslim()
	{
		return this.t_All_cat_Sex_Age_75_and_over_Muslim;
	}

	public void setT_All_cat_Sex_Age_75_and_over_Muslim(
			int t_All_cat_Sex_Age_75_and_over_Muslim)
	{
		this.t_All_cat_Sex_Age_75_and_over_Muslim = t_All_cat_Sex_Age_75_and_over_Muslim;
	}

	public int getT_All_cat_Sex_Age_75_and_over_No_rel()
	{
		return this.t_All_cat_Sex_Age_75_and_over_No_rel;
	}

	public void setT_All_cat_Sex_Age_75_and_over_No_rel(
			int t_All_cat_Sex_Age_75_and_over_No_rel)
	{
		this.t_All_cat_Sex_Age_75_and_over_No_rel = t_All_cat_Sex_Age_75_and_over_No_rel;
	}

	public int getT_All_cat_Sex_Age_75_and_over_Other_rel()
	{
		return this.t_All_cat_Sex_Age_75_and_over_Other_rel;
	}

	public void setT_All_cat_Sex_Age_75_and_over_Other_rel(
			int t_All_cat_Sex_Age_75_and_over_Other_rel)
	{
		this.t_All_cat_Sex_Age_75_and_over_Other_rel = t_All_cat_Sex_Age_75_and_over_Other_rel;
	}

	public int getT_All_cat_Sex_Age_75_and_over_rel_not_stated()
	{
		return this.t_All_cat_Sex_Age_75_and_over_rel_not_stated;
	}

	public void setT_All_cat_Sex_Age_75_and_over_rel_not_stated(
			int t_All_cat_Sex_Age_75_and_over_rel_not_stated)
	{
		this.t_All_cat_Sex_Age_75_and_over_rel_not_stated = t_All_cat_Sex_Age_75_and_over_rel_not_stated;
	}

	public int getT_All_cat_Sex_Age_75_and_over_Sikh()
	{
		return this.t_All_cat_Sex_Age_75_and_over_Sikh;
	}

	public void setT_All_cat_Sex_Age_75_and_over_Sikh(
			int t_All_cat_Sex_Age_75_and_over_Sikh)
	{
		this.t_All_cat_Sex_Age_75_and_over_Sikh = t_All_cat_Sex_Age_75_and_over_Sikh;
	}

	public int getT_All_cat_Sex_Age_75_and_over_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_Age_75_and_over_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_Age_75_and_over_T_All_cat_rel(
			int t_All_cat_Sex_Age_75_and_over_T_All_cat_rel)
	{
		this.t_All_cat_Sex_Age_75_and_over_T_All_cat_rel = t_All_cat_Sex_Age_75_and_over_T_All_cat_rel;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_Buddhist()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_Buddhist;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_Buddhist(
			int t_All_cat_Sex_T_All_cat_Age_Buddhist)
	{
		this.t_All_cat_Sex_T_All_cat_Age_Buddhist = t_All_cat_Sex_T_All_cat_Age_Buddhist;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_Christian()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_Christian;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_Christian(
			int t_All_cat_Sex_T_All_cat_Age_Christian)
	{
		this.t_All_cat_Sex_T_All_cat_Age_Christian = t_All_cat_Sex_T_All_cat_Age_Christian;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_Hindu()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_Hindu;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_Hindu(
			int t_All_cat_Sex_T_All_cat_Age_Hindu)
	{
		this.t_All_cat_Sex_T_All_cat_Age_Hindu = t_All_cat_Sex_T_All_cat_Age_Hindu;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_Jewish()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_Jewish;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_Jewish(
			int t_All_cat_Sex_T_All_cat_Age_Jewish)
	{
		this.t_All_cat_Sex_T_All_cat_Age_Jewish = t_All_cat_Sex_T_All_cat_Age_Jewish;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_Muslim()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_Muslim;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_Muslim(
			int t_All_cat_Sex_T_All_cat_Age_Muslim)
	{
		this.t_All_cat_Sex_T_All_cat_Age_Muslim = t_All_cat_Sex_T_All_cat_Age_Muslim;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_No_rel()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_No_rel;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_No_rel(
			int t_All_cat_Sex_T_All_cat_Age_No_rel)
	{
		this.t_All_cat_Sex_T_All_cat_Age_No_rel = t_All_cat_Sex_T_All_cat_Age_No_rel;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_Other_rel()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_Other_rel;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_Other_rel(
			int t_All_cat_Sex_T_All_cat_Age_Other_rel)
	{
		this.t_All_cat_Sex_T_All_cat_Age_Other_rel = t_All_cat_Sex_T_All_cat_Age_Other_rel;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_rel_not_stated()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_rel_not_stated;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_rel_not_stated(
			int t_All_cat_Sex_T_All_cat_Age_rel_not_stated)
	{
		this.t_All_cat_Sex_T_All_cat_Age_rel_not_stated = t_All_cat_Sex_T_All_cat_Age_rel_not_stated;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_Sikh()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_Sikh;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_Sikh(
			int t_All_cat_Sex_T_All_cat_Age_Sikh)
	{
		this.t_All_cat_Sex_T_All_cat_Age_Sikh = t_All_cat_Sex_T_All_cat_Age_Sikh;
	}

	public int getT_All_cat_Sex_T_All_cat_Age_T_All_cat_rel()
	{
		return this.t_All_cat_Sex_T_All_cat_Age_T_All_cat_rel;
	}

	public void setT_All_cat_Sex_T_All_cat_Age_T_All_cat_rel(
			int t_All_cat_Sex_T_All_cat_Age_T_All_cat_rel)
	{
		this.t_All_cat_Sex_T_All_cat_Age_T_All_cat_rel = t_All_cat_Sex_T_All_cat_Age_T_All_cat_rel;
	}

}