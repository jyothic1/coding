package com.practice.chain.boot;

import com.practice.chain.chaining.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		
		TextileShop runner1=new TextileShop("Surya");
		System.out.println(runner1.ownerName);
		System.out.println("running owner name");
		
		TextileShop runner2=new TextileShop("Jyothika",9100703797l);
		System.out.println(runner2.ownerWifeName);
		System.out.println(runner2.contactNo);
		System.out.println("running owner wife name, number");
		
		TextileShop runner3=new TextileShop(9100703778l,"Radhika");
       System.out.println(runner3.ownerWifeName);
		System.out.println(runner3.contactNo);
		System.out.println("running owner wife name, number,contactNo");
		
		
		TextileShop runner4=new TextileShop(7306987576l,2);
		
		System.out.println(runner4.ownerDaughterNo);
		System.out.println(runner4.ownerNoOfWifes);
		System.out.println("running ownerDaughterNo, ownerNoOfWifes");
		
		TextileShop runner5=new TextileShop(2,7306987576l);
		System.out.println(runner5.ownerDaughterNo);
		System.out.println(runner5.ownerNoOfWifes);
		
		System.out.println("running ownerNoOfWifes,ownerDaughterNo");
		
		
		TextileShop runner6=new TextileShop("Jyothika","vanshika");
		System.out.println(runner6.ownerWifeName);
		System.out.println(runner6.ownerDaughterName);
		
		TextileShop runner7=new TextileShop("Jyothika","vanshika",3);
		System.out.println(runner7.ownerWifeName);
		System.out.println(runner7.ownerDaughterName);
		System.out.println(runner7.ownerNoOfWifes);
		
		TextileShop runner8=new TextileShop("Jyothika","vanshika","TN42AN007",4);
		System.out.println(runner8.ownerWifeName);
		System.out.println(runner8.ownerDaughterName);
		System.out.println(runner8.shopNo);
		System.out.println(runner8.ownerNoOfWifes);
		
		
		
	}

}
