$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ELCOT/Newproject/Featrefoldr/loginn.feature");
formatter.feature({
  "line": 1,
  "name": "Login validation.",
  "description": "",
  "id": "login-validation.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "login validation with correct user and password",
  "description": "",
  "id": "login-validation.;login-validation-with-correct-user-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter the UserName \"Admin\" and PassWord \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click the button",
  "keyword": "Then "
});
formatter.match({
  "location": "Logiistep.launch_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "admin123",
      "offset": 41
    }
  ],
  "location": "Logiistep.enter_the_UserName_and_PassWord(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logiistep.click_the_button()"
});
formatter.result({
  "status": "skipped"
});
});