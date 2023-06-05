package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.TestSetup;

public class LoginUser extends TestSetup
{
	@Test
	public void loginusr()
	{
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		Thread.sleep(3000);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(rb.getString("email"));
		lp.setPswrd(rb.getString("password"));
		lp.clickLogin();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
