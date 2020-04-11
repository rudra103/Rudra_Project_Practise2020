package NewPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOverDragDropActionsClass {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		
		Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//li[@class='hdrMoreLink']"))).build().perform();
		
	    driver.findElement(By.xpath("//a[@href='/trains/check-pnr-status/']")).click();
	    
	    Thread.sleep(2000);
	    driver.close();
	}
}
