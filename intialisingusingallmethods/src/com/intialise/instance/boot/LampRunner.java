package com.intialise.instance.boot;

import com.intialise.instance.code.Lamp;
import com.intialise.instance.constant.Belaku;

public class LampRunner {

	public static void main(String[] args) {
		Lamp lamp=new Lamp(Belaku.KEROSINE);
		lamp.Iscostly=true;
		Lamp.quantity=6;
		lamp.print();
		

	}

}
