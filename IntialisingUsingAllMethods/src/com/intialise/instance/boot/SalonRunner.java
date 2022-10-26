package com.intialise.instance.boot;

import com.intialise.instance.code.Salon;
import com.intialise.instance.constant.SalonServices;

public class SalonRunner {

	public static void main(String[] args) {
		Salon salon=new Salon(SalonServices.HAIR_CARE);
		
		Salon.costly=true;
		salon.goodService=false;
		salon.setprice(3000.00);
		salon.display();
	}

}
