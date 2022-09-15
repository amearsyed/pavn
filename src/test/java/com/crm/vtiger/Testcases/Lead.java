package com.crm.vtiger.Testcases;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.Baseclass;
import objectRespoistory.Homepage;
import objectRespoistory.createLead;
import objectRespoistory.creatleadDetails;
@Listeners(GenericLibrary.ListnerclassImp.class)
public class Lead extends Baseclass {
	@Test(groups = "smoke")
	public void leadtest() throws Throwable {
	Homepage Hp=new Homepage(driver);
	Hp.getLed().click();
	
	createLead cl=new createLead(driver);
	cl.getCled();

	
		String fname = utility.readdatafromex("Sheet3", 1, 1);
		String cname = utility.readdatafromex("Sheet3", 1, 2);
		String mail = utility.readdatafromex("Sheet3", 4, 1);
		String smail = utility.readdatafromex("Sheet3", 4, 2);
	
	creatleadDetails cld=new creatleadDetails(driver);
	cld.selectname(fname, cname, mail, smail);
	
	}
//	@Test(groups = "regression")
//	public void leadinvalid() throws Exception {
//		Homepage Hp=new Homepage(driver);
//       Hp.getLed().click();
//		
//		createLead cl=new createLead(driver);
//		cl.getCled().click();
//
//		String fnam = utility.readdatafromex("Sheet2", 1, 1);
//		String cname = utility.readdatafromex("Sheet2", 1, 2);
//		String mail = utility.readdatafromex("Sheet2", 4, 1);
//		
//		String smail = utility.readdatafromex("Sheet2", 4, 2);
//		Thread.sleep(3000);
//		creatleadDetails ccd=new creatleadDetails(driver);
//		ccd.selectname(fnam, cname, mail, smail);
//	
	}

