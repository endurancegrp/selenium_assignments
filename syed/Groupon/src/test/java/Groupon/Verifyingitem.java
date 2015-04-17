package Groupon;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class Verifyingitem {
	
Grouponconstants groupon_object= new Grouponconstants();

	
	
	public void grouptear(WebDriver driver) throws InterruptedException 
	{
		
		driver.get(groupon_object.url);
		Thread.sleep(10000);
		
		
		//Assigning id for the localbutton
		WebElement element = driver.findElement(By.id(groupon_object.local));
		Actions action = new Actions(driver);
		   action.moveToElement(element).build().perform();

		
		
		//assigning the id for alldealsbutton
		
		driver.findElement(By.id(groupon_object.alldeals));
		driver.findElement(By.id(groupon_object.alldeals)).click();
		
		
		
		//verifying the item
		String actualtext=driver.findElement(By.xpath(groupon_object.actual)).getText();
		Assert.assertEquals(groupon_object.expected,actualtext);
		
		
		
	}
}
