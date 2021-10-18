package Utilties;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivers {

	public static WebDriver driver;

	public static WebDriver getDriver(String driverName) {
		// Return chrome driver
		try {
			if (driverName.equalsIgnoreCase("chrome")) {

				return chrome();
			}
			// Return firefox driver
			if (driverName.equalsIgnoreCase("firefox")) {

				// return firefox();
			}
			// Return opera driver
			if (driverName.equalsIgnoreCase("opera")) {

				// return opera();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ChromeDriver chrome() {
		try {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}