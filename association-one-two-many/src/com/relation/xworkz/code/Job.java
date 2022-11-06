package com.relation.xworkz.code;

public class Job {
public double salary;
public String role;
public int bond;
Company company;

public Job(double sal,String designation,int aggrement)
{
 this.salary=sal;
 this.role=designation;
 this.bond=aggrement;
	
}
public void setCompany(Company company)
{
	this.company=company;
}
 public void print()
 {
	 System.out.println(this.salary);
	 System.out.println(this.role);
	 System.out.println(this.bond);
	 if(company!=null)
	 {
		 company.show();
	 }
 }


}
