package objectRespoistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(name="user_name")
	private WebElement logn;

	@FindBy(name="user_password")
	private WebElement pwd;

	@FindBy(id="submitButton")
	private WebElement signin;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogn() {
		return logn;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSignin() {
		return signin;
	}

	//Rule5: create business logic method
	/**
	 *  This is the business logic for login
	 *  @author Syed Amear
	 * @param username
	 * @param password
	 */
	public void setlogin(String username, String password) {
		logn.sendKeys(username);
		pwd.sendKeys(password);
		signin.click();
	}

}
