package com.abk.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public static Properties prop;
	
	public TestBase(){
		
		try {
			prop = new Properties();
			
			FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/java/org/abk/crm/config/config.properties"));
			
			prop.load(fis);
		}
		catch(FileNotFoundException e1) {
			
		}
		catch(IOException e2) {
			
		}
		
	}

}
