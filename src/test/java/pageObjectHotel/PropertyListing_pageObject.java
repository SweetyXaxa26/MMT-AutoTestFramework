package pageObjectHotel;

import common.Seleniumaction;
import locatorHotel.PropertyListing_pageLocator;

public class PropertyListing_pageObject extends PropertyListing_pageLocator {

Seleniumaction sa = new Seleniumaction();
	
	public void executeProprtyClick()
	{
	sa.clickthroughActionMoveTo(property);	
	}
}
