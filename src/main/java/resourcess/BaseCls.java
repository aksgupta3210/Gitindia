package resourcess;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseCls {
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver DriveIntil() throws IOException

	{
		
		pro=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\Win_!0\\eclipse-workspace\\rajjesh\\src\\main\\java\\datass\\conf.Properties");
		pro.load(fs);
		
		String browsername= pro.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win_!0\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
		driver =new ChromeDriver();
		}
		driver.get(pro.getProperty("url"));
		return driver;
}

	public String getScreenShotNew (String testCaseName , WebDriver driver) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String DestFile= System.getProperty("user.dir")+"\\reportShot\\"+ testCaseName+".png";
FileUtils.copyFile(source, new File(DestFile));
		return DestFile;
	}
	
	


}