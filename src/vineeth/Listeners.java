package vineeth;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener   {

	@Override
	public void onTestStart(ITestResult result) {
		 
		System.out.println("Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Listener On Test Failure " +result.getTestName());
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		 
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Listener On start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		 
	}
	

}
