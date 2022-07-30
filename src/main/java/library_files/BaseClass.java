package library_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	public void initalizeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\software_test_eclipse\\maven1\\browser\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
	}

}
