package com.crm.vtiger.Testcases;
import org.testng.annotations.Test;
import GenericLibrary.Baseclass;
import objectRespoistory.Homepage;
import objectRespoistory.Loginpage;
import objectRespoistory.createLead;
import objectRespoistory.creatleadDetails;

public class LeadinvalidTestcase2 extends Baseclass {
	@Test
	public void leadinvalid() throws Exception {

		Homepage hp=new Homepage(driver);

		String URL=putil.readdatafromproperty("url");
		String UN=putil.readdatafromproperty("username");
		String PWD=putil.readdatafromproperty("password");
		wbutility.maximizeWindow(driver);
		wbutility.waitForpageLoad(driver);
		driver.get(URL);
		Loginpage li=new Loginpage(driver);
		li.setlogin(UN, PWD);
		
		hp.getLed().click();
		
		createLead cl=new createLead(driver);
		cl.getCled().click();

		String fnam = utility.readdatafromex("Sheet2", 1, 1);
		String cname = utility.readdatafromex("Sheet2", 1, 2);
		String mail = utility.readdatafromex("Sheet2", 4, 1);
		
		String smail = utility.readdatafromex("Sheet2", 4, 2);
		Thread.sleep(3000);
		creatleadDetails ccd=new creatleadDetails(driver);
		ccd.selectname(fnam, cname, mail, smail);
	}

}
