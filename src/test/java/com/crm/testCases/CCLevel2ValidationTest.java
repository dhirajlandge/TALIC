package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.Policy360Page;
import com.crm.pages.ValidationPage;
import com.crm.pages.LoginPage;

public class CCLevel2ValidationTest extends SetUp {
	
	LoginPage login=new LoginPage(driver);
	ValidationPage validation=new ValidationPage(driver);
	Policy360Page policy=new Policy360Page(driver);
	String Sheetname="CCLevel2ValidationTest";
	
@Test
	
	public void cCLevel2ValidationTest() throws Exception
	{
		if (!(CommonMethods.isTestRunnable("cCLevel2ValidationTest", Sheetname))) {

	           throw new SkipException("Skipping the test cCLevel2ValidationTest as the Run mode is NO");
	        }
		
		login.CRMLogin(Sheetname);
		validation.CallCentreHead(driver);
		policy.Policy360CardView(driver);
		policy.CCLevel2Validation(driver);
		login.Logout();	

}
}

