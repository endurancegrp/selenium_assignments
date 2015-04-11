package lowesPSC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LowesProductSearch {
	
	LowesProductSearchConstants h = new LowesProductSearchConstants();
	
	
	public LowesProductSearch(WebDriver driver) throws Exception {
		
		driver.get(h.url);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.name(h.search)).click();
		driver.findElement(By.id(h.search)).sendKeys(h.search_value);
		driver.findElement(By.cssSelector(h.click_enter)).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		String vtext = driver.findElement(By.cssSelector(h.text)).getText();
		
		String vname1 = driver.findElement(By.cssSelector(h.name)).getText();
		driver.findElement(By.id(h.search)).clear();
		driver.findElement(By.id(h.search)).sendKeys(vtext);
		driver.findElement(By.cssSelector(h.second_search)).click();
		System.out.println(vname1);
		try { //to do
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		String vname2 = driver.findElement(By.cssSelector(h.second_name)).getText();
		System.out.println(vname2);
		if (vname1.equals(vname2)) {
			System.out.println("Both are Equal"); // to do
	
		} else {
			System.out.println("Both are Not Equal");
		}
	
	}
	
}
