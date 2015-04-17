package loweswebsite;
import junit.framework.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;




@SuppressWarnings("deprecation")
public class Lowes_data {
	
	//creating an object for Lowes_Stats class
	Lowes_Stats syed = new Lowes_Stats();
	//create driver object
	 

	
	 public void lowes_testingsteps() throws InterruptedException{
		 WebDriver driver = new FirefoxDriver();
		driver.get("http://www.lowes.com");
		
		Thread.sleep(10000);
		//going to search bar, clearing it and searching data cable
		
		driver.findElement(By.id("Ntt"));
		driver.findElement(By.id("Ntt")).clear();
		driver.findElement(By.id("Ntt")).sendKeys("datacable");
		
		//going to search button and taking the xpath
		
		driver.findElement(By.xpath(syed.searchbutton));
		driver.findElement(By.xpath(syed.searchbutton)).click();
		Thread.sleep(1000);
		//going to link of datacable 
		
		//driver.findElement(By.xpath(syed.datacable_link)).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath(syed.addCart_button)).click();
		Thread.sleep(1000);
		//clicking on continue shopping link
		driver.findElement(By.xpath(syed.contineshoppinglink)).click();
		Thread.sleep(1000);
		//1 item is added to cart
		String carttext = driver.findElement(By.id(syed.itemsincart)).getText();
		
	Assert.assertEquals("1", carttext);
		
			  

}
}



