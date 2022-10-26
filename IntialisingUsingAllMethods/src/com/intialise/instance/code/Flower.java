package com.intialise.instance.code;

import com.intialise.instance.constant.Rose;

public class Flower {
	public static String shopName="Kantara Flower Stall";
	public boolean favourite;
	public int quantity;
	public Rose rose=Rose.PINK;
	public String purpose;
	
	 public Flower(String usedFor) 
	 {
		 purpose=usedFor;
		 
	 }
	public void setQuantity(int quant) 
	
	{
		this.quantity=quant;
		
	}
	
	
	 public void show()
	 {
		 
		 System.out.println(shopName);
		 System.out.println(favourite);
		 System.out.println(quantity);
		 System.out.println(rose);
		 System.out.println(purpose);
		 System.out.println(Rose.YELLOW.price);
		 System.out.println(Rose.WHITE.ordinal());
		 
		 
	 }
	 
	 
	
	
	
	
	 


}
