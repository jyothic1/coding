package com.practice.chain.boot;

import com.practice.chain.chaining.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		Tractor tractor1=new Tractor();
		Tractor tractor2=new Tractor("Jyothi");
		System.out.println(tractor2.name);
		Tractor tractor3=new Tractor("John Deere",7000000);
		System.out.println(tractor3.brand);
		System.out.println(tractor3.price);
		
		Tractor tractor4=new Tractor(8000000,"New Holland");
		
		System.out.println(tractor4.price);
		System.out.println(tractor4.brand);
	
		Tractor tractor5=new Tractor("New Holland","black",8000000);
	
		System.out.println(tractor5.price);
		System.out.println(tractor5.brand);
		System.out.println(tractor5.color);
		
		Tractor tractor6=new Tractor(900000,"Mahindra","Red",50);
		
		System.out.println(tractor6.price);
		System.out.println(tractor6.brand);
		System.out.println(tractor6.color);
		System.out.println(tractor6.horsePower);
		
	Tractor tractor7=new Tractor(900000,"Mahindra","Red","");
		
		System.out.println(tractor7.price);
		System.out.println(tractor7.brand);
		System.out.println(tractor7.color);
		
		
		System.out.println(tractor7.horsePower);
		
	
		
		
		
		
	
		
		
	}

}
