package pageObjectTrain;

import common.Seleniumaction;
import locatorTrain.CheckoutPagelocator;

public class CheckoutPageObject extends CheckoutPagelocator {

	Seleniumaction sa = new Seleniumaction();
	
	public void executeTrainName()
	{
	System.out.println("-------------Checkout Details -----------------");
	String text= sa.clickElementWebElementExtract(trainnamefinal);
	System.out.println("TrainName : "+text);
	}
	
	public void executeTrainNumber()
	{
	String text= sa.clickElementWebElementExtract(trainNOfinal);
	System.out.println("Train Number: "+text);
	}
	
	public void executeTrainDetails()
	{
	String text= sa.clickElementWebElementExtract(trainDetailsfinal);
	System.out.println("Train Details : "+text);
	}
	
	public void executeTrainTicketPricetotal()
	{
	String text= sa.clickElementWebElementExtract(trainPriceFinal);
	System.out.println("Train ticket price : "+text);
	}
	
	public void executeTrainSeat()
	{
	String text= sa.clickElementWebElementExtract(trainSeat);
	System.out.println("Train Seat  : "+text);
	}
	
	
}
