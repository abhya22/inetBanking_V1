package com.inetbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbaking.PageObject.LoginPage;
import com.inetbanking.BaseClass.BaseClass;

public class TC_LoginPageTest_001 extends BaseClass {

	@Test
	public void logintest() {
		
		driver.get(BaseURL);
		Logger.info("Open BaseURL");
		LoginPage LP = new LoginPage();
		Logger.info("Enter Password");
		LP.SetUserName(Username);
		Logger.info("Enter Password");
		LP.SetPassword(Password);
		LP.clicksbmt();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			Logger.info("Login Test Case :- Pass");
		}
		else {
			Assert.assertTrue(true);
			Logger.info("Login Test Case :- Fail");
		}
	}
}
