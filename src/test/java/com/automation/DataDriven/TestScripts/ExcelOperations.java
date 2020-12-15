package com.automation.DataDriven.TestScripts;

import com.automation.DataDriven.Utilities.ExcelReader1;

public class ExcelOperations {
	public static void main(String[] args) {
		ExcelReader1 excelReader = new ExcelReader1("H:\\Workspace\\DataDriven_FrameWork\\"
				+ "src\\main\\java\\com\\automation\\DataDriven\\DataFiles\\contacts_details.xlsx");
		
		if (!excelReader.isSheetExist("LoginPage3")) {
			excelReader.addSheet("LoginPage3");
			System.out.println("Sheet Already Exists");
			
		}
		
		
		
		
	}

}
