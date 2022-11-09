package com.xworkz.java.coding;

import com.xworkz.java.code.Dowry;

public class Money extends Dowry{
 public String date;

	public Money(String paymentMode, double amount, String purpose,String date) {
		super(paymentMode, amount, purpose);
		this.date=date;
	
	}
	
	public void money()
	{
		System.out.println(this.amount);
		System.out.println(this.date);
		System.out.println(this.paymentMode);
		System.out.println(this.date);
	
	}
	
	

	
	
	

}
