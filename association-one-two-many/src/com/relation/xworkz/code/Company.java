package com.relation.xworkz.code;

public class Company {
	
	public String name;
	public String ownerName;
	public Address address;
	
	public Company(String name,String ownerName )
	{
		this.name=name;
		this.ownerName=ownerName;
	}
	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.ownerName);
		if(this.address!=null)
		{
			address.show();
		}
		else
		{
			
			System.out.println("exit");
		}
		
	}
	
}
