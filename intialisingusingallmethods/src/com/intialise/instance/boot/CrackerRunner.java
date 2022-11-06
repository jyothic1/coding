package com.intialise.instance.boot;

import com.intialise.instance.code.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		
		Cracker cracker=new Cracker("chemical");
		cracker.setPrice(800.00);
		
	
	
	cracker.branded=true;
	cracker.details();
	}

}
