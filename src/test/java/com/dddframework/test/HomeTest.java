package com.dddframework.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dddframework.pages.HomePage;

public class HomeTest extends BaseTest {

	@Test
	public void ViewMenu() {

		HomePage hpage = PageFactory.initElements(driver, HomePage.class);
		hpage.ClickProductTab();
	}

}
