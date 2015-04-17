package flipkart;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



public class flipkarttest {
	//before the test begins
	WebDriver driver;
	
	
	  @Before
	  public void setUp() throws Exception {
		  
		  driver= new FirefoxDriver();
	     }
	  // while executing the test
	  @Test
	  public void testcases()throws Exception {
		  
		  	
		  	
		  flipkartaddingitems flipkart_object = new flipkartaddingitems();
		   
		    flipkart_object.flipkarttest(driver);
		    
	  }
//this executes after the @test
	  @After
	  public void tearDown() throws Exception {
		
//closing the driver
	    driver.close();
	    }
	  

}





