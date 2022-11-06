package com.smart.work.code;

public class LotionCompany {
	String company;
	private String brand;
	String ownerName;
	private String country;
	public long tollFreeNo;
    private int introduceYear;
	private boolean branded;
	private String usedFor;
	String companyEmailId;
	
	public LotionCompany(String company, String ownerName, long tollFreeNo, String companyEmailId) {
		super();
		this.company = company;
		this.ownerName = ownerName;
		this.tollFreeNo = tollFreeNo;
		this.companyEmailId = companyEmailId;
		
	}
	 void setBrand(String brand)
	 {
		 this.brand=brand;
	 }
	 void setCountry(String cntry)
	 {
		 this.country=cntry;
	 }
	void setIntroduceYear(int introduceYear)

	{
		this.introduceYear=introduceYear;
		
	}
	void setBranded(boolean branded)
	{
		this.branded=branded;
	}
	void setUsedFor(String usedFor)
	{
		this.usedFor=usedFor;
	}
	
	public String getBrand()
	{
		return brand;
		
	}
	public String getCountry()
	{
		return country;
		
	}
	public int getIntroduceYear()
	{
		return introduceYear;
		
	}
	public boolean getBranded()
	{
		return branded;
		
	}
	public String getUsedFor()
	{
		return usedFor;
		
	}
	public void display()
	{
		System.out.println(this.company);
		System.out.println(this.ownerName);
		System.out.println(this.tollFreeNo);
		System.out.println(this.companyEmailId);
		
	}
	
	
	
	 
	
	

}
