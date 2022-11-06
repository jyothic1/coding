package com.intialise.instance.boot;

import com.intialise.instance.code.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
	Flower flower=new Flower("Propose Madoke");
	flower.setQuantity(2);
	flower.favourite=true;
	flower.show();

	}

}
