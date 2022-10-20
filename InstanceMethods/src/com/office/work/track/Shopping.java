package com.office.work.track;

public class Shopping {
	String location;
	String transportation;
	boolean quality;
	String ShoppingItems[];
	double prices[];
	String payment[];
	 
	 public Shopping(String place,String travel,String ShoppingItem[],double[] prices,String payment[],boolean quality)
	 {
		location=place;
		transportation=travel;
		this.quality=quality;
		this.ShoppingItems=ShoppingItem;
		this.prices=prices;
		this.payment=payment;

	 }
	 
	 public void nodsu() 
	 {
		 System.out.println(location);
		 System.out.println(transportation);
		 System.out.println(quality);
		 
		 System.out.println("displaying items");
			System.out.println(System.lineSeparator());
		 for(int item=0;item<ShoppingItems.length;item++) 
		 {
			 String clothes=ShoppingItems[item];
			 System.out.println(clothes);
			 
		 }
		 
		 
		 System.out.println("displaying prices");
			System.out.println(System.lineSeparator());
		 for(int item=0;item<prices.length;item++) 
		 {
			 double clothes=prices[item];
			 System.out.println(clothes);
			 
		 }
		 
		 System.out.println("displaying payment modes");
			System.out.println(System.lineSeparator());
		 for(int item=0;item<payment.length;item++) 
		 {
			 String pay=payment[item];
			 System.out.println(pay);
			 
		 }
		 
		 
		 
		
		 
		 
		 
		 
		 
	 }
	 
	 
	

}
