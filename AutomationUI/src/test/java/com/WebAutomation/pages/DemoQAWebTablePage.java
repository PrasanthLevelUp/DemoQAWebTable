package com.WebAutomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.WebAutomation.drivers.DriverClass;

public class DemoQAWebTablePage extends DriverClass{
	
	static WebDriver testdriver;
	@FindBy(xpath="//button[@id='addNewRecordButton']") WebElement addBtn;
	@FindBy(xpath="//input[@id='firstName']") WebElement firstName;
	@FindBy(xpath="//input[@id='lastName']") WebElement lastName;
	@FindBy(xpath="//input[@id='userEmail']") WebElement userEmail;
	@FindBy(xpath="//input[@id='age']") WebElement age;
	@FindBy(xpath="//input[@id='salary']") WebElement salary;
	@FindBy(xpath="//input[@id='department']") WebElement department;
	@FindBy(xpath="//button[@id='submit']") WebElement submitBtn;
	
	public DemoQAWebTablePage() {
		this.testdriver = driver;
		PageFactory.initElements(testdriver, this);
	}
	
	public void clickAdd() {
		addBtn.click();
	}
	public void createUser() {
		firstName.sendKeys("varsha");
		lastName.sendKeys("sk");
		userEmail.sendKeys("abc@gmail.com");
		age.sendKeys("25");
		salary.sendKeys("10000");
		department.sendKeys("IT");
		submitBtn.click();
	}
	
	public void finduser() {
		List<WebElement> users = driver.findElements(By.xpath("//div[@class='rt-tbody']//child::div[@class='rt-tr-group']"));	
		
		for(int i=0;i<users.size()-1;i++) {
			WebElement currentuser = driver.findElement(By.xpath("//div[@class='rt-tbody']//child::div[@class='rt-tr-group']["+(i+1)+"]//div[@class='rt-td'][1]"));
			String currentfirstname =currentuser.getText();
			if(currentfirstname.equalsIgnoreCase("varsha")) {
				driver.findElement(By.xpath("//span[@id='edit-record-"+(i+1)+"']")).click();
			}
		}
		
	}
	
	public void edituser() {
		firstName.clear();
		firstName.sendKeys("sunil");
	}
	
}
