package Xoxoday;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BasePage;
import commonPageObjects.AdvanceSearchPageObjects;
import utility.Screenshot;

public class AdvanceSearchTest extends BasePage {
	

	@Test (priority=0)
	public void CitySearchBar() throws Exception
	{
		AdvanceSearchPageObjects search=PageFactory.initElements(driver, AdvanceSearchPageObjects.class);
		Screenshot s=new Screenshot(driver);
		
		search.City();
		search.Explore();
		search.ExploreWhat();
		search.ExploreWho();
		search.Explorewhen();
		search.ExplorePrice();
		search.Sort();
		s.screenshot();
		search.Clear();
	}
	
	@Test (priority=1)
	public void CityCategorySearchBar() throws Exception
	{
		AdvanceSearchPageObjects search=PageFactory.initElements(driver, AdvanceSearchPageObjects.class);
		Screenshot s=new Screenshot(driver);
        
		search.City();
		search.WhatCategory();
		search.Explore();
		search.ExploreWho();
		search.Explorewhen();
		search.ExplorePrice();
		search.Sort();
		s.screenshot();
		search.Clear();
	}
	
	@Test (priority=2)
	public void CityDateSearchBar() throws Exception
	{
		AdvanceSearchPageObjects search=PageFactory.initElements(driver, AdvanceSearchPageObjects.class);
		Screenshot s=new Screenshot(driver);
        
		search.City();
		search.Timeslot();
		search.Explore();
		search.ExploreWhat();
		search.ExploreWho();
		search.ExplorePrice();
		search.Sort();
		s.screenshot();
		search.Clear();
	}
	
	@Test  (priority=3)
	public void CityCategoryDateSearchBar() throws Exception
	{
		AdvanceSearchPageObjects search=PageFactory.initElements(driver, AdvanceSearchPageObjects.class);
		Screenshot s=new Screenshot(driver);
 
		search.City();
		search.WhatCategory();
		search.Timeslot();
		search.Explore();
		search.ExploreWho();
		search.ExplorePrice();
		search.Sort();
		s.screenshot();
		search.Clear();
	}

}
