package com.relation.xworkz.code;

public class City {
	public String name;
	public int pincode;
	public boolean capital;
	public boolean big;
	 public City(String name,int pincode,boolean capital,boolean big)
	 {
		 this.name=name;
		 this.pincode=pincode;
		 this.capital=capital;
		 this.big=big;
		 
	 }
	 public void dis()
	 {
		 System.out.println(this.name);
		 System.out.println(this.pincode);
		 System.out.println(this.capital);
		 System.out.println(this.big);
		 
	 }
	

}
