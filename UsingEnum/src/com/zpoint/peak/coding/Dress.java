package com.zpoint.peak.coding;

import com.zpoint.peak.constant.DressSize;

public class Dress {

	public String name;
   public double price;
   public DressSize dresssize=DressSize.Medium;
  
 public Dress(String name,double price,DressSize dresssize )
 {
	 
	this.name=name;
	this.price=price;

	
	
	 
	 
 }
 public void show()
 {
	 System.out.println(name);
	 System.out.println(price);

	 System.out.println(dresssize.size);
	 System.out.println(dresssize.Large.ordinal());

	 
	 
 }
 
 
    


}
