package com.has.relation.boot;

import com.has.relation.code.Fuel;
import com.has.relation.constant.FuelType;

public class FuelRunner {

	public static void main(String[] args) {
		Fuel fuel=new Fuel(true, FuelType.ETHANOL, 200.7, 1);
		fuel.show();
		
           
	}

}
