package commonPageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPageObjects {
	
	public WebDriver driver;
	
	public ProductPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how = How.ID, using="descriptionDate")
	@CacheLookup
	public WebElement ClickDate;
	
	@FindBy(how = How.XPATH, using=".//*[@id='timepicker1']/select")
	@CacheLookup
	public WebElement ClickTimeslot;
	
	@FindBy(how = How.XPATH, using=".//*[@id='timepicker1']/select/option[2]")
	@CacheLookup
	public WebElement ChooseTimeslot;
	
	@FindBy(how = How.XPATH, using=".//span[text()='Starts From']//following::a[1]")
	@CacheLookup
	public WebElement ClickBookingFor;
	
	@FindBy(how = How.ID, using="adultAdd-0")
	@CacheLookup
	public WebElement ClickAdult;
	
	@FindBy(how = How.XPATH, using=".//span[text()='Starts From']//following::button[5]")
	@CacheLookup
	public WebElement ClickBuyNow;
	
	@FindBy(how = How.XPATH, using=".//*[@id='app']/div/div[1]/nav[2]/div/div[1]/a/img//following::h1")
	@CacheLookup
	public WebElement FetchExperienceName;
	
	@FindBy(how = How.XPATH, using=".//button[text()='Buy Now']//preceding::a[3]")
	@CacheLookup
	public WebElement ClickReview;
	
	@FindBy(how = How.XPATH, using=".//*[@id='review']/div/p")
	@CacheLookup
	public WebElement FetchNoReview;
	
	@FindBy(how = How.XPATH, using=".//*[@id='review-container']/div/div[1]/div/div")
	@CacheLookup
	public WebElement FetchReview;
	
	@FindBy(how = How.XPATH, using=".//*[@id='review-container']/div/div[1]/div/div//following::p[1]")
	@CacheLookup
	public WebElement FetchReviewText;
	
	@FindBy(how = How.XPATH, using=".//*[@id='app']/div/div[2]/div/div/section[1]/div/div[1]/div/div[1]/section/div/a/div")
	@CacheLookup
	public WebElement FetchExperienceAddress;
	
	@FindBy(how = How.XPATH, using=".//*[@class='productDuration']")
	@CacheLookup
	public WebElement FetchTimeDuration;
	
	@FindBy(how = How.XPATH, using=".//*[@id='bestActivities']/div[1]/div/div[1]/div/div")
	@CacheLookup
	public WebElement SelectExperience;
	
	@FindBy(how = How.XPATH, using=".//a[text()='Enquire Now'][@type='button']")
	@CacheLookup
	public WebElement ClickEnquireNow;
	
	@FindBy(how = How.XPATH, using=".//*[@id='enquire_form']/div[1]/div[1]/input")
	@CacheLookup
	public WebElement EnterName;
	
	@FindBy(how = How.XPATH, using=".//*[@id='enquire_form']/div[1]/div[2]/input")
	@CacheLookup
	public WebElement EnterEmail;
	
	@FindBy(how = How.XPATH, using=".//*[@id='enquirePhone']")
	@CacheLookup
	public WebElement EnterPhoneNo;
	
	@FindBy(how = How.XPATH, using=".//*[@id='enquire_form']/div[3]/textarea")
	@CacheLookup
	public WebElement EnterEnquireText;
	
	@FindBy(how = How.XPATH, using=".//*[@id='enquire_form']/div[3]/textarea//following::input[1]")
	@CacheLookup
	public WebElement EnterSubmitButton;
	
	@FindBy(how = How.XPATH, using=".//*[@id='orderHead']")
	@CacheLookup
	public WebElement PrintCheckoutdetails;
	
	@FindBy(how = How.XPATH, using=".//*[@class='breadcrumb']")
	@CacheLookup
	public WebElement FetchBreadcrumb;
	
	
	public void ChooseExperience() throws Exception
	{
		Thread.sleep(3000);
		SelectExperience.click();
	}
	
	public void Date()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ClickDate.click();
	}
	
	public void Timeslot()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickTimeslot.click();
		ChooseTimeslot.click();
	}
	
	public void BookingFor()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickBookingFor.click();
		ClickAdult.click();
	}
	
	public void BuyNow()
	{
		ClickBuyNow.click();
	}
	
	public void ExperienceName() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println("Experience name is :" + FetchExperienceName.getText());
	}
	
	public void Review() throws Exception
	{
		Thread.sleep(10000);
		ClickReview.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		if(FetchNoReview.getText().equalsIgnoreCase("No reviews available yet"))
		{
			System.out.println("Review Text : " +FetchNoReview.getText());
		}
		else {
			System.out.println("Review Text : " +FetchReviewText.getText());
		}
	}
	
	public void ExperienceAddress() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Experience Address is : " +FetchExperienceAddress.getText());
	}
	
	public void ExperienceDuration()
	{
		System.out.println("Experience Duration is : " +FetchTimeDuration.getText());
	}
	
	public void EnquireNow() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickEnquireNow.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		EnterName.sendKeys("test");
		EnterEmail.sendKeys("test@xoxoday.com");
		EnterPhoneNo.sendKeys("7829278476");
		EnterEnquireText.sendKeys("Can you take on explaining the difference between “inquire” and “enquire?”");
		Thread.sleep(3000);
		EnterSubmitButton.click();
		System.out.println("Enquiry Passed");
	}
	
	public void PrintCheckout()
	{
		System.out.println("User reached Checkout Page " +PrintCheckoutdetails.getText());
	}
	
	public void Breadcrumb()
	{
		System.out.println("Breadcrumb is : " +FetchBreadcrumb.getText());
	}
	
}
