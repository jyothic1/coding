package com.practice.chain.chaining;

public class Chain {
	public String type;
	public int price;
	public 	double length;
	 public String material;
	 public double weight;
	 public boolean stolen;
	  public String usedFor;
	  public boolean fresh;
	
	 public Chain(String type){
		 this.type=type;
		 
		 
	 }

	 public Chain(String type,int price){
		 this(type);
		 this.price=price;
	 }

	 public Chain(int price,String type){
		 
		 this(type,price);
	 }

	 public Chain(String type,String material){
		 
		 this.type=type;
		 this.material=material;
		 
	 }

	 public Chain(String type,boolean fresh){
		 
		 this.type=type;
		 this.fresh=fresh;
	 }

	 public Chain(boolean fresh,String type){
		 this("horse chain",true);
		 
	 }

	 public Chain(double weight,boolean stolen){
		 
		 this.weight=weight;
		 this.stolen=stolen;
	 }

	 public Chain(boolean stolen,double weight){
		 this(24.5,false);
		 
	 }
	 
	 
	 
	 

}
