@Testcase_Feature
Feature: Opencart website 

@tc01_opencart_valid_register
Scenario: 
	Registering valid details
	
	Given the user launch the browser for valid register
	When the  user opens opencart register page
	Then the user enters the valid register details
	Then the user close the register page
	
@tc02_opencart_valid_login
Scenario Outline:
	Login with valid details
	
	Given the user launch the browser for valid login
	When the  user opens opencart login page
	Then the user enters the valid login details
	Then the user close the login page
	Examples:
  | username				 | password		 |
  |	rakshith1998@gmail.com | rakshith3788 |

@tc03_opencart_search
Scenario:
	Searching products in opencart website
	
	Given launch the browser
	When the user opens the opencart search page
	Then the user search the product
	Then the user close the search page
@tc04_opencart_add_to_cart
Scenario:
	Add to cart in opencart website
	
	Given launching the browser
	When the user opens the opencart page
	Then the user select the product and add to cart
	Then the user close the website
	
@tc05_opencart_wishlist
Scenario: 
	Wishlist in opencart website
	
	Given the user logged in
	When add items to wishlist
@tc06_opencart_product_comparison
Scenario: 
	Price Comparison of two products
	
    Given open the site
	When compare amount of 2 products
