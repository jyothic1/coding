package com.init.coding.bottle;

public class Fish {
	public String name;
	public String type;
	public double price;
	public int weight;
	public int length;

	public Fish(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Fish(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Fish(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public Fish(int weight, double price) {
		this.weight = weight;
		this.price = price;
	}

	public Fish(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}

	public Fish(int weight, String name, int length) {
		this.weight = weight;
		this.name = name;
		this.length = length;

	}

	public Fish(int weight, int length, String name) {

		this.weight = weight;
		this.length = length;
		this.name = name;

	}

	public Fish(int length, String name, int weight, double price,String type) {

		this.length = length;
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.type = type;

	}

}
