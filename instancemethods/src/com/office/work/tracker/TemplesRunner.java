package com.office.work.tracker;

import com.office.work.track.Temples;

public class TemplesRunner {

	public static void main(String[] args) {
		String name[]={"meenakshi","kollapuri mahalakshmi","tirupati","padmanabha swamy"};
		String god[]={"meenakshi","mahalakshmi","govinda","vishnu"};
		String place[]={"madurai","kollapur","tirupati","tamilnadu"};
		
		Temples temple=new Temples("india","200.005",3000.00,name,god,place);
		temple.pray();
	}

}
