package com.crm.vtiger.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import GenericLibrary.Baseclass;
import GenericLibrary.ExcelFileUtility;
import GenericLibrary.PropertyFileUtility;
import GenericLibrary.WebDriverUtility;
import objectRespoistory.Homepage;
import objectRespoistory.Loginpage;
import objectRespoistory.createLead;
import objectRespoistory.creatleadDetails;

public class LeadvalidTestcase1 extends Baseclass {
	@Test
	public void leadtest() throws Throwable {
//		WebDriver driver =new ChromeDriver();
//		PropertyFileUtility putil=new PropertyFileUtility();
//		ExcelFileUtility utility=new ExcelFileUtility();
//		WebDriverUtility wbutility=new WebDriverUtility();
		Homepage hp=new Homepage(driver);
		
//		String URL=putil.readdatafromproperty("url");
//		String UN=putil.readdatafromproperty("username");
//		String PWD=putil.readdatafromproperty("password");
//		wbutility.maximizeWindow(driver);
//		wbutility.waitForpageLoad(driver);
//		driver.get(URL);
//
//		Loginpage ln=new Loginpage(driver);
//		ln.setlogin(UN, PWD);

		hp.getLed().click();
		createLead cl=new createLead(driver);
		cl.getCled().click();
		
		String fnam = utility.readdatafromex("Sheet1", 1, 1);
		String cname = utility.readdatafromex("Sheet1", 1, 2);
		String mail = utility.readdatafromex("Sheet1", 4, 1);
		String smail = utility.readdatafromex("Sheet1", 4, 2);

		creatleadDetails cld=new creatleadDetails(driver);
		cld.selectname(fnam, cname, mail, smail);

//		hp.setlogout(driver);
//		driver.close();


	}

}
