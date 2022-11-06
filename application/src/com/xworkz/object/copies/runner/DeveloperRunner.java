package com.xworkz.object.copies.runner;

import com.xworkz.object.copies.create.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		Developer dev=new Developer();
		dev.name="Jyothi.c";
		dev.education="B.E";
		dev.experience=2.5f;
		dev.salary=7.5;
		dev.company="Mind Tree";
		System.out.println(dev.name);
		System.out.println(dev.education);
		System.out.println(dev.experience);
		System.out.println(dev.salary);
		System.out.println(dev.company);
		
		

	}

}
