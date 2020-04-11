package NewPractise;

import org.testng.annotations.Test;

public class testngSample5 {

	@Test(timeOut=6000)
	public void infiniteTest(){
			int i=1;
		while(i==1){
			System.out.println(i);
		}
	}
	
}
