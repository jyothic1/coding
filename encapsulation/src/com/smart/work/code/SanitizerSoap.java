package com.smart.work.code;

public class SanitizerSoap {
	Sanitizer san;
	
	
	public void soap(Sanitizer san)
	{
		san.setColor("white");
		san.setMobile(234567894567l);
		san.setIsCostly(true);
		System.out.println(san.getColor());
		System.out.println(san.getIsCostly());
	}

}
