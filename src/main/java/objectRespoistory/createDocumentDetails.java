package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createDocumentDetails {

	@FindBy(name="notes_title")
	private WebElement cd;

	@FindBy(name="assigntype")
	private WebElement grp;

	@FindBy(name="assigned_group_id")
	private WebElement sec;

	@FindBy(name="button")
	private WebElement sv;

	public createDocumentDetails(WebDriver driver) {
		PageFactory.initElements(driver, driver);
	}

	public WebElement getCd() {
		return cd;
	}

	public WebElement getGrp() {
		return grp;
	}

	public WebElement getSec() {
		return sec;
	}

	public WebElement getSv() {
		return sv;
	}

	public void setdetail(String tname) {
		cd.sendKeys(tname);
		grp.click();
		sec.click();
		sv.clear();
	}

}
