package lowesPSC;

public class LowesProductSearchConstants {
	
	public static String url = "http://www.lowes.com/" ; //baseurl
    public static String search = "Ntt"; //id
    public static String search_value = "lawn tractors";
    public static String verify_name = "//html/body/div[2]/div/div[4]/div/div/div[3]/div[1]/div[2]/div[2]/div[1]/h1";//xpath
    public static String click_enter = "html body div.parbase.esi.masthead div#header-block div.main-nav.container_16 ul li.search form#frmQuickSearch span.ui-frame button"; //css path
    //public static String link_text= "/html/body/div[2]/div/div[5]/div/div/div[3]/div[1]/div[1]/div[2]/div[1]/h1"; 
    public static String compare = "//html/body/div[2]/div/div[5]/div/div/div[3]/div[1]/div[2]/div[2]/div[1]/p/span[1]";//css path
    public static String text = "html body div#container div#page-block div#content-block div#content-area-prod-list.clearfix div#main_content_rail div.product-listing ul#productResults.listView.zipInDisplay li#item_50119839 div.productWrapper div.product-description ul.productInfo li";//css path
    public static String name = "html body div#container div#page-block div#content-block div#content-area-prod-list.clearfix div#main_content_rail div.product-listing ul#productResults.listView.zipInDisplay li#item_50119839 div.productWrapper div.titleArea h3.productTitle a"; // name
    public static String second_search = "html body div#container div#header-block div.main-nav.container_16 ul li.search form#frmQuickSearch span.ui-frame button"; // css path . this is for second time search
    public static String second_name = "html body div#container div#container div#page-block.container_16 div#content-block div#content-area-no-nav-widest div#productCont.container_16 div#productLeft.grid_12.alpha div#detailCont.grid_12.alpha div#descCont.grid_6.omega div.itemInfo h1"; // css path

}
