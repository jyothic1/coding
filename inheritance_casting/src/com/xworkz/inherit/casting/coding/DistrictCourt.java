package com.xworkz.inherit.casting.coding;

import com.xworkz.inherit.casting.code.Court;

public class DistrictCourt extends Court {
	public String place;
	public String judge;

	public DistrictCourt(String name,String judge) {
		super();
		this.place=name;
		this.judge=judge;
		System.out.println("Running DistrictCourt Construtor");
	}
	

}
