package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactverf {
	@FindBy(id="mouseArea_Last Name")
	private WebElement nme;

	@FindBy(css="span[class='dvHeaderText']")
	private WebElement ver;

	public contactverf(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void contactverfic() {
		String text = nme.getText();
		String title = ver.getText();
		if(text.contains(title)) {
			System.out.println("text contains :"+nme);
		}
	}

}
