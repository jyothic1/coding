package com.smart.work.code;

public class BodyLotion {
	
	LotionCompany company;
	public void skinCare(LotionCompany company)
	{
		company.setBrand("Nivea");
		company.setBranded(true);
		company.setCountry("German");\
		
		
		company.setIntroduceYear(1911);
		
		System.out.println(company.getBrand());
		System.out.println(company.getBranded());
		System.out.println(company.getCountry());
		System.out.println(company.getUsedFor());
		System.out.println(company.getIntroduceYear());
		
	}

}

