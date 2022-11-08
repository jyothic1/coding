package com.xworkz.inherit.casting.boot;

import com.xworkz.inherit.casting.code.Court;
import com.xworkz.inherit.casting.coding.DistrictCourt;
import com.xworkz.inherit.casting.coding.HighCourt;
import com.xworkz.inherit.casting.coding.SupremeCourt;

public class CourtRunner {
	public static void main(String[] args) {
		Court court=new Court();
		System.out.println(court.courtNo);
		System.out.println(court.judgeName);
		
		Court court1=new SupremeCourt(65,"Delhi");
		   SupremeCourt supremeCourt=(SupremeCourt)court1;
		System.out.println(supremeCourt.judgeTerm);
		System.out.println(supremeCourt.place);
		System.out.println(supremeCourt.courtNo);
		System.out.println(supremeCourt.judgeName);
		
		Court court2=new DistrictCourt("Bengaluru", "Deepak Patil");
		DistrictCourt districtCourt=(DistrictCourt)court2;
		System.out.println(districtCourt.judge);
		System.out.println(districtCourt.place);
		System.out.println(districtCourt.courtNo);
		System.out.println(districtCourt.judgeName);
		
		Court court3=new HighCourt("Bengaluru", "Alok Aradhe");
		HighCourt highCourt=(HighCourt)court3;
		System.out.println(highCourt.courtNo);
		System.out.println(highCourt.judge);
		System.out.println(highCourt.judgeName);
		System.out.println(highCourt.place);
		
		
	}

}
