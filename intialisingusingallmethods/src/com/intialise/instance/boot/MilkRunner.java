package com.intialise.instance.boot;

import com.intialise.instance.code.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		Milk milk=new Milk(true);
		milk.setFlavour("Rose Milk");
		milk.mobileNo=9100703797l;
         milk.display();
	}

}
