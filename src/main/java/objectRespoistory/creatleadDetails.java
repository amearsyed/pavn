package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatleadDetails {

	@FindBy(name="lastname")
	private WebElement lname;

	@FindBy(name="company")
	private WebElement cmp;

	@FindBy(id="email")
	private WebElement mail;

	@FindBy(id="secondaryemail")
	private WebElement sma;


	@FindBy(css="input[value='  Save  ']")
	private WebElement sve;


	public creatleadDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getLname() {
		return lname;
	}


	public WebElement getCmp() {
		return cmp;
	}


	public WebElement getMail() {
		return mail;
	}


	public WebElement getSma() {
		return sma;
	}


	public WebElement getSve() {
		return sve;
	}

	public void selectname(String value, String companyname,String email,String smail) {
		lname.sendKeys(value);
		cmp.sendKeys(companyname);
		mail.sendKeys(email);
		sma.sendKeys(smail);
		sve.click();
	}



}
