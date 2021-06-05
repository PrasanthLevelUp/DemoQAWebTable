package com.WebAutomation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {
	
	
	protected static WebDriver driver;
	
	public static void driverlauch(String broswer,String url) {

		switch(broswer) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32 (1)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();	
			break;
		case "firefox":
			//System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();	
			break;
		}
		
	}
	
	public static void teardown() {
		driver.quit();
	}

}
