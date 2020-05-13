package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotPage {
	public void takeScreenshot(WebDriver driver, File path) throws IOException {
		 {
			    TakesScreenshot shot = (TakesScreenshot)driver;
			    File img = (File)shot.getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(img, path);
			  }
	}
}
