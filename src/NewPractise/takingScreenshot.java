package NewPractise;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takingScreenshot {

	static WebDriver driver;
	 
	public static void main(String[] args) throws Exception {
 System.setProperty("webdriver.chrome.driver", 
	               "C:/Users/user/Desktop/chromedriver_win32/chromedriver.exe");	
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.naukri.com/");
            takeScreenshot("google");

	}
	
	public static void takeScreenshot(String fileName) throws Exception{
		//takescreenshot and store it in a fileformat
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//copyscreenshot to desired location using copyfile method
		FileUtils.copyFile(src, new File(".//test-output//Screenshots//"+fileName+System.currentTimeMillis()+".png"));
	}
}
