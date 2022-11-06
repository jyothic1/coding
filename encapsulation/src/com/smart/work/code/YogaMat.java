package com.smart.work.code;

public class YogaMat {
	private String brand;
	private int length;
	private String color;
	public String getBrand() {
		return brand;
	}
 void setBrand(String brand) {
		this.brand = brand;
	}
	public int getLength() {
		return length;
	}
 void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
 void setColor(String color) {
		this.color = color;
	}
	
 public void show()

 {
	 System.out.println(this.color);
	 System.out.println(this.length);
	 System.out.println(this.brand);
 }
}
