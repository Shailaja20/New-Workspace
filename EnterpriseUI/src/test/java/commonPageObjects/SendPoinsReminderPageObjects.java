package commonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SendPoinsReminderPageObjects {
	
	public WebDriver driver;
	
	public SendPoinsReminderPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='navbar-second-toggle']/ul/li[5]/a")
	@CacheLookup
	public WebElement ClickAdmin;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(text(),'Send Points Reminder')]")
	@CacheLookup
	public WebElement ClickSendPointsReminder;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-reminder_type-container']")
	@CacheLookup
	public WebElement ClickReminderType;
	
	String ExpectedTitle = "Enterprise Xoxoday - Send Points Reminder";
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'Budget Points Reminder')]")
	@CacheLookup
	public WebElement ClickBudgetPointsReminder;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'Reward Points Reminder')]")
	@CacheLookup
	public WebElement ClickRewardPointsReminder;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='submit_btn']")
	@CacheLookup
	public WebElement ClickSubmitbtn;
	
	public void navigateSendPointsReminderModule()
	{
		ClickAdmin.click();
		ClickSendPointsReminder.click();
		Assert.assertEquals(driver.getTitle(), ExpectedTitle, "Title not matching");
	}
	
	public void NatureofReminder()
	{
		ClickReminderType.click();
	}
	
	public void BudgetPointReminderType()
	{
		if(ClickBudgetPointsReminder.isDisplayed())
		{
			ClickBudgetPointsReminder.click();
			//break;
		}
	}
	
	public void RewardPointReminderType()
	{
		if(ClickRewardPointsReminder.isDisplayed())
		{
			ClickRewardPointsReminder.click();
		}
	}
	
	public void Submit()
	{
		ClickSubmitbtn.click();
	}

}
