package royaltest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageBase.StartPagee;
import royalpage.RoyalPage;

public class RoyalTest extends StartPagee  {
	RoyalPage royal;
	@BeforeMethod
	public void Start() throws IOException {
		launchBrowser();
	}
	@Test
	public void Testing() throws InterruptedException {
		royal = new RoyalPage(driver);
		
		royal.Extract_Whale();
		

		Thread.sleep(3000);

		royal.shipClick();
		Thread.sleep(3000);

		royal.rhapsodyOfShips();
		Thread.sleep(3000);

		royal.Deck_plan();
		Thread.sleep(3000);

		royal.select_Deck();
		Thread.sleep(5000);
		royal.check_Suite();
		
	}
   @AfterMethod
   public void close() {
	   quit();
   }

}
