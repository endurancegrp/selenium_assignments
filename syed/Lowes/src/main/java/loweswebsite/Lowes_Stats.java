package loweswebsite;

public class Lowes_Stats {
	
	//Storing it by "id"
	String search = "Ntt";
	
	//storing it by xpath
	String searchbutton = "/html/body/div[2]/div[4]/div[3]/ul/li[1]/form/span/button";
	
	//Storing it by datacablesXpath
	String datacable = "//html/body/div[1]/div[4]/div[1]/div/div[4]/div[4]/ul/li[1]/div/div[4]/ul[1]/li[1]";
	
	//link to click for datacable xpath
	String datacable_link="//html/body/div[1]/div[5]/div[1]/div/div[4]/div[3]/ul/li[1]/div/div[2]/h3/a";
	
	//add to cart button id
	String addCart_button= "//html/body/div[2]/div/div[5]/div/div/div[3]/div[2]/div[1]/form/ul[3]/li[2]/div/a/span";
	
	//storing continue shopping link by xpath
	String contineshoppinglink="//html/body/div[14]/div[3]/div/a";
	
	//Storing add to cart basket after adding 1 item by id
	String itemsincart= "nav-cart-count";
	
	//Storing it by url
    String URL = "/http://www.lowes.com";
    
    
    
}
