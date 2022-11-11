package resourcess;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportt {
	
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentSparkReporter reporter;
	
	public ExtentReports RepoConfig()
	{
		String path = System.getProperty("user.dir")+"\\repor\\index.html";
        reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Auto ");
		reporter.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Aakash");
		return extent;
	}
	
	

}
