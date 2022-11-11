package pagess;

import java.io.IOException;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import objectts.Hobj;
import resourcess.BaseCls;

public class Homep extends BaseCls {
	
	public WebDriver driver;
	
	//connection git 1
	@Test
	public void inti() throws IOException
	{
driver=DriveIntil();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
Hobj h=new Hobj(driver);

h.NotnkBtn().click();

//driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();

h.lgBtn().click();
System.out.print("ttt");
	}
}
