package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactdetails {
	@FindBy(name="firstname")
	private WebElement fname;

	@FindBy(name="lastname")
	private WebElement lname;


	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement symbol;

	@FindBy(name="button")
	private WebElement sav;


	public contactdetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getLname() {
		return lname;
	}


	public WebElement getSysmbol() {
		return symbol;
	}

	public WebElement getSav() {
		return sav;
	}


	public void clickn(String first, String second) {
		fname.sendKeys(first);
		lname.sendKeys(second);
		symbol.click();
	}





}
