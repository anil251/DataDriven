package com.automation.DataDriven.TestScripts;

import org.testng.annotations.Test;

import com.automation.DataDriven.BaseEngine.ActionEngine;
import com.automation.DataDriven.BaseEngine.BaseClass;
import com.automation.DataDriven.Utilities.POJOReaders;

public class Verify_Loan_Enquiry extends BaseClass {
	@Test
	public void homepage() throws Exception {
    String url =POJOReaders.getconfPropertiesReraders().getValueForKey("url");		
	ActionEngine.lunch_url(url);	
	Get2loan_Enquiry.button_close();
	Get2loan_Enquiry.Click_Contactus();
	
	}
	
	
}
