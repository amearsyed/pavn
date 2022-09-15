package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericLibrary.WebDriverUtility;

public class Homepage {

	WebDriverUtility util=new WebDriverUtility();

	@FindBy(linkText="Organizations")
	private WebElement orglk;


	@FindBy(linkText="Contacts")
	private WebElement clickcon;

	@FindBy(linkText="Leads")
	private WebElement led;

	@FindBy(linkText="Documents")
	private WebElement dct;


	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admin;

	@FindBy(linkText="Sign Out")
	private WebElement logout;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getLed() {
		return led;
	}

	public WebElement getDct() {
		return dct;
	}


	public WebElement getClickcon() {
		return clickcon;
	}

	public WebElement getOrglk() {
		return orglk;
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void sethomepage()
	{
		orglk.click();
	}

	public void setclick() {
		clickcon.click();
	}

	public void setlogout(WebDriver driver)
	{
		util.mouseoverAction(driver, admin);
		logout.click();

	}





}
