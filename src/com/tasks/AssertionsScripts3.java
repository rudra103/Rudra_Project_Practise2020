package com.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsScripts3 {
    //Soft Assertion
	SoftAssert sAssert=new SoftAssert();
	@Test
	public void TC01(){
		System.out.println("TestCase  01 Started..");
		sAssert.assertEquals(12,13,"My Message..When Tets Fails");
		System.out.println("TestCase  01 Completed..");
		sAssert.assertAll();
	}
	
	@Test
	public void TC02(){
		System.out.println("TestCase  02 Started..");
		Assert.assertEquals("Bollo","Hello","Words Didn't Match..");
		System.out.println("TestCase  02 Completed..");
	}
}
