package com.qa.utilities;

import com.qa.testbase.TestBase;

public class Utilities extends TestBase{
	public static void switch_to_frame(String frame_name)
	{
		driver.switchTo().frame(frame_name);
	}

}
