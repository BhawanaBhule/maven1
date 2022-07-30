package maven1.maven1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath="//span[@class=\"user-id\"]") private WebElement idget;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifykitehomepageuserid(String expuserid)
	{
		 String actuser =idget.getText();
		
		
		if(actuser.equals(expuserid))
		{
			System.out.println("PASS");
			
		}
		
		else 
		{
			System.out.println("FAIL");
		}
	}
	
	

}
