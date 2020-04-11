package NewPractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window "+parent);
		Set<String> handles=driver.getWindowHandles();
		
		for(String child :handles){
			
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				System.out.println("Child window "+child);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
			
		}
        
	}

}
