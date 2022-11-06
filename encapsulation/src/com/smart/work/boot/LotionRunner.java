package com.smart.work.boot;

import com.smart.work.code.BodyLotion;
import com.smart.work.code.LotionCompany;

public class LotionRunner {

	public static void main(String[] args) {
	  BodyLotion bodylotion=new BodyLotion();
	 
	 LotionCompany company=new LotionCompany("Global AG", "Beiersdorf", 18009876342L,"Rabindra.purohit@beiersdorf@gmail.com");
	 bodylotion.skinCare();
	 company.display();
	 
	 
	 

	 
	 
	 
	}

}
