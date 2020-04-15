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
  "name": "Login to the TaskManager with valid data and invalid data",
  "description": "",
  "id": "taskmanager-website;login-to-the-taskmanager-with-valid-data-and-invalid-data",
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
  "name": "click on Login button1",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "taskmanager-website;login-to-the-taskmanager-with-valid-data-and-invalid-data;",
  "rows": [
    {
      "cells": [
        "username1",
        "password1"
      ],
      "line": 13,
      "id": "taskmanager-website;login-to-the-taskmanager-with-valid-data-and-invalid-data;;1"
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 14,
      "id": "taskmanager-website;login-to-the-taskmanager-with-valid-data-and-invalid-data;;2"
    },
    {
      "cells": [
        "admin1",
        "admiin2"
      ],
      "line": 15,
      "id": "taskmanager-website;login-to-the-taskmanager-with-valid-data-and-invalid-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login to the TaskManager with valid data and invalid data",
  "description": "",
  "id": "taskmanager-website;login-to-the-taskmanager-with-valid-data-and-invalid-data;;2",
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
  "name": "click on Login button1",
  "keyword": "And "
});
formatter.match({
  "location": "taskmanagerloginstep.launch_the_browser()"
});
formatter.result({
  "duration": 44464719865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 11
    },
    {
      "val": "admin",
      "offset": 23
    }
  ],
  "location": "taskmanagerloginstep.enter_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 1400526113,
  "status": "passed"
});
formatter.match({
  "location": "taskmanagerloginstep.click_on_Login_button()"
});
