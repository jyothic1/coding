package com.smart.work.code;

public class TravelBag {
	Sweater sweater;
	TiffinBox tiffin;
	YogaMat mat;
	
	public void kick(Sweater sweater,TiffinBox tiffinBox,YogaMat yogaMat)
	
	{

		this.sweater=sweater;
		this.tiffin=tiffinBox;
		this.mat=yogaMat;
		sweater.setBrand("puma");
		sweater.setColor("ash");
		sweater.setType("hoddie");
		tiffin.setBoxes(3);
		tiffin.setShape("TRIANGLE");
		tiffin.setType("STEEL");
		mat.setBrand("strech");
		mat.setColor("violet");
		mat.setLength(15);
		
		
	}
	
}
