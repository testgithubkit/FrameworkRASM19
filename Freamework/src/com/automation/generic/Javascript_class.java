package com.automation.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Javascript_class extends Base_class
{
	public static JavascriptExecutor typecast()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}
	public static void scroll_down_Using_add(WebElement ele)
	{
		typecast().executeScript("arguments[0].scrollIntoView();", ele);
	}
	public static void scroll_Up_Using_Loc(int x,int y)
	{
		typecast().executeScript("window.scrollBy("+x+","+y+")");
	}

}
