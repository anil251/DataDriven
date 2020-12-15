package com.automation.DataDriven.BaseEngine;

import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends BaseClass {
	
	public static void lunch_url(String url) throws IOException {
		getExtentTest().log(LogStatus.INFO, "Browser is Opened " +url);
		getDriver().get(url);			
		
	}
	
	
	

}
