package com.crm.vtiger.Testcases;
import org.testng.annotations.Test;
import GenericLibrary.Baseclass;
import objectRespoistory.Homepage;
import objectRespoistory.clickoncreatesym;
import objectRespoistory.contactdetails;
import objectRespoistory.contactorganisation;

public class CreateContactwithorgTest extends Baseclass {
	@Test
	public void createcontact() throws Exception
	{

		Homepage hp=new Homepage(driver);
		hp.setclick();

		clickoncreatesym co=new clickoncreatesym(driver);
		co.setclick();

		String fnam = utility.readdatafromex("Sheet4", 7, 1);
		String snam = utility.readdatafromex("Sheet4", 7, 2);
		String indusrtytpye = utility.readdatafromex("Sheet4", 4, 2);

		contactdetails cod=new contactdetails(driver);
		cod.clickn(fnam,snam);

		wbutility.switchingWindow(driver, "Accounts");
		contactorganisation coi=new contactorganisation(driver);
		coi.changewin("Amear");
	
		wbutility.switchingWindow(driver, "Contacts");
		
		contactdetails cof=new contactdetails(driver);
		cof.getSav().click();

	}

}
