package com.practice.chain.chaining;

public class Tractor {
	
	public String name;
	public String brand;
	public long price;
	public String model;
	public int    horsePower;
	public String color;
	
	public Tractor() //1
	{
		
	}
	
	public Tractor(String name) //2
	{
		this.name=name;
	
	}
	public Tractor(String brand,long price) //3
	
	{
		
		this.brand=brand;
		this.price=price;
		
		
	}
	public Tractor(long price,String brand) //4
	{
		this(brand,price);
		
		
	}
	public Tractor(String brand,String color,long price) //5
	{
		this(price,brand);
		this.color=color;
	}
	public Tractor(long price,String brand,String color,int horsePower) //6
	{
		this(brand,color,price);
		this.horsePower=horsePower;
		
	}
	public Tractor(long price,String brand,String color,String name,int horsePower,String model) //7
	{
	
		this(price,brand,color,horsePower);
		this.name=name;
		this.model=model;
		
		
	}
	










	{
		
		
	}
	

}
