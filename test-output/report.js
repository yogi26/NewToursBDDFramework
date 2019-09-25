$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "New tours login test feature",
  "description": "",
  "id": "new-tours-login-test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login test scenario",
  "description": "",
  "id": "new-tours-login-test-feature;login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of New tours is \"Welcome: Mercury Tours\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username as \"yogi\" and password as \"yogi\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on sign on button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Find a Flight page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_is_on_login_page()"
});
formatter.result({
  "duration": 11135986133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome: Mercury Tours",
      "offset": 23
    }
  ],
  "location": "StepDefination.title_of_New_tours_is(String)"
});
formatter.result({
  "duration": 47307481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yogi",
      "offset": 25
    },
    {
      "val": "yogi",
      "offset": 48
    }
  ],
  "location": "StepDefination.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 222978683,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_click_on_sign_on_button()"
});
formatter.result({
  "duration": 3325667398,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_is_on_Find_a_Flight_page()"
});
formatter.result({
  "duration": 12415464,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinations.StepDefination.user_is_on_Find_a_Flight_page(StepDefination.java:54)\r\n\tat ✽.Then user is on Find a Flight page(Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});