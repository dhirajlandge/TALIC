package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.commonUtilities.ScreenShot;

public class Policy360Page extends SetUp {

	public Policy360Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void Policy360CardView(WebDriver driver) throws Exception

	{
		
		CommonMethods.ExWait("QuickLinks_XPATH");
		CommonMethods.highLight("QuickLinks_XPATH");
		CommonMethods.mouseHover("QuickLinks_XPATH");
		CommonMethods.highLight("PolicySearch_XPATH");
		ScreenShot.takeSnapShot("QuickLinks", "Pass");
		CommonMethods.Click("PolicySearch_XPATH");

		CommonMethods.ExWait("PolicyNumber1_XPATH");
		CommonMethods.highLight("PolicyNumber1_XPATH");
		CommonMethods.input("PolicyNumber1_XPATH", "CCLevel2ValidationTest", "PolicyNumber", 1);
		CommonMethods.highLight("Fetch_XPATH");
		ScreenShot.takeSnapShot("PolicySearch", "Pass");
		CommonMethods.Click("Fetch_XPATH");

		CommonMethods.ExWait("Action_XPATH");
		CommonMethods.highLight("Action_XPATH");
		ScreenShot.takeSnapShot("Action", "Pass");
		CommonMethods.Click("Action_XPATH");

	}

	public void CCLevel2Validation(WebDriver driver) throws Exception {

		CommonMethods.ExWait("ActionCentre_XPATH");
		CommonMethods.highLight("ActionCentre_XPATH");
		ScreenShot.takeSnapShot("ActionCentre", "Pass");
		CommonMethods.Click("ActionCentre_XPATH");

		CommonMethods.ExWait("Level2Validation_XPATH");
		CommonMethods.highLight("Level2Validation_XPATH");
		ScreenShot.takeSnapShot("Level2ValidationJourney", "Pass");
		CommonMethods.Click("Level2Validation_XPATH");

		ScreenShot.takeSnapShot("Validate", "Pass");
		CommonMethods.scrollAtBottom();

		CommonMethods.ExWait("Toggle11_XPATH");
		CommonMethods.highLight("Toggle11_XPATH");
		CommonMethods.Click("Toggle11_XPATH");

		CommonMethods.ExWait("Toggle12_XPATH");
		CommonMethods.highLight("Toggle12_XPATH");
		CommonMethods.Click("Toggle12_XPATH");
		Thread.sleep(2000);
		CommonMethods.highLight("Next3_XPATH");
		ScreenShot.takeSnapShot("PassingCriteria", "Pass");
		CommonMethods.Click("Next3_XPATH");

		Thread.sleep(2000);
		CommonMethods.scrollAtBottom();
		CommonMethods.highLight("Close22_XPATH");
		CommonMethods.Click("Close22_XPATH");

	}

	public void Policy360CardViewTest(WebDriver driver) throws Exception {

		CommonMethods.scrollDown(170);
		CommonMethods.ExWait("PolicyDetails_XPATH");
		CommonMethods.highLight("PolicyDetails_XPATH");
		CommonMethods.highLight("BasicDetails_XPATH");
		CommonMethods.Click("BasicDetails_XPATH");
		CommonMethods.highLight("BasicDetails1_XPATH");
		ScreenShot.takeSnapShot("BasicDetails", "Pass");

		CommonMethods.highLight("AgentDetails_XPATH");
		CommonMethods.Click("AgentDetails_XPATH");
		CommonMethods.highLight("AgentDetails1_XPATH");
		ScreenShot.takeSnapShot("AgentDetails", "Pass");

		CommonMethods.highLight("MoreInfo_XPATH");
		CommonMethods.Click("MoreInfo_XPATH");
		CommonMethods.highLight("MoreInfo1_XPATH");
		ScreenShot.takeSnapShot("MoreInfo", "Pass");

		CommonMethods.highLight("OwnerandInsured_XPATH");
		CommonMethods.highLight("OwnerDetails_XPATH");
		CommonMethods.Click("OwnerDetails_XPATH");
		CommonMethods.highLight("OwnerDetails1_XPATH");
		ScreenShot.takeSnapShot("OwnerDetails", "Pass");

		CommonMethods.highLight("InsuredDetails_XPATH");
		CommonMethods.Click("InsuredDetails_XPATH");
		CommonMethods.highLight("InsureDetails1_XPATH");
		ScreenShot.takeSnapShot("InsureDetails", "Pass");

		CommonMethods.highLight("ActionAlert_XPATH");
		CommonMethods.highLight("ActionAlert1_XPATH");
		ScreenShot.takeSnapShot("ActionAlert", "pass");

		CommonMethods.scrollDown(650);

		CommonMethods.highLight("PremiumDetails_XPATH");
		CommonMethods.highLight("KeyInfoo_XPATH");
		CommonMethods.Click("KeyInfoo_XPATH");
		CommonMethods.highLight("KeyInfoo1_XPATH");
		ScreenShot.takeSnapShot("KeyInfoo", "Pass");

		CommonMethods.highLight("Primary_XPATH");
		CommonMethods.Click("Primary_XPATH");
		CommonMethods.highLight("Primary1_XPATH");
		ScreenShot.takeSnapShot("Primary", "Pass");

		CommonMethods.highLight("Secondary_XPATH");
		CommonMethods.Click("Secondary_XPATH");
		CommonMethods.highLight("Secondary1_XPATH");
		ScreenShot.takeSnapShot("Secondary", "Pass");

		CommonMethods.highLight("PolicySummary_XPATH");
		CommonMethods.highLight("SRSummary0_XPATH");
		CommonMethods.highLight("SRAllFilter_XPATH");
		CommonMethods.Click("SRAllFilter_XPATH");
		CommonMethods.highLight("PolicySummary1_XPATH");
		ScreenShot.takeSnapShot("ALL SR", "Pass");

		CommonMethods.highLight("SRNewFilter_XPATH");
		CommonMethods.Click("SRNewFilter_XPATH");
		ScreenShot.takeSnapShot("NewSR", "Pass");

		CommonMethods.highLight("SRInProgressFilter_XPATH");
		CommonMethods.Click("SRInProgressFilter_XPATH");
		ScreenShot.takeSnapShot("InPrgressSR", "Pass");

		CommonMethods.ExWait("PayoutDetails_XPATH");
		CommonMethods.highLight("PayoutDetails_XPATH");
		CommonMethods.Click("PayoutDetails_XPATH");
		Thread.sleep(2000);

		CommonMethods.ExWait("PolicyHistory_XPATH");
		CommonMethods.highLight("PolicyHistory_XPATH");
		CommonMethods.Click("PolicyHistory_XPATH");
		Thread.sleep(10000);
		
		CommonMethods.ExWait("PremiumHistoryCard_XPATH");
		CommonMethods.highLight("PremiumHistoryCard_XPATH");
		CommonMethods.Click("PremiumHistoryCard_XPATH");

		Thread.sleep(12000);
		CommonMethods.highLight("Statements_XPATH");
		CommonMethods.Click("Statements_XPATH");
		CommonMethods.highLight("Statements1_XPATH");
		CommonMethods.highLight("Statements2_XPATH");
		CommonMethods.highLight("Statements3_XPATH");
		CommonMethods.highLight("Statements4_XPATH");
		ScreenShot.takeSnapShot("Statements", "Pass");

		CommonMethods.scrollDown(500);
		CommonMethods.highLight("PolicyDocuments_XPATH");
		CommonMethods.Click("PolicyDocuments_XPATH");
		CommonMethods.highLight("PolicyDocuments1_XPATH");
		ScreenShot.takeSnapShot("PoloicyDocuments", "Pass");

	}

	public void QuickLinksTest(WebDriver driver) throws Exception {

		CommonMethods.ExWait("ActionCentre_XPATH");
		CommonMethods.highLight("ActionCentre_XPATH");
		CommonMethods.Click("ActionCentre_XPATH");
		CommonMethods.ExWait("QuickLinksJourney_XPATH");
		CommonMethods.highLight("QuickLinksJourney_XPATH");
		CommonMethods.Click("QuickLinksJourney_XPATH");

		CommonMethods.ExWait("QuickLinks1_XPATH");
		CommonMethods.highLight("QuickLinks1_XPATH");
		CommonMethods.Click("QuickLinks1_XPATH");
		CommonMethods.selectByText("QuickLinks1_XPATH", "QuickLinksTest", "QuickLinks", 3);

		CommonMethods.ExWait("SendingMode_XPATH");
		CommonMethods.highLight("SendingMode_XPATH");
		CommonMethods.Click("SendingMode_XPATH");
		CommonMethods.selectByText("SendingMode_XPATH", "QuickLinksTest", "SendingMode", 1);

		CommonMethods.ExWait("Send_XPATH");
		CommonMethods.highLight("Send_XPATH");
		CommonMethods.Click("Send_XPATH");

		CommonMethods.ExWait("ServiceRequestNumber_XPATH");
		CommonMethods.highLight("ServiceRequestNumber_XPATH");
		String ServiceNumber = CommonMethods.getElementText("ServiceRequestNumber_XPATH");
		ExcelOperation.writeToExcel("QuickLinksTest", 3, 8, ServiceNumber);

		CommonMethods.scrollAtBottom();
		CommonMethods.highLight("CloseSRNumber_XPATH");
		CommonMethods.Click("CloseSRNumber_XPATH");
	}
	
	public void CTAYesResponse(WebDriver driver) throws Exception
	{
		CommonMethods.ExWait("PolicyNumberHyperLink_XPATH");
		CommonMethods.highLight("PolicyNumberHyperLink_XPATH");
		CommonMethods.Click("PolicyNumberHyperLink_XPATH");
		Thread.sleep(2000);
		CommonMethods.ExWait("Yes_XPATH");
		CommonMethods.highLight("Yes_XPATH");
		CommonMethods.Click("Yes_XPATH");

		String parentwindowid = driver.getWindowHandle();

		CommonMethods.switchToWindow();
		String childtitle = driver.getTitle();
		System.out.println(childtitle);

		ScreenShot.takeSnapShot("Childwindow", "Pass");
		CommonMethods.scrollDown(100);
		CommonMethods.ExWait("Mode_XPATH");
		CommonMethods.highLight("Mode_XPATH");
		CommonMethods.selectByText("Mode_XPATH", "CTAYesResponseTest", "Mode", 1);
		CommonMethods.scrollDown(1100);

		CommonMethods.ExWait("SubCategory_XPATH");
		CommonMethods.highLight("SubCategory_XPATH");
		CommonMethods.input("SubCategory_XPATH", "CTAYesResponseTest", "SubCategory", 1);
		CommonMethods.Click("Others_XPATH");
		CommonMethods.ExWait("SubSubCategory_XPATH");

		CommonMethods.highLight("SubSubCategory_XPATH");
		CommonMethods.input("SubSubCategory_XPATH", "CTAYesResponseTest", "SubSubCategoryRequest", 1);
		CommonMethods.Click("Request_XPATH");
		CommonMethods.ExWait("Subject_XPATH");
		CommonMethods.highLight("Subject_XPATH");
		CommonMethods.input("Subject_XPATH", "CTAYesResponseTest", "Subject", 1);

		CommonMethods.Click("SideClick1_XPATH");
		Thread.sleep(1000);
		CommonMethods.ExWait("Next111_XPATH");
		CommonMethods.highLight("Next111_XPATH");
		CommonMethods.Click("Next111_XPATH");

		CommonMethods.ExWait("SRNumber_XPATH");
		CommonMethods.highLight("SRNumber_XPATH");
		String SR = CommonMethods.getElementText("SRNumber_XPATH");
		System.out.println(SR);
		ExcelOperation.writeToExcel("CTAYesResponseTest", 1, 10, SR);

		CommonMethods.scrollAtBottom();
		CommonMethods.ExWait("Close_XPATH");
		CommonMethods.highLight("Close_XPATH");
		CommonMethods.Click("Close_XPATH");

		CommonMethods.switchToParentWin(parentwindowid);
		CommonMethods.scrollDown(300);
		CommonMethods.ExWait("Report_XPATH");
		CommonMethods.highLight("Report_XPATH");
		CommonMethods.Click("Report_XPATH");
		
		CommonMethods.ExWait("CallToAction_XPATH");
		CommonMethods.highLight("CallToAction_XPATH");
		CommonMethods.Click("CallToAction_XPATH");
		
		CommonMethods.ExWait("CallToActionResponse_XPATH");
		CommonMethods.highLight("CallToActionResponse_XPATH");
		CommonMethods.Click("CallToActionResponse_XPATH");
		
		CommonMethods.switchToWindow();
		String childtitle1=driver.getTitle();
		System.out.println(childtitle1);
		
		CommonMethods.ExWait("Execute_XPATH");
		CommonMethods.highLight("Execute_XPATH");
		CommonMethods.Click("Execute_XPATH");
		CommonMethods.ExWait("ActivityRow_XPATH");
		CommonMethods.highLight("ActivityRow_XPATH");
		Thread.sleep(3000);
		CommonMethods.switchToParentWin(parentwindowid);

	}
	
	public void CTANoResponse(WebDriver driver) throws Exception
	{
		CommonMethods.ExWait("No_XPATH");
		CommonMethods.highLight("No_XPATH");
		CommonMethods.Click("No_XPATH");

		String parentwindowid = driver.getWindowHandle();

		CommonMethods.switchToWindow();
		String childtitle = driver.getTitle();
		System.out.println(childtitle);

		CommonMethods.ExWait("Reason_XPATH");
		CommonMethods.highLight("Reason_XPATH");
		CommonMethods.Click("Reason_XPATH");
		CommonMethods.selectByText("Reason_XPATH", "CTANoResponseTest", "Reason", 1);

		CommonMethods.highLight("Details_XPATH");
		CommonMethods.input("Details_XPATH", "CTANoResponseTest", "Details", 1);

		CommonMethods.ExWait("Save_XPATH");
		CommonMethods.highLight("Save_XPATH");
		CommonMethods.Click("Save_XPATH");

		CommonMethods.ExWait("Task_XPATH");
		CommonMethods.highLight("Task_XPATH");
		String Task = CommonMethods.getElementText("Task_XPATH");
		System.out.println(Task);
		ExcelOperation.writeToExcel("CTANoResponseTest", 1, 5, Task);

		CommonMethods.scrollAtBottom();
		CommonMethods.ExWait("Close12_XPATH");
		CommonMethods.highLight("Close12_XPATH");
		CommonMethods.Click("Close12_XPATH");

		CommonMethods.switchToParentWin(parentwindowid);
		CommonMethods.scrollDown(300);
		CommonMethods.ExWait("Report_XPATH");
		CommonMethods.highLight("Report_XPATH");
		CommonMethods.Click("Report_XPATH");
		
		CommonMethods.ExWait("CallToAction_XPATH");
		CommonMethods.highLight("CallToAction_XPATH");
		CommonMethods.Click("CallToAction_XPATH");
		
		CommonMethods.ExWait("CallToActionResponse_XPATH");
		CommonMethods.highLight("CallToActionResponse_XPATH");
		CommonMethods.Click("CallToActionResponse_XPATH");
		
		CommonMethods.switchToWindow();
		String childtitle1=driver.getTitle();
		System.out.println(childtitle1);
		
		CommonMethods.ExWait("Execute_XPATH");
		CommonMethods.highLight("Execute_XPATH");
		CommonMethods.Click("Execute_XPATH");
		
		CommonMethods.ExWait("ActivityRow_XPATH");
		CommonMethods.highLight("ActivityRow_XPATH");
		Thread.sleep(3000);
		CommonMethods.switchToParentWin(parentwindowid);
	}

}
