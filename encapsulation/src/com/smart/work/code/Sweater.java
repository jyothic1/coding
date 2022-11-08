package com.smart.work.code;

public class Sweater {
 private String color;
private String type;
private String brand;
 void setColor(String color)
 {
	 this.color=color;
 }
void setType(String type)
{
	this.type=type;
}
void setBrand(String brand)
{
	this.brand=brand;

}
public String getColor()
{
	return color;
	
}
public String getBrand()
{
	return brand;
	
}
public String getType()
{
	return type;
	
	
}

public void dis()
{
	 System.out.println(this.color);
	 System.out.println(this.brand);
	 System.out.println(this.type);
}
}
