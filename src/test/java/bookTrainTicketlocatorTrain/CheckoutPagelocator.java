package bookTrainTicketlocatorTrain;

import org.openqa.selenium.By;

public class CheckoutPagelocator {
	
	
	public static By trainnamefinal = By.xpath("//h3 [@class='font22 latoBlack appendBottom5' and text()='Kriya Yoga Exp']");
	public static By trainNOfinal = By.xpath("//div[@class=' column appendRight50']/p/span[@class='font12 lightGreyText']");

	public static By trainDetailsfinal = By.xpath("//div[@class='appendBottom30']/div/child::div[@class='makeFlex hrtlCenter']");
	public static By trainPriceFinal = By.xpath("//div[@class='totalPriceWrapper makeFlex spaceBetween font16 latoBold blackText']/p[@class='totalPriceValue']");
		
	public static By trainSeat= By.xpath("//div[@class='makeFlex column']/child::div/child::p[@class='makeFlex appendBottom5 hrtlCenter']/span[@class='latoBlack font16 appendRight20']");
	
	

	

}
