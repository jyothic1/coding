package com.office.work.tracker;

import com.office.work.track.Mug;

public class MugRunner {

	public static void main(String[] args) {
		String color[]= {"pink","green","white"};
		char size[]= {'S','M','L'};
		String shape[]= {"Round","rectangle"};
		Mug mug=new Mug("plastic",150.0,color,size,shape);
		
		mug.sell();
	}

}
