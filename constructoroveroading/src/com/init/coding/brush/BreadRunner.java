package com.init.coding.brush;

import com.init.coding.bottle.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		Bread bread1 = new Bread("garlic");
		System.out.println(bread1.type);
		System.out.println("------------");

		Bread bread2 = new Bread("kara", "square");
		System.out.println(bread2.type);
		System.out.println(bread2.shape);
		System.out.println("------------");

		Bread bread3 = new Bread("sweet", 56.45);
		System.out.println(bread3.type);
		System.out.println(bread3.price);
		System.out.println("------------");
		Bread bread4 = new Bread(79.45, "garlic");
		System.out.println(bread4.price);
		System.out.println(bread4.type);
		System.out.println("------------");
		Bread bread5 = new Bread("cheese", "round", "abhi ruchi");
		System.out.println(bread5.type);
		System.out.println(bread5.shape);
		System.out.println(bread5.companyName);
		System.out.println("------------");
		Bread bread6 = new Bread("oats", "traingle", 89.67, "raja bun");
		System.out.println(bread6.type);
		System.out.println(bread6.shape);
		System.out.println(bread6.price);
		System.out.println(bread6.companyName);
		System.out.println("------------");

		Bread bread7 = new Bread("plain", "rectangle", "burger bun", 45);
		System.out.println(bread7.type);
		System.out.println(bread7.shape);
		System.out.println(bread7.companyName);
		System.out.println(bread7.price);
		System.out.println("------------");

		Bread bread8 = new Bread("pav bun", "square", "britania bun", 57.9, 10);
		System.out.println(bread8.type);
		System.out.println(bread8.shape);
		System.out.println(bread8.companyName);
		System.out.println(bread8.price);
		System.out.println(bread8.quantity);

	}

}
