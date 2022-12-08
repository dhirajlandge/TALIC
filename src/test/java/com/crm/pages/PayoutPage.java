package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.commonUtilities.ScreenShot;

public class PayoutPage extends SetUp{
	
	public PayoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void payOut(WebDriver driver) throws Exception
	{
		CommonMethods.highLight("Payout_XPATH");
		CommonMethods.Click("Payout_XPATH");
		ScreenShot.takeSnapShot("PayoutPage", "Pass");
		
        Thread.sleep(3000);
		CommonMethods.selectByText("Dropdown1_XPATH", "Payouttest", "Dropdown1", 1);
		
		Thread.sleep(3000);
		CommonMethods.scrollAtBottom();
		
		Thread.sleep(3000);
		CommonMethods.highLight("Import_XPATH");
		parentwindow = driver.getWindowHandle();
		CommonMethods.Click("Import_XPATH");
		
		Thread.sleep(3000);
		CommonMethods.switchToWindow();
		String childtitle=driver.getTitle();
		System.out.println(childtitle);
		ScreenShot.takeSnapShot("Childwindow", "Pass");
		
		Thread.sleep(3000);
		CommonMethods.highLight("Choose_XPATH");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(CommonMethods.readPropertyFile("Choose_XPATH")))).click().perform();
		Thread.sleep(6000);

		Runtime.getRuntime().exec("C:\\Users\\Dhiraj Landge\\OneDrive - Acidaes Solutions Pvt Ltd\\Desktop\\Payout.exe");
	    Thread.sleep(2000);
	    ScreenShot.takeSnapShot("FileImport", "Pass");
	    
	    CommonMethods.highLight("Finish_XPATH");
	    CommonMethods.Click("Finish_XPATH");
	    Thread.sleep(10000);
	    
	    CommonMethods.Click("Clickhere_XPATH");
	    Thread.sleep(1000);
	    CommonMethods.switchToParentWin();
	    Thread.sleep(3000);
	    CommonMethods.highLight("Itemid_XPATH");
	    ScreenShot.takeSnapShot("ItemID", "Pass");
	    String itemid=CommonMethods.getElementText("Itemid_XPATH");
	    System.out.println(itemid);
	    ExcelOperation.writeToExcel("PayoutTest", 1, 5, itemid);
	    
	    Thread.sleep(2000);
	    CommonMethods.scrollAtBottom();
	    CommonMethods.Click("Close_XPATH");
	    Thread.sleep(3000);
	    CommonMethods.highLight("Search_XPATH");
	    CommonMethods.Click("Search_XPATH");
	    Thread.sleep(2000);
	    
	    CommonMethods.input("PayoutNumber_XPATH", "PayoutTest", "ItemID", 1);
	    Thread.sleep(3000);
	    ScreenShot.takeSnapShot("EnterPayout", "Pass");
	    CommonMethods.Click("Search1_XPATH");
	    Thread.sleep(5000);
	    ScreenShot.takeSnapShot("PayoutCreation", "Pass");
}
	
}
