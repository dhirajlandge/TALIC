package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.ReportPage;
import com.crm.pages.LoginPage;

public class CTAResponseReportTest extends SetUp {
	
	LoginPage login=new LoginPage(driver);
	ReportPage report=new ReportPage(driver);
	String Sheetname="CTAResponseReportTest";
	
	@Test
		
		public void cTAResponseReportTest() throws Exception
		{
			if (!(CommonMethods.isTestRunnable("cTAResponseReportTest", Sheetname))) {

		           throw new SkipException("Skipping the test cTAResponseReportTest as the Run mode is NO");
		        }
			
			login.CRMLogin(Sheetname);
			report.cTAResponseReportPage(driver);
			login.Logout();	

	}
	

}
