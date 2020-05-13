package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	public WebDriver driver;

	public void Browserlaunch() { // To launch the browser

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "J:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "J:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize(); // maximize window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // wait for specified time
		driver.get("https://www.spicejet.com/"); // gets site

	}

	public void quit() {

		driver.close(); // To close the browser
	}

}
