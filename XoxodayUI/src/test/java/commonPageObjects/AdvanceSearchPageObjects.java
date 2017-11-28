package commonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdvanceSearchPageObjects {
	
	public WebDriver driver;
	
	public AdvanceSearchPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using=".//*[@id='advance-modal-button']/span[1]")
	@CacheLookup
	public WebElement ClickExploreButton;
	
	@FindBy(how = How.XPATH, using=".//*[@id='category_list_dropdown']/li/a")
	@CacheLookup
	public WebElement ClickWhatCategory;
	
	@FindBy(how = How.XPATH, using=".//*[@id='category_list_dropdown']/li/ul/div/ul/li/div/input")
	@CacheLookup
	public WebElement TypeCategory;
	
	@FindBy(how = How.ID, using="category-357")
	@CacheLookup
	public WebElement SelectCategory;
	
	@FindBy(how = How.XPATH, using=".//*[@id='time_slot_dropdown']/li/a")
	@CacheLookup
	public WebElement ClickTimeslot;
	
	@FindBy(how = How.XPATH, using=".//*[@id='time_slot_dropdown']/li/ul/div/ul/li/div/ul/li[2]/span/a")
	@CacheLookup
	public WebElement SelectTimeslot;
	
	@FindBy(how = How.XPATH, using=".//*[@id='city-head-list']/a")
	@CacheLookup
	public WebElement FetchCity;
	
	@FindBy(how = How.XPATH, using=".//*[@id='city_list_dropdown']/li/a")
	@CacheLookup
	public WebElement ClickCity;
	
	@FindBy(how = How.XPATH, using=".//*[@id='city_list_dropdown']/li/ul/div/ul/li/div/input")
	@CacheLookup
	public WebElement TypeCity;
	
	@FindBy(how = How.ID, using="5")
	@CacheLookup
	public WebElement SelectCity;
	
	@FindBy(how = How.XPATH, using=".//*[text()='What']")
	@CacheLookup
	public WebElement ClickExploreWhat;
	
	@FindBy(how = How.XPATH, using="//*[@id='cat-search']")
	@CacheLookup
	public WebElement SearchCategory;
	
	@FindBy(how = How.ID, using="357")
	@CacheLookup
	public WebElement ChooseCategory;
	
	@FindBy(how = How.ID, using="whoMenu")
	@CacheLookup
	public WebElement ClickExploreWho;
	
	@FindBy(how = How.ID, using="2")
	@CacheLookup
	public WebElement ChooseWho;
	
	@FindBy(how = How.ID, using="whenMenu")
	@CacheLookup
	public WebElement ClickExplorewhen;
	
	@FindBy(how = How.XPATH, using=".//*[@id='whenMenu']//following::a[2]")
	@CacheLookup
	public WebElement ChooseWhen;
	
	@FindBy(how = How.ID, using="priceMenu")
	@CacheLookup
	public WebElement ClickExplorePrice;
	
	@FindBy(how = How.ID, using="max-amt")
	@CacheLookup
	public WebElement SetMaxAmt;
	
	@FindBy(how = How.XPATH, using=".//*[@id='priceMenu']//following::a[1]")
	@CacheLookup
	public WebElement ClickApply;
	
	@FindBy(how = How.ID, using="sortMenu")
	@CacheLookup
	public WebElement ClickSort;
	
	@FindBy(how = How.ID, using="name-asc")
	@CacheLookup
	public WebElement ClickAscSort;
	
	@FindBy(how = How.ID, using="clear")
	@CacheLookup
	public WebElement ClickClearAll;
	
	
	public void City()
	{
		ClickCity.click();
		TypeCity.sendKeys("Mumbai");
		SelectCity.click();
	}
	
	public void Explore()
	{
		ClickExploreButton.click();
		System.out.println("City Location is " +FetchCity.getText());
	}
	
	public void WhatCategory()
	{
		ClickWhatCategory.click();
		TypeCategory.sendKeys("Adventure");
		SelectCategory.click();
	}
	
	public void Timeslot()
	{
		ClickTimeslot.click();
		SelectTimeslot.click();
	}
	
	public void ExploreWhat()
	{
		try {
			Thread.sleep(3000);
			ClickExploreWhat.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='357']")).click();
			/*SearchCategory.sendKeys("Adventure");
			Thread.sleep(3000);
			ChooseCategory.click();*/
		} catch (Exception e) 
		{System.out.println(e.getMessage());}
	}
	
	public void ExploreWho() throws Exception
	{
		Thread.sleep(3000);
		ClickExploreWho.click();
		Thread.sleep(3000);
		ChooseWho.click();
	}
	
	public void Explorewhen() throws Exception
	{
		Thread.sleep(3000);
		ClickExplorewhen.click();
		ChooseWhen.click();
		 
	}
	
	public void ExplorePrice() throws Exception
	{
		Thread.sleep(3000);
		ClickExplorePrice.click();
		Thread.sleep(2000);
		SetMaxAmt.clear();
		SetMaxAmt.sendKeys("6000");
		ClickApply.click();
	}
	
	public void Sort() throws Exception
	{
		Thread.sleep(3000);
		ClickSort.click();
		ClickAscSort.click();
	}
	
	public void Clear() throws Exception
	{
		Thread.sleep(3000);
		ClickClearAll.click();
	}
	

}
