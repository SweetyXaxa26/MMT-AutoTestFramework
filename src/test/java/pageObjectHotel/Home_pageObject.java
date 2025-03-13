package pageObjectHotel;

import common.Seleniumaction;
import locatorHotel.Home_pageLocator;

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
	
	public void executeCityDetail() throws InterruptedException
	{
		sa.clickthroughAction(city);
		//sa.clickthroughAction(cityText);
		sa.sendKeysElement(cityText, "Goa ");
		Thread.sleep(5000);
		sa.clickElement(Select1stopt);
	}
	public void executedate()
	{
		sa.clickthroughJavaScript(nextmonth);	
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
		sa.SwitchWindow(Search);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
