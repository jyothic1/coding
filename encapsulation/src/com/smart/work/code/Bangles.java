package com.smart.work.code;

public class Bangles {
	 String type;
	 double price;
	 int size;
	 int quantity;
	private boolean fit;
	 String company;
	private double weight;
	 String design;
	 String shape;
	 private boolean onlineDelivery=true;
	 String brand;
	
	
	public Bangles(String type, double price, int size, int quantity, String company, String design, String shape,
			String brand) {
		super();
		this.type = type;
		this.price = price;
		this.size = size;
		this.quantity = quantity;
		this.company = company;
		this.design = design;
		this.shape = shape;
		this.brand = brand;
	}
	
	 void setFit(boolean fit)
	{
		this.fit=fit;
	}
	public boolean getFit()
	{
		return fit ;
	
		
	}
	
	 void setWeight(double weight)
	{
		
	}
	 public double getWeight()
	 {
		return weight;
		 
	 }
	 void setOnlineDelivery(boolean onlineDelivery )
	{
		this.onlineDelivery=onlineDelivery;
	}
	
	 
	 public boolean getOnlineDelivery()
	 {
		return onlineDelivery;
		 
	 }
	 public void display()
	 {
		 System.out.println(this.type);
		 System.out.println(this.price);
		 System.out.println(this.size);
		 System.out.println(this.quantity);
		 System.out.println(this.company);
		 System.out.println(this.design);
		 System.out.println(this.shape);
		 System.out.println(this.brand);
	
		 
	 }
	 
	 
	 
	 
	 
	

}
