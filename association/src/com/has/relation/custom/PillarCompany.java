package com.has.relation.custom;

public class PillarCompany {
	public String name;
	public String type;
	
	public PillarCompany(String name,String type)
	{
		this.name=name;
		this.type=type;
	}	
	public void showOff()
	{
		
		System.out.println(this.name);
		System.out.println(this.type);
	}
}
