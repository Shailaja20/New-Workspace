package UIAutomation.EnterpriseUI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base.BasePage;
import commonPageObjects.LoginPageObjects;
import commonPageObjects.SendPoinsReminderPageObjects;

public class SendPointsReminderTests extends BasePage {
	
	LoginPageObjects OBJLogin;
	SendPoinsReminderPageObjects OBJSendReminder;
	
	@Test (priority=0)
	public void BudgetPointReminder()
	{
		OBJLogin=PageFactory.initElements(driver, LoginPageObjects.class);
		OBJSendReminder = new SendPoinsReminderPageObjects(driver);
		
		OBJLogin.Login("xoxoengage@test123456.com", "Enterprise@123");
		OBJSendReminder.navigateSendPointsReminderModule();
		OBJSendReminder.NatureofReminder();
		OBJSendReminder.BudgetPointReminderType();
		OBJSendReminder.Submit();
	}
	
	@Test (priority=1)
	public void RewardPointReminder()
	{
		OBJLogin=PageFactory.initElements(driver, LoginPageObjects.class);
		OBJSendReminder = new SendPoinsReminderPageObjects(driver);
		
		OBJLogin.Login("xoxoengage@test123456.com", "Enterprise@123");
		OBJSendReminder.navigateSendPointsReminderModule();
		OBJSendReminder.NatureofReminder();
		OBJSendReminder.RewardPointReminderType();
		OBJSendReminder.Submit();
	}

}
