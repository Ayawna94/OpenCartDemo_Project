package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Finding elements
	
	@FindBy(id="input-email") WebElement txt_usrnm;
	@FindBy(id="input-password") WebElement txt_psw;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login;
	
	
	//actions
	
	public void setUsername(String uname)
	{
		txt_usrnm.sendKeys(uname);
	}
	
	public void setPswrd(String pw)
	{
		txt_psw.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}
