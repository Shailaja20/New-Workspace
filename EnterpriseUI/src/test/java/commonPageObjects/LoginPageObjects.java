package commonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using="user_email")
	@CacheLookup
	public WebElement EnterEmailID;
	
	@FindBy(how = How.ID, using ="login_submit")
	@CacheLookup
	public WebElement ClickNext;
	
	@FindBy(how = How.ID, using = "user_password")
	@CacheLookup
	public WebElement EnterPassword;
	
	@FindBy(how = How.ID, using = "login_submit")
	@CacheLookup
	public WebElement ClickSubmitButton;
	
	public void Login(String username, String password)
	{
		EnterEmailID.sendKeys(username);
		ClickNext.click();
		EnterPassword.sendKeys(password);
		ClickSubmitButton.click();
	}

}
