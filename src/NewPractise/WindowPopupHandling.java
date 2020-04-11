package NewPractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopupHandling {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
        System.out.println(driver.getTitle());
        Set<String> handles=driver.getWindowHandles();
        
        Iterator<String> iter=handles.iterator();
        String pWindow=iter.next();
        System.out.println("Parent Window "+pWindow);
        String cWindow=iter.next();
        System.out.println("Child Window "+cWindow);
        driver.switchTo().window(cWindow);
        System.out.println("Child Window Title "+driver.getTitle());
        driver.close();
        driver.switchTo().window(pWindow);
        System.out.println(driver.getTitle());
	}

}
