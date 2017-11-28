package commonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DistributMyBudgetPageObjects {
	
	public WebDriver driver;
	
	public DistributMyBudgetPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[contains(text(),'Others')]")
	@CacheLookup
	public WebElement ClickOthers;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(text(),'Distribute My Budget')]")
	@CacheLookup
	public WebElement ClickDistributeMyBudget;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='test123456']/div[2]/div[1]/div[4]/div[1]/table/tbody/tr")
	@CacheLookup
	public WebElement FetchRedistributedKittyBudget;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-employee_id-container']")
	@CacheLookup
	public WebElement ClickEmployeeName;
	
	@FindBy(how = How.XPATH, using = ".//*[contains(text(),'sethu1@test123456.com')]")
	@CacheLookup
	public WebElement SelectEmailID;
	
	@FindBy(how = How.ID, using = "points")
	@CacheLookup
	public WebElement EnterPoints;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='allocate_points']/div/button")
	@CacheLookup
	public WebElement ClickSubmitButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='finalConfirmBtn']")
	@CacheLookup
	public WebElement ClickFinalSubmit;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='allocate_points']/div/a[1]")
	@CacheLookup
	public WebElement ClickHistory;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='rnrPopulateData']/div/table/tbody/tr[1]")
	@CacheLookup
	public WebElement FetchHistoryDetails;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='rnrHistoryModal']/div/div/div[3]/button")
	@CacheLookup
	public WebElement ClosePopUp;
	
	public void NavigateDistributMyBudget()
	{
		ClickOthers.click();
		ClickDistributeMyBudget.click();
		System.out.println(FetchRedistributedKittyBudget.getText());
	}
	
	public void RedistributeKittyBudget(String SendPoints)
	{
		try {
			ClickEmployeeName.click();
			Thread.sleep(3000);
			SelectEmailID.click();
			EnterPoints.sendKeys(SendPoints);
		} catch (Exception e) {
			System.out.println("Exception is :"+ " " +e.getMessage());
		}
	}
	
	public void Submit()
	{
		try {
			ClickSubmitButton.click();
			Thread.sleep(3000);
			ClickFinalSubmit.click();
			System.out.println("Points distributed Successfully");
			} catch (Exception e) {
			System.out.println("Exception is :"+ " " +e.getMessage());
		}
	}
	
	public void HistoryDetails()
	{
		try {
			ClickHistory.click();
			Thread.sleep(3000);
			System.out.println("Transferred Points Details is :" +FetchHistoryDetails.getText());
			ClosePopUp.click();
		} catch (Exception e) {
			System.out.println("Exception is : " + "" +e.getMessage());
		}
	}

}
