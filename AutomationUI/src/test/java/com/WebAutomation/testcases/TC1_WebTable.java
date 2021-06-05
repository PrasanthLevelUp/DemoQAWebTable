package com.WebAutomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.WebAutomation.drivers.DriverClass;
import com.WebAutomation.pages.DemoQAWebTablePage;
import com.WebAutomation.utils.Utils;

public class TC1_WebTable extends DriverClass{

	static DemoQAWebTablePage web;
	static Utils utils;

	
	@Parameters("browser")
	@BeforeMethod
	public void start(String browser) {
		driverlauch(browser,"https://demoqa.com/webtables");
		web = new DemoQAWebTablePage();
		utils = new Utils();
		
	}
	
	@Test
	public void AddUser() {
		web.clickAdd();
		web.createUser();
		utils.takeSnapShot();
		web.finduser();
		web.edituser();
		utils.takeSnapShot();
	}
	
	@AfterMethod
	public void end() {
		teardown();
	}
	
	
}
