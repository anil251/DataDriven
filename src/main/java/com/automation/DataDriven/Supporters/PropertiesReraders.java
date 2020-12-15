package com.automation.DataDriven.Supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class PropertiesReraders {
	
	public String filepath;
	public FileInputStream fis;
	public Properties properties;
	public String value;
	 
	public PropertiesReraders(String filepath) throws IOException {
		this.filepath =filepath;
		 fis= new FileInputStream(filepath);
		 properties = new Properties();
		 Optional<Properties> optional=Optional.ofNullable(properties);
		 if (optional.isPresent()) {
			 properties.load(fis);
			
		}
		 else {
			System.out.println("Properties Pointing To Null");
		}	 
		 
		
	}
	
	public String getValueForKey(String Key) {
		 value = properties.getProperty(Key);
		return value;
	}

}
