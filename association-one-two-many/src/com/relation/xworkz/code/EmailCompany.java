package com.relation.xworkz.code;

public class EmailCompany {
	public String company1;
	public String company2;
	
	public EmailCompany(String name1,String name2)
	{
		this.company1=name1;
		this.company2=name2;
		
	}
     public void print()
     {
    	 System.out.println(this.company1);
    	 System.out.println(this.company2);
     }

}
