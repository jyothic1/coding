package com.intialise.instance.constant;

public enum SalonServices {
MANICURES_PEDICURES(true),HAIR_CARE(true),WAXING(true),MASSAGE(true),BRIDAL_GROOMING(false);
  public boolean available;
	
SalonServices(boolean avail)
{
	available=avail;
	
}


}
