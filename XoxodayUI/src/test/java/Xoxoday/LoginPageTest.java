package Xoxoday;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BasePage;
import commonPageObjects.LoginPageObjects;

public class LoginPageTest extends BasePage {
	
	@Test
	public void TestLogin() throws Exception
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		
		login.Login();
	}

}
