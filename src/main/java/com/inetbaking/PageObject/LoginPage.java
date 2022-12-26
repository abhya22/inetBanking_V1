package com.inetbaking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"uid\"]")
	public WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement password;

	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	public WebElement submitbtn;

	public void SetUserName(String Username) {
		username.sendKeys(Username);
	}

	public void SetPassword(String Password) {
		password.sendKeys(Password);
	}

	public void clicksbmt() {
		submitbtn.click();
	}
}
