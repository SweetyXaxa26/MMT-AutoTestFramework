package locator;

import org.openqa.selenium.By;

public class Home_pageLocator {
	
	
    public static By popUp = By.xpath("//span[@class='commonModal__close']");
	
	public static By hotel = By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Hotels']");
	
	public static By Upto4Rooms = By.xpath("//span[@class='grpBkngOpt__item--text' and text()='Upto 4 Rooms']");
	
	public static By city =By.xpath("//input[@id='city']");
	
	public static By cityText= By.xpath("//input[@placeholder='Where do you want to stay?']");
	
	public static By Select1stopt = By.xpath("(//div[@class='hw__recentSearchTextWrapper'])[1]");
	
	public static By checkIn = By.xpath("//span[@class='lbl_input appendBottom5' and text()='Check-In']");
	
	public static By checkInDate =By.xpath("//div[@aria-label='Thu Feb 13 2025' and text()='13']");
	
	public static By checkOutDate =By.xpath("//div[@aria-label='Sat Feb 15 2025' and text()='15']");
	
	public static By room_Guest =By.xpath("//input[@id='guest']");
	
	public static By clickApply =By.xpath("//button[@class='primaryBtn btnApplyNew pushRight capText' and text()='Apply']");
	
	public static By Search=By.xpath("//button[@id='hsw_search_button']");
	

}
