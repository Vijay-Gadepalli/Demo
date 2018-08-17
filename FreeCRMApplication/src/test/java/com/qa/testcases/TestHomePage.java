package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.ContactsPage;
import com.qa.pages.DealsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class TestHomePage extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	ContactsPage contactspage;
	
	public TestHomePage() {
		super();
	}
		
	@BeforeMethod
	public void set_up() throws Exception
	{
		intilization();
		loginpage= new LoginPage();
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void Username_label_test()
	{
		boolean flag= homepage.username_label_check();
		Assert.assertTrue(flag);
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void click_on_contacts_link_test()
	{
		contactspage= homepage.click_on_contacts_link();
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void click_on_deals_link()
	{
		dealspage=homepage.click_on_deals_link();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}	
}
