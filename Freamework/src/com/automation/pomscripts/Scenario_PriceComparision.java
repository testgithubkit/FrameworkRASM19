package com.automation.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.automation.generic.Base_Test;


public class Scenario_PriceComparision extends Base_Test
{
	@FindBy(xpath = "//ul[@class='top-menu']/li[4]/a")
	private WebElement apparel_shoes;
	
	@FindBy(id="products-orderby")
	private WebElement sort_by_drop;
	
	@FindBy(id="products-pagesize")
	private WebElement disp_drop;
	
	@FindBy(id="products-viewmode")
	private WebElement view_drop;
	
	@FindBy(xpath="//a[text()='Blue Jeans']/../../div[3]/div[2]/input")
	private WebElement blue_jeans_addtocart;
	
	@FindBy(xpath = "//a[text()='Casual Golf Belt']/../../div[3]/div[2]/input")
	private WebElement casual_belt_addtocart;
	
	@FindBy(xpath = "//span[contains(text(),' cart')]")
	private WebElement Shopcart_link;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[1]/input")
	private WebElement cbox_belt;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[1]/input")
	private WebElement cbox_bluejeans;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[6]/span[2]")
	private WebElement bluejeans_tp;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[6]/span[2]")
    private WebElement belt_tp;
	
	@FindBy(name="updatecart")
	private WebElement update_cart_btn;
	
	@FindBy(id="termsofservice")
	private WebElement terms_cbox;
	
	@FindBy(id="checkout")
	private WebElement check_out_btn;
	
	public Scenario_PriceComparision(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement apparelshoes()
	{
		return apparel_shoes;
	}
	
	public WebElement sortbydrop()
	{
		return sort_by_drop;
	}
	
	public WebElement dispdrop()
	{
		return disp_drop;
	}
	
	public WebElement viewdrop()
	{
		return view_drop;
	}
	
	public WebElement bluejeansaddtocart()
	{
		return blue_jeans_addtocart;
	}
	
	public WebElement casualbeltaddtocart()
	{
		return casual_belt_addtocart;
	}
	
	public WebElement shopcartlink()
	{
		return Shopcart_link;
	}
	
	public WebElement cboxbelt()
	{
		return cbox_belt;
	}
	
	public WebElement cboxbluejeans()
	{
		return cbox_bluejeans;
	}
	
	public WebElement bluejeanstp()
	{
		return bluejeans_tp;
	}
	
	public WebElement belttp()
	{
		return belt_tp;
	}
	
	public WebElement updatecartbtn()
	{
		return update_cart_btn;
	}
	
	public WebElement termscbox()
	{
		return terms_cbox;
	}
	
	public WebElement checkoutbtn()
	{
		return check_out_btn;
	}
}
