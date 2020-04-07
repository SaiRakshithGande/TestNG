package com.opencart.StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.opencart.basepage.BasePage;
import com.opencart.pages.Opencart_AddTocartpage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocart_Sd extends BasePage {
	Opencart_AddTocartpage addcart;
	final static Logger logger = LogManager.getLogger(Addtocart_Sd.class.getName());
	
	 @Given("^the user launches the browser in chrome$")
	    public void the_user_launches_the_browser_in_chrome() throws Throwable {
		 
		 
		 Browserlaunch();
		 logger.info("Opencart site launches");
	    }

	 @When("^the user opens the cart and search  product called \"([^\"]*)\"$")
	    public void the_user_opens_the_cart_and_search_product_called_something(String name) throws Throwable {
	    	addcart= new Opencart_AddTocartpage(driver);
	    	addcart.searchboxes();
	    	addcart. opencart_searching(name);
	    	logger.debug("Product searched ");
	    }

	 @Then("^the user searches the product and choose$")
	    public void the_user_searches_the_product_and_choose() throws Throwable {
	    	 addcart= new Opencart_AddTocartpage(driver);
		        addcart.buttonpress();
		        logger.error("Product adding to cart");
	    }
	 

	 @Then("^the user add the product into cart$")
	    public void the_user_add_the_product_into_cart() throws Throwable  {
	        addcart.add();
	        logger.trace("Product added to cart");
	        File filepic=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	try {
	    	FileUtils.copyFile(filepic,new File("J:\\eclipse\\ProjectOpencart\\src\\test\\resources\\Screenshots\\Addcartpic.png"));

	    	}catch (IOException e) {
	    	System.out.println("IO Excp...."+e.getMessage());
	    	}
	    }
	    

	 @Then("^the user closees the browser and quit$")
	    public void the_user_closees_the_browser_and_quit() throws Throwable  {
	        quit();
	        logger.info("Browser closed");
	    }

}
