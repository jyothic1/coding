package com.xworkz.object.copies.runner;

import com.xworkz.object.copies.create.*;

public class SongRunner {

	public static void main(String[] args) {
		Song sng=new Song();
		sng.language="Telugu";
		sng.lyricist="Veturi garu";
		sng.type="beautiful melody";
		sng.singer="Mrs.sunitha";
		sng.name=("Andanga lena...??");
		System.out.println(sng.language);
		System.out.println(sng.lyricist);
		System.out.println(sng.name);
		System.out.println(sng.type);
		System.out.println(sng.singer);
		
		

	}

}
