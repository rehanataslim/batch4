$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/testcase.feature");
formatter.feature({
  "line": 3,
  "name": "taskmanager website",
  "description": "",
  "id": "taskmanager-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@taskmanager"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login to the TaskManager",
  "description": "",
  "id": "taskmanager-website;login-to-the-taskmanager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open the  taskmanager website  Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "enter the \"\u003cusername1\u003e\" and \"\u003cpassword1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "taskmanager-website;login-to-the-taskmanager;",
  "rows": [
    {
      "cells": [
        "username1",
        "password1"
      ],
      "line": 14,
      "id": "taskmanager-website;login-to-the-taskmanager;;1"
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 15,
      "id": "taskmanager-website;login-to-the-taskmanager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Login to the TaskManager",
  "description": "",
  "id": "taskmanager-website;login-to-the-taskmanager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@taskmanager"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open the  taskmanager website  Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "enter the \"admin\" and \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "taskmanagerloginstep.launch_the_browser()"
});
