package com.zpoint.peak.coding;

import com.zpoint.peak.constant.DressSize;

public class Dress {

	public String name;
   public double price;
   public DressSize Medium;
  
 public Dress(String name,double price,DressSize Medium) 
 {
	 
	this.name=name;
	this.price=price;
	this.Medium=Medium;
	
	
	 
	 
 }
 public void show()
 {
	 System.out.println(name);
	 System.out.println(price);

	 System.out.println(Medium);

	 
	 
 }
 
 
    


}
