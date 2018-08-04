package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
	static WebDriver driver;

		public void takeScreenShot() {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentdir=System.getProperty("user.dir");
		try {
			FileUtils.copyFile(src, new File(currentdir +"/ScreenShots/" + System.currentTimeMillis() +".jpg"));
			//FileUtils.copyFile(src, new File("D:\\Dheeru\\Work\\TestNgTest\\ScreenShots" + testMethodName +"_"+".jpg"));
			//
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
