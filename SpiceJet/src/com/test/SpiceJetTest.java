package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.page.SpiceJetPage;
import com.screenshot.ScreenshotPage;
import com.utilites.ReadValues;

public class SpiceJetTest extends BasePage {
	SpiceJetPage spicejet;
	ScreenshotPage screenshot = new ScreenshotPage();
	ReadValues data = new ReadValues();

	@BeforeMethod
	public void Start() throws InterruptedException {
		Browserlaunch();
		Thread.sleep(3000);
	}

	@Test
	public void Testing() throws InterruptedException, IOException {
		spicejet = new SpiceJetPage(driver);
		spicejet.getTitle();
		spicejet.depCity(data.getDeparturecity(0));
		spicejet.ariveCity(data.getArrivecity(0));
		spicejet.journeyDate();
		spicejet.tickets();
		spicejet.search();
		
		File path=new File("J:\\eclipse\\SpiceJet\\ScreenShots\\spicejet.png");
		screenshot.takeScreenshot(driver, path);
		spicejet.getAssert();
	}

	@AfterMethod
	public void end() {
		quit();
	}
}
