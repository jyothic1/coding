package com.intialise.instance.boot;

import com.intialise.instance.code.ShirtBrand;
import com.intialise.instance.constant.ShirtBrands;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		ShirtBrand brand=new ShirtBrand(ShirtBrands.RAYMOND,"Cotton");
		brand.isCostly=true;
		brand.setPrice(2999.00);
		brand.show();
		
		
		
	}

}
