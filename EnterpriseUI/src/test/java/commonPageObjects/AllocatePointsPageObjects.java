package commonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class AllocatePointsPageObjects {
	
	public WebDriver driver;
	
	public AllocatePointsPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='navbar-second-toggle']/ul/li[5]/a")
	@CacheLookup
	public WebElement ClickAdmin;
	
	@FindBy(how = How.XPATH, using = ".//*[contains(text(),'Allocate Points/Budgets')]")
	@CacheLookup
	public WebElement ClickAllocatePoints;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='test123456']/div[2]/div[1]/div[4]/div[1]/table/tbody/tr")
	@CacheLookup
	public WebElement DisplayHeaderAllocatePoints;
	
	@FindBy(how = How.XPATH, using =".//*[@id='select2-employee_id-container']")
	@CacheLookup
	public WebElement ClickEmployeeName;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='test123456']/span/span/span[1]/input")
	@CacheLookup
	public WebElement SearchEmployee;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-employee_id-results']/li")
	@CacheLookup
	public WebElement ClickSearchedEmployee;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-type-container']")
	@CacheLookup
	public WebElement ClickAction;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'Add')]")
	@CacheLookup
	public WebElement SelectAdd;
	
	@FindBy(how = How.ID, using= "current_points")
	@CacheLookup
	public WebElement FetchCurrentPoints;
	
	@FindBy(how = How.ID, using = "points")
	@CacheLookup
	public WebElement AddPoints;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='allocate_points']/div/button")
	@CacheLookup
	public WebElement ClickSubmitButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='finalConfirmBtn']")
	@CacheLookup
	public WebElement ClickFinalSubmitButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='allocate_points']/div/div/a[2]")
	@CacheLookup
	public WebElement ClickHistory;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='btn btn-link']")
	@CacheLookup
	public WebElement ClosePopUp;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='rnrPopulateData']/div/table/tbody/tr[1]")
	@CacheLookup
	public WebElement FetchSendPointsHistory;
	
	@FindBy(how = How.XPATH, using = ".//*[contains(text(),'Others')]")
	@CacheLookup
	public WebElement ClickOthers;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(text(),'Distribute My Budget')]")
	@CacheLookup
	public WebElement ClickDistributeMyBudget;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='test123456']/div[2]/div[1]/div[4]/div[1]/table/tbody/tr")
	@CacheLookup
	public WebElement FetchRedistributedKittyBudget;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='allocate_points']/div/div/a[1]")
	@CacheLookup
	public WebElement ClickBulkUploadButton;
	
	@FindBy(how = How.ID, using = "points_upload")
	@CacheLookup
	public WebElement ClickUploadExcelPath;
	
	public void NavigateAllocatePointsBudgetModule()
	{
		ClickAdmin.click();
		ClickAllocatePoints.click();
		System.out.println("Allocate Points header is :" +DisplayHeaderAllocatePoints.getText());
		Reporter.log("NavigateAllocatePointsBudgetModule Passed", true);
	}
	
	public void Employee()
	{
		try {
			ClickEmployeeName.click();
			SearchEmployee.sendKeys("test987@test123456.com");
			Thread.sleep(3000);
			ClickSearchedEmployee.click();
		} catch (Exception e) {
			System.out.println("Exception is = " + " " + e.getMessage());
		}
		Reporter.log("Employee Passed", true);
	}
	
	public void Action()
	{
		try {
			ClickAction.click();
			Thread.sleep(3000);
			SelectAdd.click();
		} catch (Exception e) {
			System.out.println("Exception is = " + " " + e.getMessage());
		}
		Reporter.log("Action Passed", true);
	}
	
	public void CurrentPoints()
	{
		System.out.println("Current Points is :" +FetchCurrentPoints.getText());
		Reporter.log("CurrentPoints Passed", true);
	}
	
	public void EmployeePoints()
	{
		AddPoints.sendKeys("110");
		Reporter.log("EmployeePoints Passed", true);
	}
	
	public void Submit()
	{
		try {
			ClickSubmitButton.click();
			Thread.sleep(3000);
			ClickFinalSubmitButton.click();
		} catch (Exception e) {
			System.out.println("Exception is :" + "" + e.getMessage());
		}
		Reporter.log("Submit Passed", true);
	}
	
	public void History()
	{
		try {
			ClickHistory.click();
			Thread.sleep(3000);
			System.out.println("History Details is :" +FetchSendPointsHistory.getText());
			ClosePopUp.click();
		} catch (Exception e) {
			System.out.println("Exception is :" + "" + e.getMessage());
		}
		Reporter.log("History Passed", true);
	}
	
	public void RedistributeKittyBudget()
	{
		ClickOthers.click();
		ClickDistributeMyBudget.click();
		System.out.println(FetchRedistributedKittyBudget.getText());
		System.out.println("Points is successfull Received by the user");
		Reporter.log("RedistributeKittyBudget Passed", true);
	}
	
	public void BulkUpload()
	{
		ClickBulkUploadButton.click();
		ClickUploadExcelPath.sendKeys("C:\\Users\\Admin\\Desktop\\TestExcelAllocatePoints.xlsx");
		Reporter.log("BulkUpload Passed", true);
	}

}
