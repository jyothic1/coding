package com.xworkz.object.boot;

import com.xworkz.object.create.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {
		Cigarette cigar=new Cigarette();
		System.out.println(cigar.brand);
		System.out.println(cigar.type);
		System.out.println(cigar.company);
		System.out.println(cigar.location);
		System.out.println(cigar.price);
		System.out.println(cigar.gst);
		System.out.println(cigar.quantity);
		System.out.println(cigar.quality);
		System.out.println(cigar.disAdv);
		System.out.println(cigar.adv);
		System.out.println("*********");
		System.out.println(cigar.owner="jyothi");
		System.out.println(cigar.brandAmbassader="Amitab");
		System.out.println(cigar.mfdate="jan 26-2021");
		System.out.println(cigar.expdate="feb 21=2023");
		System.out.println(cigar.manufacturePlace="dubai");
		System.out.println(cigar.export=true);
		System.out.println(cigar.color="pure white");
		

		Cigarette cigar2=new Cigarette();
		cigar2.disAdv="cancer";
		cigar=cigar2;
		System.out.println("updated");
		System.out.println(cigar.disAdv);


	}

}
