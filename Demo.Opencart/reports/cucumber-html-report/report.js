$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Opencart.feature");
formatter.feature({
  "line": 2,
  "name": "Opencart website",
  "description": "",
  "id": "opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Registering valid details",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_opencart_valid_register"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launch the browser for valid register",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the  user opens opencart register page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user enters the valid register details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user close the register page",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenCart_RegisterStepdefinition.the_user_launch_the_browser_for_valid_register()"
});
formatter.result({
  "duration": 11245906027,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_RegisterStepdefinition.the_user_opens_opencart_register_page()"
});
formatter.result({
  "duration": 2069331310,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_RegisterStepdefinition.the_user_enters_the_valid_register_details()"
});
formatter.result({
  "duration": 7180416011,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_RegisterStepdefinition.the_user_close_the_register_page()"
});
formatter.result({
  "duration": 245772606,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "",
  "description": "Login with valid details",
  "id": "opencart-website;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@tc02_opencart_valid_login"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "the user launch the browser for valid login",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "the  user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "the user enters the valid login details",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "opencart-website;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22,
      "id": "opencart-website;;;1"
    },
    {
      "cells": [
        "rakshith1998@gmail.com",
        "Rakshith3788"
      ],
      "line": 23,
      "id": "opencart-website;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "",
  "description": "Login with valid details",
  "id": "opencart-website;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 13,
      "name": "@tc02_opencart_valid_login"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "the user launch the browser for valid login",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "the  user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "the user enters the valid login details",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenCart_LoginStepdefinition.the_user_launch_the_browser_for_valid_login()"
});
formatter.result({
  "duration": 6060646217,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_LoginStepdefinition.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 1710645109,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_LoginStepdefinition.the_user_enters_the_valid_login_details()"
});
formatter.result({
  "duration": 5221943612,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_LoginStepdefinition.the_user_close_the_login_page()"
});
formatter.result({
  "duration": 261725244,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "Searching products in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@tc03_opencart_search"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "the user opens the opencart search page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "the user close the search page",
  "keyword": "Then "
});
formatter.match({
  "location": "Opencart_ValidSearchStepdefination.launch_the_browser()"
});
formatter.result({
  "duration": 3878829491,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_ValidSearchStepdefination.the_user_opens_the_opencart_search_page()"
});
formatter.result({
  "duration": 2201767891,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_ValidSearchStepdefination.the_user_search_the_product()"
});
formatter.result({
  "duration": 5796305099,
  "status": "passed"
});
formatter.match({
  "location": "Opencart_ValidSearchStepdefination.the_user_close_the_search_page()"
});
formatter.result({
  "duration": 2314941348,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "",
  "description": "Add to cart in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tc04_opencart_add_to_cart"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "launching the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "the user opens the opencart page",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "the user select the product and add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "the user close the website",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenCart_AddToCartStepdefinition.launching_the_browser()"
});
formatter.result({
  "duration": 6329006798,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_AddToCartStepdefinition.the_user_opens_the_opencart_page()"
});
formatter.result({
  "duration": 1691924293,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_AddToCartStepdefinition.the_user_select_the_product_and_add_to_cart()"
});
formatter.result({
  "duration": 12963458651,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_AddToCartStepdefinition.the_user_close_the_website()"
});
formatter.result({
  "duration": 188055082,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "",
  "description": "Wishlist in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@tc05_opencart_wishlist"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "add items to wishlist",
  "keyword": "When "
});
formatter.match({
  "location": "OpenCart_WishListStepdefinition.logedin()"
});
formatter.result({
  "duration": 13085283948,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_WishListStepdefinition.wishes()"
});
formatter.result({
  "duration": 10521626521,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "",
  "description": "Price Comparison of two products",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@tc06_opencart_product_comparison"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "open the site",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "compare amount of 2 products",
  "keyword": "When "
});
formatter.match({
  "location": "OpenCart_CompareStepdefinition.logedin()"
});
formatter.result({
  "duration": 5902733612,
  "status": "passed"
});
formatter.match({
  "location": "OpenCart_CompareStepdefinition.wishes()"
});
formatter.result({
  "duration": 11220063812,
  "status": "passed"
});
});