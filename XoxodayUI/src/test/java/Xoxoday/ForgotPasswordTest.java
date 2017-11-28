package Xoxoday;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BasePage;
import commonPageObjects.ForgotPasswordPageObjects;

public class ForgotPasswordTest extends BasePage {
	
	@Test
	public void FPTest() throws Exception
	{
		ForgotPasswordPageObjects fp=PageFactory.initElements(driver, ForgotPasswordPageObjects.class);
		fp.Account();
		fp.ForgotPassword();
		fp.EmailID();
		fp.ResetPassword();
	}
}
