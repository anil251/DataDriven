package com.automation.DataDriven.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.automation.DataDriven.BaseEngine.BaseClass;
import com.automation.DataDriven.Utilities.ExcelReader1;
import com.automation.DataDriven.Utilities.POJOReaders;
import com.relevantcodes.extentreports.LogStatus;

public class Get2loan_Enquiry extends BaseClass {
	
	public static void button_close() throws IOException {
		getExtentTest().log(LogStatus.INFO, "Click On Close Button");
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("btn_close_xpath"))).click();	
		getExtentTest().log(LogStatus.PASS, "Button Clicking Successfully");
		
	}
	public static void Click_Contactus() throws IOException {
		getExtentTest().log(LogStatus.INFO, "Click On Enquiry Button");
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("contact_xpath"))).click();
		getExtentTest().log(LogStatus.PASS, "Contact Button Clicking Successfully");
		ExcelReader1 excelReader = new ExcelReader1("H:\\Workspace\\DataDriven_FrameWork\\src\\"
				+ "main\\java\\com\\automation\\DataDriven\\DataFiles\\contacts_details.xlsx");
		
		 int rowcount=excelReader.getRowCount("Sheet2");
		 excelReader.addColumn("Sheet2", "Status");
		
			
		 //Parameteraztion
		for (int rows = 2; rows <=rowcount; rows++) {
			String Name=excelReader.getCellData("Sheet2", "Name",rows );
			System.out.println("****************");
			System.out.println(Name);
			String Mobile=excelReader.getCellData("information", "Mobile", rows);
			System.out.println(Mobile);
			String Email=excelReader.getCellData("information", "Email", rows);
			System.out.println(Email);
			String Message=excelReader.getCellData("information", "Message", rows);
			System.out.println(Message);
		
		
//		  String Name=excelReader.getCellData("information", "Name", 3);
//		  System.out.println(Name);
//		  String Mobile=excelReader.getCellData("information", "Mobile", 3);
//		  System.out.println(Mobile);
//		  String Email=excelReader.getCellData("information", "Email", 3);
//		  System.out.println(Email);
//		  String Message=excelReader.getCellData("information", "Message", 3);
//		  System.out.println(Message);
			getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("name_xpath"))).clear();
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("name_xpath"))).sendKeys(Name);
		
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("phone_xpath"))).clear();
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("phone_xpath"))).sendKeys(Mobile);
		
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("email_id"))).clear();
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("email_id"))).sendKeys(Email);
		
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("message_xpath"))).clear();
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("message_xpath"))).sendKeys(Message);
		
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("submit_xpath"))).click();
		excelReader.setCellData("Sheet2", "Status", rows, "Pass");
		}
		
	}

	
	
	
	

}
