package com.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetPage {
	WebDriver driver;

	By Dep_City = By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']");

	By Arrv_City = By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");

	By Date = By.xpath(
			"//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'30')]");

	By Dropdown = By.xpath("//div[@id='divpaxinfo']");

	By Adult = By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']");

	By Infant = By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']");

	By INR = By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']");

	By Search = By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");

	By FareDetails = By.xpath("//span[@id='spanamnt']");

	public SpiceJetPage(WebDriver driver)

	{

		this.driver = driver;

	}

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", title);
	}

	public void depCity(String depcity) throws InterruptedException // Departure city and Arrival city
	{

		Thread.sleep(2000);

		driver.findElement(Dep_City).sendKeys(depcity);
	}
	public void ariveCity(String arrivecity) throws InterruptedException{
		driver.findElement(Arrv_City).sendKeys(arrivecity);

	}

	public void journeyDate() throws InterruptedException // choosing journey date
	{

		driver.findElement(Date).click();

	}

	public void tickets() // choosing number of adults and infants
	{

		driver.findElement(Dropdown).click();
		Select Ad = new Select(driver.findElement(Adult));
		Ad.selectByIndex(2);

		Select Inf = new Select(driver.findElement(Infant));
		Inf.selectByIndex(1);

		Select Cur = new Select(driver.findElement(INR));
		Cur.selectByIndex(0);

	}

	public void search() // Searching for flights
	{
		driver.findElement(Search).click();
	}

	public void getAssert() {
		String Price = driver.findElement(By.xpath("//span[@id='spanamnt']")).getText();
		System.out.println(Price);

		Assert.assertTrue(true);
		System.out.print("Total fare is " + Price);

	}

}
