package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.TestSetup;

public class AccountRegistration extends TestSetup {

	@Test
	public void AcntReg()
		{
		logger.info("Registration started.....");
		try
		{
			Thread.sleep(3000);
			HomePage hp = new HomePage(driver);
			hp.clickMyaccount();
			hp.clickRegister();
			logger.info("Registration clicked");
			Thread.sleep(3000);

			RegistrationPage reg = new RegistrationPage(driver);
			
			logger.info("Provided user informations.");
			reg.setFirstname("Cristy");
			reg.setLastname("Doe");
			reg.setEmail("CristyDoe@gmail.com");

			reg.setPassword("Test@1234");
			Thread.sleep(3000);

			reg.agreePrivacyPolicy();
			//reg.clickContinue();
			
			logger.info("Clicked on continue....");
			
			Thread.sleep(3000);

			String conf = reg.getConfirmation();
			System.out.println(conf);
			
			
			logger.info("Verifying customer registration...");
			
			Assert.assertEquals(conf, "Your Account Has Been Created!", "Test failed");

		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
			logger.info("Finishing registration.....");
		}
	

}
