package com.testngdemo.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LandingPageTest {
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
		Assert.assertTrue(true);
	}
	
	@Test(dataProvider="MultipleUsersLoginCredentials")
	public void test2(String id, String password)
	{
		System.out.println("ID "+id);
		System.out.println("Password "+password);
		Assert.assertTrue(true);
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("Test3");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4()
	{
		System.out.println("Test4");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test5()
	{
		System.out.println("Test5");
		Assert.assertTrue(false);
	}
	
	@DataProvider(name="MultipleUsersLoginCredentials")
	public Object[][] getLoginData()
	{
		return new Object[][] {
			   { "52","Cedric" },
			   { "56", "Anne" },
			 };

	}
	
	

}
