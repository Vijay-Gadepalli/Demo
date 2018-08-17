package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	static public Properties prop;
	static public WebDriver driver;
	
	public TestBase()
	{
			try {
				prop = new Properties();
				String filepath= System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\configurations\\config.properties";
				FileInputStream ip = new FileInputStream(filepath);
				prop.load(ip);				
			    }
			
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}				
	}
	
	public static void intilization()
	{
		if(prop.getProperty("browser").contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\512528\\Desktop\\Vijay_Personal\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		
		else if(prop.getProperty("browser").contains("mozilla"))
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));		
	}
}
