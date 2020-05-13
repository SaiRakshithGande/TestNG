package bmwpage.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import excel.com.Excelcode;

public class BmwPage extends Excelcode {
	
	WebDriver driver;
	//SoftAssert krish = new SoftAssert();

	@FindBy(linkText = "Models")
	WebElement models;

	@FindBy (xpath = "//a[contains(text(),'7')]")
	WebElement seven;

	//@FindBy (xpath = "//img[@class = 'image-default ds2-model-card--street-lazy-load ds2-model-card--street-background-img loaded']")
	//WebElement bmwseven;

	@FindBy(xpath = "//a[@id='showmore-modelcard-55a95b4e-868b-4569-b42d-67cb36570302']")
	WebElement more;

	@FindBy (xpath = "//div[@class='slider']//div[3]//a[1]")
	WebElement technicaldata;

	@FindBy(xpath = "//section[@class='content ds2-technical-data--content ds2-mvc-tabs-content__panel ds2-mvc-tabs-content__panel--active']//div[@class='show-for-medium-up']//div[2]//div[1]//table[1]//tbody[1]//tr[1]//td[2]//div[1]")
	WebElement topspeed;

//	@FindBy(xpath = "//section[contains(@class,'content ds2-technical-data--content ds2-mvc-tabs-content__panel ds2-mvc-tabs-content__panel--active')]//div[contains(@class,'row')]//div[1]//div[1]//table[1]//tbody[1]//tr[4]//td[2]//div[1]")
	//WebElement horsepower;

	public BmwPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	}
	public void Click_model() {
	models.click();
	}
	public void click_seven() {

	seven.click();
	}
	public void Carselect() {
		more.click();
	//Actions action = new Actions(driver);
	//action.moveToElement(more).build().perform();
	//Actions action1 = action.moveToElement(more).click();
	//action1.build().perform();
	}
	public void Techincal_Data() throws InterruptedException {
	technicaldata.click();
	Thread.sleep(3000);
	}
	
	public void Top_speed() throws Throwable{
		String SPEED = topspeed.getText();
		int i = Integer.parseInt(SPEED);
		System.out.println(i);
		if(i<500) {
		Assert.assertTrue(true);
		System.out.println("does not meet my requirements");
		Excelcode excel= new Excelcode();
		excel.ExcelFile();
		

	}
}
}
