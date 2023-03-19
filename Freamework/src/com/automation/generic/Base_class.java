package com.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automation.pomscripts.Login_page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_class implements Framework_Constants
{
	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public static WebDriver driver;
	public Login_page login;
	public ExtentTest test;
	
	@BeforeTest
	public void repconfig()
	{
	    reporter=new ExtentHtmlReporter(EXTENT_PATH);
	    reports=new ExtentReports();
		reports.attachReporter(reporter);
	    test = reports.createTest(REPORT_HEADING);
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void log_In()
	{
		driver.get(Test_DataPropertyFILE.getData("URL"));
	    login = new Login_page(driver);
	    login.login_link().click();
	    login.username().sendKeys(Test_DataPropertyFILE.getData("user_name"));
	    login.password().sendKeys(Test_DataPropertyFILE.getData("pass_word"));
	    login.remcbox().click();
	    login.loginbtn().click();
	}
	
	@AfterMethod
	public void log_out()
	{
		login.logoutbtn().click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
    @AfterTest
    public void repclose()
    {
    	reports.flush();
    }
}
