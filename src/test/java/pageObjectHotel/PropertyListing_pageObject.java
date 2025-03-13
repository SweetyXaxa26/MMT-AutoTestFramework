package pageObjectHotel;

import common.Seleniumaction;
import locatorHotel.PropertyListing_pageLocator;

public class PropertyListing_pageObject extends PropertyListing_pageLocator {

Seleniumaction sa = new Seleniumaction();
	
     public void executeScroll()
     {
	    sa.scrolltoParticularElement(ScroltoProperty);
     }

	public void executeProprtyClick()
	{
	sa.SwitchWindow(property);;	
	}
	
}
