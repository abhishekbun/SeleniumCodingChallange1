package org.abk.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.abk.base.TestBase;
import com.abk.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		homePage = new HomePage();
		
	}
	
	@Test
	public void searchForHome() throws InterruptedException {
		String cityName = prop.getProperty("city");
		System.out.println(cityName);
		homePage.setTextOnSearchBox(cityName);
		Thread.sleep(5000);
		homePage.clickOnSearchButton();
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
		int priceCount = prices.size();
		for(int i = 3; i<priceCount; i++) {
			System.out.println(prices.get(i).getText());
		}
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
