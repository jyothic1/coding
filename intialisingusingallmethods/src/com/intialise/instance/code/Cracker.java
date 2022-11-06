package com.intialise.instance.code;

import com.intialise.instance.constant.Crack;

public class Cracker {
public static String company="Ganesh Pataki";
public String type;
public double price;
public boolean branded;
public Crack crack=Crack.VISHNU_CHAKRA;

public Cracker(String type)
{
	
this.type=type;

}
public double setPrice(double price) 
{
	this.price=price;
	return price;	
	
}

public void details() 
{
	System.out.println(company);
	System.out.println(type);
	System.out.println(price);
	System.out.println(branded);
	System.out.println(crack);
	System.out.println(Crack.VISHNU_CHAKRA.quant);
	System.out.println(Crack.ROCKETS.ordinal());
	
}







}
