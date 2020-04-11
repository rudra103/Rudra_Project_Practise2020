package NewPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownhandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.name("birthday_day"));
		WebElement month=driver.findElement(By.name("birthday_month"));
		
		/*Select selDay=new Select(day);
		selDay.selectByValue("15");
		
		Select selMonth=new Select(month);
		selMonth.selectByVisibleText("Jun");
		
		Thread.sleep(2000);*/
		//dropDown(month, "Dec");
		
		Select selMonth=new Select(month);
		List<WebElement> monList=selMonth.getOptions();
		int count=monList.size()-1;
		System.out.println("No of Months "+count);
		for(int i=0;i<=count;i++){
			System.out.println(monList.get(i).getText());
			if(monList.get(i).getText().equalsIgnoreCase("Nov")){
				monList.get(i).click();
			}
			
		}
		
        driver.close();
     
	}
    //Generic Method
	public static void dropDown(WebElement element,String value){
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
}
