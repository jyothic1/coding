package com.relation.xworkz.code;

public class Address {
	public Location location;
	public Address(Location location)
	{
	   this.location=location;	
		
	}
	public void show()
	{
		 if(location!=null)
		 {
		 
			location.dispay(); 
			 
		 }
		
		
	}
	

}

