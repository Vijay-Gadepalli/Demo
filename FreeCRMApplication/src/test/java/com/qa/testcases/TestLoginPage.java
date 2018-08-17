package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class TestLoginPage extends TestBase {
	 LoginPage loginpage;
	 HomePage homepage;
	
	
	public TestLoginPage() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intilization();
		loginpage = new LoginPage();		
	}	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	//Login Page Tittle Test
	public void LoginpageTitleTest()
	{
		String tittle= loginpage.validateLoginPageTitle();
		Assert.assertEquals(tittle, "#1 Free CRM software in"
				+ " the cloud for sales and service");		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	 //CRM LOgo Check
	public void CRMLogoTest()
	{
		boolean logo_check= loginpage.ValidateCRMlogo();
		Assert.assertEquals(logo_check, true);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void logintest() throws Exception
	{
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));			
		
	}		
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
