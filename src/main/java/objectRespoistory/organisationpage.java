package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.WebDriverUtility;

public class organisationpage {

	WebDriverUtility util=new WebDriverUtility();

	@FindBy(name="accountname")
	private WebElement acname;

	@FindBy(name="industry")
	private WebElement indus;

	@FindBy(name="button")
	private WebElement svt;

	public organisationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return acname;
	}

	public WebElement getInd() {
		return indus;
	}

	public WebElement getSvt() {
		return svt;
	}

	public void giveinfo(String orgname)
	{
		acname.sendKeys(orgname);	
		svt.click();
	}

	public void setindustry(String orgname, String indus) {
		acname.sendKeys(orgname);	
		util.selectingByValue(getInd(), indus);
		svt.click();
	}



}
