package com.init.coding.brush;

import com.init.coding.bottle.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		Passport passport1= new Passport(9845325);
		 System.out.println(passport1.no);
		 System.out.println("----------");
		 
			Passport passport2= new Passport(9845325,"jyothi");
			 System.out.println(passport2.no);
			 System.out.println(passport2.name);
			 System.out.println("------------------");
			 
			 Passport passport3= new Passport(9845325,"jyothi",2030);
			 System.out.println(passport3.no);
			 System.out.println(passport3.name);
			 System.out.println(passport3.expiryDate);
			 System.out.println("------------------");
			 
			 
			 Passport passport4= new Passport(9845325,"yasmeen",2030,2020);
			 System.out.println(passport4.no);
			 System.out.println(passport4.name);
			 System.out.println(passport4.expiryDate);
			 System.out.println(passport4.issueDate);
			 
			 System.out.println("------------------");
			 
			 
			 Passport passport5= new Passport(9845795,2040,2030);
			 System.out.println(passport5.no);
			 System.out.println(passport5.expiryDate);
			 System.out.println(passport5.issueDate);
			 
			 System.out.println("------------------");
			 
			 Passport passport6= new Passport(46,2040203);
			 System.out.println(passport6.no);
			 System.out.println(passport6.noOfLeafs);
			 System.out.println("------------------");
			 
			 Passport passport7= new Passport(1234567,"vinutha",2030,2019,45);
			 System.out.println(passport7.no);
			 System.out.println(passport7.name);
			 System.out.println(passport7.expiryDate);
			 System.out.println(passport7.issueDate);
			 System.out.println(passport7.noOfLeafs);
			 
			 
			 System.out.println("------------------");
			 

			 Passport passport8= new Passport(2025,2010,50);
			 
			 System.out.println(passport8.expiryDate);
			 System.out.println(passport8.issueDate);
			 System.out.println(passport8.noOfLeafs);
			 System.out.println("------------------");
			 
			 

Passport passport9= new Passport("India",57);
			 
			 System.out.println(passport9.country);
			 System.out.println(passport9.noOfLeafs);
			 System.out.println("------------------");
			
	}

}
