package com.has.relation.coding;

import com.has.relation.code.Pillar;
import com.has.relation.constant.PillarShape;

public class PillarRunner {

	public static void main(String[] args) {
		Pillar pillar=new Pillar(4567889324l,"Bengaluru", PillarShape.CIRCULAR, 34.8, true);
		pillar.ShowOff();
		pillar.company.showOff();

		
		
	}

}
