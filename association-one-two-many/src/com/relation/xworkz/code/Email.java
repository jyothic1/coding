package com.relation.xworkz.code;

public class Email {
	
	public String emailId;
	public String password;
	public long mobile;
	public EmailCompany EmailCompany;
	
	public Email(String emailId,long mobile,String password)
	{
		
		this.mobile=mobile;
		this.emailId=emailId;
		this.password=password;
		
		
	}
	public void setemailCompany(EmailCompany EmailCompany)
	{
		this.EmailCompany=EmailCompany;
		
	}
	public void display()
	{
		
		System.out.println(this.emailId);
		System.out.println(this.mobile);
		System.out.println(this.password);
		if(EmailCompany!=null)
		{
			EmailCompany.print();
			
		}
		else
		{
			
			System.out.println("exit");
		}

	}
	
	
	

}
