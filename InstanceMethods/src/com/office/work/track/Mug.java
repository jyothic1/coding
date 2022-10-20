package com.office.work.track;

public class Mug {

	String material;
	double price;
	String colors[];
	char sizes[];
	String shapes[];
	
	public Mug(String material,double price,String[] colors,char[] sizes,String[] shapes ) 
	{
		this.material=material;
		this.price=price;
		this.colors=colors;
		this.sizes=sizes;
		this.shapes=shapes;
		
		
	}
	public void sell() 
	{
		
		System.out.println(this.material);
		System.out.println(this.price);
		System.out.println(System.lineSeparator());
		for(int details=0;details<colors.length;details++)
		{
			String color=colors[details];
			System.out.println(color);
		}
		System.out.println(System.lineSeparator());
		for(int details=0;details<sizes.length;details++)
		{
			char size=sizes[details];
			System.out.println(size);
		}
		System.out.println(System.lineSeparator());
		for(int details=0;details<shapes.length;details++)
		{
			String size=shapes[details];
			System.out.println(size);
		}
		
		
	}
	
	
}
