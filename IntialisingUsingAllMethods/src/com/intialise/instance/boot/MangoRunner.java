package com.intialise.instance.boot;

import com.intialise.instance.code.Mango;
import com.intialise.instance.constant.MangoTypes;

public class MangoRunner {

	public static void main(String[] args) {
	Mango mango=new Mango(150.00) ;
	Mango.quantity=10;
	mango.available=true;
	mango.setTypes(MangoTypes.KENT);
	mango.display();
	

	}

}
