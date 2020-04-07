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
  "line": 6,
  "name": "Login with Valid details",
  "description": "",
  "id": "opencart-website;login-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tc01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "a user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user login using username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Sd.a_user_launch_the_browser()"
});
formatter.result({
  "duration": 8218340013,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 1854839570,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 16347205014,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.the_user_close_the_login_page()"
});
formatter.result({
  "duration": 2091754663,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search the Product",
  "description": "",
  "id": "opencart-website;search-the-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tc02_Search"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user opens the open cart search \u003cname\u003e page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "the user close the browesr",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_Sd.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 6223109917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cname\u003e",
      "offset": 36
    }
  ],
  "location": "Search_Sd.the_user_opens_the_open_cart_search_page(String)"
});
formatter.result({
  "duration": 3214377614,
  "status": "passed"
});
formatter.match({
  "location": "Search_Sd.the_user_search_the_product()"
});
formatter.result({
  "duration": 5129441381,
  "status": "passed"
});
formatter.match({
  "location": "Search_Sd.the_user_close_the_browesr()"
});
formatter.result({
  "duration": 2325475040,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Add to Cart",
  "description": "",
  "id": "opencart-website;add-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "the user opens the cart and search  product called \"\u003cname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "opencart-website;add-to-cart;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 28,
      "id": "opencart-website;add-to-cart;;1"
    },
    {
      "cells": [
        "IMAC"
      ],
      "line": 29,
      "id": "opencart-website;add-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Add to Cart",
  "description": "",
  "id": "opencart-website;add-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 20,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "the user opens the cart and search  product called \"IMAC\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.match({
  "location": "Addtocart_Sd.the_user_launches_the_browser_in_chrome()"
});
formatter.result({
  "duration": 7947123812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IMAC",
      "offset": 52
    }
  ],
  "location": "Addtocart_Sd.the_user_opens_the_cart_and_search_product_called_something(String)"
});
formatter.result({
  "duration": 251799542,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_searches_the_product_and_choose()"
});
formatter.result({
  "duration": 4819907074,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_add_the_product_into_cart()"
});
formatter.result({
  "duration": 3417714946,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_closees_the_browser_and_quit()"
});
formatter.result({
  "duration": 211429214,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Compare the products",
  "description": "",
  "id": "opencart-website;compare-the-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@tc04_Comparison"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "the user launched the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "the user compared the two products",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the user will see product comparison",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "the user closed the browser after comparsion",
  "keyword": "Then "
});
formatter.match({
  "location": "Compare_sd.the_user_launched_the_browser_in_chrome()"
});
formatter.result({
  "duration": 7037273318,
  "status": "passed"
});
formatter.match({
  "location": "Compare_sd.the_user_compared_the_two_products()"
});
formatter.result({
  "duration": 6253308636,
  "status": "passed"
});
formatter.match({
  "location": "Compare_sd.the_user_will_see_product_comparison()"
});
formatter.result({
  "duration": 5967263819,
  "status": "passed"
});
formatter.match({
  "location": "Compare_sd.the_user_closed_the_browser_after_comparsion()"
});
formatter.result({
  "duration": 192284734,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Select the brand and add to wishlist",
  "description": "",
  "id": "opencart-website;select-the-brand-and-add-to-wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@tc05_Brands"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "the user launching the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "the user clicks on brands",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "the user selects the brand",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "the user add the product to wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "the user quits the chrome",
  "keyword": "Then "
});
formatter.match({
  "location": "Brands_Sd.the_user_launching_the_chrome_browser()"
});
formatter.result({
  "duration": 8829131597,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_clicks_on_brands()"
});
formatter.result({
  "duration": 4734552514,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_selects_the_brand()"
});
formatter.result({
  "duration": 7084174707,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_add_the_product_to_wishlist()"
});
formatter.result({
  "duration": 3593498168,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_quits_the_chrome()"
});
formatter.result({
  "duration": 2059815723,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Special offers in opencart website",
  "description": "",
  "id": "opencart-website;special-offers-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@tc06_Special"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "the user to open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "the user clicks on the specials",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "the user will see the specials and add to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "the user close the site and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Specials_Sd.the_user_to_open_browser_chrome()"
});
formatter.result({
  "duration": 10077480666,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Sd.the_user_clicks_on_the_specials()"
});
formatter.result({
  "duration": 4809296612,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Sd.the_user_will_see_the_specials_and_add_to_the_cart()"
});
formatter.result({
  "duration": 10297930373,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Sd.the_user_close_the_site_and_browser()"
});
formatter.result({
  "duration": 2326007903,
  "status": "passed"
});
});