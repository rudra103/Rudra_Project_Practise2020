package NewPractise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngSample3 {

	@Test
	public void Logintest(){
		System.out.println("Login Test got passed");
		int i=4/0;
	}
		
	@Test(dependsOnMethods="Logintest")
	public void homeTest(){
		System.out.println("Home test got passed");
	}
}
