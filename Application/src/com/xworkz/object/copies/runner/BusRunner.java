package com.xworkz.object.copies.runner;

import com.xworkz.object.copies.create.*;

public class BusRunner {

	public static void main(String[] args) {
	Bus bus1=new Bus();
	// new bus()--instansiation-constructor
	System.out.println("default values");
	System.out.println(bus1.busno);
	System.out.println(bus1.source);
	System.out.println(bus1.destination);
	
	bus1.busno=25;
	bus1.source="Majestic";
	bus1.destination="BTM";
	System.out.println("giving values");
	System.out.println(bus1.busno);
	System.out.println(bus1.source);
	System.out.println(bus1.destination);
	
	
	
		

	}

}
