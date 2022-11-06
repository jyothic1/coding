package com.intialise.instance.boot;

import com.intialise.instance.code.Sweet;
import com.intialise.instance.constant.Type;

public class SweetRunner {

	public static void main(String[] args) {
	Sweet sweet=new Sweet(Type.RAVA);
	sweet.setCostly(true);
	sweet.weight=5.6;
	sweet.show();
	
	

	}

}
