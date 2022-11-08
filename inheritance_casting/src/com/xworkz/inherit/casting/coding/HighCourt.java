package com.xworkz.inherit.casting.coding;

import com.xworkz.inherit.casting.code.Court;

public class HighCourt extends Court{
	public String place;
	public String judge;
	

	public HighCourt(String place,String judge) {
		super();
		this.judge=judge;
		this.place=place;
		System.out.println("Running HighCourt Construtor");
	}

}
