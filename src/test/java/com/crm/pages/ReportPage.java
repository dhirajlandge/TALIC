package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;

public class ReportPage extends SetUp {

	public ReportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void cTAResponseReportPage(WebDriver driver) throws Exception

	{
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
		String childtitle = driver.getTitle();
		System.out.println(childtitle);

		CommonMethods.ExWait("Execute_XPATH");
		CommonMethods.highLight("Execute_XPATH");
		CommonMethods.Click("Execute_XPATH");

		CommonMethods.ExWait("Export_XPATH");
		CommonMethods.highLight("Export_XPATH");
		CommonMethods.mouseHover("Export_XPATH");

		CommonMethods.ExWait("CSV_XPATH");
		CommonMethods.highLight("CSV_XPATH");
		CommonMethods.Click("CSV_XPATH");

		CommonMethods.switchToParentWin(parentwindow);
	}
	
	
	public void auditLogReport(WebDriver driver) throws Exception
	{
		CommonMethods.ExWait("Report_XPATH");
		CommonMethods.highLight("Report_XPATH");
		CommonMethods.Click("Report_XPATH");
		
		CommonMethods.ExWait("AuditLog_XPATH");
		CommonMethods.highLight("AuditLog_XPATH");
		CommonMethods.Click("AuditLog_XPATH");
		
		CommonMethods.ExWait("CustomerSearchAuditLog_XPATH");
		CommonMethods.highLight("CustomerSearchAuditLog_XPATH");
		CommonMethods.Click("CustomerSearchAuditLog_XPATH");
		
		CommonMethods.switchToWindow();
		String childtitle=driver.getTitle();
		System.out.println(childtitle);
		
		CommonMethods.ExWait("Execute_XPATH");
		CommonMethods.highLight("Execute_XPATH");
		CommonMethods.Click("Execute_XPATH");
		
		CommonMethods.ExWait("AllReport_XPATH");
		CommonMethods.highLight("AllReport_XPATH");
		
		CommonMethods.ExWait("Export_XPATH");
		CommonMethods.highLight("Export_XPATH");
		CommonMethods.Click("Export_XPATH");
		
		CommonMethods.ExWait("CSV_XPATH");
		CommonMethods.highLight("CSV_XPATH");
		
		
		CommonMethods.switchToParentWin();
			
		
	}

}
