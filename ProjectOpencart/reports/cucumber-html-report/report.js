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
formatter.scenarioOutline({
  "line": 24,
  "name": "Add to Cart",
  "description": "",
  "id": "opencart-website;add-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "the user opens the cart and search  product called \u003cname\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "opencart-website;add-to-cart;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 31,
      "id": "opencart-website;add-to-cart;;1"
    },
    {
      "cells": [
        "IMAC"
      ],
      "line": 32,
      "id": "opencart-website;add-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
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
      "line": 23,
      "name": "@tc03_AddToCart"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "the user launches the browser in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "the user opens the cart and search  product called IMAC",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the user searches the product and choose",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "the user add the product into cart",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the user closees the browser and quit",
  "keyword": "Then "
});
formatter.match({
  "location": "Addtocart_Sd.the_user_launches_the_browser_in_chrome()"
});
formatter.result({
  "duration": 8521183430,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IMAC",
      "offset": 51
    }
  ],
  "location": "Addtocart_Sd.the_user_opens_the_cart_and_search_page_called(String)"
});
formatter.result({
  "duration": 335378131,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_searches_the_product_and_choose()"
});
formatter.result({
  "duration": 7073499437,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_add_the_product_into_cart()"
});
formatter.result({
  "duration": 3476091541,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Sd.the_user_closees_the_browser_and_quit()"
});
formatter.result({
  "duration": 149174629,
  "status": "passed"
});
});