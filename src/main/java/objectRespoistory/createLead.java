package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createLead {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement cled;

	public createLead(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCled() {
		return cled;
	}





}
