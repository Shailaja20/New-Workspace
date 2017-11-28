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
	
	@FindBy(how = How.XPATH, using=".//*[@id='email_password']/div/div[1]/input")
	@CacheLookup
	public WebElement EnterEmailID;
	
	@FindBy(how = How.XPATH, using=".//*[@id='pass_login']")
	@CacheLookup
	public WebElement EnterPassword;
	
	@FindBy(how = How.XPATH, using=".//*[@id='login-btn-2']")
	@CacheLookup
	public WebElement ClickLogin;
	
	@FindBy(how = How.XPATH, using=".//*[@id='myDropdown']/a")
	@CacheLookup
	public WebElement ClickAccount;
	
	public void Login() throws Exception
	{
		Thread.sleep(3000);
		EnterEmailID.sendKeys("shailja@xoxoday.com");
		EnterPassword.sendKeys("Shailaja1!@");
		ClickLogin.click();
	}

}
