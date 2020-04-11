package NewPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableHandling {

	public static void main(String[] args) throws Exception {
           System.setProperty("webdriver.chrome.driver", 
				               "C:/Users/user/Desktop/chromedriver_win32/chromedriver.exe");	
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.w3schools.com/html/html_tables.asp");
	       String beforexpath="//table[@id='customers']/tbody/tr[";
	       String afterxpath="]/td[3]";
	       List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	       int rCount=rows.size();
	       System.out.println("Rows Count : "+rCount);
	       for(int i=2;i<=rCount;i++){
	    	   
	    	   String actXpath=beforexpath+i+afterxpath;
	    	   WebElement ele=driver.findElement(By.xpath(actXpath));
	    	   System.out.println(ele.getText());
	    	   if(ele.getText().equals("UK"))
	    	   {
	    		   System.out.println(ele.getText()+" is Found, break loop ");
	    		   break;
	    	   }
	       }
	 
	       //******
	       String beforexpath2="//table[@id='customers']/tbody/tr[1]/th[";
	       String afterxpath2="]";
	       List<WebElement> coumns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
	       int cCount=coumns.size();
	       System.out.println("Columns Count : "+cCount);
	       for(int i=1;i<=cCount;i++){
	    	 //table[@id='customers']/tbody/tr[1]/th[3]
	    	   String actXpath=beforexpath2+i+afterxpath2;
	    	   WebElement ele=driver.findElement(By.xpath(actXpath));
	    	   System.out.println(ele.getText());
	    	  
	       }
	       
	     //table[@id='customers']/tbody/tr[1]/th
           Thread.sleep(2000);
           driver.close();
	}

}
