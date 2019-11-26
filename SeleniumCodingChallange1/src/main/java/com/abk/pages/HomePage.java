package com.abk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abk.base.TestBase;
import com.abk.utils.Javascript;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='search-input-location']")
	static WebElement searchBox;
	
	@FindBy(id="search-submit")
	static WebElement searchButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public  void setTextOnSearchBox(String cityName) {
		System.out.println("set text on search box method ======>");
		Javascript.scrollToViewElement(searchBox);
		searchBox.sendKeys(cityName);
	}
	
	public  void clickOnSearchButton() {
		Javascript.scrollToViewElement(searchButton);
		Javascript.advancedClick(searchButton);
	}

}
