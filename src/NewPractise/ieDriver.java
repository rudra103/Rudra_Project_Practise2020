package NewPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieDriver {

	public static void main(String[] args) throws Exception {

	   System.setProperty("webdriver.ie.driver", 
			               "C:/Users/user/Desktop/chromedriver_win32/IEDriverServer.exe");	
       WebDriver driver=new InternetExplorerDriver();
       driver.manage().window().maximize();
       driver.get("https://www.w3schools.com/java/");
       
		 
		 Thread.sleep(4000);
		 driver.close();
		 System.out.println("Browser got closed..");
  
	}

}
