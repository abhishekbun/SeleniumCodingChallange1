package com.abk.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.abk.base.TestBase;

public class Javascript extends TestBase{
	
	static JavascriptExecutor js = ((JavascriptExecutor)driver);
	
	public static void scrollToViewElement(WebElement element) {
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	
	public static void scrollToPageBottom() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void advancedClick(WebElement clickElement) {
		
		try {
			clickElement.click();
		}catch(Exception e) {
			js.executeScript("arguments[0].click();", clickElement);
		}
	}

}
