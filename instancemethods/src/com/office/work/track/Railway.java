package com.office.work.track;

public class Railway {

	public double length;
	public double width;
	public int noOfPlatforms;
	public int noOfWorkers;
	public boolean toilet;
	public int noOfTicketCounters;

	public String[] places;
	public String[] categories; // women,men,adults,children
	public String[] ways; // overpass,underpass
	public String[] types;
	public int[] platformNumbers;

	public Railway(double length, double width, int noOfPlatforms, int noOfWorkers, boolean restRooms, int noOfCounters,
			String[] places, String[] categories, String[] ways, String[] types, int[] platformNumbers) {

		this.length = length;
		this.width = width;
		this.noOfPlatforms = noOfPlatforms;
		this.noOfWorkers = noOfWorkers;
		toilet = restRooms;
		noOfTicketCounters = noOfCounters;
		this.places = places;
		this.categories = categories;
		this.ways = ways;
		this.types = types;
		this.platformNumbers = platformNumbers;

	}
	public void display() {
		System.out.println(this.length);
		System.out.println(this.width);
		System.out.println(noOfPlatforms);
		System.out.println(this.toilet);
		System.out.println(this.noOfTicketCounters);
		
		System.out.println("displaying locations");
		System.out.println(System.lineSeparator());
		for(int index=0;index<places.length;index++)
		{
			String place=places[index];
			System.out.println(place);
			
			
		}
		System.out.println("Displaying categories ");
		System.out.println(System.lineSeparator());
		for(int index=0;index<categories.length;index++)
		{
			String category=categories[index];
			System.out.println(category);
			
		}
		System.out.println("Displaying ways");
		System.out.println(System.lineSeparator());
		
		for(int value=0;value<ways.length;value++)
		{
			String way=ways[value];
			System.out.println(way);
			
			
		}
		System.out.println("Displaying types");
		System.out.println(System.lineSeparator());
		
		for(int number=0;number<types.length;number++)
		{
			String type=types[number];	
			System.out.println(type);
			
			
		}
		System.out.println("Displaying platformNumbers");
		System.out.println(System.lineSeparator());
		for(int tomato=0;tomato<platformNumbers.length;tomato++)
		{
			int platformNumber=platformNumbers[tomato];
			System.out.print(platformNumber +" , ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
