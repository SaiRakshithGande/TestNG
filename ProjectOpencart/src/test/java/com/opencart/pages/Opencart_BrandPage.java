package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opencart_BrandPage {
	@FindBy(linkText = "Brands")
	WebElement Brand;
	@FindBy(linkText = "Apple")
	WebElement AppleBrand;
	@FindBy(xpath = "(//button[@type='button'])[10]")
	WebElement Wishlist;

	public Opencart_BrandPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void getBrand() throws InterruptedException {
		Brand.click();// To click on brand

	}

	public void getProduct() throws InterruptedException {
		AppleBrand.click();// To click on Apple brand

	}

	public void addToWishList() throws InterruptedException {
		Wishlist.click();// To add to wishlist
		Thread.sleep(3000);
	}

}
