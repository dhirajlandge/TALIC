package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LoginPage;
import com.crm.pages.ValidationPage;

public class BranchLevel1EmailIDValidationTest extends SetUp {
	
	LoginPage login=new LoginPage(driver);
	ValidationPage validation=new ValidationPage(driver);
	String Sheetname="BranchLevel1ValidationTest";
	
	@Test
	
	public void branchLevel1ValidationTest() throws Exception
	{
		if (!CommonMethods.isTestRunnable("branchLevel1ValidationTest", Sheetname)){
			
			throw new SkipException("Skipping the test branchLevel1ValidationTest as the Run mode is NO");
			
		}
		
		login.CRMLogin(Sheetname);
		validation.BOE(driver);
		validation.CustomerSearch(driver);
		validation.EmailIDValidation(driver);
		validation.BranchValidateThirdParty(driver);
		login.Logout();
			
	}

}
