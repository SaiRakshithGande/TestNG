package royalpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RoyalPage {
	WebDriver driver;
	String whale = null;
	@FindBy(xpath = "//*[@id=\"rciHeaderOpenSidenav\"]/div")
	WebElement menu;
	@FindBy(xpath = "//*[@id=\"rciHeaderSideNavMenu-1\"]/span")
	WebElement crusie;
	@FindBy(xpath = "//*[@id=\"rciHeaderCloseSidenav\"]/div")
	WebElement close;
	@FindBy(xpath = "//*[@id=\"rciHeaderMenuItem-2\"]")
	WebElement ships;
	@FindBy(xpath = "//p[contains(text(),'Rhapsody of the Seas')]")
	WebElement rhapsodyOfShips;
	@FindBy(xpath = "//a[contains(text(),'DECK PLANS')]")
	WebElement deckPlan;
	@FindBy(id = "deckDropdown")
	WebElement deckdropdown;
	@FindBy(xpath = "//h4[contains(text(),'Royal Suite - 1 Bedroom')]")
	WebElement royalsuite;

	public RoyalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void Extract_Whale() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			if (link.getText().contains("whale watching")) {
				whale = link.getText();
				System.out.println("whale watching link is present");
				break;
			}

		}

	}

	public void shipClick() {

		menu.click();
		crusie.click();
		close.click();
		ships.click();
	}

	public void rhapsodyOfShips() {
		rhapsodyOfShips.click();
	}

	public void Deck_plan() {
		Actions action = new Actions(driver);
		action.moveToElement(deckPlan).click();
		action.build().perform();

	}

	public void select_Deck() {

		Select DECK = new Select(deckdropdown);
		DECK.selectByVisibleText("Deck Eight");

	}

	public void check_Suite() {

		String ROYAL = royalsuite.getText();
		String royal = ROYAL.substring(0, 11);
		if (royal.contains("Royal Suite")) {
			Assert.assertTrue(true);
			System.out.println("whale watch link and royal suite are present");
		} else {
			Assert.assertFalse(false);
			System.out.println("does not meet my requirements");
		}

	}
}
