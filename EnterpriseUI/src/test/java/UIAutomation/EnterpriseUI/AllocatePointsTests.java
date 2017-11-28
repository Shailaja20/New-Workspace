package UIAutomation.EnterpriseUI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base.BasePage;
import commonPageObjects.AllocatePointsPageObjects;
import commonPageObjects.LoginPageObjects;

public class AllocatePointsTests extends BasePage {
	
	//Allocate Points to Employees
	@Test
	public void SendAllocatePoints()
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		AllocatePointsPageObjects allocOBJ=PageFactory.initElements(driver, AllocatePointsPageObjects.class);
		
		login.Login("xoxoengage@test123456.com", "Enterprise@123");
		allocOBJ.NavigateAllocatePointsBudgetModule();
		allocOBJ.Employee();
		allocOBJ.Action();
		allocOBJ.CurrentPoints();
		allocOBJ.EmployeePoints();
		allocOBJ.Submit();
		allocOBJ.History();	
	}
	
	//To check whether the Points is allocated to the Users or not
	@Test
	public void SendPointsValidation()
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		AllocatePointsPageObjects alloOBJ=PageFactory.initElements(driver, AllocatePointsPageObjects.class);

		login.Login("test987@test123456.com", "Test@123");
		alloOBJ.RedistributeKittyBudget();
		
	}
}
