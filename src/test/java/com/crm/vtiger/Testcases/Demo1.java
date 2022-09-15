package com.crm.vtiger.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeSuite
	public void connectdat() {
		System.out.println("create connection with db");
	}
	@BeforeTest
	public void crossbrow() {
		System.out.println("cross browsering opening");
	}
	
	@BeforeClass
	public void crossbrower() {
		System.out.println("opening browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login into application");
	}
	
	@Test(priority = 1)
	public void orgTest() {
		System.out.println("Orgnisation created");
	}
	
	@Test(priority = 2)
	public void industryTest() {
		System.out.println("Organisation with industry");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from appklication");
	}
	
	@AfterClass
	public void closebroe() {
		System.out.println("close the browser");
	}
	@AfterTest
	public void closecrossbrow() {
		System.out.println("cross browsering closed");
	}
	
	@AfterSuite
	public void closed() {
		System.out.println("close tyhe connection with db");
	}
	
	
	
	
	
	
	
	
	
	

}
