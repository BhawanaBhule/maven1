package maven1.maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy(xpath="//input[@id=\"pin\"]") private WebElement PIN;            //decleration of globle variables
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement clickbtn;
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setkitelogin2pagepin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickkitelogin2pagecntbtn()
	{
		clickbtn.click();
	}

}
