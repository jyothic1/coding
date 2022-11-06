package com.relation.xworkz.code;

public class Country {
	public String countryName;
	public long population;
	public String presidentName;
	public int noOfStates;
	

public void setCountry( String countryName,long population,String presidentName,int noOfStates)
{
	this.countryName=countryName;
	this.population=population;
	this.presidentName=presidentName;
	this.noOfStates=noOfStates;
	
	
}

public void display()
{
	System.out.println(this.countryName);
	System.out.println(this.noOfStates);
	System.out.println(this.population);
	System.out.println(this.presidentName);
	
}


}
