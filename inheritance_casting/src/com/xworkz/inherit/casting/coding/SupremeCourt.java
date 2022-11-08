package com.xworkz.inherit.casting.coding;

import com.xworkz.inherit.casting.code.Court;

public class SupremeCourt extends Court {

	public int judgeTerm;
	public String place;

	public SupremeCourt(int judgeTerm,String place ) {
	  
		this.judgeTerm=judgeTerm;
		this.place=place;
		System.out.println("Running SupremeCourt Construtor");
		
	}

}
