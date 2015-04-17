package Groupon;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Groupontest {

	//before the test begins
		WebDriver driver;
		
		
		  @Before
		  public void setUp() throws Exception {
			  
			  driver= new FirefoxDriver();
		     }
		  // while executing the test
		  @Test
		  public void test()throws Exception {
			  
			  	
			  	
			  Verifyingitem dealobject = new Verifyingitem();
			   	dealobject.grouptear(driver);
			    
		  }
	//this executes after the @test
		  @After
		  public void tearDown() throws Exception {
			
	//closing the driver
		    driver.close();
		    }
		  

	}

