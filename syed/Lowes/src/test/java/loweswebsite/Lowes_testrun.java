package loweswebsite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class Lowes_testrun {
	
		
		

		

		
		/*	
			  //before the test begins
			  @Before
			  public void setUp() throws Exception {
				  
			    
			     }
			*/  // while executing the test
			  @Test
			  public void lowesdata() throws Exception {
				  
				  	
				  	
				  Lowes_data step_object= new Lowes_data();
				  step_object.lowes_testingsteps();
				 
				   
				    
				  
			  }
		      //this executes after the @test
			 /* @After
			  public void tearDown() throws Exception {
				  
			    
			    }
			  */

		}



