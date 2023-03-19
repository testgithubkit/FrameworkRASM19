package com.automation.testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.Base_class;
import com.automation.generic.Conversion;
import com.automation.generic.Javascript_class;
import com.automation.generic.Select_Dropdown_Options;
import com.automation.pomscripts.Scenario_PriceComparision;
import com.aventstack.extentreports.Status;

@Listeners(com.automation.generic.ListenerClass.class)
public class TS_PriceComparision_Demowebshop extends Base_class
{
	@Test
	public void pricecompare() throws InterruptedException
	{
		Scenario_PriceComparision spc=new Scenario_PriceComparision(driver);
		spc.apparelshoes().click();
		test.log(Status.INFO, "Apparel&shoes tab is clicked");
		Thread.sleep(1000);
		WebElement sort_drop = spc.sortbydrop();
		Select_Dropdown_Options .select_By_index(sort_drop, 1);
		Thread.sleep(1000);
		WebElement disp_drop = spc.dispdrop();
		Select_Dropdown_Options.select_By_VisibleText(disp_drop, "12");
		Thread.sleep(1000);
		WebElement view_drop = spc.viewdrop();
		Select_Dropdown_Options.select_By_VisibleText(view_drop, "List");
		Thread.sleep(1000);
		Javascript_class.scroll_down_Using_add(spc.bluejeansaddtocart());
		Thread.sleep(1000);
		spc.bluejeansaddtocart().click();
		Thread.sleep(1000);
		spc.casualbeltaddtocart().click();
	    Thread.sleep(1000);
		spc.shopcartlink().click();
		Thread.sleep(1000);
		String Jeans_Price = spc.bluejeanstp().getText();
		Thread.sleep(1000);
		String Belt_Price = spc.belttp().getText();
		Thread.sleep(1000);
		double Belt_Converted = Conversion.convert(Belt_Price);
		Thread.sleep(1000);
		double jeans_Converted = Conversion.convert(Jeans_Price);
		if(Belt_Converted>jeans_Converted)
		{
			test.log(Status.INFO, "Belt is costly");
			spc.cboxbelt().click();
			Thread.sleep(1000);
			spc.updatecartbtn().click();
		}
		else if(jeans_Converted>Belt_Converted)
		{
			test.log(Status.INFO, "jeans pant is costly");
			spc.cboxbluejeans().click();
			Thread.sleep(1000);
			spc.updatecartbtn().click();
		}
		else
		{
			test.log(Status.INFO, "Both are equal");
			spc.termscbox().click();
			spc.checkoutbtn().click();
		}
	}
}
