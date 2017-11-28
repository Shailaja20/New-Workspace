package UIAutomation.EnterpriseUI;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BasePage;
import commonPageObjects.DistributMyBudgetPageObjects;
import commonPageObjects.LoginPageObjects;

public class DistributeMyBudgetTest extends BasePage {
	
	@Test
	public void RedistributBudget()
	{
		LoginPageObjects loginOBJ=PageFactory.initElements(driver, LoginPageObjects.class);
		DistributMyBudgetPageObjects disOBJ=PageFactory.initElements(driver, DistributMyBudgetPageObjects.class);
		
		loginOBJ.Login("test987@test123456.com", "Test@123");
		disOBJ.NavigateDistributMyBudget();
		disOBJ.RedistributeKittyBudget("10");
		disOBJ.Submit();
		disOBJ.HistoryDetails();
	}
	
	@Test (dependsOnMethods = {"RedistributBudget"})
	public void ValidatePoints()
	{
		LoginPageObjects loginOBJ=PageFactory.initElements(driver, LoginPageObjects.class);
		DistributMyBudgetPageObjects disOBJ=PageFactory.initElements(driver, DistributMyBudgetPageObjects.class);

		loginOBJ.Login("sethu1@test123456.com", "Test@123");
		disOBJ.NavigateDistributMyBudget();
	}

}
