package com.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsScripts2 {

	String str="TM in Hyderabad";
	@Test
	public void TC01(){
		Assert.assertTrue(str.contains("TM2"),"Message From Assertion Script..");
	}
	
	@Test
	public void TC02(){
		Assert.assertTrue(false);
	}
	
}
