package com.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsScripts {
    //Hard Assertion
	@Test
	public void TC01(){
		Assert.assertEquals(12,13);
	}
	
	@Test
	public void TC02(){
		System.out.println("TestCase  02 Started..");
		Assert.assertEquals(12,13,"My Message..When Tets Fails");
		System.out.println("TestCase  02 Completed..");
	}
	
	@Test
	public void TC03(){
		System.out.println("TestCase  03 Started..");
		Assert.assertEquals("Hello","Hello","Words Didn't Match..");
		System.out.println("TestCase  03 Completed..");
	}
}
