package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;

public class Customer360Page {
	
	public Customer360Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Customer360CardViewPage(WebDriver driver) throws Exception

	{
		
		CommonMethods.scrollDown(150);
		CommonMethods.ExWait("KeyInfo_XPATH");
		CommonMethods.highLight("KeyInfo_XPATH");
		CommonMethods.Click("KeyInfo_XPATH");
		
		CommonMethods.ExWait("KeyInfo1_XPATH");
		CommonMethods.highLight("KeyInfo1_XPATH");
		
		CommonMethods.ExWait("ContactInfo_XPATH");
		CommonMethods.highLight("ContactInfo_XPATH");
		CommonMethods.Click("ContactInfo_XPATH");
		
		CommonMethods.ExWait("ContactInfo1_XPATH");
		CommonMethods.highLight("ContactInfo1_XPATH");
		
		CommonMethods.ExWait("Policies_XPATH");
		CommonMethods.highLight("Policies_XPATH");
		CommonMethods.Click("Policies_XPATH");
		
		CommonMethods.highLight("Policy1_XPATH");
		
		CommonMethods.ExWait("SRSummary_XPATH");
		CommonMethods.highLight("SRSummary_XPATH");
		CommonMethods.Click("SRSummary_XPATH");
		
		CommonMethods.highLight("SRAllFilter1_XPATH");
		CommonMethods.Click("SRAllFilter1_XPATH");
		CommonMethods.highLight("SRSummary1_XPATH");
		
		Thread.sleep(2000);
		CommonMethods.highLight("SRNewFilter1_XPATH");
		CommonMethods.Click("SRNewFilter1_XPATH");
		CommonMethods.highLight("SRSummary1_XPATH");
		
		Thread.sleep(2000);
		CommonMethods.highLight("SRInProgressFilter1_XPATH");
		CommonMethods.Click("SRInProgressFilter1_XPATH");
		CommonMethods.highLight("SRSummary1_XPATH");
		
		Thread.sleep(2000);
		CommonMethods.highLight("Offers_XPATH");
		CommonMethods.Click("Offers_XPATH");
		CommonMethods.highLight("Offers1_XPATH");
		
		
	}

}
