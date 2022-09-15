package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrganisationpage {

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement create;

	public createOrganisationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreate() {
		return create;
	}

	public void setclick()
	{
		create.click();
	}







}
