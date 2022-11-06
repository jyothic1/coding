package com.relation.xworkz.code;

public class Person {
	
	public String name;
	public Email email[];
	public Job job;
	public Person(String name, Email[] email, Job job) {
		super();
		this.name = name;
		this.email = email;
		this.job = job;
	}
	
	public void showOff()
	{
		
		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.job);
	}
	
	
	

}
