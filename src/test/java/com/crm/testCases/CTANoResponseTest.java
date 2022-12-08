package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LoginPage;
import com.crm.pages.Policy360Page;
import com.crm.pages.ValidationPage;
import com.google.common.util.concurrent.CycleDetectingLockFactory.Policy;

public class CTANoResponseTest extends SetUp {
	
	LoginPage login=new LoginPage(driver);
	ValidationPage validation=new ValidationPage(driver);
	Policy360Page policy=new Policy360Page(driver);
	String Sheetname="CTAYesResponseTest";
	
	@Test
		
		public void cTANoResponseTest() throws Exception
		{
		
			if (!(CommonMethods.isTestRunnable("cTANoResponseTest", Sheetname))) {

		           throw new SkipException("Skipping the test cTANoResponseTest as the Run mode is NO");
		        }
			
			login.CRMLogin(Sheetname);
			validation.CallCentreHead(driver);
			policy.Policy360CardView(driver);
			policy.CTANoResponse(driver);
			login.Logout();	

	}

}
