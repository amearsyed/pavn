package com.crm.vtiger.Testcases;

import org.testng.annotations.Test;

public class Demoretry {
	@Test(retryAnalyzer = GenericLibrary.RetryAnal.class)
	public void demo() {
		
		System.err.println("test run");
		int a=10/0;
		System.out.println(a);
	}

}
