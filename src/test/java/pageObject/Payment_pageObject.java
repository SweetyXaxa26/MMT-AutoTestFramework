package pageObject;

import common.Seleniumaction;
import locator.Payment_pageLocator;

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
		
		String basepriceofRoom =sa.clickElementWebElementExtract(basePrice);
		System.out.println("Base price : "+basepriceofRoom);
		
		String discount =sa.clickElementWebElementExtract(Discountprice);
		System.out.println("Discount : "+discount);
		
		String priceAfterDec =sa.clickElementWebElementExtract(PriceAfterDiscount);
		System.out.println("Price after Discount : "+priceAfterDec);
		
		String hotelTax = sa.clickElementWebElementExtract(HotelTax);
		System.out.println("Hotel Tax : "+hotelTax);
		
		 String totalPay = sa.clickElementWebElementExtract(Totalpay);
		System.out.println("Total pay  : "+totalPay);
		
		System.out.println("------------------------------------------");
		
	}

}
