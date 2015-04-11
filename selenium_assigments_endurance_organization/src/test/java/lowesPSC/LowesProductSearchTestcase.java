package lowesPSC;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LowesProductSearchTestcase {

	WebDriver driver; 	
		
		@Before
		public void setUp() throws Exception {
			driver = new FirefoxDriver();
		System.out.println("@before executed");
	
		}


        @Test
        public void testCase() throws Exception{
        LowesProductSearch s = new LowesProductSearch(driver);
        System.out.println("@test executed");	
        }


        @After
        public void testCase1(){
       // driver.quit();	
        System.out.println("@after executed");	
        }



}

