package com.smart.work.code;

public class Sanitizer {
	String brand;
	double quantity;
	String ownerName;
	

	private String color="black";
	private long mobile=3456789987654l;
	private boolean isCostly=false;
	
	 public Sanitizer(String brand, double quantity, String ownerName) {
			super();
			this.brand = brand;
			this.quantity = quantity;
			this.ownerName = ownerName;
		
		}
	
	 void setColor(String clr)
	{
		this.color=clr;
	}
	 public String getColor()
	 {
		return color;
		 
	 }
	
	void setMobile(long no)
	 {
		 this.mobile=no;
	 }
	 public long getMobile()
	 
	 {
		return mobile;
		}
	 void setIsCostly(boolean cost)
	 {
		 this.isCostly=cost;
	 }
	 public boolean getIsCostly()
	 {
		return isCostly;
		 
	 }
	 
	 public void snow()

	 {
		 System.out.println(this.color);
		 System.out.println(this.isCostly);
		 System.out.println(this.mobile);
		 System.out.println(this.brand);
		 System.out.println(this.quantity);
		 System.out.println(this.ownerName);
		
		
	 }

	
	
	
	
	
	

}
