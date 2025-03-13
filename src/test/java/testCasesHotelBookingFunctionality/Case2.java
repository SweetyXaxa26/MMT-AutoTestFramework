package testCasesHotelBookingFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Setup;
import common.Seleniumaction;
import pageObjectHotel.Home_pageObject;
import pageObjectHotel.Checkout_pageObject;
import pageObjectHotel.PropertyDetail_PageObject;
import pageObjectHotel.PropertyListing_pageObject;
import verifyHotelDetails.VerifyAll;

public class Case2 extends Setup {
	
	Seleniumaction sa = new Seleniumaction();
	Home_pageObject hpo = new Home_pageObject();
	PropertyListing_pageObject plpo = new PropertyListing_pageObject();
	PropertyDetail_PageObject pdpo = new PropertyDetail_PageObject();
	Checkout_pageObject ppo = new Checkout_pageObject();
	VerifyAll verify1 = new VerifyAll();
	
	
	@Test
	public void ScriptVerify() throws InterruptedException
	{
      sa.openURL("https://www.makemytrip.com/");
      hpo.popUp();
      hpo.executeHotelClick();
      hpo.extecuteUptoRoom();
      hpo.executeCityDetail();
      hpo.executedate();
      hpo.executeCheckIn();
      hpo.executeCheckOut();
      hpo.executeRoomGuest();
      hpo.executeclickApply();
      hpo.executeSearch(); 
      plpo.executeScroll();
      plpo.executeProprtyClick();
      pdpo.executeNeartoBooking();
      pdpo.executeBookNow();
      verify1.verifyRoomType();
      verify1.verifyFits();

      
      
	}

}
