package bmwtest.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import base.com.ClassBase;
import bmwpage.com.BmwPage;

public class BmwTest extends ClassBase{
	final static Logger logger = LogManager.getLogger(BmwTest.class.getName());
	BmwPage bmw;
	
	@BeforeMethod
	@Parameters( "browser" )
	public void start() throws IOException {
		Browserlaunch();
	}
	@Test
	public void tests() throws Throwable {
		bmw = new BmwPage(driver);
		bmw.Click_model();
		bmw.click_seven();
		
		bmw.Carselect();
		
		bmw.Techincal_Data();

 
		bmw.Top_speed();
		File path=new File("J:\\eclipse\\BMW\\Screenshots\\model.png");
		takeScreenshot(driver, path);
	
	}
	@AfterMethod
	public void close() {
		quit();
	}
	
  
}
