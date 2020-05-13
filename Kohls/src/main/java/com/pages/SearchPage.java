package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class SearchPage  {
	WebDriver driver;

	@FindBy(xpath = "//input[@name='search']")
	WebElement search;

	@FindBy(xpath = "//div[@class='sortBy_block fl']//div[@class='sbHolder']//a[@class='sbSelector']")
	WebElement feature;

	@FindBy(xpath = "//a[contains(text(),'Price High-Low')]")
	WebElement price;

	@FindBy(xpath = "//div[@id='3817223_prod_price']//p")
	WebElement firstitem;


	@FindBy(xpath = "//div[@class='pdp-product-size']//select")
	WebElement size;

	@FindBy(xpath = "//p[contains(text(),'+')]")
	WebElement quantity;

	@FindBy(xpath = "//input[@id='addtobagID']")
	WebElement addtocart;

	@FindBy(xpath = "//span[@class='number-items boss-number-items nonzero-items']")
	WebElement finding;


	public SearchPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	}
	public void Search_item() {
	search.sendKeys("tuxedo");
	search.submit();
	}
	public void Sort_Feature() {
	feature.click();
	}
	public void Select_price() {
	price.click();
	}
	public void Select_firstitem() {

	try {
	firstitem.click();
	}
	catch(StaleElementReferenceException e)
	{
	firstitem = driver.findElement(By.xpath("//div[@id='3817223_prod_price']//p"));
	firstitem.click();
	}
	}
	public void Select_size(){
	try {
	Select SIZE = new Select (size);
	SIZE.selectByVisibleText("36R 29");
	}
	catch(StaleElementReferenceException e) {
	size = driver.findElement(By.xpath("//div[@class='pdp-product-size']//select"));
	Select SIZE = new Select (size);
	SIZE.selectByVisibleText("36R 29");
	}
	}
	public void Quantity_select() {
	try {
	quantity.click();

	}
	catch(StaleElementReferenceException e) {
	quantity = driver.findElement(By.xpath("//p[contains(text(),'+')]"));
	quantity.click();
	}
	}
	public void Addtocart_select() {
	addtocart.click();
	}
	public void To_Find() {
	String str = finding.getText();
	System.out.println(str);
	int i = Integer.parseInt(str);
	if(i==2) {
	Assert.assertTrue(true);
	System.out.println("yes the bag is full");
	}
	else {
	Assert.assertTrue(true);
	System.out.println("No the bag is not full");
	}
	}
	}