package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LoginPage;
import com.crm.pages.ValidationPage;

public class CCLevel1MobileNumberValidationTest extends SetUp {
	
	LoginPage login= new LoginPage(driver);
	ValidationPage validation=new ValidationPage(driver);
    String Sheetname="CCLevel1ValidationTest";
	
    @Test
	
	public void cCLevel1ValidationTest() throws Exception
	{
		if (!(CommonMethods.isTestRunnable("cCLevel1ValidationTest", Sheetname))) {

	           throw new SkipException("Skipping the test cCLevel1ValidationTest as the Run mode is NO");
	        }
		
		login.CRMLogin(Sheetname);
		validation.CCQuality(driver);
		validation.CustomerSearch(driver);
		validation.MobileNumberValidation(driver);
		validation.validate(driver);
		login.Logout();	

}

}
