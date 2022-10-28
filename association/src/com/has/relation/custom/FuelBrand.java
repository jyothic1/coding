package com.has.relation.custom;

public class FuelBrand {
	public String name;
	public String gstNo;
	public int rating;
	public Location location=new Location("Hyderabad");
	
	public FuelBrand(String name, String gstNo, int rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}

	 public void display()
	 {
		 
		 if(location!=null)
		 {
			 location.print();
			 
		 }
		 else
		 {
			 System.out.println("exit");
		 }
		 
		 System.out.println(this.name);
		 System.out.println(this.gstNo);
		 System.out.println(this.rating);
	 }

}
