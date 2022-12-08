package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LoginPage;
import com.crm.pages.Policy360Page;
import com.crm.pages.ValidationPage;

public class Policy360CardViewTest extends SetUp {
	
	LoginPage login=new LoginPage(driver);
	ValidationPage validation=new ValidationPage(driver);
	Policy360Page policy=new Policy360Page(driver);
	String Sheetname="Policy360CardViewTest";
	
	@Test
	public void policy360CardViewTest() throws Exception
	{
		if (!CommonMethods.isTestRunnable("Policy360CardViewTest", Sheetname))
				{
					throw new SkipException("Skipping the test Policy360CardViewTest as the Run mode is NO");	
				}
		
		
		login.CRMLogin(Sheetname);
		validation.CROExecutive(driver);
		policy.Policy360CardView(driver);
		policy.Policy360CardViewTest(driver);
		login.Logout();
	}

}
