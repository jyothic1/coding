package com.init.coding.brush;

import com.init.coding.bottle.Boat;

public class BoatRunner {

	public static void main(String[] args)
	{
		Boat boat1=new Boat("Liberty boat");
		 System.out.println(boat1.name);
		 System.out.println("****");
		 Boat boat2=new Boat("Liberty boat","white");
		 System.out.println(boat2.name);
		 System.out.println(boat2.color);
		 System.out.println("*********");
		 Boat boat3=new Boat("Liberty boat","white","Royal Caribbean Cruises Ltd.");
		 
		 System.out.println(boat3.name);
		 System.out.println(boat3.color);
		 System.out.println(boat3.companyName);
		 System.out.println("*********");
		
		 Boat boat4=new Boat("Liberty boat","white","Royal Caribbean Cruises Ltd.","electronic spy ship");
		
		 System.out.println(boat4.name);
		 System.out.println(boat4.color);
		 System.out.println(boat4.companyName);
		 System.out.println(boat4.type);
		 System.out.println("*********");
		 Boat boat5=new Boat("Liberty boat","white","Royal Caribbean Cruises Ltd.","electronic spy ship","John Hancock");
		 
		 System.out.println(boat5.name);
		 System.out.println(boat5.color);
		 System.out.println(boat5.companyName);
		 System.out.println(boat5.type);
		 System.out.println(boat5.owner);
	}
	

}
