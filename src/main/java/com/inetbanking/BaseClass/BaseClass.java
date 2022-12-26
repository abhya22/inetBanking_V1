package com.inetbanking.BaseClass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public String BaseURL = "https://www.demo.guru99.com/V4/index.php";
	public String Username = "mngr463965";
	public String Password = "jUgUqut";
	public static WebDriver driver;
	public static Logger Logger;
	
	//@BeforeClass
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\inetBanking_V1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
		Logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");	
	}

	//@AfterClass
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
