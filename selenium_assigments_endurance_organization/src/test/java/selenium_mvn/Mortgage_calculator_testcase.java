package selenium_mvn;


import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Mortgage_calculator_testcase {
	RemoteWebDriver driver;

  
	
	  @Before
	  public void setUp() throws Exception {
	  System.out.println("@before executed");	
	  driver = new FirefoxDriver ();
	  }

	   @Test
	  public void testcase1() throws Exception {
	  Mortgage_calculator t = new Mortgage_calculator(driver); 
	 
	  
	}
	
     @After
     public void tearDown() throws Exception {
    	 System.out.println("@after executed");
     driver.quit(); 
     }
	
}
