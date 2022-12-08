package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.Customer360Page;
import com.crm.pages.LoginPage;
import com.crm.pages.ValidationPage;

public class Customer360CardViewTest extends SetUp {
	
	LoginPage login=new LoginPage(driver);
	ValidationPage validation=new ValidationPage(driver);
	Customer360Page customer=new Customer360Page(driver);
	String Sheetname="Customer360CardViewTest";
	
	@Test
	
	public void customer360CardViewTest() throws Exception
	{
		if (!CommonMethods.isTestRunnable("customer360CardViewTest", Sheetname)){
			
			throw new SkipException("Skipping the test customer360CardViewTest as the Run mode is NO");
			
		}
		
		login.CRMLogin(Sheetname);
		validation.BOE(driver);
		validation.CustomerSearch(driver);
		validation.PolicyValidation(driver);
		validation.BranchValidateSelf(driver);
		customer.Customer360CardViewPage(driver);
		login.Logout();
			
	}

}
