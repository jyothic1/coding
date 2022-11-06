package com.init.coding.brush;

import com.init.coding.bottle.Fish;

public class FishRunner {

	public static void main(String[] args) {
   Fish fish1= new Fish("Nile tilapia","African freshwater fish");
   		
    System.out.println(fish1.name);
    System.out.println(fish1.type);
    System.out.println(fish1.price);
    System.out.println(fish1.weight);
    System.out.println(fish1.length);
    System.out.println("*************");
    
    Fish fish2= new Fish("Guppy",99);
    
    System.out.println(fish2.name);
    System.out.println(fish2.price);
    System.out.println(fish2.type);
    System.out.println(fish2.weight);
    System.out.println(fish2.length);
    System.out.println("*************");
    
    Fish fish3= new Fish("Ocean sunfish",550);
    
    System.out.println(fish3.name);
    System.out.println(fish3.weight);
    System.out.println(fish3.price);
    System.out.println(fish3.type);
    System.out.println(fish3.length);
    System.out.println("*************");
    
    Fish fish4= new Fish(90,550);

    System.out.println(fish4.weight);
    System.out.println(fish4.price);
    System.out.println(fish4.type);
    System.out.println(fish4.length);
    System.out.println(fish4.name);
    System.out.println("*************");
    
    Fish fish5= new Fish(750,"Suckermouth catfish");
    System.out.println(fish5.weight);
    System.out.println(fish5.name);
    System.out.println(fish5.price);
    System.out.println(fish5.type);
    System.out.println(fish5.length);
    System.out.println("*************");
   
    Fish fish6= new Fish(14,"Common carp",56);
    
    System.out.println(fish6.weight);
    System.out.println(fish6.name);
    System.out.println(fish6.length);
    System.out.println(fish6.price);
    System.out.println(fish6.type);
    System.out.println("*************");
    
    Fish fish7= new Fish(9,30,"Blobfish");
    System.out.println(fish7.weight);
    System.out.println(fish7.length);
    System.out.println(fish7.name);
    System.out.println(fish7.price);
    System.out.println(fish7.type);
    
    System.out.println("*************");
    Fish fish8= new Fish(455,"Swordfish",50,5000.00,"Mediterranean swordfish");
    System.out.println(fish8.weight);
    System.out.println(fish8.length);
    System.out.println(fish8.name);
    System.out.println(fish8.price);
    System.out.println(fish8.type);	
    		
    		
  
	}
	
	
	

}
