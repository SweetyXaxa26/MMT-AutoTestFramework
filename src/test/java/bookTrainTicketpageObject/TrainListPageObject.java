
package bookTrainTicketpageObject;

import bookTrainTicketlocatorTrain.TrainListPagelocator;
import common.Seleniumaction;

public class TrainListPageObject extends TrainListPagelocator {

Seleniumaction sa = new Seleniumaction();
	
	public void executePageContain()
	{
	System.out.println("----------Train PICK DETAILS---------");
	sa.clickElementWebElementExtract(pageContain);
	}
	
	public void executeScroll()
	{
		sa.scrolltoParticularElement(scrollText);
	}
	
	public void executeTrainName()
	
	{
		String name = sa.clickElementWebElementExtract(trainNamegetText);
		System.out.println("Name of Train : "+name);
	}
	
    public void executeTrainNO()
	{
		String name = sa.clickElementWebElementExtract(trainNo);
		System.out.println("Train number :  "+name);
	}
    
    public void executeTrainDetails()
    {
    	String name = sa.clickElementWebElementExtract(trainDetails);
		System.out.println("Train Details :   "+name);
    }
    
    public void executeTrainPrice()
    {
    	String name = sa.clickElementWebElementExtract(ticketPrice);
		System.out.println("Train Ticket:   "+name);
    }
    
    public void executeTrainSeatSelecte()
    {
    	sa.clickElementWebElement(TrainSeatclick);
    }
    
    
    
    
    
    
    
}
