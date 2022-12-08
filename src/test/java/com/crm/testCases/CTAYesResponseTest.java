package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.ReportPage;
import com.crm.pages.LoginPage;
import com.crm.pages.Policy360Page;
import com.crm.pages.ValidationPage;

public class CTAYesResponseTest extends SetUp {
		
		LoginPage login=new LoginPage(driver);
		ValidationPage validation=new ValidationPage(driver);
		Policy360Page policy=new Policy360Page(driver);
		String Sheetname="CTAYesResponseTest";
		
		@Test
			
			public void cTAYesResponseTest() throws Exception
			{
				if (!(CommonMethods.isTestRunnable("cTAYesResponseTest", Sheetname))) {

			           throw new SkipException("Skipping the test cTAYesResponseTest as the Run mode is NO");
			        }
				
				login.CRMLogin(Sheetname);
				validation.BOE(driver);
				validation.CustomerSearch(driver);
				validation.PolicyValidation(driver);
				validation.BranchValidateSelf(driver);
			    policy.CTAYesResponse(driver);
				login.Logout();	

		}
		

	}


