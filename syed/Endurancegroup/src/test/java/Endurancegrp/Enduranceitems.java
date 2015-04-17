package Endurancegrp;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class Enduranceitems {
Enduranceconstants endure_object= new Enduranceconstants();

	
	
	public void endutear(WebDriver driver) throws InterruptedException 
	{
		
		driver.get(endure_object.url);
		Thread.sleep(10000);
		
		
		//Assigning id for the homebutton
		driver.findElement(By.id(endure_object.active));
		driver.findElement(By.id(endure_object.active)).click();
		
		
		
		
		//assigning the id for performancebar
		
		driver.findElement(By.id(endure_object.Performance));
		driver.findElement(By.id(endure_object.Performance)).click();
		
		
		
		//verifying the item
		String actualtext=driver.findElement(By.xpath(endure_object.actual)).getText();
		Assert.assertEquals(endure_object.expected,actualtext);
		
		
		
	}
}


