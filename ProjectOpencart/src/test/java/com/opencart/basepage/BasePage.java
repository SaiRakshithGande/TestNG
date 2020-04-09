package com.opencart.basepage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	public WebDriver driver;

	public void Browserlaunch() { // To launch the browser

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize(); // maximize window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // wait for specified time
		driver.get("https://demo.opencart.com/"); // gets site

	}

	public void quit() {

		driver.close(); // To close the browser
	}

}
