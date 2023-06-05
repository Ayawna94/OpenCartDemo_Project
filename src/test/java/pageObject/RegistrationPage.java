package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage
{	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	// Finding elements
	
	@FindBy(id="input-firstname") WebElement txt_firstname;
	@FindBy(id="input-lastname") WebElement txt_lastname;
	@FindBy(id="input-email") WebElement txt_email;
	@FindBy(id="input-password") WebElement txt_password;
	@FindBy(name="agree") WebElement check_agree;
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement btn_continue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;
	
	
	
	//Actions
	
	public void setFirstname(String fname)
	{
		txt_firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void setPassword(String pw)
	{
		txt_password.sendKeys(pw);
	}
	
	public void agreePrivacyPolicy()
	{
		check_agree.click();
	}
	
	public void clickContinue()
	{
		btn_continue.click();
	}
	
	public String getConfirmation()
	{
		String cnf = msgConfirmation.getText();
		return cnf;
	}
	
	
	
	
	
	
	
	
	
}
