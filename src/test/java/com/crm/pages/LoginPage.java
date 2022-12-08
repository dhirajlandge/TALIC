package com.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
//import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;
import com.crm.pages.LoginPage;

public class LoginPage extends TestListeners{
	
public static Logger log =LogManager.getLogger(LoginPage.class.getName());

	
	public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
}

	public void CRMLogin(String sheetName) throws Exception
	{
				extentInfo("Login for ", sheetName +" Intiated");
				CommonMethods.input("Username_XPATH", sheetName, "Username", 1);
				CommonMethods.input("password_XPATH", sheetName, "Password", 1);
				CommonMethods.highLight("loginBtn_XPATH");
				ScreenShot.takeSnapShot("LoginPage", "Pass");
				CommonMethods.Click("loginBtn_XPATH");
				extentInfo("Sucessfully Login","");
	}
	
	/******************LOGOUT*************************/
	
		
	public void Logout() throws Exception
	{
		    Thread.sleep(2000);
			CommonMethods.highLight("ProfileBtn_XPATH");
			CommonMethods.Click("ProfileBtn_XPATH");
			CommonMethods.highLight("logoutBtn_XPATH");
			CommonMethods.Click("logoutBtn_XPATH");
			log.info("Sucessfully logout..");
	}
	

}
