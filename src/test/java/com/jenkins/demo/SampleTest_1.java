package com.jenkins.demo;

import org.testng.annotations.Test;

public class SampleTest_1 {
	
	@Test(priority = 1)
	public void test_one()
	{
		System.out.println("test_one");
	}
	
	@Test(priority = 2)
	public void test_two()
	{
		System.out.println("test_two");
	}
	
	@Test(priority = 3)
	public void test_three()
	{
		System.out.println("test_three");
	}

}
