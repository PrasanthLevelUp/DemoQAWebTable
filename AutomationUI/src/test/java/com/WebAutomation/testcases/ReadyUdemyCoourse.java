package com.WebAutomation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadyUdemyCoourse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cognizant.udemy.com/course/master-the-coding-interview-data-structures-algorithms/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//span[contains(text(),'more sections')]//parent::button")).click();
		Thread.sleep(5000);*/
		driver.findElement(By.xpath("//span[contains(text(),'Expand all sections')]//parent::button")).click();
		Thread.sleep(5000);
		List<WebElement> courses = driver.findElements(By.xpath("//h2[contains(text(),'Course content')]//parent::div//span"));
		System.out.println(courses.size());
		
		for(WebElement e: courses) {
			String dtr = e.getText();
			if(!dtr.equals("")) {
			System.out.println(dtr);
			}
		}
		
		driver.close();
	}

}
