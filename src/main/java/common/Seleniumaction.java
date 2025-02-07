package common;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Setup;

public class Seleniumaction extends Setup
{
	
	static WebDriverWait wait = null;
	
	
	public void openURL(String url)
	{
		driver.get(url);
	}
	
	public void clickElementWebElement (By locator)
	{
		 WebElement element = driver.findElement(locator);
		 element.click();
	       
	}
	public String clickElementWebElementExtract(By locator)
	{
		 WebElement element = driver.findElement(locator);
		 String extract = element.getText();
		 return extract;
	       
	}
	public void clickElement(By locator )
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 element.click();
	}
	public void sendKeysElement(By locator ,String Text )
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 element.sendKeys(Text );
	}
	
	public void clickthroughAction(By locator )
	{
		 Actions act = new Actions(driver);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 act.click(element).perform();
	}

	public void clickthroughActionMoveTo(By locator )
	{
		 Actions act = new Actions(driver);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 act.moveToElement(element).click().perform();
	}

	
	public void clickthroughJavaScript(By locator )
	{
		WebElement element = driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);	
	}
	
	public void SwitchWindow(  )
	{
		// Switch to new window
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        String parentWindow = iterator.next();
        String childWindow = iterator.next();

        driver.switchTo().window(childWindow); // Switch to the child tab

	}
	public void JavaScriptAction(By locator)
	{
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
	     WebElement Element = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']")));
	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Element);
	     Actions act = new Actions(driver);
	     act.moveToElement(Element).click().perform();
	        
	}

}
