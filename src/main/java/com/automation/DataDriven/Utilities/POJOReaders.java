package com.automation.DataDriven.Utilities;

import java.io.IOException;

import com.automation.DataDriven.Supporters.PropertiesReraders;

public class POJOReaders {
	public static  PropertiesReraders prconf;
	public static  PropertiesReraders pror;
	public static  PropertiesReraders excel;
	
	public static PropertiesReraders getconfPropertiesReraders() throws IOException {
		prconf = new PropertiesReraders(FilePaths.configpath);
		return prconf;
	}
	
	public static PropertiesReraders getorPropertiesReraders() throws IOException {
		pror = new PropertiesReraders(FilePaths.orpath);
		return pror;
	}
	public static PropertiesReraders getexcelPropertiesReraders() throws IOException {
		excel = new PropertiesReraders(FilePaths.excelpath);
		return excel;
	}

}
