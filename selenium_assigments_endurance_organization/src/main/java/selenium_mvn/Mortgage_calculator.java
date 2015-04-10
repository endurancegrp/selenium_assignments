package selenium_mvn;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Mortgage_calculator {
	

	public Mortgage_calculator(WebDriver driver) throws Exception {	//constructor
	
		  driver.get(Mortgage_calculator_constants.url);
		   Thread.sleep(1000); // not for page to load but to stop all the actions for specified time
		   
		  driver.findElement(By.name(Mortgage_calculator_constants.home)).clear(); 
		  driver.findElement(By.name(Mortgage_calculator_constants.home)).sendKeys(Mortgage_calculator_constants.home_value);
		  driver.findElement(By.name(Mortgage_calculator_constants.loan_amount)).clear();
		  driver.findElement(By.name(Mortgage_calculator_constants.loan_amount)).sendKeys(Mortgage_calculator_constants.loan_amount_value);
		  driver.findElement(By.name(Mortgage_calculator_constants.interest_rate)).clear();
		  driver.findElement(By.name(Mortgage_calculator_constants.interest_rate)).sendKeys(Mortgage_calculator_constants.interest_rate_value);
		  driver.findElement(By.name(Mortgage_calculator_constants.loan_term)).clear();
		  driver.findElement(By.name(Mortgage_calculator_constants.loan_term)).sendKeys(Mortgage_calculator_constants.loan_term_value);
		 // driver.findElementByName(Mortgage_calculator_constants.start_month).clear();
		  driver.findElement(By.name(Mortgage_calculator_constants.start_month)).sendKeys(Mortgage_calculator_constants.start_month_value);
		 // driver.findElementByName(Mortgage_calculator_constants.start_year).clear();
		  driver.findElement(By.name(Mortgage_calculator_constants.start_year)).sendKeys(Mortgage_calculator_constants.start_year_value);
		  driver.findElement(By.name(Mortgage_calculator_constants.property_tax)).clear();
		  driver.findElement(By.name(Mortgage_calculator_constants.property_tax)).sendKeys(Mortgage_calculator_constants.property_tax_value);
		  driver.findElement(By.name(Mortgage_calculator_constants.pmi)).clear();
		  driver.findElement(By.name(Mortgage_calculator_constants.pmi)).sendKeys(Mortgage_calculator_constants.pmi_value);
		  driver.findElement(By.name(Mortgage_calculator_constants.calculate)).click();
		  
		  
		
	
	
	}

}
