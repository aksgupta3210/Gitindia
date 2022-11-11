package objectts;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hobj {
	
	public WebDriver driver;
	
	public Hobj (WebDriver driver)
	{
		this.driver=driver;	
	}                            

	By NoThanksClick=By.xpath("//button[normalize-space()='NO THANKS']");
	By lgBtn=By.xpath("//span[normalize-space()='Loginn']");
	
	
	public WebElement NotnkBtn()
	{
		return driver.findElement(NoThanksClick);
	}
	public WebElement lgBtn ()
	{
	return driver.findElement(lgBtn);	
	}
	
}
