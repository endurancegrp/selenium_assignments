package flipkart;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;




public class flipkartaddingitems {
	
flipkartconstants flipkart_object= new flipkartconstants();
	
	
	public void flipkarttest(WebDriver driver) throws InterruptedException 
	{
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(10000);
		
		
		//Assigning id for searchbox
		driver.findElement(By.id(flipkart_object.searchbox));
		driver.findElement(By.id(flipkart_object.searchbox)).sendKeys("mens watch");
		
		//assigning the xpath for the search button
		
		driver.findElement(By.xpath(flipkart_object.searchbutton));
		driver.findElement(By.xpath(flipkart_object.searchbutton)).click();
		
		Thread.sleep(10000);
		
		//assigning the xpath for the menswatch
		driver.findElement(By.xpath(flipkart_object.menswatch));
		driver.findElement(By.xpath(flipkart_object.menswatch)).click();
		
		Thread.sleep(10000);
		
		//assigning the xpath for the add to cart button
		driver.findElement(By.xpath(flipkart_object.addtocartbutton));
		driver.findElement(By.xpath(flipkart_object.addtocartbutton)).click();
		
		Thread.sleep(10000);
		
		//assigning the xpath for the cartbasketlogo
		
		driver.findElement(By.xpath(flipkart_object.cartbasketlogo));
		driver.findElement(By.xpath(flipkart_object.cartbasketlogo)).click();
		
		
		}
	
	

}


