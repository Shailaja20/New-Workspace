package UIAutomation.EnterpriseUI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base.BasePage;
import commonPageObjects.LoginPageObjects;

public class LoginTest extends BasePage{
	
	@Test
	public void TestLogin()
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		
		login.Login("xoxoengage@test123456.com", "Enterprise@123");		
	}

}
