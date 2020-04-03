package com.Opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart_WishListPage {
          WebDriver driver;
	

	public void loginpass() 
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click(); //click my account
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click(); //select login
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("rakshith1998@gmail.com"); //enter registered emailid
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("rakshith3788"); //enter password
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click(); //click login
		

	}

	public void wish() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a")).click(); //select wish list from my account
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/i")).click(); //click the wish list
		Thread.sleep(3000); //wait for specified time
		driver.close(); //close the tab
	}

	
}
