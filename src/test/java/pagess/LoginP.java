package pagess;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import objectts.Hobj;
import resourcess.BaseCls;


public class LoginP extends BaseCls  {
	public WebDriver driver;
	@Test
	public void loginit() throws IOException
	{
		driver=DriveIntil();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Hobj h=new Hobj(driver);

		h.NotnkBtn().click();
		
	}

}