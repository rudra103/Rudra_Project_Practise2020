
	package retryLogicFailed;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class retryFailedTest
	{
		@BeforeMethod
		public void bMethod() throws Exception{
			
		}
		//Test Level
		//@Test(retryAnalyzer=retryLogicFailed.retryAnalyzer.class)
		@Test
		public void homepageTest(){
			Assert.assertTrue(false);
	    }
		
		@Test
		public void loginTest(){
			Assert.assertTrue(false);
	    }
		
		@Test
		public void verifyTitleTest(){
			Assert.assertTrue(true);
	    }
	
		
		@AfterMethod
		public void aMethod(){
			
		}
	}
