package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createDoucumentpage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement dc;

	public createDoucumentpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDc() {
		return dc;
	}



}
