package com.abk.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
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
	public static void initialization() {
		
		String browser = prop.getProperty("browser");
		
	}
	
	public static void getPath(String browser) {
		
		String os = System.getProperty("os.name");
		
		String driverPath = null;
		
		if(os.equalsIgnoreCase("windows")) {
			
			if(browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("google chrome")) {
				
				driverPath = ".//src//main//java//com//abk//resources//chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("mozila")) {
				
				driverPath = ".//src//main//java//com//abk//resources//geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", driverPath);
				driver = new FirefoxDriver();
				
			}
			else if(browser.equalsIgnoreCase("ie") || browser.equalsIgnoreCase("internet explorer")) {
				
				
			}
			
		}
		else if(os.equalsIgnoreCase("mac")) {
			
			if(browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("google chrome")) {
				
				driverPath = ".//src//main//java//com//abk//resources//chromedriver";
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("mozila")) {
				
				driverPath = ".//src//main//java//com//abk//resources//geckodriver";
				System.setProperty("webdriver.gecko.driver", driverPath);
				driver = new FirefoxDriver();
				
			}
			else if(browser.equalsIgnoreCase("ie") || browser.equalsIgnoreCase("internet explorer")) {
				
				
			}
			
			
		}
		else if(os.equalsIgnoreCase("linux")) {
			
			
			
		}
	}

}
