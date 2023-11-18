package testng;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementationOfListners implements ITestListener{

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish" + " from method "+ context.getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart" + " from method "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess" + " from method "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure" + " from method "+ result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart" + " from method "+ context.getName());
	}
	
}
