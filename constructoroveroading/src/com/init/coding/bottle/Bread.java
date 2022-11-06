package com.init.coding.bottle;

public class Bread {
	public String type;
	public String shape;
	public String companyName;
	public double price;
	public int quantity;

	public Bread(String type) {
		this.type = type;

	}

	public Bread(String type, String shape) {

		this.type = type;
		this.shape = shape;
	}

	public Bread(String type, double price) {
		this.type = type;
		this.price = price;

	}

	public Bread(double price, String type) {
		this.price = price;
		this.type = type;

	}

	public Bread(String type, String shape, String companyName) {
		this.type = type;
		this.shape = shape;
		this.companyName = companyName;
	}

	public Bread(String type, String shape, double price, String companyName) {
		this.type = type;
		this.shape = shape;
		this.price = price;
		this.companyName = companyName;
	}

	public Bread(String type, String shape, String companyName, double price) {
		this.type = type;
		this.shape = shape;
		this.price = price;
		this.companyName = companyName;

	}

	public Bread(String type, String shape, String companyName, double price, int quantity) {
		this.type = type;
		this.shape = shape;
		this.price = price;
		this.companyName = companyName;
		this.quantity = quantity;

	}

}
