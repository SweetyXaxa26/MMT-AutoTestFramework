package pageObjectHotel;

import common.Seleniumaction;
import locatorHotel.PropertyDetail_pageLocator;

public class PropertyDetail_PageObject extends PropertyDetail_pageLocator 
{
	Seleniumaction sa = new Seleniumaction();
	
	
	
	public void executeNeartoBooking()
	{
		sa.scrolltoParticularElement(neartoBooknow);
	}
	

	public void executeBookNow()
	{
		sa.clickElement(bookNow);
	}
	
}
