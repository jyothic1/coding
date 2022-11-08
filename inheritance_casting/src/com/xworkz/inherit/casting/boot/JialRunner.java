package com.xworkz.inherit.casting.boot;

import com.xworkz.inherit.casting.code.Jail;
import com.xworkz.inherit.casting.coding.CentralJail;
import com.xworkz.inherit.casting.coding.SubJail;
import com.xworkz.inherit.casting.coding.WomensJail;

public class JialRunner {

	public static void main(String[] args) {
		Jail jail=new Jail();
		System.out.println(jail.noOfCases);
		System.out.println(jail.noOfCells);
		Jail jail1=new CentralJail("Delhi",23456789089l);
		CentralJail centralJail=(CentralJail)jail1;
		System.out.println(centralJail.phNo);
		System.out.println(centralJail.place);
		System.out.println(centralJail.noOfCases);
		System.out.println(centralJail.noOfCells);
		
		Jail jail2=new SubJail("Tamilmadu", 9876543345l);
		SubJail subJail=(SubJail)jail2;
		System.out.println(subJail.phNo);
		System.out.println(subJail.place);
		
		System.out.println(subJail.noOfCells);
		
		System.out.println(subJail.noOfCases);
		
		Jail jail3=new WomensJail("Tiruvanantapuram", 3467895434l);
		WomensJail womensJail=(WomensJail)jail3;
		System.out.println(womensJail.mobile);
		System.out.println(womensJail.name);
		System.out.println(womensJail.noOfCases);
		System.out.println(womensJail.noOfCells);
		
		
		
	}
	
	

	

}
