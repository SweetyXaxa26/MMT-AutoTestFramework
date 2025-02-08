package testCasesHotelBookingFunctionality;

import org.testng.annotations.Test;

import base.Setup;
import common.Seleniumaction;
import pageObjectHotel.Home_pageObject;
import pageObjectHotel.Payment_pageObject;
import pageObjectHotel.PropertyDetail_PageObject;
import pageObjectHotel.PropertyListing_pageObject;

public class Case1 extends Setup {
	
	Seleniumaction sa = new Seleniumaction();
	Home_pageObject hpo = new Home_pageObject();
	PropertyListing_pageObject plpo = new PropertyListing_pageObject();
	PropertyDetail_PageObject pdpo = new PropertyDetail_PageObject();
	Payment_pageObject ppo = new Payment_pageObject();
	
	@Test
	public void Script() throws InterruptedException
	{
      sa.openURL("https://www.makemytrip.com/");
      hpo.popUp();
      hpo.executeHotelClick();
      hpo.extecuteUptoRoom();
      hpo.executeCityDetail();
      hpo.executeCheckIn();
      hpo.executeCheckOut();
      hpo.executeRoomGuest();
      hpo.executeclickApply();
      hpo.executeSearch();
      plpo.executeProprtyClick();
      pdpo.switchWindowtoNewTab();
      pdpo.BookNow();
      ppo.executeExtractHotelDetails();
      
      
	}

}
