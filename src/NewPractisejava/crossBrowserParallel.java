package NewPractisejava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserParallel {
	WebDriver driver=null;
	String path="C:/Users/user/Desktop/chromedriver_win32";
	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser){
		if(browser.equals("chrome")){
				System.out.println("Thread ID : "+Thread.currentThread().getId());	
				System.out.println("Test started : -"+browser);
				System.setProperty("webdriver.chrome.driver",path+"/chromedriver.exe");
                     driver=new ChromeDriver();
                    
               }
			else {
				if(browser.equals("firefox")){
					System.out.println("Thread ID : "+Thread.currentThread().getId());
					System.out.println("Test started : -"+browser);
					driver= new FirefoxDriver();
				}
				else if(browser.equals("ie")){
					System.out.println("Thread ID : "+Thread.currentThread().getId());
					System.out.println("Test started : -"+browser);
					System.setProperty("webdriver.ie.driver",path+"/IEDriverServer.exe");
					driver= new InternetExplorerDriver();
				}
			}
		}
	
	@Test
	
       public void testMethod(){
		driver.get("https://www.javatpoint.com/");
		
	}
		
		@AfterMethod
		@Parameters("browser")
		public void endUp(String bro) throws Exception{
		    Thread.sleep(2000);
			driver.close();
			System.out.println("Test "+bro+" browser got completed successfully");
		}
	}
	

