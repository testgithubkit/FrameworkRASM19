package com.automation.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.automation.generic.Base_Test;


public class Login_page extends Base_Test
{
	@FindBy(xpath = "//a[contains(text(),' in')]")
	private WebElement login_link;
	
	@FindBy(id="Email")
	private WebElement user_name;
	
	@FindBy(id="Password")
	private WebElement pass_word;
	
	@FindBy(id="RememberMe")
	private WebElement rem_cbox;
	
	@FindBy(xpath="//input[contains(@value,' in')]")
	private WebElement login_btn;
	
	@FindBy(xpath = "//a[contains(text(),' out')]")
	private WebElement logout_btn;
	
	public Login_page(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement login_link()
	{
		return login_link;
	}
	
	public WebElement username()
	{
		return user_name;
	}
	
	public WebElement password()
	{
		return pass_word;
	}
	
	public WebElement remcbox()
	{
		return rem_cbox;
	}
	
	public WebElement loginbtn()
	{
		return login_btn;
	}
	
	public WebElement logoutbtn()
	{
		return logout_btn;
	}

}
