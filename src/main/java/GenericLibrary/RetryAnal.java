package GenericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnal implements IRetryAnalyzer {
	
	int count=0;
	int retryLimit=2;
	@Override
	public boolean retry(ITestResult result) {
		if(count<retryLimit) {
			count++;
		return true;
	}
		return false;
	}
	

}
