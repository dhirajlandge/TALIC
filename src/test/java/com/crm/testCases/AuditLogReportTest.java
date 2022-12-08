package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LoginPage;
import com.crm.pages.ReportPage;
import com.crm.pages.ValidationPage;

public class AuditLogReportTest extends SetUp {

	LoginPage login = new LoginPage(driver);
	ValidationPage validation = new ValidationPage(driver);
	ReportPage report=new ReportPage(driver);
	String Sheetname="CTAResponseReportTest";
	
	@Test
		
		public void auditLogReport() throws Exception
		{
			if (!(CommonMethods.isTestRunnable("auditLogReport", Sheetname))) {

		           throw new SkipException("Skipping the test auditLogReport as the Run mode is NO");
		        }
			
			login.CRMLogin(Sheetname);
			validation.CallCentreHead(driver);
			report.auditLogReport(driver);
			login.Logout();	

	}

}
