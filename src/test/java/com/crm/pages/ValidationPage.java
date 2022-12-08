package com.crm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.InvalidElementStateException;
import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.commonUtilities.ScreenShot;

public class ValidationPage extends SetUp {

	public ValidationPage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);

	}

	public void CCQuality(WebDriver driver) throws Exception

	{
		
		CommonMethods.ExWait("ProfileBtn_XPATH");
		CommonMethods.Click("ProfileBtn_XPATH");
		CommonMethods.ExWait("Role_XPATH");
		CommonMethods.Click("Role_XPATH");
		CommonMethods.selectByText("Role_XPATH", "CCLevel1ValidationTest", "UserRole", 1);

	}
	
	public void CallCentreHead(WebDriver driver) throws Exception

	{
		CommonMethods.ExWait("ProfileBtn_XPATH");
		CommonMethods.Click("ProfileBtn_XPATH");
		CommonMethods.ExWait("Role_XPATH");
		CommonMethods.Click("Role_XPATH");
		CommonMethods.selectByText("Role_XPATH", "QuickLinksTest", "UserRole", 1);

	}
	
	
	public void CROExecutive(WebDriver driver) throws Exception

	{
		CommonMethods.ExWait("ProfileBtn_XPATH");
		CommonMethods.Click("ProfileBtn_XPATH");
		CommonMethods.ExWait("Role_XPATH");
		CommonMethods.Click("Role_XPATH");
		CommonMethods.selectByText("Role_XPATH", "Policy360CardViewTest", "UserRole", 1);

	}

	public void BOE(WebDriver driver) throws Exception

	{
		CommonMethods.ExWait("ProfileBtn_XPATH");
		CommonMethods.Click("ProfileBtn_XPATH");
		CommonMethods.ExWait("Role_XPATH");
		CommonMethods.Click("Role_XPATH");
		CommonMethods.selectByText("Role_XPATH", "CCLevel1ValidationTest", "UserRole", 2);

	}

	public void CustomerSearch(WebDriver driver) throws Exception

	{
		Thread.sleep(4000);
		CommonMethods.ExWait("QuickLinks_XPATH");
		CommonMethods.highLight("QuickLinks_XPATH");
		CommonMethods.mouseHover("QuickLinks_XPATH");
		CommonMethods.highLight("CustomerSearch_XPATH");
		ScreenShot.takeSnapShot("QuickLinks", "Pass");
		CommonMethods.Click("CustomerSearch_XPATH");

	}

	public void PolicyValidation(WebDriver driver) throws Exception

	{

		CommonMethods.ExWait("PolicyNumber_XPATH");
		CommonMethods.Click("PolicyNumber_XPATH");
		CommonMethods.highLight("PolicyNumber_XPATH");
		CommonMethods.input("PolicyNumber_XPATH", "CCLevel1ValidationTest", "PolicyNumber", 1);
		CommonMethods.Click("SideClick_XPATH");

		CommonMethods.ExWait("CustomerSearchNext_XPATH");
		CommonMethods.highLight("CustomerSearchNext_XPATH");
		ScreenShot.takeSnapShot("PolicyNumber", "Pass");
		Thread.sleep(2000);
		CommonMethods.Click("CustomerSearchNext_XPATH");

	}

	public void validate(WebDriver driver) throws Exception

	{
		Thread.sleep(2000);
		CommonMethods.ExWait("PolicyValidate_XPATH");
		CommonMethods.Click("PolicyValidate_XPATH");
		CommonMethods.scrollAtBottom();
		CommonMethods.ExWait("ClickHere_XPATH");
		CommonMethods.highLight("ClickHere_XPATH");
		CommonMethods.Click("ClickHere_XPATH");
		Thread.sleep(2000);
		CommonMethods.scrollAtBottom();
		CommonMethods.Click("Question1Response_XPATH");
		CommonMethods.selectByText("Question1Response_XPATH", "CCLevel1ValidationTest", "Response", 1);
		CommonMethods.Click("Question2Response_XPATH");
		CommonMethods.selectByText("Question2Response_XPATH", "CCLevel1ValidationTest", "Response", 1);
		CommonMethods.Click("Question3Response_XPATH");
		CommonMethods.selectByText("Question3Response_XPATH", "CCLevel1ValidationTest", "Response", 1);
		CommonMethods.Click("Question4Response_XPATH");
		CommonMethods.selectByText("Question4Response_XPATH", "CCLevel1ValidationTest", "Response", 2);
		CommonMethods.ExWait("CustomerValidateNext_XPATH");
		CommonMethods.highLight("CustomerValidateNext_XPATH");
		CommonMethods.Click("CustomerValidateNext_XPATH");

	}

	public void MobileNumberValidation(WebDriver driver) throws Exception

	{
		CommonMethods.ExWait("MobileNumber_XPATH");
		CommonMethods.Click("MobileNumber_XPATH");
		CommonMethods.highLight("MobileNumber_XPATH");
		CommonMethods.input("MobileNumber_XPATH", "CCLevel1ValidationTest", "MobileNumber", 1);
		CommonMethods.Click("SideClick_XPATH");
		Thread.sleep(4000);
		CommonMethods.ExWait("CustomerSearchNext_XPATH");
		CommonMethods.highLight("CustomerSearchNext_XPATH");
		ScreenShot.takeSnapShot("MobileNumber", "Pass");
		CommonMethods.Click("CustomerSearchNext_XPATH");

	}

	public void EmailIDValidation(WebDriver driver) throws Exception

	{
		CommonMethods.ExWait("EmailID_XPATH");
		CommonMethods.Click("EmailID_XPATH");
		CommonMethods.highLight("EmailID_XPATH");
		CommonMethods.input("EmailID_XPATH", "CCLevel1ValidationTest", "EmailID", 1);
		CommonMethods.Click("SideClick_XPATH");
		Thread.sleep(5000);
		CommonMethods.ExWait("CustomerSearchNext_XPATH");
		CommonMethods.highLight("CustomerSearchNext_XPATH");
		ScreenShot.takeSnapShot("EmailID", "Pass");
		CommonMethods.Click("CustomerSearchNext_XPATH");

	}

	public void PANNumberValidation(WebDriver driver) throws Exception

	{
		CommonMethods.ExWait("PANNumber_XPATH");
		CommonMethods.Click("PANNumber_XPATH");
		CommonMethods.highLight("PANNumber_XPATH");
		CommonMethods.input("PANNumber_XPATH", "CCLevel1ValidationTest", "PANNumber", 1);
		CommonMethods.Click("SideClick_XPATH");
		Thread.sleep(5000);
		CommonMethods.ExWait("CustomerSearchNext_XPATH");
		CommonMethods.highLight("CustomerSearchNext_XPATH");
		ScreenShot.takeSnapShot("PANNumber", "Pass");
		CommonMethods.Click("CustomerSearchNext_XPATH");

	}

	public void BankAccountNumberValidation(WebDriver driver) throws Exception

	{
		CommonMethods.ExWait("BankAccountNumber_XPATH");
		CommonMethods.Click("BankAccountNumber_XPATH");
		CommonMethods.highLight("BankAccountNumber_XPATH");
		CommonMethods.input("BankAccountNumber_XPATH", "CCLevel1ValidationTest", "BankAccountNumber", 1);
		CommonMethods.Click("SideClick_XPATH");
		Thread.sleep(5000);
		CommonMethods.ExWait("CustomerSearchNext_XPATH");
		CommonMethods.highLight("CustomerSearchNext_XPATH");
		ScreenShot.takeSnapShot("BankAccountNumber", "Pass");
		CommonMethods.Click("CustomerSearchNext_XPATH");

	}

	public void BranchValidateThirdParty(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		CommonMethods.ExWait("PolicyValidate_XPATH");
		CommonMethods.Click("PolicyValidate_XPATH");
		CommonMethods.scrollAtBottom();

		CommonMethods.highLight("Validatordropdown_XPATH");
		CommonMethods.selectByText("Validatordropdown_XPATH", "BranchLevel1ValidationTest", "Validator", 1);
		CommonMethods.highLight("Typeofvalidation_XPATH");
		CommonMethods.selectByText("Typeofvalidation_XPATH", "BranchLevel1ValidationTest", "Typeofvalidation", 2);

		CommonMethods.ExWait("ThirdPartyName_XPATH");
		CommonMethods.highLight("ThirdPartyName_XPATH");
		CommonMethods.input("ThirdPartyName_XPATH", "BranchLevel1ValidationTest", "ThirdPartyName", 1);
		CommonMethods.highLight("ThirdPartyRelation_XPATH");
		CommonMethods.selectByText("ThirdPartyRelation_XPATH", "BranchLevel1ValidationTest", "ThirdPartyRelation", 1);
		CommonMethods.highLight("ThirdPartyMobileNumber_XPATH");
		CommonMethods.input("ThirdPartyMobileNumber_XPATH", "BranchLevel1ValidationTest", "ThirdPartyMobile", 1);
		
		CommonMethods.highLight("BranchValidateNext_XPATH");
		CommonMethods.Click("BranchValidateNext_XPATH");
		Thread.sleep(2000);
	}
	
	public void BranchValidateSelf(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		CommonMethods.ExWait("PolicyValidate_XPATH");
		CommonMethods.Click("PolicyValidate_XPATH");
		CommonMethods.scrollAtBottom();

		CommonMethods.highLight("Validatordropdown_XPATH");
		CommonMethods.selectByText("Validatordropdown_XPATH", "BranchLevel1ValidationTest", "Validator", 2);
		CommonMethods.highLight("Typeofvalidation_XPATH");
		CommonMethods.selectByText("Typeofvalidation_XPATH", "BranchLevel1ValidationTest", "Typeofvalidation", 2);
		
		Thread.sleep(1000);
		CommonMethods.ExWait("BranchValidateNext_XPATH");
		CommonMethods.highLight("BranchValidateNext_XPATH");
		CommonMethods.Click("BranchValidateNext_XPATH");
		CommonMethods.ExWait("PhotoUploadNext_XPATH");
		CommonMethods.highLight("PhotoUploadNext_XPATH");
		CommonMethods.Click("PhotoUploadNext_XPATH");
		Thread.sleep(2000);

}

}