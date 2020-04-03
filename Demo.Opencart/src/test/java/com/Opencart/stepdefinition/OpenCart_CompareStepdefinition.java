package com.Opencart.stepdefinition;

import com.Opencart.pages.Opencart_ComparePage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OpenCart_CompareStepdefinition {

	Opencart_ComparePage cm = new  Opencart_ComparePage();

	@Given("^open the site$")
	public void logedin() throws Throwable 
	{
		
		cm.opening() ;
	}

	@When("^compare amount of 2 products$")
	public void wishes() throws Throwable
	{
		
		cm.compare();
	}
}
