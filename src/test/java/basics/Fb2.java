package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb2 
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Javaworkspace\\\\com.infi.hos\\\\driverfiles\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void userTextbox()
  {
  driver.findElement(By.id("email")).sendKeys("selenium");
  }
  
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
