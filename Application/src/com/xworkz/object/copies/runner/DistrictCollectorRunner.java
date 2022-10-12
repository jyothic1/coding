package com.xworkz.object.copies.runner;

import com.xworkz.object.copies.create.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		DistrictCollector collector=new DistrictCollector();
		
	System.out.println(collector.name);
	System.out.println(collector.age);
	System.out.println(collector.district);
	
	collector.age=35;
	collector.name="Naga Lakshmi";
	collector.district="Anantapur";
	
	System.out.println(collector.name);
	System.out.println(collector.age);
	System.out.println(collector.district);
	
	
	
	

	}

}
