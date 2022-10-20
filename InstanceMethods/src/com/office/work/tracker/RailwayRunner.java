package com.office.work.tracker;

import com.office.work.track.Railway;

public class RailwayRunner {


	public static void main(String[] args) {
		String[]place= {"hyderabad","kanyakumari","tripura"};
		String[]categry= {"women","men","adults"};
		String[]way= {"under pass","overpass"};
		String[]type= {"electric","coal","diesel"};
		int[]numbers= {1,2,3,4,5,6,7};
		
		
		
		Railway railway=new Railway(4.4,1000,12,46,true,6,place,categry,way,type,numbers);
		
		railway.display();
		

	}

}
