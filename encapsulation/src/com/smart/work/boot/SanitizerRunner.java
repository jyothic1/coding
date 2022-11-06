package com.smart.work.boot;


import com.smart.work.code.Sanitizer;
import com.smart.work.code.SanitizerSoap;

public class SanitizerRunner {

	public static void main(String[] args) {
	Sanitizer san=new Sanitizer("Gems", 2.7,"jyothi");
	san.snow();
	System.out.println(san.getColor());
	System.out.println(san.getIsCostly());
	System.out.println(san.getMobile());

	SanitizerSoap soap=new SanitizerSoap();
	soap.soap(san);
	}

}

