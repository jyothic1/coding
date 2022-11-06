package com.smart.work.code;

public class BanglesShop {
	Bangles bangles;
	public void wearBangles(Bangles bangles)
	{
		
		bangles.setFit(true);
		
		System.out.println(bangles.getFit());
	    System.out.println(bangles.getOnlineDelivery()); //encapsulation---controlling direct access and 
	                                                 //giving access through methods
	      bangles.setOnlineDelivery(false);
	   
	    bangles.setWeight(12.5);
	
	 bangles.setWeight(67.9);
	 System.out.println(bangles.getWeight());
		
	 
	}
	


 
}
