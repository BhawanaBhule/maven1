package maven1.maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 1
public class KiteLogin1Page 
{
	@FindBy(xpath="//input[@label='User ID']")private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement Loginbtn;
	
	
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setkiteloginpageusername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void setkiteloginpagepassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickkiteloginpageclickbtn()
	{
		Loginbtn.click();
	}

}
