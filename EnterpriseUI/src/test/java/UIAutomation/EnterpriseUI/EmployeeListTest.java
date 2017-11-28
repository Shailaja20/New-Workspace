package UIAutomation.EnterpriseUI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base.BasePage;
import commonPageObjects.EmployeeListPageObjects;
import commonPageObjects.LoginPageObjects;

public class EmployeeListTest extends BasePage {
	
	//Add a new Employee
	@Test (priority=0, description = "Create a New Employee") 
	public void AddEmployee() throws Exception
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		EmployeeListPageObjects emp=PageFactory.initElements(driver, EmployeeListPageObjects.class);
		
		login.Login("xoxoengage@test123456.com", "Enterprise@123");
		emp.NavigateEmployeeDashboard();
		emp.CreateEmployee();
		emp.UserDetails();
	}
	
	//To search an Employee-Profile View- Edit Profile
	@Test (priority=1, description = "View Employee Details")
	public void EmployeeProfileView() throws Exception
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		EmployeeListPageObjects emp=PageFactory.initElements(driver, EmployeeListPageObjects.class);
		
		login.Login("xoxoengage@test123456.com", "Enterprise@123");
		emp.NavigateEmployeeDashboard();
		emp.SearchEmployee();
		emp.EmployeeDetailsView();
		emp.EditProfile();
		emp.EditEmployeeDetails();
	}
	
	//To search an Employee- Edit Employee
	@Test (priority=2, description = "To search an Employee- Edit Employee")
	public void EditProfile() throws Exception
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		EmployeeListPageObjects emp=PageFactory.initElements(driver, EmployeeListPageObjects.class);
		
		login.Login("xoxoengage@test123456.com", "Enterprise@123");
		emp.NavigateEmployeeDashboard();
		emp.SearchEmployee();
		emp.EditEmployee();
		emp.EditEmployeeDetails();
	}
	
	//To Enable/Disable Employee
	@Test (priority=3, description = "To Disable Employee")
	public void DisableEmployee() throws Exception
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		EmployeeListPageObjects emp=PageFactory.initElements(driver, EmployeeListPageObjects.class);
		
			login.Login("xoxoengage@test123456.com", "Enterprise@123");
			emp.NavigateEmployeeDashboard();
			emp.SearchEmployee();
			emp.Disable();
	}
	
	@Test (priority=4, description = "To Enable Employee")
	public void EnableEmployee() throws Exception
	{
		LoginPageObjects login=PageFactory.initElements(driver, LoginPageObjects.class);
		EmployeeListPageObjects emp=PageFactory.initElements(driver, EmployeeListPageObjects.class);
		
		login.Login("xoxoengage@test123456.com", "Enterprise@123");
		emp.NavigateEmployeeDashboard();
		emp.SearchEmployee();
		emp.Enable();
	}

}
