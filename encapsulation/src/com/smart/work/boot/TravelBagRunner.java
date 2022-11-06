package com.smart.work.boot;

import com.smart.work.code.Sweater;
import com.smart.work.code.TiffinBox;
import com.smart.work.code.TravelBag;
import com.smart.work.code.YogaMat;

public class TravelBagRunner {

	public static void main(String[] args) {

TiffinBox tif=new TiffinBox();
YogaMat mat=new YogaMat();
Sweater sweat=new Sweater();
TravelBag bag=new TravelBag();
bag.kick(sweat, tif, mat);

System.out.println(tif.getBoxes());
System.out.println(tif.getShape());
System.out.println(tif.getType());

System.out.println(mat.getBrand());
System.out.println(mat.getColor());
System.out.println(mat.getLength());

System.out.println(sweat.getBrand());
System.out.println(sweat.getColor());
System.out.println(sweat.getType());




	}

}
