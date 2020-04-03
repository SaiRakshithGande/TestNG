package com.Opencart.stepdefinition;

import com.Opencart.pages.Opencart_WishListPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OpenCart_WishListStepdefinition {
	Opencart_WishListPage wi = new Opencart_WishListPage();

		@Given("^the user logged in$")
		public void logedin() throws Throwable
		{
			
			wi.loginpass() ;
		}

		@When("^add items to wishlist$")
		public void wishes() throws Throwable
		{
			
			wi.wish();
		}
}
