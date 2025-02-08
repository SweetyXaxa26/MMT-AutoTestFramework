package pageObjectHotel;

import common.Seleniumaction;
import locatorHotel.Payment_pageLocator;

public class Payment_pageObject extends Payment_pageLocator{
	
	Seleniumaction sa = new Seleniumaction();
	
	public void executeExtractHotelDetails()
	{
		System.out.println("------------------------------------------");
		String name= sa.clickElementWebElementExtract(hotel_name);
		System.out.println("Hotel Name : "+name);
		
		String location = sa.clickElementWebElementExtract(address);
		System.out.println("Address : "+location);
		
		String suitebook = sa.clickElementWebElementExtract(roomDetail);
		System.out.println("Hotel Room detail : "+suitebook);
		
		
		
		 String totalPay = sa.clickElementWebElementExtract(Totalpay);
		System.out.println("Total pay  : "+totalPay);
		
		System.out.println("------------------------------------------");
		
	}

}
