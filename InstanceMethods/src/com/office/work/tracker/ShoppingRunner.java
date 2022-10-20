package com.office.work.tracker;

import com.office.work.track.Shopping;

public class ShoppingRunner {

	public static void main(String[] args) {
		
		String items[]={"traditional","western"};
		double price[]= {4500.9,7699.45};
		String pay[]= {"QR code","cash","card"};
		Shopping shopping=new Shopping("shein", "car", items, price, pay,true);
		shopping.nodsu();
	
		
		
		
		

	}

}
