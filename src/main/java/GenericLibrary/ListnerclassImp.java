package GenericLibrary;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerclassImp implements ITestListener {


	ExtentSparkReporter reporter;// path, look and feel report
	ExtentReports reports;//attach reporter variable
	ExtentTest test;//to create entries

	@Override
	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" GOT PASSED");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+"Got Failed");
		test.log(Status.FAIL, result.getThrowable());
		try {
			String path=Baseclass.takingScreenshot(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
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

	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();	


	}



}
