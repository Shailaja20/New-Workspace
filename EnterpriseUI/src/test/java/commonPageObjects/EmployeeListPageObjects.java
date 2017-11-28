package commonPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPageObjects {
	
	public WebDriver driver;
	
	public EmployeeListPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='navbar-second-toggle']/ul/li[5]/a") 
	@CacheLookup
	public WebElement ClickAdmin;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='navbar-second-toggle']/ul/li[5]/div/div[1]/div[2]/ul/li[10]/a")
	@CacheLookup
	public WebElement ClickEmployeeList;
	
	@FindBy(how = How.XPATH, using = ".//*[text()='Employee Data Configuration']")
	@CacheLookup
	public WebElement ClickEmployeeConfiguration;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(text(),'Add New Employee')]")
	@CacheLookup
	public WebElement AddEmploye;
	
	@FindBy(how = How.ID, using = "first_name")
	@CacheLookup
	public WebElement EnterFirstName;
	
	@FindBy(how = How.ID, using = "last_name")
	@CacheLookup
	public WebElement EnterLastName;
	
	@FindBy(how = How.ID, using = "emp_id")
	@CacheLookup
	public WebElement EnterEmployeeID;
	
	@FindBy(how = How.ID, using = "work_email")
	@CacheLookup
	public WebElement EnterWorkEmail;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-acc_roles-container']")
	@CacheLookup
	public WebElement SelectEmployeeAccessRole;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'Employee')]")
	@CacheLookup
	public WebElement ChooseRole;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-roles-container']") 
	@CacheLookup
	public WebElement SelectCompanyRole;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-sites-container']")
	@CacheLookup
	public WebElement SelectEmployeeSite;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'bangalore')]")
	@CacheLookup
	public WebElement ChooseSite;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-dept-container']")
	@CacheLookup
	public WebElement SelectDepartment;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'testing')]")
	@CacheLookup
	public WebElement ChooseDepartment;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='addEmployeeForm']/div/button")
	@CacheLookup
	public WebElement ClickSubmitButton;
	
	@FindBy(how = How.ID, using = "finalConfirmBtn") 
	@CacheLookup
	public WebElement ClickFinalSubmit;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'emp')]") 
	@CacheLookup
	public WebElement ChooseEmployeeCompanyRole;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-designation-container']") 
	@CacheLookup
	public WebElement SelectEmployeeDesignation;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'employee')]")
	@CacheLookup
	public WebElement ChooseDesignation;
	
	@FindBy(how = How.ID, using = "contact")
	@CacheLookup
	public WebElement EnterContactNo;
	
	@FindBy(how = How.ID, using = "address")
	@CacheLookup
	public WebElement EnterAddress;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-state-container']")
	@CacheLookup
	public WebElement SelectState;
	
	@FindBy(how = How.XPATH, using = ".//li[contains(text(),'Goa')]")
	@CacheLookup
	public WebElement ChooseState;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-city-container']")
	@CacheLookup
	public WebElement SelectCity;
	
	@FindBy(how = How.XPATH, using = ".//li[text()='Panaji']")
	@CacheLookup
	public WebElement ChooseCity;
	
	@FindBy(how = How.ID, using = "birthdate")
	@CacheLookup
	public WebElement SelectBirthDate;
	
	@FindBy(how = How.XPATH, using = "//*[@id='test123456']/div[5]/div[1]/table/tbody/tr[1]/td[7]")
	@CacheLookup
	public WebElement ChooseDate;
	
	@FindBy(how = How.ID, using = "joindate")
	@CacheLookup
	public WebElement SelectJoiningDate;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='emp_list_filter']/label/input")
	@CacheLookup
	public WebElement EnterSearchEmailID;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='emp_list_filter']/label/input")
	@CacheLookup
	public WebElement EnterSearchEmailIDrecreated;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='emp_list']/tbody/tr")
	@CacheLookup
	public WebElement PrintEmployeeDetails;
	
	@FindBy(how = How.XPATH, using = ".//a[@title='View']")
	@CacheLookup
	public WebElement ClickView;
	
	@FindBy(how = How.XPATH, using = "//*[@id='test123456']/div[2]/div[1]/div[3]/div[2]/div[3]/div/div")
	@CacheLookup
	public WebElement PrintEmployeeAllocationPoints;
	
	@FindBy(how = How.XPATH, using = "//*[@id='test123456']/div[2]/div[1]/div[3]/div[2]/div[5]/div/div")
	@CacheLookup
	public WebElement PrintEmployeePersonalPoints;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(text(),'Edit Profile')]")
	@CacheLookup
	public WebElement ClickEditProfile;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='editEmployeeForm']/div/button")
	@CacheLookup
	public WebElement ClickEditProfileSubmit;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='test123456']/div[2]/div[1]/div[3]/div[2]/div[6]/a[1]")
	@CacheLookup
	public WebElement ClickBackToEmployeeList;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='emp_list']/tbody/tr/td[6]/a[2]")
	@CacheLookup
	public WebElement ClickEditEmployee;
	
	@FindBy(how = How.XPATH, using = ".//a[@title='Disable Employee']")
	public WebElement ClickDisableButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='emp_list']/tbody/tr/td[6]/a[1]/span")
	public WebElement ClickEnableButton;
	
/*	@FindBy(how = How.XPATH, using = ".//*[@id='test123456']/div[2]/div[1]/div[4]/div[2]/div[1]")
	public WebElement PrintDisableMessage;*/
	
	
	
	public void NavigateEmployeeDashboard() throws Exception
	{
		ClickAdmin.click();
		Thread.sleep(3000);
		ClickEmployeeConfiguration.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ClickEmployeeList);
		ClickEmployeeList.click();
	}
	
	public void CreateEmployee()
	{
		AddEmploye.click();
	}
	
	public void UserDetails() throws Exception
	{
		try {
			EnterFirstName.sendKeys("Shailaja");
			EnterLastName.sendKeys("Sharma");
			EnterEmployeeID.sendKeys("GX028");
			EnterWorkEmail.sendKeys("shailja1@sudlife.com");
			SelectEmployeeAccessRole.click();
			ChooseRole.click();
			SelectCompanyRole.click();
			Thread.sleep(2000);
			ChooseEmployeeCompanyRole.click();
			SelectEmployeeSite.click();
			Thread.sleep(2000);
			ChooseSite.click();
			SelectDepartment.click();
			ChooseDepartment.click();
			SelectEmployeeDesignation.click();
			Thread.sleep(2000);
			ChooseDesignation.click();
			EnterContactNo.sendKeys("7829276849");
			EnterAddress.sendKeys("Hello Delhi Restaturant, Sector 3, 18 th main HSR Layout");
			SelectState.click();
			ChooseState.click();
			SelectCity.click();
			Thread.sleep(10000);
			ChooseCity.click();
			//SelectBirthDate.click();
			//ChooseDate.click();
			SelectJoiningDate.click();
			ChooseDate.click();
			ClickSubmitButton.click();
			Thread.sleep(3000);
			ClickFinalSubmit.click();
			System.out.println("Employee is added Successfully");
		} catch (Exception e) {
			System.out.println("Exception is :" + " " +e.getMessage());
		}
	}
	
	public void SearchEmployee() throws Exception
	{
		EnterSearchEmailID.sendKeys("shailja1@sudlife.com");
		Thread.sleep(5000);
		System.out.println("Employee Details is :" + PrintEmployeeDetails.getText());
	}
	
	public void BacktoSearchEmployee() throws Exception
	{
		EnterSearchEmailIDrecreated.sendKeys("shailja1@sudlife.com");
		Thread.sleep(5000);
		System.out.println("Employee Details is :" + PrintEmployeeDetails.getText());
	}
	
	public void EmployeeDetailsView() throws Exception
	{
		try {
			ClickView.click();
			Thread.sleep(3000);
			System.out.println("Employee Allocation Points is : "+PrintEmployeeAllocationPoints.getText());
			System.out.println("Employee Personal Points is : "+PrintEmployeePersonalPoints.getText());
		} catch (Exception e) {
			System.out.println("Exception is : " + " " +e.getMessage());
		}
	}
	
	public void EditProfile() throws Exception
	{
		try {
			ClickEditProfile.click();
		} catch (Exception e) {
			System.out.println("Exception is : " + " " +e.getMessage());
		}
	}
	
	public void EditEmployee() throws Exception
	{
		ClickEditEmployee.click();
	}
	
	public void EditEmployeeDetails() throws Exception
	{
		EnterContactNo.clear();
		EnterContactNo.sendKeys("7829276849");
		ClickEditProfileSubmit.click();
		Thread.sleep(3000);
		ClickFinalSubmit.click();
		System.out.println("Employee is Edited Successfully");
	}
	
	public void ViewProfile()
	{
		ClickView.click();
		ClickBackToEmployeeList.click();
	}
	
	public void Disable()
	{
		ClickDisableButton.click();
		driver.switchTo().alert().accept();
		System.out.println("Employee has been Disabled Successfully");
	}
	
	public void Enable()
	{
		ClickEnableButton.click();
		driver.switchTo().alert().accept();
		System.out.println("Employee has been Enabled Successfully");
	}

}
