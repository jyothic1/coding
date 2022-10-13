package com.xworkz.object.boot;

import com.xworkz.object.create.Tea;

public class TeaRunner {

	public static void main(String[] args) {
	   Tea tea1;
	  // System.out.println(tea1);
	   tea1=new Tea();
	   
	 System.out.println(tea1.name);
	 System.out.println(tea1.type);
	 System.out.println(tea1.price);
	 System.out.println(tea1.color);
	 System.out.println(tea1.quantity);
	 System.out.println(tea1.brandAmbassader);
	 System.out.println(tea1.benifit1);
	 System.out.println("*********");
	 System.out.println(tea1.taste=true);
	 System.out.println(tea1.brand="Tetley");
	 System.out.println(tea1.source="india");
	 System.out.println(tea1.expdate="13-oct-2022");
	 System.out.println(tea1.mfdate="13-oct-2025");
	 System.out.println(tea1.owner=" Joseph Tetley, Edward Tetley");
	 System.out.println(tea1.taste=true);
	 System.out.println(tea1.Benifit2="weight loss");
	 System.out.println(tea1.export=true);
	 
	  Tea tea2=new Tea();
	  tea2.Benifit2="boost melabolism";
	  tea1=tea2;
	  System.out.println("after updating");
	  System.out.println(tea1.Benifit2);
	  
	  
	 
	 
	 

	 
	}

}
