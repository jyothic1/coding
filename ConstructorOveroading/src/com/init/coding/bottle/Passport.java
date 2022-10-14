package com.init.coding.bottle;

public class Passport {
	
	public long no;
	public String name;
	public int expiryDate;
	public int issueDate;
	public String country;
	public int noOfLeafs;
	
	public Passport(long no) 
	{
		this.no=no;
		
	}
	public Passport(long no,String name ) 
	{
		this.no=no;
		this.name=name;
		
	}
	public Passport(long no,String name,int expiryDate) 
	{
		this.no=no;
		this.name=name;
		this.expiryDate=expiryDate;
		
	}
	public Passport(long no,String name,int expiryDate,int issueDate) 
	{

		this.no=no;
		this.name=name;
		this.expiryDate=expiryDate;
		this.issueDate=issueDate;
		
	}
	public Passport(long no,int expiryDate,int issueDate) 
	{
		this.no=no;
		this.expiryDate=expiryDate;
		this.issueDate=issueDate;
		
	}
	public Passport(int noOfLeafs,long no) 
	{
		this.no=no;
		this.noOfLeafs=noOfLeafs;
		
	}
	public Passport(long no,String name,int expiryDate,int issueDate,int noOfLeafs) 
	{
		this.no=no;

		this.name=name;
		this.expiryDate=expiryDate;
		this.issueDate=issueDate;
		this.noOfLeafs=noOfLeafs;
		
	}
	public Passport(int expiryDate,int issueDate,int noOfLeafs) 
	{

		this.expiryDate=expiryDate;
		this.issueDate=issueDate;
		this.noOfLeafs=noOfLeafs;
		
	}
	public Passport(String country,int noOfLeafs) 
	{
		this.country=country;
		this.noOfLeafs=noOfLeafs;
		
	}
	
	
	
	
	
	
	
	
	
	

}
