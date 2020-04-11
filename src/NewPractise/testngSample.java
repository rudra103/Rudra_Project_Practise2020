package NewPractise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngSample {

	   @BeforeSuite
	   public void beforeSuite(){
			System.out.println("Before Suite Executed");
		}
	   
	    @BeforeMethod
	    public void beforeMethod(){
			System.out.println("Before Method Executed");
		}
	   
		@Test
		public void testMethod(){
			System.out.println("Test Executed");
		}

		@Test
		public void testmethod2(){
			System.out.println("Test2 Executed");
		}
		
		@AfterMethod
	    public void afterMethod(){
			System.out.println("After Method Executed");
		}
		
		@AfterSuite
		public void afterSuite(){
			System.out.println("After Suite Executed");
		}
}
