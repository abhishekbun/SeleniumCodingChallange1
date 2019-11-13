package com.abk.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.abk.crm.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase(){
		System.out.println("HI");
		try {
			prop = new Properties();
			File file = new File(System.getProperty("user.dir")+"/src/main/java/com/abk/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			
			prop.load(fis);
			System.out.println("Hello");
			
		}
		catch(FileNotFoundException e1) {
			
		}
		catch(IOException e2) {
			
		}
		
	}
	public static void initialization() {
		
		String browser = prop.getProperty("browser");
		
		getPath(browser);
		driver.get(prop.getProperty("executionEnvironment"));
		driver.manage().window().maximize();
		
	}
	
	public static void getPath(String browser) {
		
		String os = System.getProperty("os.name");
		System.out.println("Operating system type is" + os);
		String driverPath = null;
		
		if(os.toUpperCase().contains("WINDOWS")) {
			
			if(browser.toUpperCase().contains("CHROME") || browser.toUpperCase().contains("GOOGLE CHROME")) {
				
				driverPath = ".//src//main//java//com//abk//resources//chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
				
			}
			else if(browser.toUpperCase().contains("FIREFOX") || browser.toUpperCase().contains("MOZILA")) {
				
				driverPath = ".//src//main//java//com//abk//resources//geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", driverPath);
				driver = new FirefoxDriver();
				
			}
			else if(browser.toUpperCase().contains("IE") || browser.toUpperCase().contains("INTERNET EXPLORER")) {
				
				
			}
			
		}
		else if(os.toUpperCase().equalsIgnoreCase("MAC")) {
			
			if(browser.toUpperCase().contains("CHROME") || browser.toUpperCase().contains("GOOGLE CHROME")) {
				
				driverPath = ".//src//main//java//com//abk//resources//chromedriver";
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
				
			}
			else if(browser.toUpperCase().contains("FIREFOX") || browser.toUpperCase().contains("MOZILA")) {
				
				driverPath = ".//src//main//java//com//abk//resources//geckodriver";
				System.setProperty("webdriver.gecko.driver", driverPath);
				driver = new FirefoxDriver();
				
			}
			else if(browser.toUpperCase().contains("IE") || browser.toUpperCase().contains("INTERNET EXPLORER")) {
				
				
			}
			
			
		}
		else if(os.equalsIgnoreCase("linux")) {
			
			
			
		}
	}
	/*public static void main(String[] args) {
		TestBase t1 = new TestBase();
		initialization();
	}
*/
}
