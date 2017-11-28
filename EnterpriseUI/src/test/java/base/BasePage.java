package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.ConfigReader;

public class BasePage {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser()
	{
		ConfigReader config=new ConfigReader();
		System.setProperty(config.ChromeKey(), config.getChromepath());
		driver = new ChromeDriver();
		driver.get(config.getApplicationUrl());
		driver.manage().window().maximize();
	}
	
	
	/*@AfterMethod
	public void teardown()
	{
		driver.close();
	}*/
}
