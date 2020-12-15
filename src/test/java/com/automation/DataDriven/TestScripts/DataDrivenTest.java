package com.automation.DataDriven.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.automation.DataDriven.Utilities.ExcelReader1;

public class DataDrivenTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelReader1 excelReader = new ExcelReader1("H:\\Workspace\\DataDriven_POM\\src\\main\\java\\com\\DataDriven\\POM\\DataFiles\\Registration_Deatils.xlsx");
		  String Name=excelReader.getCellData("userdetails", "Name", 2);
		  System.out.println(Name);
		
		  String Email=excelReader.getCellData("userdetails", "Email", 2);
		  System.out.println(Email);
		  
		  String Standard=excelReader.getCellData("userdetails", "Standard", 2);
		  System.out.println(Standard);
		  
		  String Password=excelReader.getCellData("userdetails", "Password", 2);
		  System.out.println(Password);
		//String Mobile =excelReader.getSingleCelldata("Sheet2", 2, 1);
		  String Mobile =excelReader.getCellData("userdetails","Mobile",2);
		 System.out.println(Mobile);
		 //int rowcount=excelReader.getRowCount("Sheet2");
		
		 //Parameteraztion
			/*
			 * for (int rows = 2; rows <=rowcount; rows++) { String
			 * Name=excelReader.getCellData("Sheet2", "Name",rows );
			 * System.out.println("****************"); System.out.println(Name); String
			 * Mobile=excelReader.getCellData("information", "Mobile", rows);
			 * System.out.println(Mobile); String
			 * Email=excelReader.getCellData("information", "Email", rows);
			 * System.out.println(Email); String
			 * Message=excelReader.getCellData("information", "Message", rows);
			 * System.out.println(Message); }
			 */
		 
	}
	
		
		
	}
	
	
	
			


