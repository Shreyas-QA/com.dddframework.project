package com.dddframework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "(//button[@class='nav-item-link child-menu'])[1]")
	public WebElement ProductsTab;

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

//	public List<WebElement> DisplayMenuOnHomePage() {
//
//		List<WebElement> elementName = driver.findElements(By.xpath("//ul[@id='toggleNav']/li"));
//		for (WebElement en : elementName) {
//
//			System.out.println(en.getText());
//		}
//
//		return elementName;
//
//	}

	public void ClickProductTab() {
		ProductsTab.click();
	}

}
