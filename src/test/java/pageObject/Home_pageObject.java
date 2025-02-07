package pageObject;

import common.Seleniumaction;
import locator.Home_pageLocator;

public class Home_pageObject extends Home_pageLocator {
	
	Seleniumaction sa = new Seleniumaction();
	
	public void popUp()
	{
	sa.clickElement(popUp);	
	}
	
	public void executeHotelClick()
	{
		sa.clickElementWebElement(hotel);
	}
	
	public void extecuteUptoRoom()
	{
		sa.clickElementWebElement(Upto4Rooms);
	}
	
	public void executeCityDetail()
	{
		sa.clickthroughAction(city);
		sa.clickthroughAction(cityText);
		sa.clickElement(Select1stopt);
	}
	
	public void executeCheckIn()
	{
		sa.clickthroughJavaScript(checkIn);
		sa.clickthroughActionMoveTo(checkInDate);
	}
	
	public void executeCheckOut()
	{
		sa.clickthroughActionMoveTo(checkOutDate);
	}
	
	public void executeRoomGuest()
	{
		sa.clickthroughJavaScript(room_Guest);
	}
	
	public void executeclickApply()
	{
		sa.clickthroughJavaScript(clickApply);
	}
	
	public void executeSearch()
	{
		sa.clickthroughJavaScript(Search);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
