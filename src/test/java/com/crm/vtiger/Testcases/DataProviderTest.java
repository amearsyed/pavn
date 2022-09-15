package com.crm.vtiger.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "provideMeData")
	public void getMultipleData(String name,int regid)
	{
		System.out.println("Name is "+name+" regid is "+regid);
	}
	
	@DataProvider
	public Object[][] provideMeData()
	{
		Object [][]obj=new Object[3][2];
		
		obj[0][0]="Akash";
		obj[0][1]=101;
		
		obj[1][0]="Amear";
		obj[1][1]=102;
		
		obj[2][0]="Swarnalatha";
		obj[2][1]=103;
		
		return obj;
		
	}

}
