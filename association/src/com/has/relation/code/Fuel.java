package com.has.relation.code;

import com.has.relation.constant.FuelType;
import com.has.relation.custom.FuelBrand;

public class Fuel {
	public boolean special;
	public FuelType type;
	public double price;
	public double quantity;
	public FuelBrand brand=new FuelBrand("Shell", "gst3465758", 5);
	public Fuel(boolean special, FuelType type, double price, double quantity) {
		super();
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	public void show()
	{
		if(brand!=null)
		{
			brand.display();
			
		}
		else
		{
			System.out.println("exit");
		}
		System.out.println(this.special);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		
		
	}
	
	

}
