package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LoginPage;
import com.crm.pages.PayoutPage;

public class PayoutTest extends SetUp {
	
	LoginPage login=new LoginPage(driver);
	PayoutPage payout=new PayoutPage(driver);
	String Sheetname="PayoutTest";
	
    @Test
	
	public void payoutTest() throws Exception
	{
		if (!(CommonMethods.isTestRunnable("payoutTest", Sheetname))) {

	           throw new SkipException("Skipping the test payoutTest as the Run mode is NO");
	        }
		
		login.CRMLogin(Sheetname);
		payout.payOut(driver);
		login.Logout();	

}
}
