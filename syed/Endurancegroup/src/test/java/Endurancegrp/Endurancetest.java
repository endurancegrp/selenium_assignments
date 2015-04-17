package Endurancegrp;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class Endurancetest {
	//before the test begins
			WebDriver driver;
			
			
			  @Before
			  public void setUp() throws Exception {
				  
				  driver= new FirefoxDriver();
			     }
			  // while executing the test
			  @Test
			  public void test()throws Exception {
				  
				  	
				  	
				  Enduranceitems dealobject = new Enduranceitems();
				   	dealobject.endutear(driver);
				    
			  }
		//this executes after the @test
			  @After
			  public void tearDown() throws Exception {
				
		//closing the driver
			    driver.close();
			    }
			  

		}



