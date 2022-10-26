package com.intialise.instance.constant;

public enum ShirtBrands {
	ALLEN_SOLLY(4, "Amazon"),RAYMOND(5, "Flipkart"),PARK_AVENUE(6, "Ajio"),JOHN_PLAYERS(3, "Myntra");
	
	public int noOfPieces;
	public String website;
	ShirtBrands(int quantity,String website)
	{
		noOfPieces=quantity;
		this.website=website;
		
	}

}
