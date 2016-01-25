package gov.ons.ness.datarp.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the population database table.
 * 
 */
@Entity
@Table(name = "population")
@NamedQueries({
		@NamedQuery(name = "Population.findAll", query = "SELECT p FROM Population p"),
		@NamedQuery(name = "Population.find", query = "SELECT p FROM Population p WHERE p.geographic_ID IN (:ids)") })
public class Population extends DataRpEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Column(name = "0_Female")
	private int v_0_Female;

	@Column(name = "0_Male")
	private int v_0_Male;

	@Column(name = "0_Total_All_Persons")
	private int v_0_Total_All_Persons;

	@Column(name = "1_Female")
	private int v_1_Female;

	@Column(name = "1_Male")
	private int v_1_Male;

	@Column(name = "1_Total_All_Persons")
	private int v_1_Total_All_Persons;

	@Column(name = "10_Female")
	private int v_10_Female;

	@Column(name = "10_Male")
	private int v_10_Male;

	@Column(name = "10_Total_All_Persons")
	private int v_10_Total_All_Persons;

	@Column(name = "11_Female")
	private int v_11_Female;

	@Column(name = "11_Male")
	private int v_11_Male;

	@Column(name = "11_Total_All_Persons")
	private int v_11_Total_All_Persons;

	@Column(name = "12_Female")
	private int v_12_Female;

	@Column(name = "12_Male")
	private int v_12_Male;

	@Column(name = "12_Total_All_Persons")
	private int v_12_Total_All_Persons;

	@Column(name = "13_Female")
	private int v_13_Female;

	@Column(name = "13_Male")
	private int v_13_Male;

	@Column(name = "13_Total_All_Persons")
	private int v_13_Total_All_Persons;

	@Column(name = "14_Female")
	private int v_14_Female;

	@Column(name = "14_Male")
	private int v_14_Male;

	@Column(name = "14_Total_All_Persons")
	private int v_14_Total_All_Persons;

	@Column(name = "15_Female")
	private int v_15_Female;

	@Column(name = "15_Male")
	private int v_15_Male;

	@Column(name = "15_Total_All_Persons")
	private int v_15_Total_All_Persons;

	@Column(name = "16_Female")
	private int v_16_Female;

	@Column(name = "16_Male")
	private int v_16_Male;

	@Column(name = "16_Total_All_Persons")
	private int v_16_Total_All_Persons;

	@Column(name = "17_Female")
	private int v_17_Female;

	@Column(name = "17_Male")
	private int v_17_Male;

	@Column(name = "17_Total_All_Persons")
	private int v_17_Total_All_Persons;

	@Column(name = "18_Female")
	private int v_18_Female;

	@Column(name = "18_Male")
	private int v_18_Male;

	@Column(name = "18_Total_All_Persons")
	private int v_18_Total_All_Persons;

	@Column(name = "19_Female")
	private int v_19_Female;

	@Column(name = "19_Male")
	private int v_19_Male;

	@Column(name = "19_Total_All_Persons")
	private int v_19_Total_All_Persons;

	@Column(name = "2_Female")
	private int v_2_Female;

	@Column(name = "2_Male")
	private int v_2_Male;

	@Column(name = "2_Total_All_Persons")
	private int v_2_Total_All_Persons;

	@Column(name = "20_Female")
	private int v_20_Female;

	@Column(name = "20_Male")
	private int v_20_Male;

	@Column(name = "20_Total_All_Persons")
	private int v_20_Total_All_Persons;

	@Column(name = "21_Female")
	private int v_21_Female;

	@Column(name = "21_Male")
	private int v_21_Male;

	@Column(name = "21_Total_All_Persons")
	private int v_21_Total_All_Persons;

	@Column(name = "22_Female")
	private int v_22_Female;

	@Column(name = "22_Male")
	private int v_22_Male;

	@Column(name = "22_Total_All_Persons")
	private int v_22_Total_All_Persons;

	@Column(name = "23_Female")
	private int v_23_Female;

	@Column(name = "23_Male")
	private int v_23_Male;

	@Column(name = "23_Total_All_Persons")
	private int v_23_Total_All_Persons;

	@Column(name = "24_Female")
	private int v_24_Female;

	@Column(name = "24_Male")
	private int v_24_Male;

	@Column(name = "24_Total_All_Persons")
	private int v_24_Total_All_Persons;

	@Column(name = "25_Female")
	private int v_25_Female;

	@Column(name = "25_Male")
	private int v_25_Male;

	@Column(name = "25_Total_All_Persons")
	private int v_25_Total_All_Persons;

	@Column(name = "26_Female")
	private int v_26_Female;

	@Column(name = "26_Male")
	private int v_26_Male;

	@Column(name = "26_Total_All_Persons")
	private int v_26_Total_All_Persons;

	@Column(name = "27_Female")
	private int v_27_Female;

	@Column(name = "27_Male")
	private int v_27_Male;

	@Column(name = "27_Total_All_Persons")
	private int v_27_Total_All_Persons;

	@Column(name = "28_Female")
	private int v_28_Female;

	@Column(name = "28_Male")
	private int v_28_Male;

	@Column(name = "28_Total_All_Persons")
	private int v_28_Total_All_Persons;

	@Column(name = "29_Female")
	private int v_29_Female;

	@Column(name = "29_Male")
	private int v_29_Male;

	@Column(name = "29_Total_All_Persons")
	private int v_29_Total_All_Persons;

	@Column(name = "3_Female")
	private int v_3_Female;

	@Column(name = "3_Male")
	private int v_3_Male;

	@Column(name = "3_Total_All_Persons")
	private int v_3_Total_All_Persons;

	@Column(name = "30_Female")
	private int v_30_Female;

	@Column(name = "30_Male")
	private int v_30_Male;

	@Column(name = "30_Total_All_Persons")
	private int v_30_Total_All_Persons;

	@Column(name = "31_Female")
	private int v_31_Female;

	@Column(name = "31_Male")
	private int v_31_Male;

	@Column(name = "31_Total_All_Persons")
	private int v_31_Total_All_Persons;

	@Column(name = "32_Female")
	private int v_32_Female;

	@Column(name = "32_Male")
	private int v_32_Male;

	@Column(name = "32_Total_All_Persons")
	private int v_32_Total_All_Persons;

	@Column(name = "33_Female")
	private int v_33_Female;

	@Column(name = "33_Male")
	private int v_33_Male;

	@Column(name = "33_Total_All_Persons")
	private int v_33_Total_All_Persons;

	@Column(name = "34_Female")
	private int v_34_Female;

	@Column(name = "34_Male")
	private int v_34_Male;

	@Column(name = "34_Total_All_Persons")
	private int v_34_Total_All_Persons;

	@Column(name = "35_Female")
	private int v_35_Female;

	@Column(name = "35_Male")
	private int v_35_Male;

	@Column(name = "35_Total_All_Persons")
	private int v_35_Total_All_Persons;

	@Column(name = "36_Female")
	private int v_36_Female;

	@Column(name = "36_Male")
	private int v_36_Male;

	@Column(name = "36_Total_All_Persons")
	private int v_36_Total_All_Persons;

	@Column(name = "37_Female")
	private int v_37_Female;

	@Column(name = "37_Male")
	private int v_37_Male;

	@Column(name = "37_Total_All_Persons")
	private int v_37_Total_All_Persons;

	@Column(name = "38_Female")
	private int v_38_Female;

	@Column(name = "38_Male")
	private int v_38_Male;

	@Column(name = "38_Total_All_Persons")
	private int v_38_Total_All_Persons;

	@Column(name = "39_Female")
	private int v_39_Female;

	@Column(name = "39_Male")
	private int v_39_Male;

	@Column(name = "39_Total_All_Persons")
	private int v_39_Total_All_Persons;

	@Column(name = "4_Female")
	private int v_4_Female;

	@Column(name = "4_Male")
	private int v_4_Male;

	@Column(name = "4_Total_All_Persons")
	private int v_4_Total_All_Persons;

	@Column(name = "40_Female")
	private int v_40_Female;

	@Column(name = "40_Male")
	private int v_40_Male;

	@Column(name = "40_Total_All_Persons")
	private int v_40_Total_All_Persons;

	@Column(name = "41_Female")
	private int v_41_Female;

	@Column(name = "41_Male")
	private int v_41_Male;

	@Column(name = "41_Total_All_Persons")
	private int v_41_Total_All_Persons;

	@Column(name = "42_Female")
	private int v_42_Female;

	@Column(name = "42_Male")
	private int v_42_Male;

	@Column(name = "42_Total_All_Persons")
	private int v_42_Total_All_Persons;

	@Column(name = "43_Female")
	private int v_43_Female;

	@Column(name = "43_Male")
	private int v_43_Male;

	@Column(name = "43_Total_All_Persons")
	private int v_43_Total_All_Persons;

	@Column(name = "44_Female")
	private int v_44_Female;

	@Column(name = "44_Male")
	private int v_44_Male;

	@Column(name = "44_Total_All_Persons")
	private int v_44_Total_All_Persons;

	@Column(name = "45_Female")
	private int v_45_Female;

	@Column(name = "45_Male")
	private int v_45_Male;

	@Column(name = "45_Total_All_Persons")
	private int v_45_Total_All_Persons;

	@Column(name = "46_Female")
	private int v_46_Female;

	@Column(name = "46_Male")
	private int v_46_Male;

	@Column(name = "46_Total_All_Persons")
	private int v_46_Total_All_Persons;

	@Column(name = "47_Female")
	private int v_47_Female;

	@Column(name = "47_Male")
	private int v_47_Male;

	@Column(name = "47_Total_All_Persons")
	private int v_47_Total_All_Persons;

	@Column(name = "48_Female")
	private int v_48_Female;

	@Column(name = "48_Male")
	private int v_48_Male;

	@Column(name = "48_Total_All_Persons")
	private int v_48_Total_All_Persons;

	@Column(name = "49_Female")
	private int v_49_Female;

	@Column(name = "49_Male")
	private int v_49_Male;

	@Column(name = "49_Total_All_Persons")
	private int v_49_Total_All_Persons;

	@Column(name = "5_Female")
	private int v_5_Female;

	@Column(name = "5_Male")
	private int v_5_Male;

	@Column(name = "5_Total_All_Persons")
	private int v_5_Total_All_Persons;

	@Column(name = "50_Female")
	private int v_50_Female;

	@Column(name = "50_Male")
	private int v_50_Male;

	@Column(name = "50_Total_All_Persons")
	private int v_50_Total_All_Persons;

	@Column(name = "51_Female")
	private int v_51_Female;

	@Column(name = "51_Male")
	private int v_51_Male;

	@Column(name = "51_Total_All_Persons")
	private int v_51_Total_All_Persons;

	@Column(name = "52_Female")
	private int v_52_Female;

	@Column(name = "52_Male")
	private int v_52_Male;

	@Column(name = "52_Total_All_Persons")
	private int v_52_Total_All_Persons;

	@Column(name = "53_Female")
	private int v_53_Female;

	@Column(name = "53_Male")
	private int v_53_Male;

	@Column(name = "53_Total_All_Persons")
	private int v_53_Total_All_Persons;

	@Column(name = "54_Female")
	private int v_54_Female;

	@Column(name = "54_Male")
	private int v_54_Male;

	@Column(name = "54_Total_All_Persons")
	private int v_54_Total_All_Persons;

	@Column(name = "55_Female")
	private int v_55_Female;

	@Column(name = "55_Male")
	private int v_55_Male;

	@Column(name = "55_Total_All_Persons")
	private int v_55_Total_All_Persons;

	@Column(name = "56_Female")
	private int v_56_Female;

	@Column(name = "56_Male")
	private int v_56_Male;

	@Column(name = "56_Total_All_Persons")
	private int v_56_Total_All_Persons;

	@Column(name = "57_Female")
	private int v_57_Female;

	@Column(name = "57_Male")
	private int v_57_Male;

	@Column(name = "57_Total_All_Persons")
	private int v_57_Total_All_Persons;

	@Column(name = "58_Female")
	private int v_58_Female;

	@Column(name = "58_Male")
	private int v_58_Male;

	@Column(name = "58_Total_All_Persons")
	private int v_58_Total_All_Persons;

	@Column(name = "59_Female")
	private int v_59_Female;

	@Column(name = "59_Male")
	private int v_59_Male;

	@Column(name = "59_Total_All_Persons")
	private int v_59_Total_All_Persons;

	@Column(name = "6_Female")
	private int v_6_Female;

	@Column(name = "6_Male")
	private int v_6_Male;

	@Column(name = "6_Total_All_Persons")
	private int v_6_Total_All_Persons;

	@Column(name = "60_Female")
	private int v_60_Female;

	@Column(name = "60_Male")
	private int v_60_Male;

	@Column(name = "60_Total_All_Persons")
	private int v_60_Total_All_Persons;

	@Column(name = "61_Female")
	private int v_61_Female;

	@Column(name = "61_Male")
	private int v_61_Male;

	@Column(name = "61_Total_All_Persons")
	private int v_61_Total_All_Persons;

	@Column(name = "62_Female")
	private int v_62_Female;

	@Column(name = "62_Male")
	private int v_62_Male;

	@Column(name = "62_Total_All_Persons")
	private int v_62_Total_All_Persons;

	@Column(name = "63_Female")
	private int v_63_Female;

	@Column(name = "63_Male")
	private int v_63_Male;

	@Column(name = "63_Total_All_Persons")
	private int v_63_Total_All_Persons;

	@Column(name = "64_Female")
	private int v_64_Female;

	@Column(name = "64_Male")
	private int v_64_Male;

	@Column(name = "64_Total_All_Persons")
	private int v_64_Total_All_Persons;

	@Column(name = "65_Female")
	private int v_65_Female;

	@Column(name = "65_Male")
	private int v_65_Male;

	@Column(name = "65_Total_All_Persons")
	private int v_65_Total_All_Persons;

	@Column(name = "66_Female")
	private int v_66_Female;

	@Column(name = "66_Male")
	private int v_66_Male;

	@Column(name = "66_Total_All_Persons")
	private int v_66_Total_All_Persons;

	@Column(name = "67_Female")
	private int v_67_Female;

	@Column(name = "67_Male")
	private int v_67_Male;

	@Column(name = "67_Total_All_Persons")
	private int v_67_Total_All_Persons;

	@Column(name = "68_Female")
	private int v_68_Female;

	@Column(name = "68_Male")
	private int v_68_Male;

	@Column(name = "68_Total_All_Persons")
	private int v_68_Total_All_Persons;

	@Column(name = "69_Female")
	private int v_69_Female;

	@Column(name = "69_Male")
	private int v_69_Male;

	@Column(name = "69_Total_All_Persons")
	private int v_69_Total_All_Persons;

	@Column(name = "7_Female")
	private int v_7_Female;

	@Column(name = "7_Male")
	private int v_7_Male;

	@Column(name = "7_Total_All_Persons")
	private int v_7_Total_All_Persons;

	@Column(name = "70_Female")
	private int v_70_Female;

	@Column(name = "70_Male")
	private int v_70_Male;

	@Column(name = "70_Total_All_Persons")
	private int v_70_Total_All_Persons;

	@Column(name = "71_Female")
	private int v_71_Female;

	@Column(name = "71_Male")
	private int v_71_Male;

	@Column(name = "71_Total_All_Persons")
	private int v_71_Total_All_Persons;

	@Column(name = "72_Female")
	private int v_72_Female;

	@Column(name = "72_Male")
	private int v_72_Male;

	@Column(name = "72_Total_All_Persons")
	private int v_72_Total_All_Persons;

	@Column(name = "73_Female")
	private int v_73_Female;

	@Column(name = "73_Male")
	private int v_73_Male;

	@Column(name = "73_Total_All_Persons")
	private int v_73_Total_All_Persons;

	@Column(name = "74_Female")
	private int v_74_Female;

	@Column(name = "74_Male")
	private int v_74_Male;

	@Column(name = "74_Total_All_Persons")
	private int v_74_Total_All_Persons;

	@Column(name = "75_Female")
	private int v_75_Female;

	@Column(name = "75_Male")
	private int v_75_Male;

	@Column(name = "75_Total_All_Persons")
	private int v_75_Total_All_Persons;

	@Column(name = "76_Female")
	private int v_76_Female;

	@Column(name = "76_Male")
	private int v_76_Male;

	@Column(name = "76_Total_All_Persons")
	private int v_76_Total_All_Persons;

	@Column(name = "77_Female")
	private int v_77_Female;

	@Column(name = "77_Male")
	private int v_77_Male;

	@Column(name = "77_Total_All_Persons")
	private int v_77_Total_All_Persons;

	@Column(name = "78_Female")
	private int v_78_Female;

	@Column(name = "78_Male")
	private int v_78_Male;

	@Column(name = "78_Total_All_Persons")
	private int v_78_Total_All_Persons;

	@Column(name = "79_Female")
	private int v_79_Female;

	@Column(name = "79_Male")
	private int v_79_Male;

	@Column(name = "79_Total_All_Persons")
	private int v_79_Total_All_Persons;

	@Column(name = "8_Female")
	private int v_8_Female;

	@Column(name = "8_Male")
	private int v_8_Male;

	@Column(name = "8_Total_All_Persons")
	private int v_8_Total_All_Persons;

	@Column(name = "80_Female")
	private int v_80_Female;

	@Column(name = "80_Male")
	private int v_80_Male;

	@Column(name = "80_Total_All_Persons")
	private int v_80_Total_All_Persons;

	@Column(name = "81_Female")
	private int v_81_Female;

	@Column(name = "81_Male")
	private int v_81_Male;

	@Column(name = "81_Total_All_Persons")
	private int v_81_Total_All_Persons;

	@Column(name = "82_Female")
	private int v_82_Female;

	@Column(name = "82_Male")
	private int v_82_Male;

	@Column(name = "82_Total_All_Persons")
	private int v_82_Total_All_Persons;

	@Column(name = "83_Female")
	private int v_83_Female;

	@Column(name = "83_Male")
	private int v_83_Male;

	@Column(name = "83_Total_All_Persons")
	private int v_83_Total_All_Persons;

	@Column(name = "84_Female")
	private int v_84_Female;

	@Column(name = "84_Male")
	private int v_84_Male;

	@Column(name = "84_Total_All_Persons")
	private int v_84_Total_All_Persons;

	@Column(name = "85_Female")
	private int v_85_Female;

	@Column(name = "85_Male")
	private int v_85_Male;

	@Column(name = "85_Total_All_Persons")
	private int v_85_Total_All_Persons;

	@Column(name = "86_Female")
	private int v_86_Female;

	@Column(name = "86_Male")
	private int v_86_Male;

	@Column(name = "86_Total_All_Persons")
	private int v_86_Total_All_Persons;

	@Column(name = "87_Female")
	private int v_87_Female;

	@Column(name = "87_Male")
	private int v_87_Male;

	@Column(name = "87_Total_All_Persons")
	private int v_87_Total_All_Persons;

	@Column(name = "88_Female")
	private int v_88_Female;

	@Column(name = "88_Male")
	private int v_88_Male;

	@Column(name = "88_Total_All_Persons")
	private int v_88_Total_All_Persons;

	@Column(name = "89_Female")
	private int v_89_Female;

	@Column(name = "89_Male")
	private int v_89_Male;

	@Column(name = "89_Total_All_Persons")
	private int v_89_Total_All_Persons;

	@Column(name = "9_Female")
	private int v_9_Female;

	@Column(name = "9_Male")
	private int v_9_Male;

	@Column(name = "9_Total_All_Persons")
	private int v_9_Total_All_Persons;

	@Column(name = "90_and_over_Female")
	private int v_90_and_over_Female;

	@Column(name = "90_and_over_Male")
	private int v_90_and_over_Male;

	@Column(name = "90_and_over_Total_All_Persons")
	private int v_90_and_over_Total_All_Persons;

	private int total_All_Ages_Female;

	private int total_All_Ages_Male;

	private int total_All_Ages_Total_All_Persons;

	public Population()
	{
	}

	public int getV_0_Female()
	{
		return v_0_Female;
	}

	public void setV_0_Female(int v_0_Female)
	{
		this.v_0_Female = v_0_Female;
	}

	public int getV_0_Male()
	{
		return v_0_Male;
	}

	public void setV_0_Male(int v_0_Male)
	{
		this.v_0_Male = v_0_Male;
	}

	public int getV_0_Total_All_Persons()
	{
		return v_0_Total_All_Persons;
	}

	public void setV_0_Total_All_Persons(int v_0_Total_All_Persons)
	{
		this.v_0_Total_All_Persons = v_0_Total_All_Persons;
	}

	public int getV_1_Female()
	{
		return v_1_Female;
	}

	public void setV_1_Female(int v_1_Female)
	{
		this.v_1_Female = v_1_Female;
	}

	public int getV_1_Male()
	{
		return v_1_Male;
	}

	public void setV_1_Male(int v_1_Male)
	{
		this.v_1_Male = v_1_Male;
	}

	public int getV_1_Total_All_Persons()
	{
		return v_1_Total_All_Persons;
	}

	public void setV_1_Total_All_Persons(int v_1_Total_All_Persons)
	{
		this.v_1_Total_All_Persons = v_1_Total_All_Persons;
	}

	public int getV_10_Female()
	{
		return v_10_Female;
	}

	public void setV_10_Female(int v_10_Female)
	{
		this.v_10_Female = v_10_Female;
	}

	public int getV_10_Male()
	{
		return v_10_Male;
	}

	public void setV_10_Male(int v_10_Male)
	{
		this.v_10_Male = v_10_Male;
	}

	public int getV_10_Total_All_Persons()
	{
		return v_10_Total_All_Persons;
	}

	public void setV_10_Total_All_Persons(int v_10_Total_All_Persons)
	{
		this.v_10_Total_All_Persons = v_10_Total_All_Persons;
	}

	public int getV_11_Female()
	{
		return v_11_Female;
	}

	public void setV_11_Female(int v_11_Female)
	{
		this.v_11_Female = v_11_Female;
	}

	public int getV_11_Male()
	{
		return v_11_Male;
	}

	public void setV_11_Male(int v_11_Male)
	{
		this.v_11_Male = v_11_Male;
	}

	public int getV_11_Total_All_Persons()
	{
		return v_11_Total_All_Persons;
	}

	public void setV_11_Total_All_Persons(int v_11_Total_All_Persons)
	{
		this.v_11_Total_All_Persons = v_11_Total_All_Persons;
	}

	public int getV_12_Female()
	{
		return v_12_Female;
	}

	public void setV_12_Female(int v_12_Female)
	{
		this.v_12_Female = v_12_Female;
	}

	public int getV_12_Male()
	{
		return v_12_Male;
	}

	public void setV_12_Male(int v_12_Male)
	{
		this.v_12_Male = v_12_Male;
	}

	public int getV_12_Total_All_Persons()
	{
		return v_12_Total_All_Persons;
	}

	public void setV_12_Total_All_Persons(int v_12_Total_All_Persons)
	{
		this.v_12_Total_All_Persons = v_12_Total_All_Persons;
	}

	public int getV_13_Female()
	{
		return v_13_Female;
	}

	public void setV_13_Female(int v_13_Female)
	{
		this.v_13_Female = v_13_Female;
	}

	public int getV_13_Male()
	{
		return v_13_Male;
	}

	public void setV_13_Male(int v_13_Male)
	{
		this.v_13_Male = v_13_Male;
	}

	public int getV_13_Total_All_Persons()
	{
		return v_13_Total_All_Persons;
	}

	public void setV_13_Total_All_Persons(int v_13_Total_All_Persons)
	{
		this.v_13_Total_All_Persons = v_13_Total_All_Persons;
	}

	public int getV_14_Female()
	{
		return v_14_Female;
	}

	public void setV_14_Female(int v_14_Female)
	{
		this.v_14_Female = v_14_Female;
	}

	public int getV_14_Male()
	{
		return v_14_Male;
	}

	public void setV_14_Male(int v_14_Male)
	{
		this.v_14_Male = v_14_Male;
	}

	public int getV_14_Total_All_Persons()
	{
		return v_14_Total_All_Persons;
	}

	public void setV_14_Total_All_Persons(int v_14_Total_All_Persons)
	{
		this.v_14_Total_All_Persons = v_14_Total_All_Persons;
	}

	public int getV_15_Female()
	{
		return v_15_Female;
	}

	public void setV_15_Female(int v_15_Female)
	{
		this.v_15_Female = v_15_Female;
	}

	public int getV_15_Male()
	{
		return v_15_Male;
	}

	public void setV_15_Male(int v_15_Male)
	{
		this.v_15_Male = v_15_Male;
	}

	public int getV_15_Total_All_Persons()
	{
		return v_15_Total_All_Persons;
	}

	public void setV_15_Total_All_Persons(int v_15_Total_All_Persons)
	{
		this.v_15_Total_All_Persons = v_15_Total_All_Persons;
	}

	public int getV_16_Female()
	{
		return v_16_Female;
	}

	public void setV_16_Female(int v_16_Female)
	{
		this.v_16_Female = v_16_Female;
	}

	public int getV_16_Male()
	{
		return v_16_Male;
	}

	public void setV_16_Male(int v_16_Male)
	{
		this.v_16_Male = v_16_Male;
	}

	public int getV_16_Total_All_Persons()
	{
		return v_16_Total_All_Persons;
	}

	public void setV_16_Total_All_Persons(int v_16_Total_All_Persons)
	{
		this.v_16_Total_All_Persons = v_16_Total_All_Persons;
	}

	public int getV_17_Female()
	{
		return v_17_Female;
	}

	public void setV_17_Female(int v_17_Female)
	{
		this.v_17_Female = v_17_Female;
	}

	public int getV_17_Male()
	{
		return v_17_Male;
	}

	public void setV_17_Male(int v_17_Male)
	{
		this.v_17_Male = v_17_Male;
	}

	public int getV_17_Total_All_Persons()
	{
		return v_17_Total_All_Persons;
	}

	public void setV_17_Total_All_Persons(int v_17_Total_All_Persons)
	{
		this.v_17_Total_All_Persons = v_17_Total_All_Persons;
	}

	public int getV_18_Female()
	{
		return v_18_Female;
	}

	public void setV_18_Female(int v_18_Female)
	{
		this.v_18_Female = v_18_Female;
	}

	public int getV_18_Male()
	{
		return v_18_Male;
	}

	public void setV_18_Male(int v_18_Male)
	{
		this.v_18_Male = v_18_Male;
	}

	public int getV_18_Total_All_Persons()
	{
		return v_18_Total_All_Persons;
	}

	public void setV_18_Total_All_Persons(int v_18_Total_All_Persons)
	{
		this.v_18_Total_All_Persons = v_18_Total_All_Persons;
	}

	public int getV_19_Female()
	{
		return v_19_Female;
	}

	public void setV_19_Female(int v_19_Female)
	{
		this.v_19_Female = v_19_Female;
	}

	public int getV_19_Male()
	{
		return v_19_Male;
	}

	public void setV_19_Male(int v_19_Male)
	{
		this.v_19_Male = v_19_Male;
	}

	public int getV_19_Total_All_Persons()
	{
		return v_19_Total_All_Persons;
	}

	public void setV_19_Total_All_Persons(int v_19_Total_All_Persons)
	{
		this.v_19_Total_All_Persons = v_19_Total_All_Persons;
	}

	public int getV_2_Female()
	{
		return v_2_Female;
	}

	public void setV_2_Female(int v_2_Female)
	{
		this.v_2_Female = v_2_Female;
	}

	public int getV_2_Male()
	{
		return v_2_Male;
	}

	public void setV_2_Male(int v_2_Male)
	{
		this.v_2_Male = v_2_Male;
	}

	public int getV_2_Total_All_Persons()
	{
		return v_2_Total_All_Persons;
	}

	public void setV_2_Total_All_Persons(int v_2_Total_All_Persons)
	{
		this.v_2_Total_All_Persons = v_2_Total_All_Persons;
	}

	public int getV_20_Female()
	{
		return v_20_Female;
	}

	public void setV_20_Female(int v_20_Female)
	{
		this.v_20_Female = v_20_Female;
	}

	public int getV_20_Male()
	{
		return v_20_Male;
	}

	public void setV_20_Male(int v_20_Male)
	{
		this.v_20_Male = v_20_Male;
	}

	public int getV_20_Total_All_Persons()
	{
		return v_20_Total_All_Persons;
	}

	public void setV_20_Total_All_Persons(int v_20_Total_All_Persons)
	{
		this.v_20_Total_All_Persons = v_20_Total_All_Persons;
	}

	public int getV_21_Female()
	{
		return v_21_Female;
	}

	public void setV_21_Female(int v_21_Female)
	{
		this.v_21_Female = v_21_Female;
	}

	public int getV_21_Male()
	{
		return v_21_Male;
	}

	public void setV_21_Male(int v_21_Male)
	{
		this.v_21_Male = v_21_Male;
	}

	public int getV_21_Total_All_Persons()
	{
		return v_21_Total_All_Persons;
	}

	public void setV_21_Total_All_Persons(int v_21_Total_All_Persons)
	{
		this.v_21_Total_All_Persons = v_21_Total_All_Persons;
	}

	public int getV_22_Female()
	{
		return v_22_Female;
	}

	public void setV_22_Female(int v_22_Female)
	{
		this.v_22_Female = v_22_Female;
	}

	public int getV_22_Male()
	{
		return v_22_Male;
	}

	public void setV_22_Male(int v_22_Male)
	{
		this.v_22_Male = v_22_Male;
	}

	public int getV_22_Total_All_Persons()
	{
		return v_22_Total_All_Persons;
	}

	public void setV_22_Total_All_Persons(int v_22_Total_All_Persons)
	{
		this.v_22_Total_All_Persons = v_22_Total_All_Persons;
	}

	public int getV_23_Female()
	{
		return v_23_Female;
	}

	public void setV_23_Female(int v_23_Female)
	{
		this.v_23_Female = v_23_Female;
	}

	public int getV_23_Male()
	{
		return v_23_Male;
	}

	public void setV_23_Male(int v_23_Male)
	{
		this.v_23_Male = v_23_Male;
	}

	public int getV_23_Total_All_Persons()
	{
		return v_23_Total_All_Persons;
	}

	public void setV_23_Total_All_Persons(int v_23_Total_All_Persons)
	{
		this.v_23_Total_All_Persons = v_23_Total_All_Persons;
	}

	public int getV_24_Female()
	{
		return v_24_Female;
	}

	public void setV_24_Female(int v_24_Female)
	{
		this.v_24_Female = v_24_Female;
	}

	public int getV_24_Male()
	{
		return v_24_Male;
	}

	public void setV_24_Male(int v_24_Male)
	{
		this.v_24_Male = v_24_Male;
	}

	public int getV_24_Total_All_Persons()
	{
		return v_24_Total_All_Persons;
	}

	public void setV_24_Total_All_Persons(int v_24_Total_All_Persons)
	{
		this.v_24_Total_All_Persons = v_24_Total_All_Persons;
	}

	public int getV_25_Female()
	{
		return v_25_Female;
	}

	public void setV_25_Female(int v_25_Female)
	{
		this.v_25_Female = v_25_Female;
	}

	public int getV_25_Male()
	{
		return v_25_Male;
	}

	public void setV_25_Male(int v_25_Male)
	{
		this.v_25_Male = v_25_Male;
	}

	public int getV_25_Total_All_Persons()
	{
		return v_25_Total_All_Persons;
	}

	public void setV_25_Total_All_Persons(int v_25_Total_All_Persons)
	{
		this.v_25_Total_All_Persons = v_25_Total_All_Persons;
	}

	public int getV_26_Female()
	{
		return v_26_Female;
	}

	public void setV_26_Female(int v_26_Female)
	{
		this.v_26_Female = v_26_Female;
	}

	public int getV_26_Male()
	{
		return v_26_Male;
	}

	public void setV_26_Male(int v_26_Male)
	{
		this.v_26_Male = v_26_Male;
	}

	public int getV_26_Total_All_Persons()
	{
		return v_26_Total_All_Persons;
	}

	public void setV_26_Total_All_Persons(int v_26_Total_All_Persons)
	{
		this.v_26_Total_All_Persons = v_26_Total_All_Persons;
	}

	public int getV_27_Female()
	{
		return v_27_Female;
	}

	public void setV_27_Female(int v_27_Female)
	{
		this.v_27_Female = v_27_Female;
	}

	public int getV_27_Male()
	{
		return v_27_Male;
	}

	public void setV_27_Male(int v_27_Male)
	{
		this.v_27_Male = v_27_Male;
	}

	public int getV_27_Total_All_Persons()
	{
		return v_27_Total_All_Persons;
	}

	public void setV_27_Total_All_Persons(int v_27_Total_All_Persons)
	{
		this.v_27_Total_All_Persons = v_27_Total_All_Persons;
	}

	public int getV_28_Female()
	{
		return v_28_Female;
	}

	public void setV_28_Female(int v_28_Female)
	{
		this.v_28_Female = v_28_Female;
	}

	public int getV_28_Male()
	{
		return v_28_Male;
	}

	public void setV_28_Male(int v_28_Male)
	{
		this.v_28_Male = v_28_Male;
	}

	public int getV_28_Total_All_Persons()
	{
		return v_28_Total_All_Persons;
	}

	public void setV_28_Total_All_Persons(int v_28_Total_All_Persons)
	{
		this.v_28_Total_All_Persons = v_28_Total_All_Persons;
	}

	public int getV_29_Female()
	{
		return v_29_Female;
	}

	public void setV_29_Female(int v_29_Female)
	{
		this.v_29_Female = v_29_Female;
	}

	public int getV_29_Male()
	{
		return v_29_Male;
	}

	public void setV_29_Male(int v_29_Male)
	{
		this.v_29_Male = v_29_Male;
	}

	public int getV_29_Total_All_Persons()
	{
		return v_29_Total_All_Persons;
	}

	public void setV_29_Total_All_Persons(int v_29_Total_All_Persons)
	{
		this.v_29_Total_All_Persons = v_29_Total_All_Persons;
	}

	public int getV_3_Female()
	{
		return v_3_Female;
	}

	public void setV_3_Female(int v_3_Female)
	{
		this.v_3_Female = v_3_Female;
	}

	public int getV_3_Male()
	{
		return v_3_Male;
	}

	public void setV_3_Male(int v_3_Male)
	{
		this.v_3_Male = v_3_Male;
	}

	public int getV_3_Total_All_Persons()
	{
		return v_3_Total_All_Persons;
	}

	public void setV_3_Total_All_Persons(int v_3_Total_All_Persons)
	{
		this.v_3_Total_All_Persons = v_3_Total_All_Persons;
	}

	public int getV_30_Female()
	{
		return v_30_Female;
	}

	public void setV_30_Female(int v_30_Female)
	{
		this.v_30_Female = v_30_Female;
	}

	public int getV_30_Male()
	{
		return v_30_Male;
	}

	public void setV_30_Male(int v_30_Male)
	{
		this.v_30_Male = v_30_Male;
	}

	public int getV_30_Total_All_Persons()
	{
		return v_30_Total_All_Persons;
	}

	public void setV_30_Total_All_Persons(int v_30_Total_All_Persons)
	{
		this.v_30_Total_All_Persons = v_30_Total_All_Persons;
	}

	public int getV_31_Female()
	{
		return v_31_Female;
	}

	public void setV_31_Female(int v_31_Female)
	{
		this.v_31_Female = v_31_Female;
	}

	public int getV_31_Male()
	{
		return v_31_Male;
	}

	public void setV_31_Male(int v_31_Male)
	{
		this.v_31_Male = v_31_Male;
	}

	public int getV_31_Total_All_Persons()
	{
		return v_31_Total_All_Persons;
	}

	public void setV_31_Total_All_Persons(int v_31_Total_All_Persons)
	{
		this.v_31_Total_All_Persons = v_31_Total_All_Persons;
	}

	public int getV_32_Female()
	{
		return v_32_Female;
	}

	public void setV_32_Female(int v_32_Female)
	{
		this.v_32_Female = v_32_Female;
	}

	public int getV_32_Male()
	{
		return v_32_Male;
	}

	public void setV_32_Male(int v_32_Male)
	{
		this.v_32_Male = v_32_Male;
	}

	public int getV_32_Total_All_Persons()
	{
		return v_32_Total_All_Persons;
	}

	public void setV_32_Total_All_Persons(int v_32_Total_All_Persons)
	{
		this.v_32_Total_All_Persons = v_32_Total_All_Persons;
	}

	public int getV_33_Female()
	{
		return v_33_Female;
	}

	public void setV_33_Female(int v_33_Female)
	{
		this.v_33_Female = v_33_Female;
	}

	public int getV_33_Male()
	{
		return v_33_Male;
	}

	public void setV_33_Male(int v_33_Male)
	{
		this.v_33_Male = v_33_Male;
	}

	public int getV_33_Total_All_Persons()
	{
		return v_33_Total_All_Persons;
	}

	public void setV_33_Total_All_Persons(int v_33_Total_All_Persons)
	{
		this.v_33_Total_All_Persons = v_33_Total_All_Persons;
	}

	public int getV_34_Female()
	{
		return v_34_Female;
	}

	public void setV_34_Female(int v_34_Female)
	{
		this.v_34_Female = v_34_Female;
	}

	public int getV_34_Male()
	{
		return v_34_Male;
	}

	public void setV_34_Male(int v_34_Male)
	{
		this.v_34_Male = v_34_Male;
	}

	public int getV_34_Total_All_Persons()
	{
		return v_34_Total_All_Persons;
	}

	public void setV_34_Total_All_Persons(int v_34_Total_All_Persons)
	{
		this.v_34_Total_All_Persons = v_34_Total_All_Persons;
	}

	public int getV_35_Female()
	{
		return v_35_Female;
	}

	public void setV_35_Female(int v_35_Female)
	{
		this.v_35_Female = v_35_Female;
	}

	public int getV_35_Male()
	{
		return v_35_Male;
	}

	public void setV_35_Male(int v_35_Male)
	{
		this.v_35_Male = v_35_Male;
	}

	public int getV_35_Total_All_Persons()
	{
		return v_35_Total_All_Persons;
	}

	public void setV_35_Total_All_Persons(int v_35_Total_All_Persons)
	{
		this.v_35_Total_All_Persons = v_35_Total_All_Persons;
	}

	public int getV_36_Female()
	{
		return v_36_Female;
	}

	public void setV_36_Female(int v_36_Female)
	{
		this.v_36_Female = v_36_Female;
	}

	public int getV_36_Male()
	{
		return v_36_Male;
	}

	public void setV_36_Male(int v_36_Male)
	{
		this.v_36_Male = v_36_Male;
	}

	public int getV_36_Total_All_Persons()
	{
		return v_36_Total_All_Persons;
	}

	public void setV_36_Total_All_Persons(int v_36_Total_All_Persons)
	{
		this.v_36_Total_All_Persons = v_36_Total_All_Persons;
	}

	public int getV_37_Female()
	{
		return v_37_Female;
	}

	public void setV_37_Female(int v_37_Female)
	{
		this.v_37_Female = v_37_Female;
	}

	public int getV_37_Male()
	{
		return v_37_Male;
	}

	public void setV_37_Male(int v_37_Male)
	{
		this.v_37_Male = v_37_Male;
	}

	public int getV_37_Total_All_Persons()
	{
		return v_37_Total_All_Persons;
	}

	public void setV_37_Total_All_Persons(int v_37_Total_All_Persons)
	{
		this.v_37_Total_All_Persons = v_37_Total_All_Persons;
	}

	public int getV_38_Female()
	{
		return v_38_Female;
	}

	public void setV_38_Female(int v_38_Female)
	{
		this.v_38_Female = v_38_Female;
	}

	public int getV_38_Male()
	{
		return v_38_Male;
	}

	public void setV_38_Male(int v_38_Male)
	{
		this.v_38_Male = v_38_Male;
	}

	public int getV_38_Total_All_Persons()
	{
		return v_38_Total_All_Persons;
	}

	public void setV_38_Total_All_Persons(int v_38_Total_All_Persons)
	{
		this.v_38_Total_All_Persons = v_38_Total_All_Persons;
	}

	public int getV_39_Female()
	{
		return v_39_Female;
	}

	public void setV_39_Female(int v_39_Female)
	{
		this.v_39_Female = v_39_Female;
	}

	public int getV_39_Male()
	{
		return v_39_Male;
	}

	public void setV_39_Male(int v_39_Male)
	{
		this.v_39_Male = v_39_Male;
	}

	public int getV_39_Total_All_Persons()
	{
		return v_39_Total_All_Persons;
	}

	public void setV_39_Total_All_Persons(int v_39_Total_All_Persons)
	{
		this.v_39_Total_All_Persons = v_39_Total_All_Persons;
	}

	public int getV_4_Female()
	{
		return v_4_Female;
	}

	public void setV_4_Female(int v_4_Female)
	{
		this.v_4_Female = v_4_Female;
	}

	public int getV_4_Male()
	{
		return v_4_Male;
	}

	public void setV_4_Male(int v_4_Male)
	{
		this.v_4_Male = v_4_Male;
	}

	public int getV_4_Total_All_Persons()
	{
		return v_4_Total_All_Persons;
	}

	public void setV_4_Total_All_Persons(int v_4_Total_All_Persons)
	{
		this.v_4_Total_All_Persons = v_4_Total_All_Persons;
	}

	public int getV_40_Female()
	{
		return v_40_Female;
	}

	public void setV_40_Female(int v_40_Female)
	{
		this.v_40_Female = v_40_Female;
	}

	public int getV_40_Male()
	{
		return v_40_Male;
	}

	public void setV_40_Male(int v_40_Male)
	{
		this.v_40_Male = v_40_Male;
	}

	public int getV_40_Total_All_Persons()
	{
		return v_40_Total_All_Persons;
	}

	public void setV_40_Total_All_Persons(int v_40_Total_All_Persons)
	{
		this.v_40_Total_All_Persons = v_40_Total_All_Persons;
	}

	public int getV_41_Female()
	{
		return v_41_Female;
	}

	public void setV_41_Female(int v_41_Female)
	{
		this.v_41_Female = v_41_Female;
	}

	public int getV_41_Male()
	{
		return v_41_Male;
	}

	public void setV_41_Male(int v_41_Male)
	{
		this.v_41_Male = v_41_Male;
	}

	public int getV_41_Total_All_Persons()
	{
		return v_41_Total_All_Persons;
	}

	public void setV_41_Total_All_Persons(int v_41_Total_All_Persons)
	{
		this.v_41_Total_All_Persons = v_41_Total_All_Persons;
	}

	public int getV_42_Female()
	{
		return v_42_Female;
	}

	public void setV_42_Female(int v_42_Female)
	{
		this.v_42_Female = v_42_Female;
	}

	public int getV_42_Male()
	{
		return v_42_Male;
	}

	public void setV_42_Male(int v_42_Male)
	{
		this.v_42_Male = v_42_Male;
	}

	public int getV_42_Total_All_Persons()
	{
		return v_42_Total_All_Persons;
	}

	public void setV_42_Total_All_Persons(int v_42_Total_All_Persons)
	{
		this.v_42_Total_All_Persons = v_42_Total_All_Persons;
	}

	public int getV_43_Female()
	{
		return v_43_Female;
	}

	public void setV_43_Female(int v_43_Female)
	{
		this.v_43_Female = v_43_Female;
	}

	public int getV_43_Male()
	{
		return v_43_Male;
	}

	public void setV_43_Male(int v_43_Male)
	{
		this.v_43_Male = v_43_Male;
	}

	public int getV_43_Total_All_Persons()
	{
		return v_43_Total_All_Persons;
	}

	public void setV_43_Total_All_Persons(int v_43_Total_All_Persons)
	{
		this.v_43_Total_All_Persons = v_43_Total_All_Persons;
	}

	public int getV_44_Female()
	{
		return v_44_Female;
	}

	public void setV_44_Female(int v_44_Female)
	{
		this.v_44_Female = v_44_Female;
	}

	public int getV_44_Male()
	{
		return v_44_Male;
	}

	public void setV_44_Male(int v_44_Male)
	{
		this.v_44_Male = v_44_Male;
	}

	public int getV_44_Total_All_Persons()
	{
		return v_44_Total_All_Persons;
	}

	public void setV_44_Total_All_Persons(int v_44_Total_All_Persons)
	{
		this.v_44_Total_All_Persons = v_44_Total_All_Persons;
	}

	public int getV_45_Female()
	{
		return v_45_Female;
	}

	public void setV_45_Female(int v_45_Female)
	{
		this.v_45_Female = v_45_Female;
	}

	public int getV_45_Male()
	{
		return v_45_Male;
	}

	public void setV_45_Male(int v_45_Male)
	{
		this.v_45_Male = v_45_Male;
	}

	public int getV_45_Total_All_Persons()
	{
		return v_45_Total_All_Persons;
	}

	public void setV_45_Total_All_Persons(int v_45_Total_All_Persons)
	{
		this.v_45_Total_All_Persons = v_45_Total_All_Persons;
	}

	public int getV_46_Female()
	{
		return v_46_Female;
	}

	public void setV_46_Female(int v_46_Female)
	{
		this.v_46_Female = v_46_Female;
	}

	public int getV_46_Male()
	{
		return v_46_Male;
	}

	public void setV_46_Male(int v_46_Male)
	{
		this.v_46_Male = v_46_Male;
	}

	public int getV_46_Total_All_Persons()
	{
		return v_46_Total_All_Persons;
	}

	public void setV_46_Total_All_Persons(int v_46_Total_All_Persons)
	{
		this.v_46_Total_All_Persons = v_46_Total_All_Persons;
	}

	public int getV_47_Female()
	{
		return v_47_Female;
	}

	public void setV_47_Female(int v_47_Female)
	{
		this.v_47_Female = v_47_Female;
	}

	public int getV_47_Male()
	{
		return v_47_Male;
	}

	public void setV_47_Male(int v_47_Male)
	{
		this.v_47_Male = v_47_Male;
	}

	public int getV_47_Total_All_Persons()
	{
		return v_47_Total_All_Persons;
	}

	public void setV_47_Total_All_Persons(int v_47_Total_All_Persons)
	{
		this.v_47_Total_All_Persons = v_47_Total_All_Persons;
	}

	public int getV_48_Female()
	{
		return v_48_Female;
	}

	public void setV_48_Female(int v_48_Female)
	{
		this.v_48_Female = v_48_Female;
	}

	public int getV_48_Male()
	{
		return v_48_Male;
	}

	public void setV_48_Male(int v_48_Male)
	{
		this.v_48_Male = v_48_Male;
	}

	public int getV_48_Total_All_Persons()
	{
		return v_48_Total_All_Persons;
	}

	public void setV_48_Total_All_Persons(int v_48_Total_All_Persons)
	{
		this.v_48_Total_All_Persons = v_48_Total_All_Persons;
	}

	public int getV_49_Female()
	{
		return v_49_Female;
	}

	public void setV_49_Female(int v_49_Female)
	{
		this.v_49_Female = v_49_Female;
	}

	public int getV_49_Male()
	{
		return v_49_Male;
	}

	public void setV_49_Male(int v_49_Male)
	{
		this.v_49_Male = v_49_Male;
	}

	public int getV_49_Total_All_Persons()
	{
		return v_49_Total_All_Persons;
	}

	public void setV_49_Total_All_Persons(int v_49_Total_All_Persons)
	{
		this.v_49_Total_All_Persons = v_49_Total_All_Persons;
	}

	public int getV_5_Female()
	{
		return v_5_Female;
	}

	public void setV_5_Female(int v_5_Female)
	{
		this.v_5_Female = v_5_Female;
	}

	public int getV_5_Male()
	{
		return v_5_Male;
	}

	public void setV_5_Male(int v_5_Male)
	{
		this.v_5_Male = v_5_Male;
	}

	public int getV_5_Total_All_Persons()
	{
		return v_5_Total_All_Persons;
	}

	public void setV_5_Total_All_Persons(int v_5_Total_All_Persons)
	{
		this.v_5_Total_All_Persons = v_5_Total_All_Persons;
	}

	public int getV_50_Female()
	{
		return v_50_Female;
	}

	public void setV_50_Female(int v_50_Female)
	{
		this.v_50_Female = v_50_Female;
	}

	public int getV_50_Male()
	{
		return v_50_Male;
	}

	public void setV_50_Male(int v_50_Male)
	{
		this.v_50_Male = v_50_Male;
	}

	public int getV_50_Total_All_Persons()
	{
		return v_50_Total_All_Persons;
	}

	public void setV_50_Total_All_Persons(int v_50_Total_All_Persons)
	{
		this.v_50_Total_All_Persons = v_50_Total_All_Persons;
	}

	public int getV_51_Female()
	{
		return v_51_Female;
	}

	public void setV_51_Female(int v_51_Female)
	{
		this.v_51_Female = v_51_Female;
	}

	public int getV_51_Male()
	{
		return v_51_Male;
	}

	public void setV_51_Male(int v_51_Male)
	{
		this.v_51_Male = v_51_Male;
	}

	public int getV_51_Total_All_Persons()
	{
		return v_51_Total_All_Persons;
	}

	public void setV_51_Total_All_Persons(int v_51_Total_All_Persons)
	{
		this.v_51_Total_All_Persons = v_51_Total_All_Persons;
	}

	public int getV_52_Female()
	{
		return v_52_Female;
	}

	public void setV_52_Female(int v_52_Female)
	{
		this.v_52_Female = v_52_Female;
	}

	public int getV_52_Male()
	{
		return v_52_Male;
	}

	public void setV_52_Male(int v_52_Male)
	{
		this.v_52_Male = v_52_Male;
	}

	public int getV_52_Total_All_Persons()
	{
		return v_52_Total_All_Persons;
	}

	public void setV_52_Total_All_Persons(int v_52_Total_All_Persons)
	{
		this.v_52_Total_All_Persons = v_52_Total_All_Persons;
	}

	public int getV_53_Female()
	{
		return v_53_Female;
	}

	public void setV_53_Female(int v_53_Female)
	{
		this.v_53_Female = v_53_Female;
	}

	public int getV_53_Male()
	{
		return v_53_Male;
	}

	public void setV_53_Male(int v_53_Male)
	{
		this.v_53_Male = v_53_Male;
	}

	public int getV_53_Total_All_Persons()
	{
		return v_53_Total_All_Persons;
	}

	public void setV_53_Total_All_Persons(int v_53_Total_All_Persons)
	{
		this.v_53_Total_All_Persons = v_53_Total_All_Persons;
	}

	public int getV_54_Female()
	{
		return v_54_Female;
	}

	public void setV_54_Female(int v_54_Female)
	{
		this.v_54_Female = v_54_Female;
	}

	public int getV_54_Male()
	{
		return v_54_Male;
	}

	public void setV_54_Male(int v_54_Male)
	{
		this.v_54_Male = v_54_Male;
	}

	public int getV_54_Total_All_Persons()
	{
		return v_54_Total_All_Persons;
	}

	public void setV_54_Total_All_Persons(int v_54_Total_All_Persons)
	{
		this.v_54_Total_All_Persons = v_54_Total_All_Persons;
	}

	public int getV_55_Female()
	{
		return v_55_Female;
	}

	public void setV_55_Female(int v_55_Female)
	{
		this.v_55_Female = v_55_Female;
	}

	public int getV_55_Male()
	{
		return v_55_Male;
	}

	public void setV_55_Male(int v_55_Male)
	{
		this.v_55_Male = v_55_Male;
	}

	public int getV_55_Total_All_Persons()
	{
		return v_55_Total_All_Persons;
	}

	public void setV_55_Total_All_Persons(int v_55_Total_All_Persons)
	{
		this.v_55_Total_All_Persons = v_55_Total_All_Persons;
	}

	public int getV_56_Female()
	{
		return v_56_Female;
	}

	public void setV_56_Female(int v_56_Female)
	{
		this.v_56_Female = v_56_Female;
	}

	public int getV_56_Male()
	{
		return v_56_Male;
	}

	public void setV_56_Male(int v_56_Male)
	{
		this.v_56_Male = v_56_Male;
	}

	public int getV_56_Total_All_Persons()
	{
		return v_56_Total_All_Persons;
	}

	public void setV_56_Total_All_Persons(int v_56_Total_All_Persons)
	{
		this.v_56_Total_All_Persons = v_56_Total_All_Persons;
	}

	public int getV_57_Female()
	{
		return v_57_Female;
	}

	public void setV_57_Female(int v_57_Female)
	{
		this.v_57_Female = v_57_Female;
	}

	public int getV_57_Male()
	{
		return v_57_Male;
	}

	public void setV_57_Male(int v_57_Male)
	{
		this.v_57_Male = v_57_Male;
	}

	public int getV_57_Total_All_Persons()
	{
		return v_57_Total_All_Persons;
	}

	public void setV_57_Total_All_Persons(int v_57_Total_All_Persons)
	{
		this.v_57_Total_All_Persons = v_57_Total_All_Persons;
	}

	public int getV_58_Female()
	{
		return v_58_Female;
	}

	public void setV_58_Female(int v_58_Female)
	{
		this.v_58_Female = v_58_Female;
	}

	public int getV_58_Male()
	{
		return v_58_Male;
	}

	public void setV_58_Male(int v_58_Male)
	{
		this.v_58_Male = v_58_Male;
	}

	public int getV_58_Total_All_Persons()
	{
		return v_58_Total_All_Persons;
	}

	public void setV_58_Total_All_Persons(int v_58_Total_All_Persons)
	{
		this.v_58_Total_All_Persons = v_58_Total_All_Persons;
	}

	public int getV_59_Female()
	{
		return v_59_Female;
	}

	public void setV_59_Female(int v_59_Female)
	{
		this.v_59_Female = v_59_Female;
	}

	public int getV_59_Male()
	{
		return v_59_Male;
	}

	public void setV_59_Male(int v_59_Male)
	{
		this.v_59_Male = v_59_Male;
	}

	public int getV_59_Total_All_Persons()
	{
		return v_59_Total_All_Persons;
	}

	public void setV_59_Total_All_Persons(int v_59_Total_All_Persons)
	{
		this.v_59_Total_All_Persons = v_59_Total_All_Persons;
	}

	public int getV_6_Female()
	{
		return v_6_Female;
	}

	public void setV_6_Female(int v_6_Female)
	{
		this.v_6_Female = v_6_Female;
	}

	public int getV_6_Male()
	{
		return v_6_Male;
	}

	public void setV_6_Male(int v_6_Male)
	{
		this.v_6_Male = v_6_Male;
	}

	public int getV_6_Total_All_Persons()
	{
		return v_6_Total_All_Persons;
	}

	public void setV_6_Total_All_Persons(int v_6_Total_All_Persons)
	{
		this.v_6_Total_All_Persons = v_6_Total_All_Persons;
	}

	public int getV_60_Female()
	{
		return v_60_Female;
	}

	public void setV_60_Female(int v_60_Female)
	{
		this.v_60_Female = v_60_Female;
	}

	public int getV_60_Male()
	{
		return v_60_Male;
	}

	public void setV_60_Male(int v_60_Male)
	{
		this.v_60_Male = v_60_Male;
	}

	public int getV_60_Total_All_Persons()
	{
		return v_60_Total_All_Persons;
	}

	public void setV_60_Total_All_Persons(int v_60_Total_All_Persons)
	{
		this.v_60_Total_All_Persons = v_60_Total_All_Persons;
	}

	public int getV_61_Female()
	{
		return v_61_Female;
	}

	public void setV_61_Female(int v_61_Female)
	{
		this.v_61_Female = v_61_Female;
	}

	public int getV_61_Male()
	{
		return v_61_Male;
	}

	public void setV_61_Male(int v_61_Male)
	{
		this.v_61_Male = v_61_Male;
	}

	public int getV_61_Total_All_Persons()
	{
		return v_61_Total_All_Persons;
	}

	public void setV_61_Total_All_Persons(int v_61_Total_All_Persons)
	{
		this.v_61_Total_All_Persons = v_61_Total_All_Persons;
	}

	public int getV_62_Female()
	{
		return v_62_Female;
	}

	public void setV_62_Female(int v_62_Female)
	{
		this.v_62_Female = v_62_Female;
	}

	public int getV_62_Male()
	{
		return v_62_Male;
	}

	public void setV_62_Male(int v_62_Male)
	{
		this.v_62_Male = v_62_Male;
	}

	public int getV_62_Total_All_Persons()
	{
		return v_62_Total_All_Persons;
	}

	public void setV_62_Total_All_Persons(int v_62_Total_All_Persons)
	{
		this.v_62_Total_All_Persons = v_62_Total_All_Persons;
	}

	public int getV_63_Female()
	{
		return v_63_Female;
	}

	public void setV_63_Female(int v_63_Female)
	{
		this.v_63_Female = v_63_Female;
	}

	public int getV_63_Male()
	{
		return v_63_Male;
	}

	public void setV_63_Male(int v_63_Male)
	{
		this.v_63_Male = v_63_Male;
	}

	public int getV_63_Total_All_Persons()
	{
		return v_63_Total_All_Persons;
	}

	public void setV_63_Total_All_Persons(int v_63_Total_All_Persons)
	{
		this.v_63_Total_All_Persons = v_63_Total_All_Persons;
	}

	public int getV_64_Female()
	{
		return v_64_Female;
	}

	public void setV_64_Female(int v_64_Female)
	{
		this.v_64_Female = v_64_Female;
	}

	public int getV_64_Male()
	{
		return v_64_Male;
	}

	public void setV_64_Male(int v_64_Male)
	{
		this.v_64_Male = v_64_Male;
	}

	public int getV_64_Total_All_Persons()
	{
		return v_64_Total_All_Persons;
	}

	public void setV_64_Total_All_Persons(int v_64_Total_All_Persons)
	{
		this.v_64_Total_All_Persons = v_64_Total_All_Persons;
	}

	public int getV_65_Female()
	{
		return v_65_Female;
	}

	public void setV_65_Female(int v_65_Female)
	{
		this.v_65_Female = v_65_Female;
	}

	public int getV_65_Male()
	{
		return v_65_Male;
	}

	public void setV_65_Male(int v_65_Male)
	{
		this.v_65_Male = v_65_Male;
	}

	public int getV_65_Total_All_Persons()
	{
		return v_65_Total_All_Persons;
	}

	public void setV_65_Total_All_Persons(int v_65_Total_All_Persons)
	{
		this.v_65_Total_All_Persons = v_65_Total_All_Persons;
	}

	public int getV_66_Female()
	{
		return v_66_Female;
	}

	public void setV_66_Female(int v_66_Female)
	{
		this.v_66_Female = v_66_Female;
	}

	public int getV_66_Male()
	{
		return v_66_Male;
	}

	public void setV_66_Male(int v_66_Male)
	{
		this.v_66_Male = v_66_Male;
	}

	public int getV_66_Total_All_Persons()
	{
		return v_66_Total_All_Persons;
	}

	public void setV_66_Total_All_Persons(int v_66_Total_All_Persons)
	{
		this.v_66_Total_All_Persons = v_66_Total_All_Persons;
	}

	public int getV_67_Female()
	{
		return v_67_Female;
	}

	public void setV_67_Female(int v_67_Female)
	{
		this.v_67_Female = v_67_Female;
	}

	public int getV_67_Male()
	{
		return v_67_Male;
	}

	public void setV_67_Male(int v_67_Male)
	{
		this.v_67_Male = v_67_Male;
	}

	public int getV_67_Total_All_Persons()
	{
		return v_67_Total_All_Persons;
	}

	public void setV_67_Total_All_Persons(int v_67_Total_All_Persons)
	{
		this.v_67_Total_All_Persons = v_67_Total_All_Persons;
	}

	public int getV_68_Female()
	{
		return v_68_Female;
	}

	public void setV_68_Female(int v_68_Female)
	{
		this.v_68_Female = v_68_Female;
	}

	public int getV_68_Male()
	{
		return v_68_Male;
	}

	public void setV_68_Male(int v_68_Male)
	{
		this.v_68_Male = v_68_Male;
	}

	public int getV_68_Total_All_Persons()
	{
		return v_68_Total_All_Persons;
	}

	public void setV_68_Total_All_Persons(int v_68_Total_All_Persons)
	{
		this.v_68_Total_All_Persons = v_68_Total_All_Persons;
	}

	public int getV_69_Female()
	{
		return v_69_Female;
	}

	public void setV_69_Female(int v_69_Female)
	{
		this.v_69_Female = v_69_Female;
	}

	public int getV_69_Male()
	{
		return v_69_Male;
	}

	public void setV_69_Male(int v_69_Male)
	{
		this.v_69_Male = v_69_Male;
	}

	public int getV_69_Total_All_Persons()
	{
		return v_69_Total_All_Persons;
	}

	public void setV_69_Total_All_Persons(int v_69_Total_All_Persons)
	{
		this.v_69_Total_All_Persons = v_69_Total_All_Persons;
	}

	public int getV_7_Female()
	{
		return v_7_Female;
	}

	public void setV_7_Female(int v_7_Female)
	{
		this.v_7_Female = v_7_Female;
	}

	public int getV_7_Male()
	{
		return v_7_Male;
	}

	public void setV_7_Male(int v_7_Male)
	{
		this.v_7_Male = v_7_Male;
	}

	public int getV_7_Total_All_Persons()
	{
		return v_7_Total_All_Persons;
	}

	public void setV_7_Total_All_Persons(int v_7_Total_All_Persons)
	{
		this.v_7_Total_All_Persons = v_7_Total_All_Persons;
	}

	public int getV_70_Female()
	{
		return v_70_Female;
	}

	public void setV_70_Female(int v_70_Female)
	{
		this.v_70_Female = v_70_Female;
	}

	public int getV_70_Male()
	{
		return v_70_Male;
	}

	public void setV_70_Male(int v_70_Male)
	{
		this.v_70_Male = v_70_Male;
	}

	public int getV_70_Total_All_Persons()
	{
		return v_70_Total_All_Persons;
	}

	public void setV_70_Total_All_Persons(int v_70_Total_All_Persons)
	{
		this.v_70_Total_All_Persons = v_70_Total_All_Persons;
	}

	public int getV_71_Female()
	{
		return v_71_Female;
	}

	public void setV_71_Female(int v_71_Female)
	{
		this.v_71_Female = v_71_Female;
	}

	public int getV_71_Male()
	{
		return v_71_Male;
	}

	public void setV_71_Male(int v_71_Male)
	{
		this.v_71_Male = v_71_Male;
	}

	public int getV_71_Total_All_Persons()
	{
		return v_71_Total_All_Persons;
	}

	public void setV_71_Total_All_Persons(int v_71_Total_All_Persons)
	{
		this.v_71_Total_All_Persons = v_71_Total_All_Persons;
	}

	public int getV_72_Female()
	{
		return v_72_Female;
	}

	public void setV_72_Female(int v_72_Female)
	{
		this.v_72_Female = v_72_Female;
	}

	public int getV_72_Male()
	{
		return v_72_Male;
	}

	public void setV_72_Male(int v_72_Male)
	{
		this.v_72_Male = v_72_Male;
	}

	public int getV_72_Total_All_Persons()
	{
		return v_72_Total_All_Persons;
	}

	public void setV_72_Total_All_Persons(int v_72_Total_All_Persons)
	{
		this.v_72_Total_All_Persons = v_72_Total_All_Persons;
	}

	public int getV_73_Female()
	{
		return v_73_Female;
	}

	public void setV_73_Female(int v_73_Female)
	{
		this.v_73_Female = v_73_Female;
	}

	public int getV_73_Male()
	{
		return v_73_Male;
	}

	public void setV_73_Male(int v_73_Male)
	{
		this.v_73_Male = v_73_Male;
	}

	public int getV_73_Total_All_Persons()
	{
		return v_73_Total_All_Persons;
	}

	public void setV_73_Total_All_Persons(int v_73_Total_All_Persons)
	{
		this.v_73_Total_All_Persons = v_73_Total_All_Persons;
	}

	public int getV_74_Female()
	{
		return v_74_Female;
	}

	public void setV_74_Female(int v_74_Female)
	{
		this.v_74_Female = v_74_Female;
	}

	public int getV_74_Male()
	{
		return v_74_Male;
	}

	public void setV_74_Male(int v_74_Male)
	{
		this.v_74_Male = v_74_Male;
	}

	public int getV_74_Total_All_Persons()
	{
		return v_74_Total_All_Persons;
	}

	public void setV_74_Total_All_Persons(int v_74_Total_All_Persons)
	{
		this.v_74_Total_All_Persons = v_74_Total_All_Persons;
	}

	public int getV_75_Female()
	{
		return v_75_Female;
	}

	public void setV_75_Female(int v_75_Female)
	{
		this.v_75_Female = v_75_Female;
	}

	public int getV_75_Male()
	{
		return v_75_Male;
	}

	public void setV_75_Male(int v_75_Male)
	{
		this.v_75_Male = v_75_Male;
	}

	public int getV_75_Total_All_Persons()
	{
		return v_75_Total_All_Persons;
	}

	public void setV_75_Total_All_Persons(int v_75_Total_All_Persons)
	{
		this.v_75_Total_All_Persons = v_75_Total_All_Persons;
	}

	public int getV_76_Female()
	{
		return v_76_Female;
	}

	public void setV_76_Female(int v_76_Female)
	{
		this.v_76_Female = v_76_Female;
	}

	public int getV_76_Male()
	{
		return v_76_Male;
	}

	public void setV_76_Male(int v_76_Male)
	{
		this.v_76_Male = v_76_Male;
	}

	public int getV_76_Total_All_Persons()
	{
		return v_76_Total_All_Persons;
	}

	public void setV_76_Total_All_Persons(int v_76_Total_All_Persons)
	{
		this.v_76_Total_All_Persons = v_76_Total_All_Persons;
	}

	public int getV_77_Female()
	{
		return v_77_Female;
	}

	public void setV_77_Female(int v_77_Female)
	{
		this.v_77_Female = v_77_Female;
	}

	public int getV_77_Male()
	{
		return v_77_Male;
	}

	public void setV_77_Male(int v_77_Male)
	{
		this.v_77_Male = v_77_Male;
	}

	public int getV_77_Total_All_Persons()
	{
		return v_77_Total_All_Persons;
	}

	public void setV_77_Total_All_Persons(int v_77_Total_All_Persons)
	{
		this.v_77_Total_All_Persons = v_77_Total_All_Persons;
	}

	public int getV_78_Female()
	{
		return v_78_Female;
	}

	public void setV_78_Female(int v_78_Female)
	{
		this.v_78_Female = v_78_Female;
	}

	public int getV_78_Male()
	{
		return v_78_Male;
	}

	public void setV_78_Male(int v_78_Male)
	{
		this.v_78_Male = v_78_Male;
	}

	public int getV_78_Total_All_Persons()
	{
		return v_78_Total_All_Persons;
	}

	public void setV_78_Total_All_Persons(int v_78_Total_All_Persons)
	{
		this.v_78_Total_All_Persons = v_78_Total_All_Persons;
	}

	public int getV_79_Female()
	{
		return v_79_Female;
	}

	public void setV_79_Female(int v_79_Female)
	{
		this.v_79_Female = v_79_Female;
	}

	public int getV_79_Male()
	{
		return v_79_Male;
	}

	public void setV_79_Male(int v_79_Male)
	{
		this.v_79_Male = v_79_Male;
	}

	public int getV_79_Total_All_Persons()
	{
		return v_79_Total_All_Persons;
	}

	public void setV_79_Total_All_Persons(int v_79_Total_All_Persons)
	{
		this.v_79_Total_All_Persons = v_79_Total_All_Persons;
	}

	public int getV_8_Female()
	{
		return v_8_Female;
	}

	public void setV_8_Female(int v_8_Female)
	{
		this.v_8_Female = v_8_Female;
	}

	public int getV_8_Male()
	{
		return v_8_Male;
	}

	public void setV_8_Male(int v_8_Male)
	{
		this.v_8_Male = v_8_Male;
	}

	public int getV_8_Total_All_Persons()
	{
		return v_8_Total_All_Persons;
	}

	public void setV_8_Total_All_Persons(int v_8_Total_All_Persons)
	{
		this.v_8_Total_All_Persons = v_8_Total_All_Persons;
	}

	public int getV_80_Female()
	{
		return v_80_Female;
	}

	public void setV_80_Female(int v_80_Female)
	{
		this.v_80_Female = v_80_Female;
	}

	public int getV_80_Male()
	{
		return v_80_Male;
	}

	public void setV_80_Male(int v_80_Male)
	{
		this.v_80_Male = v_80_Male;
	}

	public int getV_80_Total_All_Persons()
	{
		return v_80_Total_All_Persons;
	}

	public void setV_80_Total_All_Persons(int v_80_Total_All_Persons)
	{
		this.v_80_Total_All_Persons = v_80_Total_All_Persons;
	}

	public int getV_81_Female()
	{
		return v_81_Female;
	}

	public void setV_81_Female(int v_81_Female)
	{
		this.v_81_Female = v_81_Female;
	}

	public int getV_81_Male()
	{
		return v_81_Male;
	}

	public void setV_81_Male(int v_81_Male)
	{
		this.v_81_Male = v_81_Male;
	}

	public int getV_81_Total_All_Persons()
	{
		return v_81_Total_All_Persons;
	}

	public void setV_81_Total_All_Persons(int v_81_Total_All_Persons)
	{
		this.v_81_Total_All_Persons = v_81_Total_All_Persons;
	}

	public int getV_82_Female()
	{
		return v_82_Female;
	}

	public void setV_82_Female(int v_82_Female)
	{
		this.v_82_Female = v_82_Female;
	}

	public int getV_82_Male()
	{
		return v_82_Male;
	}

	public void setV_82_Male(int v_82_Male)
	{
		this.v_82_Male = v_82_Male;
	}

	public int getV_82_Total_All_Persons()
	{
		return v_82_Total_All_Persons;
	}

	public void setV_82_Total_All_Persons(int v_82_Total_All_Persons)
	{
		this.v_82_Total_All_Persons = v_82_Total_All_Persons;
	}

	public int getV_83_Female()
	{
		return v_83_Female;
	}

	public void setV_83_Female(int v_83_Female)
	{
		this.v_83_Female = v_83_Female;
	}

	public int getV_83_Male()
	{
		return v_83_Male;
	}

	public void setV_83_Male(int v_83_Male)
	{
		this.v_83_Male = v_83_Male;
	}

	public int getV_83_Total_All_Persons()
	{
		return v_83_Total_All_Persons;
	}

	public void setV_83_Total_All_Persons(int v_83_Total_All_Persons)
	{
		this.v_83_Total_All_Persons = v_83_Total_All_Persons;
	}

	public int getV_84_Female()
	{
		return v_84_Female;
	}

	public void setV_84_Female(int v_84_Female)
	{
		this.v_84_Female = v_84_Female;
	}

	public int getV_84_Male()
	{
		return v_84_Male;
	}

	public void setV_84_Male(int v_84_Male)
	{
		this.v_84_Male = v_84_Male;
	}

	public int getV_84_Total_All_Persons()
	{
		return v_84_Total_All_Persons;
	}

	public void setV_84_Total_All_Persons(int v_84_Total_All_Persons)
	{
		this.v_84_Total_All_Persons = v_84_Total_All_Persons;
	}

	public int getV_85_Female()
	{
		return v_85_Female;
	}

	public void setV_85_Female(int v_85_Female)
	{
		this.v_85_Female = v_85_Female;
	}

	public int getV_85_Male()
	{
		return v_85_Male;
	}

	public void setV_85_Male(int v_85_Male)
	{
		this.v_85_Male = v_85_Male;
	}

	public int getV_85_Total_All_Persons()
	{
		return v_85_Total_All_Persons;
	}

	public void setV_85_Total_All_Persons(int v_85_Total_All_Persons)
	{
		this.v_85_Total_All_Persons = v_85_Total_All_Persons;
	}

	public int getV_86_Female()
	{
		return v_86_Female;
	}

	public void setV_86_Female(int v_86_Female)
	{
		this.v_86_Female = v_86_Female;
	}

	public int getV_86_Male()
	{
		return v_86_Male;
	}

	public void setV_86_Male(int v_86_Male)
	{
		this.v_86_Male = v_86_Male;
	}

	public int getV_86_Total_All_Persons()
	{
		return v_86_Total_All_Persons;
	}

	public void setV_86_Total_All_Persons(int v_86_Total_All_Persons)
	{
		this.v_86_Total_All_Persons = v_86_Total_All_Persons;
	}

	public int getV_87_Female()
	{
		return v_87_Female;
	}

	public void setV_87_Female(int v_87_Female)
	{
		this.v_87_Female = v_87_Female;
	}

	public int getV_87_Male()
	{
		return v_87_Male;
	}

	public void setV_87_Male(int v_87_Male)
	{
		this.v_87_Male = v_87_Male;
	}

	public int getV_87_Total_All_Persons()
	{
		return v_87_Total_All_Persons;
	}

	public void setV_87_Total_All_Persons(int v_87_Total_All_Persons)
	{
		this.v_87_Total_All_Persons = v_87_Total_All_Persons;
	}

	public int getV_88_Female()
	{
		return v_88_Female;
	}

	public void setV_88_Female(int v_88_Female)
	{
		this.v_88_Female = v_88_Female;
	}

	public int getV_88_Male()
	{
		return v_88_Male;
	}

	public void setV_88_Male(int v_88_Male)
	{
		this.v_88_Male = v_88_Male;
	}

	public int getV_88_Total_All_Persons()
	{
		return v_88_Total_All_Persons;
	}

	public void setV_88_Total_All_Persons(int v_88_Total_All_Persons)
	{
		this.v_88_Total_All_Persons = v_88_Total_All_Persons;
	}

	public int getV_89_Female()
	{
		return v_89_Female;
	}

	public void setV_89_Female(int v_89_Female)
	{
		this.v_89_Female = v_89_Female;
	}

	public int getV_89_Male()
	{
		return v_89_Male;
	}

	public void setV_89_Male(int v_89_Male)
	{
		this.v_89_Male = v_89_Male;
	}

	public int getV_89_Total_All_Persons()
	{
		return v_89_Total_All_Persons;
	}

	public void setV_89_Total_All_Persons(int v_89_Total_All_Persons)
	{
		this.v_89_Total_All_Persons = v_89_Total_All_Persons;
	}

	public int getV_9_Female()
	{
		return v_9_Female;
	}

	public void setV_9_Female(int v_9_Female)
	{
		this.v_9_Female = v_9_Female;
	}

	public int getV_9_Male()
	{
		return v_9_Male;
	}

	public void setV_9_Male(int v_9_Male)
	{
		this.v_9_Male = v_9_Male;
	}

	public int getV_9_Total_All_Persons()
	{
		return v_9_Total_All_Persons;
	}

	public void setV_9_Total_All_Persons(int v_9_Total_All_Persons)
	{
		this.v_9_Total_All_Persons = v_9_Total_All_Persons;
	}

	public int getV_90_and_over_Female()
	{
		return v_90_and_over_Female;
	}

	public void setV_90_and_over_Female(int v_90_and_over_Female)
	{
		this.v_90_and_over_Female = v_90_and_over_Female;
	}

	public int getV_90_and_over_Male()
	{
		return v_90_and_over_Male;
	}

	public void setV_90_and_over_Male(int v_90_and_over_Male)
	{
		this.v_90_and_over_Male = v_90_and_over_Male;
	}

	public int getV_90_and_over_Total_All_Persons()
	{
		return v_90_and_over_Total_All_Persons;
	}

	public void setV_90_and_over_Total_All_Persons(
			int v_90_and_over_Total_All_Persons)
	{
		this.v_90_and_over_Total_All_Persons = v_90_and_over_Total_All_Persons;
	}
	
	public int getTotal_All_Ages_Female()
	{
		return total_All_Ages_Female;
	}

	public void setTotal_All_Ages_Female(int total_All_Ages_Female)
	{
		this.total_All_Ages_Female = total_All_Ages_Female;
	}

	public int getTotal_All_Ages_Male()
	{
		return total_All_Ages_Male;
	}

	public void setTotal_All_Ages_Male(int total_All_Ages_Male)
	{
		this.total_All_Ages_Male = total_All_Ages_Male;
	}

	public int getTotal_All_Ages_Total_All_Persons()
	{
		return total_All_Ages_Total_All_Persons;
	}

	public void setTotal_All_Ages_Total_All_Persons(
			int total_All_Ages_Total_All_Persons)
	{
		this.total_All_Ages_Total_All_Persons = total_All_Ages_Total_All_Persons;
	}
}