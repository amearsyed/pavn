package com.crm.vtiger.Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;import GenericLibrary.ExcelFileUtility;
import GenericLibrary.PropertyFileUtility;
import GenericLibrary.WebDriverUtility;
import objectRespoistory.Homepage;

public class TestCaseDocument {
	@Test
	public void documenttest() {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wbutility=new WebDriverUtility();
		PropertyFileUtility putil=new PropertyFileUtility();
		ExcelFileUtility utility=new ExcelFileUtility();
		 Homepage hp=new Homepage(driver);

	}

}
