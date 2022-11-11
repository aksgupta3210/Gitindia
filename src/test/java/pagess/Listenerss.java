package pagess;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resourcess.BaseCls;
import resourcess.ExtendsReportt;

public class Listenerss extends BaseCls implements ITestListener  {
public WebDriver driver;
	ExtendsReportt AA= new ExtendsReportt();
	ExtentReports extent = AA.RepoConfig();
	public ExtentTest test;
	
	ThreadLocal <ExtentTest> ExtentTest=new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result)
	{
		test=extent.createTest(result.getMethod().getMethodName());
		 ExtentTest.set(test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	test.log(Status.PASS, "test Pass");
	System.out.print("pass code");
	
	}
	/*
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
		System.out.print("this test fail");
		test.fail(result.getThrowable());
		String TestMethodName= result.getMethod().getMethodName();
		WebDriver driver =null;
		
		try {
		driver=(WebDriver)	result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				ExtentTest.get().addScreenCaptureFromPath(getScreenshot(TestMethodName , driver), result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	}
	*/

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
		System.out.print("this test fail");
		String TestMethodName= result.getMethod().getMethodName();
		WebDriver driver=null;
		
		try
		{
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			
		}
		catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			ExtentTest.get().addScreenCaptureFromPath(getScreenShotNew(TestMethodName, driver),result.getMethod().getMethodName());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		System.out.println("texting end");
		extent.flush();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	

	

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
	}
	

}
