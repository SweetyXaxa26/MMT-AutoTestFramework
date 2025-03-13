package bookTrainTicketpageObject;

import bookTrainTicketlocatorTrain.HomePagelocator;
import common.Seleniumaction;

public class HomePageObject extends HomePagelocator {

	Seleniumaction sa = new Seleniumaction();
	
	public void popUp()
	{
	sa.clickElement(popUp);	
	}
	public void exploreTrain()
	{
		sa.clickElement(train);
	}
	public void executeBokingTrainTicket()
	{
		sa.clickElement(bookTrainTicket);
	}
	public void executecityFrom() throws InterruptedException
	{
		sa.clickElement(city);
		Thread.sleep(4000);
		sa.sendKeysElement(cityTextFrom, "Jamshedpur");
		Thread.sleep(3000);
		sa.clickthroughJavaScript(clickOptionFrom);
		
	}
	
	public void executecityTo() throws InterruptedException
	{
		sa.sendKeysElement(cityTextTo, "Ranchi");
		Thread.sleep(3000);
		sa.clickthroughJavaScript(clickOptionTo);	
	}
	
	public void executeDate()
	{
		sa.clickElement(nextMonth);
		sa.clickElement(checkIn);
	}
	
	 public void executeClassType()
	 {
		 sa.clickElementWebElement(classType);
	 }
	 
	 public void executeSearch()
	 {
		 sa.clickthroughJavaScript(search);
	 }
     
	
}
