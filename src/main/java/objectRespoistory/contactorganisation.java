package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactorganisation {
	@FindBy(name="search_text")
	private WebElement box;

	@FindBy(name="search")
	private WebElement sear;


	@FindBy(linkText="Amear")
	private WebElement clk;


	public contactorganisation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getBox() {
		return box;
	}


	public WebElement getSear() {
		return sear;
	}


	public WebElement getClk() {
		return clk;
	}

	public void changewin(String value)
	{
		box.sendKeys(value);
		sear.click();
		clk.click();
	}



}
