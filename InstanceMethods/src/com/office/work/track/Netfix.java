package com.office.work.track;

public class Netfix {
	String subsriptiondDate;
	String subsriptiondExpDate;
	double netIncome; //511.6 crores USD (2021)
	
	String movies[];
	String printType[];  //Headquarters: Los Gatos, California, United States
	String headquarters[];
	
	public Netfix() 
	{
		
		
	}
	public Netfix(String subsriptiondDate,String subsriptiondExpDate,double netIncome,String movies[],String printType[],String headquarters[]) 
	{
		this.subsriptiondDate=subsriptiondDate;
		this.subsriptiondExpDate=subsriptiondExpDate;
		this.netIncome=netIncome;
		this.movies=movies;
		this.printType=printType;
		this.headquarters=headquarters;
		
		
		
	}
	public void present() 
	{ 
		System.out.println(this.subsriptiondDate);
		System.out.println(this.subsriptiondExpDate);
		System.out.println(this.netIncome);
		//System.out.println(	this.movies);
		//System.out.println(this.printType);
		//System.out.println(	this.headquarters);
		System.out.println(System.lineSeparator());
		for(int dosa=0;dosa<movies.length;dosa++)
		{
			String movie=movies[dosa];
			System.out.println(movie);
			
		}
		System.out.println(System.lineSeparator());
		for(int palya=0;palya<printType.length;palya++)
		{
			String type=printType[palya];
			System.out.println(type);
			
		}
		System.out.println(System.lineSeparator());
		for(int sambar=0;sambar<movies.length;sambar++)
		{
			String headquarter=headquarters[sambar];
			System.out.println(headquarter);
			
		}
		
	}
	

}
