package com.has.relation.code;

import com.has.relation.constant.PillarShape;

public class Pillar {
 public long no;
 public String place;
 public PillarShape shape;
 public double height;
 public boolean supporting;
 public PillarCompany company=new PillarCompany("Golden Pillar", "Ionic");
public Pillar(long no, String place, PillarShape shape, double height, boolean supporting) {
	super();
	this.no = no;
	this.place = place;
	this.shape = shape;
	this.height = height;
	this.supporting = supporting;
}
  
public void ShowOff()
{
   if(company!=null)
   {
			company.showOff();
			
			
   }
	else
	{
		
		System.out.println("exit");
	}
   
   System.out.println(this.no);
   System.out.println(this.place);
   System.out.println(this.shape);
   System.out.println(this.height);
   System.out.println(this.supporting);		   
}	

}
