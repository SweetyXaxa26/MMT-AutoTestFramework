package bookTrainTicketlocatorTrain;

import org.openqa.selenium.By;

public class HomePagelocator {
	
	 public static By popUp = By.xpath("//span[@class='commonModal__close']");
		
	public static By train= By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Trains']");
	
	public static By bookTrainTicket = By.xpath("//span[@data-cy='bookTrainTickets' and @class='appendRight10 active latoBlack']");
	
	public static By city= By.xpath("//input[@id='fromCity' and @class='rsw_inputField font32 latoBlack']");
	
	public static By cityTextFrom= By.xpath("//input[@placeholder='From']");
	
	public static By clickOptionFrom= By.xpath("//p[@class='searchedResult font14 darkText']//span [@class='sr_city blackText']");
	
	public static By cityTextTo= By.xpath("//input[@placeholder='To']");
	
	public static By clickOptionTo= By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']");
	
	public static By nextMonth= By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
	
	public static By checkIn= By.xpath("//div[@aria-label='Sun Apr 20 2025' and text()='20']");
	
    public static By classType = By.xpath("//li[@data-cy='SL' and text()='Sleeper Class']");

    public static By search = By.xpath("//a[@data-cy='submit' and @class='primaryBtn font24 latoBold widgetSearchBtn']");


}
