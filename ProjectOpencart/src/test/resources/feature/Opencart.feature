@Testcase_Feature
Feature: Opencart website


@tc01_login
Scenario Outline: Login with Valid details
 Given a user launch the browser
 When the user opens opencart login page
 Then the user login using <username> and <password>
 Then the user close the login page
 Examples:
 |username              |password|
 |rakshith1998@gmail.com|rakshith3788|
 
 
 @tc02_Search
 Scenario: Search the Product
 Given the user launch the browser
 When the user opens the open cart search <name> page
 Then the user search the product
 Then the user close the browesr
 
 @tc03_AddToCart
 Scenario Outline: Add to Cart
 Given the user launches the browser in chrome
 When the user opens the cart and search  product called <name>
 Then the user searches the product and choose
 Then the user add the product into cart
 Then the user closees the browser and quit
 Examples:
 |name|
 |IMAC|
 
 @tc04_Comparison
 Scenario: Compare the products
 Given the user launched the browser in chrome
 When the user compared the two products
 Then the user will see product comparison
 Then the user closed the browser after comparsion
 @tc05_Brands
 Scenario: Select the brand and add to wishlist
 Given the user launching the chrome browser
 When the user clicks on brands
 Then the user selects the brand
 Then the user add the product to wishlist
 Then the user quits the chrome
 @tc06_Special
 Scenario: Special offers in opencart website
 Given the user to open browser chrome
 When the user clicks on the specials
 Then the user will see the specials and add to the cart
 Then the user close the site and browser