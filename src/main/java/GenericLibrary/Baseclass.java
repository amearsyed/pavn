package GenericLibrary;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;
import objectRespoistory.Homepage;
import objectRespoistory.Loginpage;

public class Baseclass {

	public WebDriver driver;
	public WebDriverUtility wbutility=new WebDriverUtility();
	public PropertyFileUtility putil=new PropertyFileUtility();
	public ExcelFileUtility utility=new ExcelFileUtility();
	public static WebDriver sdriver;
	
	@BeforeSuite(groups="smoke test")
	public void createconwithdb() {
		System.out.println("********create con;nection with db");
	}
	
	//@Parameters("BROWSER")
	@BeforeClass(groups="smoke test")
	public void openbrowser() throws Exception {
		System.out.println("*******open browser");
		driver=new ChromeDriver();
		String BROWSER = putil.readdatafromproperty("browser");
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}

		wbutility.maximizeWindow(driver);
		driver.get(putil.readdatafromproperty("url"));
		sdriver=driver;
		wbutility.waitForpageLoad(driver);

	}

	@BeforeMethod(groups="smoke test")
	public void login() throws Exception {
		System.out.println("***login ");
		Loginpage ln=new Loginpage(driver);
		ln.setlogin(putil.readdatafromproperty("username"), putil.readdatafromproperty("password"));

	}

	@AfterMethod(groups="smoke test")
	public void logout() {
		System.out.println("***logout ");
		Homepage hp=new Homepage(driver);
		hp.setlogout(driver);
	}

	@AfterClass(groups="smoke test")
	public void closebrowser() {
		System.out.println("*******close browser");
		driver.close();

	}

	@AfterSuite(groups="smoke test")
	public void closeconwithdb() {
		System.out.println("********create connection with db");
	}

	public static String takingScreenshot(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path="./screenshot/"+name+".png";
		File dest= new File(path);
		Files.copy(src, dest);
		return path;
	}

}
