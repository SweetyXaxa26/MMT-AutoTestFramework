package testCasesTrainBookingFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Setup;
import bookTrainTicketpageObject.CheckoutPageObject;
import bookTrainTicketpageObject.HomePageObject;
import bookTrainTicketpageObject.TrainListPageObject;
import common.Seleniumaction;


public class TrainSearchToCheckout extends Setup {
	
	Seleniumaction sa = new Seleniumaction();
	HomePageObject Trainhome = new HomePageObject();
	TrainListPageObject Trainlist = new TrainListPageObject();
	CheckoutPageObject CheckoutDetail = new CheckoutPageObject();
	
@Test
	
	public void Script001Serch() throws InterruptedException
	{
      sa.openURL("https://www.makemytrip.com/");
      Trainhome.popUp();
      Trainhome.exploreTrain();
      Trainhome.executeBokingTrainTicket();
      Trainhome.executecityFrom();
      Trainhome.executecityTo();
      Trainhome.executeDate();
      Trainhome.executeClassType();
      Trainhome.executeSearch();
      
      
	}
	
	@Test
	
	public void Script002TrainList() throws InterruptedException
	{
      sa.openURL("https://www.makemytrip.com/");
      Trainhome.popUp();
      Trainhome.exploreTrain();
      Trainhome.executeBokingTrainTicket();
      Trainhome.executecityFrom();
      Trainhome.executecityTo();
      Trainhome.executeDate();
      Trainhome.executeClassType();
      Trainhome.executeSearch();
      Trainlist.executePageContain();
      Trainlist.executeScroll();
      Trainlist.executeTrainName();
      Trainlist.executeTrainNO();
      Trainlist.executeTrainDetails();
      Trainlist.executeTrainPrice();
      Trainlist.executeTrainSeatSelecte();
    
      
	}
	
    @Test
	
	public void Script003TrainBookingCheckout() throws InterruptedException
	{
      sa.openURL("https://www.makemytrip.com/");
      Trainhome.popUp();
      Trainhome.exploreTrain();
      Trainhome.executeBokingTrainTicket();
      Trainhome.executecityFrom();
      Trainhome.executecityTo();
      Trainhome.executeDate();
      Trainhome.executeClassType();
      Trainhome.executeSearch();
      Trainlist.executePageContain();
      Trainlist.executeScroll();
      Trainlist.executeTrainName();
      Trainlist.executeTrainNO();
      Trainlist.executeTrainDetails();
      Trainlist.executeTrainPrice();
      Trainlist.executeTrainSeatSelecte();
      CheckoutDetail.executeTrainName();
      CheckoutDetail.executeTrainNumber();
      CheckoutDetail.executeTrainDetails();
      CheckoutDetail.executeTrainTicketPricetotal();
      CheckoutDetail.executeTrainSeat();
      
      
	}

}


