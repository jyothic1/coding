package com.intialise.instance.code;

import com.intialise.instance.constant.MilkBrands;

public class Milk {
	public static String storeName="Asha Stores";
	public boolean quality;
	public String flavour;
	public MilkBrands brands=MilkBrands.PATANJALI;
	public long mobileNo;
	 
	public Milk(boolean quality)
	{
		
		this.quality=quality;
	}
	public void setFlavour(String flavour) 
	{
		this.flavour=flavour;
		
	}
	public void display()
	{
		System.out.println(storeName);
		System.out.println(quality);
		System.out.println(flavour);
		System.out.println(brands);
		System.out.println(mobileNo);
		System.out.println(MilkBrands.NESTLE.name());
		System.out.println(MilkBrands.NANDINI.getClass());
		System.out.println(MilkBrands.MOTHER_DAIRY.ordinal());
		
	}
}
