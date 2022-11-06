package com.intialise.instance.code;

import com.intialise.instance.constant.Belaku;

public class Lamp {
	public static String usedIn="Night Time";
	public static String name;
	public Belaku belaku;
	public static int quantity;
	public boolean Iscostly;
	  public Lamp(Belaku light)
	  {
		  belaku=light;
		  
	  }
	public static void setQuantity(int quant)
	{
		
		quantity=quant;
	}
	static {
		
		name="AmarRaja Batteries";
	}
	
	
	public void print() 
	{
		System.out.println(usedIn);
		System.out.println(name);
		System.out.println(belaku);
		System.out.println(quantity);
		System.out.println(Iscostly);
		System.out.println(Belaku.SODIUM.ordinal());
		
	}
	
	
	
	
	 

}
