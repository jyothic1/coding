package com.office.work.tracker;

import com.office.work.track.Netfix;

public class NetfixRunner {

	public static void main(String[] args) {
	String moviesList[]={"kalsipalya","Major","Karthikeya-2"};
	String type[]= {"HD","Normal","Medium"};
    String headquarters[]= {"Los Gatos","California","United States"};
	
		
		Netfix netflix=new Netfix();
		System.out.println(netflix);

		Netfix netflix1=new Netfix("dec-21","jan 21",511.6,moviesList,type,headquarters);
		netflix1.present();
		
	}

}
