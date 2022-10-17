package com.practice.chain.chaining;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNo;
	public int ownerNoOfWifes;
	public long contactNo;
	public String shopNo;
	
	
	public TextileShop(String ownerName ) //1
	{
		this.ownerName=ownerName;
		
	}
	public TextileShop(String ownerWifeName, long contactNo) //2
	{
		this.ownerWifeName=ownerWifeName;
		this.contactNo=contactNo;
		System.out.println("values...");
		
	}
	public TextileShop(long contactNo,String ownerWifeName) //3
	{
		this(ownerWifeName,contactNo);
		
	}
	public TextileShop(long ownerDaughterNo,int ownerNoOfWifes) //4
	{
		
		this.ownerDaughterNo=ownerDaughterNo;
		this.ownerNoOfWifes=ownerNoOfWifes;
		System.out.println("intialising.....");
	}
	public TextileShop(int ownerNoOfWifes,long ownerDaughterNo) //5
	{
		this(ownerDaughterNo,ownerNoOfWifes);
		
	}
	public TextileShop(String ownerWifeName,String ownerDaughterName) //6
	{
		
		this.ownerWifeName=ownerWifeName;
		this.ownerDaughterName=ownerDaughterName;
		System.out.println("giving values");
		
		
	}
	public TextileShop(String ownerWifeName,String ownerDaughterName,int ownerNoOfWifes) //7
	{
		this(ownerWifeName,ownerDaughterName);
		this.ownerNoOfWifes=ownerNoOfWifes;
		
		
		
	}
	public TextileShop(String ownerWifeName,String ownerDaughterName,String shopNo, int ownerNoOfWifes) //8
	{
	  this(ownerWifeName,ownerDaughterName);
	
	 this.shopNo=shopNo;
	 this.ownerNoOfWifes=ownerNoOfWifes;
	 
	  
		
		
	}
	
	
	
	
	
	
	
	
	

}
