package com.smart.work.boot;

import com.smart.work.code.*;



public class ShopRunner {

	public static void main(String[] args) {
	  BanglesShop shop=new BanglesShop();
      Bangles bangles=new Bangles("Gold", 87000.00, 12,2, "Sridevi Jewelleries", "peacock design","round","Bluestone");
      bangles.display();
      shop.wearBangles(bangles);
      System.out.println(bangles.getWeight());
   
     System.out.println(bangles.getFit());
     System.out.println(bangles.getOnlineDelivery());
 
      
	}
	

}
