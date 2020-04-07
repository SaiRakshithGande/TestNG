package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opencart_BrandPage {
 @FindBy(linkText="Brands")
 WebElement Brand;
 @FindBy(linkText="Apple")
 WebElement AppleBrand;
 @FindBy(xpath="(//button[@type='button'])[10]")
 WebElement Wishlist;
 public Opencart_BrandPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
 }
 
 public void Branding() throws InterruptedException {
	 Brand.click();
	 Thread.sleep(3000);
 }
 public void Product() throws InterruptedException {
	 AppleBrand.click();
	 Thread.sleep(3000);
 }
 public void Wish() throws InterruptedException {
	 Wishlist.click();
	 Thread.sleep(3000);
 }
 
 
 
 
 
 
 
 
}
