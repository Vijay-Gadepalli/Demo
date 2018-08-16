package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;
import com.qa.utilities.Utilities;

public class HomePage extends TestBase {
	
					//Page-Factory
			
	@FindBy(xpath="//td[contains(text(),'Vijay')]") WebElement user_label;
	@FindBy(xpath="//a[@title='Contacts']") WebElement contacts_link;
	@FindBy(xpath="//a[@title='Deals']") WebElement deals_link;
	
		
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
					//Functionalities
	
	//Username label check
	public boolean username_label_check()
	{
		Utilities.switch_to_frame("mainpanel");
		return user_label.isDisplayed();
	}
	
	//Click on Contacts link
	public ContactsPage click_on_contacts_link()
	{
		Utilities.switch_to_frame("mainpanel");
		contacts_link.click();
		return new ContactsPage();		
	}
	
	//Click on Deals page
	public DealsPage click_on_deals_link()
	{
		Utilities.switch_to_frame("mainpanel");
		deals_link.click();
		return new DealsPage();
}
}
