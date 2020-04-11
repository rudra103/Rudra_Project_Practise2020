package NewPractise;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityScreenshot {

	public static String getScreenshot(WebDriver driver) throws Exception {
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	    String  path=System.getProperty("user.dir")+"//test-output//extentReports//"+System.currentTimeMillis()+".png";
	    File destination=new File(path);
	    FileUtils.copyFile(source, destination);
		  
		return path;

	}

}
