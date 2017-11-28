package Xoxoday;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base.BasePage;
import commonPageObjects.LoginPageObjects;
import commonPageObjects.ProductPageObjects;
import utility.Datepicker;

public class ProductPageTest extends BasePage{
	

	@Test (priority=0)
	public void BuyExperience() throws Exception
	{
		ProductPageObjects product=PageFactory.initElements(driver, ProductPageObjects.class);
		
		LoginPageObjects log=PageFactory.initElements(driver, LoginPageObjects.class);
		
		Datepicker d=new Datepicker(driver);		
		product.ChooseExperience();
		product.ExperienceName();
		product.ExperienceAddress();
		product.ExperienceDuration();
		product.Breadcrumb();
		product.Date();
		d.datepicker();
		product.Timeslot();
		product.BookingFor();
		product.BuyNow();
		log.Login();
		product.PrintCheckout();		
	}
	
	@Test (priority=1)
	public void EnquireReview() throws Exception
	{
		ProductPageObjects product=PageFactory.initElements(driver, ProductPageObjects.class);
		
						
		product.ChooseExperience();
	    product.EnquireNow();
		product.Review();
		
	}
	
	
}
