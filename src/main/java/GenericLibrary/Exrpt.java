package GenericLibrary;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class Exrpt {
	
	ExtentSparkReporter reporter;// path, look and feel report
	ExtentReports reports;//attach reporter variable
	ExtentTest test;//to create enteries
	
	@Test
	public void generatereport() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		reporter=new ExtentSparkReporter("./Reports/facebook.html");
		reporter.config().setDocumentTitle("google");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("smoke");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("browser version", "105");
		reports.setSystemInfo("reporter name", "Amear");
		reports.setSystemInfo("buildno", "5.3.1");
		reports.setSystemInfo("OS", "Windows_11");
		
		
		test=reports.createTest("Amazon");
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path="../SDET-8/screenshot/ABC1.PNG";
		
		File dest=new File(path);
		Files.copy(src, dest);
		
		test.addScreenCaptureFromPath(path);
		test.log(Status.FAIL, "Got failed");
		reports.flush();	
	}

}
