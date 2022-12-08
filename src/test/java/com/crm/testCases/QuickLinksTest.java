package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LoginPage;
import com.crm.pages.Policy360Page;
import com.crm.pages.ValidationPage;

public class QuickLinksTest extends SetUp{
	
	LoginPage login = new LoginPage(driver);
	Policy360Page policy=new Policy360Page(driver);
	ValidationPage validation=new ValidationPage(driver);
	String Sheetname="QuickLinksTest";
	
	@Test
	
	public void quickLinksTest() throws Exception {
		
		if (!CommonMethods.isTestRunnable("quickLinksTest", Sheetname)) {
			
			throw new SkipException("Skipping the test quickLinksTest as the Run mode is NO");
		}
		
		login.CRMLogin(Sheetname);
		validation.CallCentreHead(driver);
		policy.Policy360CardView(driver);
		policy.QuickLinksTest(driver);
		login.Logout();
		
	}

}
