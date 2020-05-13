package com.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.Base.LibraryClass;
import com.pages.SearchPage;

public class SearchTest extends LibraryClass {
	@BeforeClass
	public void start() throws IOException {
     Browserlaunch();
	}

	@Test
	public void testing() throws Throwable  {
	SearchPage kohl = new SearchPage(driver);
	kohl.Search_item();
	kohl.Sort_Feature();
	kohl.Select_price();
	kohl.Select_firstitem();
	Thread.sleep(5000);
	kohl.Select_size();
	Thread.sleep(5000);
	kohl.Quantity_select();
	Thread.sleep(5000);
	kohl.Addtocart_select();
	Thread.sleep(5000);
	kohl.To_Find();
	}

	@AfterClass
	public void closeapp() {

	//Seleniumutil screenshot = new Seleniumutil(driver);
	//screenshot.takeSnapShot("F:\\krishna chaitanya\\BMW\\screenshot.png");

	quit();
	}
	}