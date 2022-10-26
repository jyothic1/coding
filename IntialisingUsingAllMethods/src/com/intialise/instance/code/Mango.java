package com.intialise.instance.code;

import com.intialise.instance.constant.MangoTypes;

public class Mango {
public static String place="Florida";
public double price;
public MangoTypes types;
public static int quantity;
public boolean available;

public Mango(double cost) 
{
	price=cost;
}
public void setTypes(MangoTypes types)
{
	
	this.types=types;
}
public void display()
{
	System.out.println(place);
	System.out.println(price);
	System.out.println(types);
	System.out.println(quantity);
	System.out.println(available);
	System.out.println(MangoTypes.TOMMY_AKTINS.ordinal());
	
}

}
