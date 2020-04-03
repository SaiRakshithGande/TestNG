$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login with valid credentials",
  "description": "",
  "id": "title-of-your-feature;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the MyAccount page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fillup \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I fill \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I press loginButton",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on testcases",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on second testcase",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "title-of-your-feature;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "rakshith.gande@gmail.com",
        "Rakshith@3788"
      ],
      "line": 17,
      "id": "title-of-your-feature;login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Login with valid credentials",
  "description": "",
  "id": "title-of-your-feature;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the MyAccount page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fillup rakshith.gande@gmail.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I fill Rakshith@3788",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I press loginButton",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on testcases",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on second testcase",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginUIsteps.i_am_on_the_myaccount_page()"
});
formatter.result({
  "duration": 10901949016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rakshith.gande@gmail.com",
      "offset": 9
    }
  ],
  "location": "LoginUIsteps.i_fillup(String)"
});
formatter.result({
  "duration": 2833847370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rakshith@3788",
      "offset": 7
    }
  ],
  "location": "LoginUIsteps.i_fill(String)"
});
formatter.result({
  "duration": 255741196,
  "status": "passed"
});
formatter.match({
  "location": "LoginUIsteps.i_press_loginbutton()"
});
formatter.result({
  "duration": 2732335720,
  "status": "passed"
});
formatter.match({
  "location": "LoginUIsteps.click_on_dashboard()"
});
formatter.result({
  "duration": 2377543107,
  "status": "passed"
});
formatter.match({
  "location": "LoginUIsteps.click_on_testcases()"
});
formatter.result({
  "duration": 2188367399,
  "status": "passed"
});
formatter.match({
  "location": "LoginUIsteps.click_on_second_testcase()"
});
formatter.result({
  "duration": 891174972,
  "status": "passed"
});
});