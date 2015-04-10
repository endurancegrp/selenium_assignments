package selenium_mvn;



public class Mortgage_calculator_constants {
	
	private Mortgage_calculator_constants(){ //constructor
	}
	
	//FirefoxDriver driver = new FirefoxDriver ();
	public static String url = "http://www.mortgagecalculator.org/" ; //url
    public static String home = "param[homevalue]";//name
    public static String home_value ="620000";
    public static String loan_amount = "param[principal]";//name
    public static String loan_amount_value ="120000";
    public static String interest_rate = "param[interest_rate]";//name
    public static String interest_rate_value ="3";
    public static String loan_term = "param[term]";//name
    public static String loan_term_value ="34";
    public static String start_month = "param[start_month]";//name
    public static String start_month_value ="Mar";
    public static String start_year = "param[start_year]";//name
    public static String start_year_value ="2015";
    public static String property_tax = "param[property_tax]";//name
    public static String property_tax_value ="1.05";
    public static String pmi = "param[pmi]";//name
    public static String pmi_value ="0.6";
    public static String calculate = "cal";//name
    public static String verify_text_present = "//html/body/section/div/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/div[1]/h3";//xpath
	public static String search_result;//variable to store getText() value
}


