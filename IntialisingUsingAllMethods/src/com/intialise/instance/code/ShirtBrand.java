package com.intialise.instance.code;

import com.intialise.instance.constant.ShirtBrands;

public class ShirtBrand {
	public static String boutique="Manyavar";
	public boolean isCostly;
	public double price;
	public String clothType;
	public ShirtBrands brands;
	
	public ShirtBrand(ShirtBrands brand,String clothType) 
	{
		
		brands=brand;
		this.clothType=clothType;
	}
	 
	
	public void setPrice(double price)
	{
		this.price=price;
		
	}
	public void show()
	{
		System.out.println(boutique);
		System.out.println(isCostly);
		System.out.println(price);
		System.out.println(clothType);
		System.out.println(brands);
		System.out.println(ShirtBrands.PARK_AVENUE.ordinal());
		System.out.println(ShirtBrands.JOHN_PLAYERS.noOfPieces);
		System.out.println(ShirtBrands.JOHN_PLAYERS.website);
		System.out.println(ShirtBrands.ALLEN_SOLLY.noOfPieces);
		System.out.println(ShirtBrands.ALLEN_SOLLY.website);
		

		
	}
	

}
