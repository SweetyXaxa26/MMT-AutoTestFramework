package pageObject;

import common.Seleniumaction;
import locator.PropertyDetail_pageLocator;

public class PropertyDetail_PageObject extends PropertyDetail_pageLocator 
{
	Seleniumaction sa = new Seleniumaction();
	
	public void switchWindowtoNewTab()
	{
		sa.SwitchWindow();
	}

	public void BookNow()
	{
		sa.JavaScriptAction(bookNow);
	}
	
}
