package locatorHotel;

import org.openqa.selenium.By;

public class Payment_pageLocator {
	
	public static By hotel_name = By.xpath("//h3[@class='font22 latoBlack blackText']");
	
	public static By address = By.xpath("//p[@class='font14 grayText lineHight20 appendTop8 appendBottom8']");

	public static By roomDetail = By.xpath("//p[@class='latoBold blackText']//span[text()='1 Room']");
	
	public static By Totalpay =By.xpath("//div[@class='pricBreakup__total']/div/div[@class='pricBreakup__rht']");
}
