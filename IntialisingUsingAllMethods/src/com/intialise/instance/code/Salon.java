package com.intialise.instance.code;

import com.intialise.instance.constant.SalonServices;

public class Salon {
	public static String salonName="Beauty Bounty";
	public boolean goodService;
	public static  boolean costly;
	public SalonServices services;
	public double price;
	
	public Salon(SalonServices service) 
	{
		services=service;
	}
	public void setprice(double cost) 
	{
		price=cost;
	}
	public void display()
	{
		
		System.out.println(salonName);
		System.out.println(goodService);
		System.out.println(costly);
		System.out.println(services);
		System.out.println(price);
		System.out.println(SalonServices.MANICURES_PEDICURES.available);
		System.out.println(SalonServices.WAXING.ordinal());
	}
	

}
