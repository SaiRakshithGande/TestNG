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
  "line": 4,
  "name": "Login with Valid details",
  "description": "",
  "id": "opencart-website;login-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tc01_login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user login using username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Sd.a_user_launch_the_browser()"
});
formatter.result({
  "duration": 10264030342,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 1904290663,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 18366915211,
  "status": "passed"
});
formatter.match({
  "location": "Login_Sd.the_user_close_the_login_page()"
});
formatter.result({
  "duration": 158909766,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search the Product",
  "description": "",
  "id": "opencart-website;search-the-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tc02_Search"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user opens the open cart search \u003cname\u003e page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "the user close the browesr",
  "keyword": "Then "
});
formatter.match({
  "location": "Search_Sd.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 6136530925,
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
  "duration": 258774827,
  "status": "passed"
});
formatter.match({
  "location": "Search_Sd.the_user_search_the_product()"
});
formatter.result({
  "duration": 5995420205,
  "status": "passed"
});
formatter.match({
  "location": "Search_Sd.the_user_close_the_browesr()"
});
formatter.result({
  "duration": 2364139255,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Add to Cart",
  "description": "",
  "id": "opencart-website;add-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the user opens the cart and search  product called \"\u003cname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "opencart-website;add-to-cart;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 25,
      "id": "opencart-website;add-to-cart;;1"
    },
    {
      "cells": [
        "IMAC"
      ],
      "line": 26,
      "id": "opencart-website;add-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
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
      "line": 17,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the user opens the cart and search  product called \"IMAC\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.match({
  "location": "Addtocart_Sd.the_user_launches_the_browser_in_chrome()"
});
formatter.result({
  "duration": 6016550646,
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
  "duration": 341374932,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_searches_the_product_and_choose()"
});
formatter.result({
  "duration": 4844711048,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_add_the_product_into_cart()"
});
formatter.result({
  "duration": 3549698532,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_closees_the_browser_and_quit()"
});
formatter.result({
  "duration": 330932869,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Compare the products",
  "description": "",
  "id": "opencart-website;compare-the-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tc04_Comparison"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "the user launched the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "the user compared the two products",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "the user will see product comparison",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "the user closed the browser after comparsion",
  "keyword": "Then "
});
formatter.match({
  "location": "Compare_sd.the_user_launched_the_browser_in_chrome()"
});
formatter.result({
  "duration": 9550524094,
  "status": "passed"
});
formatter.match({
  "location": "Compare_sd.the_user_compared_the_two_products()"
});
formatter.result({
  "duration": 6290411783,
  "status": "passed"
});
formatter.match({
  "location": "Compare_sd.the_user_will_see_product_comparison()"
});
formatter.result({
  "duration": 6512673051,
  "status": "passed"
});
formatter.match({
  "location": "Compare_sd.the_user_closed_the_browser_after_comparsion()"
});
formatter.result({
  "duration": 2324091913,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Select the brand and add to wishlist",
  "description": "",
  "id": "opencart-website;select-the-brand-and-add-to-wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tc05_Brands"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "the user launching the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "the user clicks on brands",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "the user selects the brand",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "the user add the product to wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "the user quits the chrome",
  "keyword": "Then "
});
formatter.match({
  "location": "Brands_Sd.the_user_launching_the_chrome_browser()"
});
formatter.result({
  "duration": 6270659879,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_clicks_on_brands()"
});
formatter.result({
  "duration": 4721997096,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_selects_the_brand()"
});
formatter.result({
  "duration": 6071437985,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_add_the_product_to_wishlist()"
});
formatter.result({
  "duration": 3518270532,
  "status": "passed"
});
formatter.match({
  "location": "Brands_Sd.the_user_quits_the_chrome()"
});
formatter.result({
  "duration": 2055979740,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Special offers in opencart website",
  "description": "",
  "id": "opencart-website;special-offers-in-opencart-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@tc06_Special"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "the user to open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "the user clicks on the specials",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "the user will see the specials and add to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "the user close the site and browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Specials_Sd.the_user_to_open_browser_chrome()"
});
formatter.result({
  "duration": 7978289901,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Sd.the_user_clicks_on_the_specials()"
});
formatter.result({
  "duration": 5622994134,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Sd.the_user_will_see_the_specials_and_add_to_the_cart()"
});
formatter.result({
  "duration": 11028019017,
  "status": "passed"
});
formatter.match({
  "location": "Specials_Sd.the_user_close_the_site_and_browser()"
});
formatter.result({
  "duration": 2325730721,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 47,
  "name": "Contact to the opencart for quries",
  "description": "",
  "id": "opencart-website;contact-to-the-opencart-for-quries",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 46,
      "name": "@tc07_Contactus"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "the customer open the cart in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "the user click on contact us in website",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "the user should fill the form of \"\u003cName\u003e\" \"\u003cmailid\u003e\" \"\u003ccomplaint\u003e\" which is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "the user click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "user will close the website and browser",
  "keyword": "And "
});
formatter.examples({
  "line": 53,
  "name": "",
  "description": "",
  "id": "opencart-website;contact-to-the-opencart-for-quries;",
  "rows": [
    {
      "cells": [
        "Name",
        "mailid",
        "complaint"
      ],
      "line": 54,
      "id": "opencart-website;contact-to-the-opencart-for-quries;;1"
    },
    {
      "cells": [
        "rakshith",
        "g.sairakshith1998@gmail.com",
        "To know about the prevoius order"
      ],
      "line": 55,
      "id": "opencart-website;contact-to-the-opencart-for-quries;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 55,
  "name": "Contact to the opencart for quries",
  "description": "",
  "id": "opencart-website;contact-to-the-opencart-for-quries;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    },
    {
      "line": 46,
      "name": "@tc07_Contactus"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "the customer open the cart in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "the user click on contact us in website",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "the user should fill the form of \"rakshith\" \"g.sairakshith1998@gmail.com\" \"To know about the prevoius order\" which is displayed",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "the user click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "user will close the website and browser",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUs_Sd.the_customer_open_the_cart_in_the_browser()"
});
formatter.result({
  "duration": 6243131437,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs_Sd.the_user_click_on_contact_us_in_website()"
});
formatter.result({
  "duration": 1856069398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rakshith",
      "offset": 34
    },
    {
      "val": "g.sairakshith1998@gmail.com",
      "offset": 45
    },
    {
      "val": "To know about the prevoius order",
      "offset": 75
    }
  ],
  "location": "ContactUs_Sd.the_user_should_fill_the_form_of_which_is_displayed(String,String,String)"
});
formatter.result({
  "duration": 4010794702,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs_Sd.the_user_click_the_submit_button()"
});
formatter.result({
  "duration": 2732714210,
  "status": "passed"
});
formatter.match({
  "location": "ContactUs_Sd.user_will_close_the_website_and_browser()"
});
formatter.result({
  "duration": 2202134145,
  "status": "passed"
});
});