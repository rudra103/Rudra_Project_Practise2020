package NewPractise;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotDemo {

	public static void main(String[] args) throws Exception {

		            System.setProperty("webdriver.chrome.driver","C:/Users/user/Desktop/chromedriver_win32/chromedriver.exe");	
                    WebDriver driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get("https://www.naukri.com/");
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//*[@data-uba-click='UploadCVClick' and @id='wdgt-file-upload']")).click();
                    
                    Robot r=new Robot();
                    
                    StringSelection s1=new StringSelection("C://Users//user//Desktop//names.pdf");
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
                    r.setAutoDelay(2000);
                    
                   r.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                   r.keyPress(java.awt.event.KeyEvent.VK_V);
                   
                   r.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
                   r.keyRelease(java.awt.event.KeyEvent.VK_V);
                   
                   r.keyPress(java.awt.event.KeyEvent.VK_TAB);
                   r.keyRelease(java.awt.event.KeyEvent.VK_TAB); 
                   r.keyPress(java.awt.event.KeyEvent.VK_TAB);
                   r.keyRelease(java.awt.event.KeyEvent.VK_TAB); 
                   
                   r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
                      
	            }
	   }
