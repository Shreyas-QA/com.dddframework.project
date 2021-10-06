package com.dddframework.test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.collections.Lists;

public class BaseTest {

	public static WebDriver driver;

	@BeforeSuite
	public void initialize() throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		// headless Mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--window-size=1920,1080");
		driver = new ChromeDriver(options);

		// To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// To open facebook
		driver.get("https://www.salesforce.com/in/");
	}

	@AfterSuite
	// Test cleanup
	public void TeardownTest() {
		BaseTest.driver.quit();
	}
	public static void main(String[] args) {
	    TestListenerAdapter tla = new TestListenerAdapter();
	    TestNG testng = new TestNG();
	    List<String> suites = Lists.newArrayList();
	    suites.add("C:\\Users\\shreyas.sambare\\eclipse-workspace\\com.dddframework.project\\testNG.xml");//path to xml..
	    
	    testng.setTestSuites(suites);
	    testng.run();
	}

}
