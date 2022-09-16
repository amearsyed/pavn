package com.crm.vtiger.Testcases;
import org.testng.annotations.Test;
import GenericLibrary.Baseclass;
import GenericLibrary.Javautility;
import objectRespoistory.Homepage;
import objectRespoistory.Organisationinfopage;
import objectRespoistory.createOrganisationpage;
import objectRespoistory.organisationpage;
public class CreateOragnisationTest extends Baseclass{
	@Test(groups="smoke testing")
	public void createorg() throws Exception
	{

		String orgname = utility.readdatafromex("Sheet4", 1, 1)+Javautility.generateRandomNumber();

		Homepage hp=new Homepage(driver);
		hp.sethomepage();

		createOrganisationpage ol=new createOrganisationpage(driver);
		ol.setclick();

		organisationpage op=new organisationpage(driver);
		op.giveinfo(orgname);

		Organisationinfopage oi=new Organisationinfopage(driver);
		oi.orgverfication();

	}
}
