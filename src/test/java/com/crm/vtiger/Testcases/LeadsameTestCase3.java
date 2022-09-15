package com.crm.vtiger.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.ExcelFileUtility;
import GenericLibrary.PropertyFileUtility;
import GenericLibrary.WebDriverUtility;
import objectRespoistory.Homepage;
import objectRespoistory.Loginpage;
import objectRespoistory.createLead;
import objectRespoistory.creatleadDetails;

public class LeadsameTestCase3 {
	@Test
	public void invalidtest() throws Exception {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wbutility=new WebDriverUtility();
		PropertyFileUtility putility=new PropertyFileUtility();
		ExcelFileUtility utility=new ExcelFileUtility();
		
		String URL = putility.readdatafromproperty("url");
		String UN = putility.readdatafromproperty("username");
		String PWD = putility.readdatafromproperty("password");
		
		wbutility.maximizeWindow(driver);
		wbutility.waitForpageLoad(driver);
		driver.get(URL);
		
		Loginpage ln=new Loginpage(driver);
		ln.setlogin(UN, PWD);
		
		Homepage Hp=new Homepage(driver);
		Hp.getLed().click();
		
		createLead cl=new createLead(driver);
		cl.getCled().click();
		
			String fname = utility.readdatafromex("Sheet3", 1, 1);
			String cname = utility.readdatafromex("Sheet3", 1, 2);
			String mail = utility.readdatafromex("Sheet3", 4, 1);
			String smail = utility.readdatafromex("Sheet3", 4, 2);
		
		creatleadDetails cld=new creatleadDetails(driver);
		cld.selectname(fname, cname, mail, smail);
		
		Hp.setlogout(driver);
		driver.close();
		

		
	}
		
	

}
