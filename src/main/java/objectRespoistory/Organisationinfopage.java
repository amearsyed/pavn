package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationinfopage {

	@FindBy(css="span[class='dvHeaderText']")
	private WebElement orgname;

	@FindBy(id="mouseArea_Organization Name")
	private WebElement verforg;

	public Organisationinfopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getVerforg() {
		return verforg;
	}

	public void orgverfication()
	{
		String text = orgname.getText();
		String title = verforg.getText();
		if(title.contains(text)) {
			System.out.println("text contains :"+orgname);
		}

	}

}





