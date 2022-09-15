package com.crm.vtiger.Testcases;
import org.testng.annotations.Test;
import GenericLibrary.Baseclass;
import GenericLibrary.Javautility;
import objectRespoistory.Homepage;
import objectRespoistory.Organisationinfopage;
import objectRespoistory.createOrganisationpage;
import objectRespoistory.organisationpage;

public class CreateorgnamewithIndustryTest extends Baseclass {
	@Test
	public void createorgindustry() throws Throwable {

	String orgname="RMG"+Javautility.generateRandomNumber();
	String Industrytype = utility.readdatafromex("Sheet4", 4, 2);

		Homepage hp=new Homepage(driver);
		hp.sethomepage();

		createOrganisationpage oip=new createOrganisationpage(driver);
		oip.setclick();

		organisationpage op=new organisationpage(driver);
		op.setindustry(orgname, Industrytype);

		Organisationinfopage oil=new Organisationinfopage(driver);
		oil.orgverfication();

	}
}
