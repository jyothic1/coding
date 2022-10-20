package com.office.work.track;

public class Temples {
String country;
double distance;
String population;

String names[];
String gods[];
String places[];


public Temples(String country,String population,double distance,String names[],String gods[],String places[]) 
{
	this.country=country;
	this.distance=distance;
	this.population=population;
	this.names=names;
	this.gods=gods;
	this.places=places;
	
}
public void pray() 
{
	System.out.println(this.country);
	System.out.println(this.distance);
	System.out.println(this.population);
	System.out.println(System.lineSeparator());
	for(int name=0;name<names.length;name++)
	{
		
		String hesaru=names[name];
		System.out.println(hesaru);
		
	}
	System.out.println(System.lineSeparator());
	for(int god=0;god<gods.length;god++)
	{
		
		String devaraHesaru=gods[god];
		System.out.println(devaraHesaru);
		
	}
	System.out.println(System.lineSeparator());
	for(int place=0;place<places.length;place++)
	{
		
		String placesHesaru=places[place];
		System.out.println(placesHesaru);
		
	}
}

}
