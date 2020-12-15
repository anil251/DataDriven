package com.automation.DataDriven.Supporters;


import com.automation.DataDriven.BaseEngine.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Utilities extends BaseClass{
	
	public void Loginfo(String info) {
		if (info=="INFO") {		
		getExtentTest().log(LogStatus.INFO, info);
		}
		else if(info=="PASS") {
			getExtentTest().log(LogStatus.PASS, info);
			
		}
		else if (info=="FAIL") {
			getExtentTest().log(LogStatus.FAIL, info);
			
		}
		else if (info=="SKIP") {
			getExtentTest().log(LogStatus.SKIP, info);
			
			
		}
		else if (info=="ERROR") {
			getExtentTest().log(LogStatus.ERROR, info);
			
		}
	}
	public void Loginfo(String info,String detailedinfo) {
		if (info=="INFO") {
			getExtentTest().log(LogStatus.INFO, info,detailedinfo);			
			
		}
		else if (info=="PASS") {
			getExtentTest().log(LogStatus.PASS, info,detailedinfo);
			
		}
		else if (info=="FAIL") {
			getExtentTest().log(LogStatus.FAIL, info,detailedinfo);
			
		}
		else if (info=="SKIP") {
			getExtentTest().log(LogStatus.SKIP, info,detailedinfo);
			
		}
		else if (info=="ERROR") {
			getExtentTest().log(LogStatus.ERROR, info,detailedinfo);
			
		}
	}

}
