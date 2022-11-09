package com.xworkz.java.coding;

import com.xworkz.java.code.Catering;

public class Food extends Catering {
  

	
   public Food( String name, String date,double payment) {
	     super(date, name, payment);
	    
	}

public void eat(Catering catering)
   {
	   System.out.println(catering.date);
	   System.out.println(catering.name);
	   System.out.println(catering.payment);
   }
   
}
