package verifyHotelDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common.Seleniumaction;
import locatorHotel.Checkout_pageLocator;
import verifyDataHotelDetails.DatatoVerif;

public class VerifyAll extends Seleniumaction {
	
	Seleniumaction sa = new Seleniumaction();
	DatatoVerif da = new DatatoVerif();
	Checkout_pageLocator loc = new Checkout_pageLocator();
	
	
	
	public void verifyRoomType()
	{
		System.out.println("Verify Deatails about Room Type ");
		String expectedRoom =da.roomType;
		String actualRoom = sa.verifytext(loc.roomtypr);
		Assert.assertEquals(actualRoom, expectedRoom);
	}
	
	public void verifyFits()
	{
		System.out.println("Verify Deatails about Fitsfor  ");
	    String expectedFits =da.str1;	
	    String actualFits=sa.verifytext(loc.fitsAgeGroup);
	  //  System.out.println(actualFits);
	    Assert.assertEquals(actualFits, expectedFits);
	}
	
	
	
}
