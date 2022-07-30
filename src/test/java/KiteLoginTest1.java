


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library_files.BaseClass;
import library_files.UtilityClass;
import maven1.maven1.KiteHomePage;
import maven1.maven1.KiteLogin1Page;
import maven1.maven1.KiteLogin2Page;





public class KiteLoginTest1 extends BaseClass
{
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
		
		initalizeBrowser();
		
		login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
		home=new KiteHomePage(driver);
				
	}
	
	@BeforeMethod
	public void logintoApp() throws EncryptedDocumentException, IOException
	{
		login1.setkiteloginpageusername(UtilityClass.getTD(0, 1));
		login1.setkiteloginpagepassword(UtilityClass.getTD(1, 1));
		login1.clickkiteloginpageclickbtn();
		login2.setkitelogin2pagepin(UtilityClass.getTD(2, 1));
		login2.clickkitelogin2pagecntbtn();
	}
	
	@Test
	public void verifyUserid() throws EncryptedDocumentException, IOException
	{
		home.verifykitehomepageuserid(UtilityClass.getTD(0, 2));
		
	}
	
	@AfterClass
	public void logoutApp()
	{
		
	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			UtilityClass.captureScreenshot(driver, TCID);
		}
				
	}
	
	
	
	
	

}
