package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilitySC {

	public static void captureScreenshot(WebDriver driver,String screenShotName) throws Exception{
		
		try {
			TakesScreenshot sc=(TakesScreenshot)driver;
			 File source=sc.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(source, new File("./ScreenShots/"+screenShotName+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
