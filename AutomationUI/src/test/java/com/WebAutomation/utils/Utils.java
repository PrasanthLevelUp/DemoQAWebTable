package com.WebAutomation.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.WebAutomation.drivers.DriverClass;

public class Utils extends DriverClass {

	public static void takeSnapShot() {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		String filename = "image"+System.currentTimeMillis();
		String fileWithPath = "./ss/"+filename+".png";
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
