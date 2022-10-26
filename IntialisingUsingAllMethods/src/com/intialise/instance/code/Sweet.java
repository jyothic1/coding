package com.intialise.instance.code;

import com.intialise.instance.constant.Type;

public class Sweet {
	public static String name;
    public String ShopName="Jyothi Sweets";
     public Type type;
     public double weight;
     public boolean costly;
      public Sweet( Type type)
      {
    	  
    	  this.type=type;
    	  
      }
      static
      {
    	  name="Laddu";
    	  
      }
      public boolean setCostly(boolean costly)
      {
    	  this.costly=costly;
		return costly;
    	  
      }
      public void show() 
      {
    	  System.out.println("sweet name is "+this.name);
    	  System.out.println("shop name is "+this.ShopName);
    	  System.out.println("quantity is "+this.weight);
    	  System.out.println("costly...???"+this.costly);
    	  System.out.println("type of sweet is "+type);
    	  System.out.println("Is this your favourite...?? "+type.favourite);
    	  System.out.println(type.DRYFRUIT.ordinal());
    	  
      }
      
      
      
      
      
      

     
     
	
	

}
