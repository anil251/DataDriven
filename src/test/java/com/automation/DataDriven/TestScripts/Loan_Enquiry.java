package com.automation.DataDriven.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.DataDriven.BaseEngine.BaseClass;
import com.automation.DataDriven.Utilities.POJOReaders;
import com.relevantcodes.extentreports.LogStatus;

public class Loan_Enquiry extends BaseClass {
	
	@Test(priority = 0)
	
	public void loan_enquiry() throws Exception {
		
		getDriver().get(POJOReaders.getorPropertiesReraders().getValueForKey("product_url"));
		getExtentTest().log(LogStatus.INFO,"Browser Is Opened");			
		getExtentTest().log(LogStatus.PASS, "Detailed Button Is Clicked");
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("btn_close_id"))).click();
		getExtentTest().log(LogStatus.PASS, "Detailed Button Is Closed");
		
		WebElement products =getDriver().findElement(By.linkText("PRODUCTS"));
		
		Actions actions = new Actions(getDriver());
		actions.moveToElement(products).build().perform();
		WebElement carloan = getDriver().findElement(By.linkText("CAR LOAN"));
		carloan.click();
		
		System.out.println("The Title Is: " +getDriver().getTitle());
		String text="As part of the documentation process";
		if (getDriver().getPageSource().contains("the documentation process")) {
			
			System.out.println("The Text is : "+text+" Is Present");
			
		}
		else {
			System.out.println("The Text is : "+text+" Is Not Present");
		}
		
		getDriver().findElement(By.xpath("//a[@class='buttonn']")).click();
		getExtentTest().log(LogStatus.INFO, "Enter Name");
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("name_id"))).sendKeys(POJOReaders.getorPropertiesReraders().getValueForKey("key_value"));
		getExtentTest().log(LogStatus.INFO, "Enter Phone Number");
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("phone_id"))).sendKeys(POJOReaders.getorPropertiesReraders().getValueForKey("key_no"));
		getExtentTest().log(LogStatus.INFO, "Enter Email");
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("email_id"))).sendKeys(POJOReaders.getorPropertiesReraders().getValueForKey("key_mail"));
		
		WebElement loantype=getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("c_loan")));
		boolean status =loantype.isDisplayed();
		if (status) {
			System.out.println("The Present Selected  Loan Is :"+status);
			System.out.println("The Select Loan Is :"+loantype.getAttribute("value"));
			
		}
		else {
			System.out.println("The Loan is Not Selected");
		}
		getExtentTest().log(LogStatus.INFO, "Typing Message");
		getDriver().findElement(By.id(POJOReaders.getorPropertiesReraders().getValueForKey("message_d"))).sendKeys(POJOReaders.getorPropertiesReraders().getValueForKey("message"));
		getExtentTest().log(LogStatus.INFO, "Send Message");
		getDriver().findElement(By.xpath(POJOReaders.getorPropertiesReraders().getValueForKey("submit"))).click();
		
		String text1="We've Just Recieved Your Information";
		if (getDriver().getPageSource().contains("Just Recieved")) {
			
			System.out.println("The Text is : "+text1+" Is Present");
			
		}
		else {
			System.out.println("The Text is : "+text1+" Is Not Present");
		}
		getExtentTest().log(LogStatus.INFO, "Detailed Submmited Successfully");
		System.out.println("Details Submitted Suuccessfully");
		
	}

}
