package com.qa.utilities;

import org.openqa.selenium.WebDriver;

import com.qa.testbase.TestBase;

public class Utilities extends TestBase{
	
	
						//Switch To Frame
	
	public static void switch_to_frame(String frame_name)
	{
		driver.switchTo().frame(frame_name);
	}
	
						// Capture screen shot for failure
	public static String captureScreenshotForFailureTest(WebDriver driver, String testname )
	{
		
		
		String final_destination=null;
		return final_destination;
		
		
	}

}
