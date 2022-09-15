package com.crm.vtiger.Testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.Baseclass;
@Listeners(GenericLibrary.ListnerclassImp.class)
public class DemoTest extends Baseclass {
	@Test(invocationCount = 1)
	public void orgnsTest() {
		System.out.println("organisation created");
		int a=5/0;
		//System.out.println(a);
	}
		
	
	@Test(enabled = true)
	public void industryTest() {
		System.out.println("org with industry created");
	}
	
	@Test(dependsOnMethods = "industryTest")
	public void contactTest() {
		System.out.println("created contact");
	}
}
