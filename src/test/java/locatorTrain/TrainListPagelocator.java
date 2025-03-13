package locatorTrain;

import org.openqa.selenium.By;

public class TrainListPagelocator {

	
	public static By pageContain = By.xpath("//div[@class='SortBy_sortBySection__wvAB0']/div");
	
	public static By scrollText =By.xpath("//span[@class='TgBanner_rbBannerTabText__W5z0X']");
	
	public static By trainNamegetText =By.xpath("//p[@class='ListingCard_listName__4Ox7f' and text()='Kriya Yoga Exp']");
	
	public static By trainNo   =By.xpath("//p[@class='ListingCard_listName__4Ox7f' and text()='Kriya Yoga Exp']/parent::div/child::div/p[@class='ListingCard_trainNumText__vSho_']");
	
	public static By trainDetails   =By.xpath("//p[@class='ListingCard_listName__4Ox7f' and text()='Kriya Yoga Exp']/parent::div/following-sibling::div");
	
	public static By ticketPrice  =By.xpath("//p[@class='ListingCard_listName__4Ox7f' and text()='Kriya Yoga Exp']/parent::div/parent::div/following-sibling::div[@class='Cards_navContainer__PyW2o']/div/child::div/child::div/a/div/div[@class='flexOne makeFlex alignItemsCenter']/p[text()='SL']/parent::div/parent::div/p[@class='Cards_totalText__dd8cs']");

	public static By TrainSeatclick=By.xpath("//p[@class='ListingCard_listName__4Ox7f' and text()='Kriya Yoga Exp']/parent::div/parent::div/following-sibling::div[@class='Cards_navContainer__PyW2o']/div/child::div/child::div/a/div/div[@class='flexOne makeFlex alignItemsCenter']/p[text()='SL']");

   
	
	
}
