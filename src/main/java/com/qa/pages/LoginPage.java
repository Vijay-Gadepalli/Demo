package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	
						//page-Library
						//Object Repository
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[@type='submit']") WebElement LoginButton;
	@FindBy	(xpath="//img[@alt='free crm logo']")WebElement Logo;
	
						//Intiliazing page factory
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
						//Functionalities in Login Page
	
	
	//1. to validate page title
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	//2.to validate crm image
	public boolean ValidateCRMlogo()
	{
		return Logo.isDisplayed();
	}
	
	
	//3. to login in the application
	public HomePage Login(String un, String pwd) throws Exception
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		LoginButton.click();
		return new HomePage();		
	}	
}
