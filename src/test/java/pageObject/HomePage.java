package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage

{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	// finding elements
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement lnk_myaccount;
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Register']") WebElement lnk_register;
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']") WebElement lnk_login;
	
	
	// actions
	
	public void clickMyaccount()
	{
		lnk_myaccount.click();
	}
	
	public void clickRegister()
	{
		lnk_register.click();
	}
	
	public void clickLogin()
	{
		lnk_login.click();
	}
}
