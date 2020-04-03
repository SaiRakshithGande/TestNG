package com.Opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart_ComparePage {
WebDriver driver;
	

	public void opening() 
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");//browser name and url
		driver = new ChromeDriver();//assigning chrome driver properties to driver
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//wait for specified time
		driver.get("https://demo.opencart.com/");//get site link from user
		
	}

	public void compare() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]/i")).click();//click one item to be compared
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[3]/i")).click();//click other item for comparison with previous one
		Thread.sleep(3000);//wait for specified time
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/a[2]")).click();
		
		String a=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[3]/td[2]")).getText();//get price
		String b=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[3]/td[3]")).getText();//get price
		System.out.println(a);//print price of first item
		System.out.println(b);//print price of second item
		Thread.sleep(3000);//wait for specified time
		driver.close();//close browser
		
	
	}
	

}
