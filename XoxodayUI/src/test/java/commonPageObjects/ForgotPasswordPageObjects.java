package commonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPageObjects {
	
	public WebDriver driver;
	
	public ForgotPasswordPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH, using=".//*[@id='myDropdown']/a")
	@CacheLookup
	public WebElement ClickAccount;
	
	@FindBy(how = How.XPATH, using=".//*[@id='forgotpassword2']")
	@CacheLookup
	public WebElement ClickForgotPassword;
	
	@FindBy(how = How.XPATH, using=".//*[@id='forgot_form']/form/div/div[1]/input")
	@CacheLookup
	public WebElement TypeEmailID;
	
	@FindBy(how = How.XPATH, using=".//*[@id='forgot_form']/form/div/div[2]/input")
	@CacheLookup
	public WebElement ClickResetPassword;
	
	
	public void Account()
	{
		ClickAccount.click();
	}
	
	public void ForgotPassword() throws Exception
	{
		
		ClickForgotPassword.click();
		Thread.sleep(10000);
	}
	
	public void EmailID()
	{
		TypeEmailID.sendKeys("shailja@xoxoday.com");
	}
	
	public void ResetPassword()
	{
		ClickResetPassword.click();
	}

}
