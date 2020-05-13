package base.com;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassBase {
	public WebDriver driver;
	 public FileInputStream file;
	public Properties prop;
	public void Browserlaunch() throws IOException { // To launch the browser
  file= new FileInputStream("J:\\eclipse\\BMW\\config.properties");  
		//String browser = "chrome";
 prop = new Properties();
prop.load(file);
String browse = prop.getProperty("browser");
String link = prop.getProperty("url");
		if (browse.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "J:\\Gitrepo\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browse.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize(); // maximize window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // wait for specified time
		driver.get(link); // gets site
	}
		public void takeScreenshot(WebDriver driver, File path) throws IOException {
			 {
				    TakesScreenshot shot = (TakesScreenshot)driver;
				    File img = (File)shot.getScreenshotAs(OutputType.FILE);
				    FileUtils.copyFile(img, path);
				  }
		}
	
	public void quit() {

		driver.close(); // To close the browser
	}

}
