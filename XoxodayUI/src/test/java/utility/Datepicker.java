package utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datepicker {
	
	public WebDriver driver;
	
	public Datepicker(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void datepicker()
	
	{
		List<WebElement>dates=driver.findElements(By.xpath(".//div[@class='datepicker-days']/table/tbody/tr/td"));
		int NoOfDates=dates.size();
		
		for(int i=0; i< NoOfDates; i++)
		{
			String date = dates.get(i).getText();
			
			if(date.equalsIgnoreCase("15"))
			{
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				dates.get(i).click();
				//System.out.println(i);
				System.out.println("Selected Date is :" +date);
				break;
			}
		}
	}

}
