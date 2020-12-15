package com.automation.DataDriven.BaseEngine;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String tcname;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	@Parameters({"browsertype"})
	@BeforeSuite
	public static void openBrowser(@org.testng.annotations.Optional("chrome") String browsertype){		
	   
		String currentdir = System.getProperty("user.dir");
		 WebDriverManager.chromedriver().setup();
		 if (browsertype.equalsIgnoreCase("chrome")) {				
				driver=new ChromeDriver();
						 
				}
		
		else if(browsertype.equalsIgnoreCase("chrome-headless"))
		{
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);   
					 
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
	
	@BeforeMethod
	public void BeforeTCExecution(Method method) {
		tcname=method.getName();
		System.out.println("The Present Testcase is :"+tcname);
		extentTest = extentReports.startTest(tcname);
		getExtentTest().log(LogStatus.INFO, "Current Executing Testcase Is :" +tcname);
		
		
		
	}
	@BeforeTest
	public void initReports() {
		extentReports = new ExtentReports("H:\\Workspace\\DataDriven_FrameWork\\ExtentReports\\Reports.html");
		
	}
	
	@AfterTest
	public void generateReports() {
		Optional optional = Optional.ofNullable(extentReports);
		if (optional.isPresent()) {
			extentReports.close();			
			
			
			
		}
		else {
			System.out.println("Extent Reoprts Pointing To Null");
		}
		 
	}
	@AfterMethod
	public void AfterTCExcution(ITestResult result) throws IOException {
		extentReports.endTest(extentTest);
		  extentReports.flush();
		  driver.close();
		  
	}
	
	@AfterSuite
	public static WebDriver getDriver( ){
		return driver;
		
	}
	public static String getTcName() {
		return tcname;
	}
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
	@AfterClass
	public void quit() {
		driver.close();
	}
	

}
