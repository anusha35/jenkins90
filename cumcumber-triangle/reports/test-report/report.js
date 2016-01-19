$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Myfile.feature");
formatter.feature({
  "line": 1,
  "name": "Booking a flight ticket.",
  "description": "",
  "id": "booking-a-flight-ticket.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Booking a flight ticket.",
  "description": "",
  "id": "booking-a-flight-ticket.;booking-a-flight-ticket.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigating to Test Triangle App",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the check Box",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be taken to singUp page",
  "keyword": "Then "
});
formatter.match({
  "location": "Testapp.i_navigating_to_Test_Triangle_App()"
});
formatter.result({
  "duration": 6247229512,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.i_click_on_the_check_Box()"
});
formatter.result({
  "duration": 305821194,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.i_click_on_next_button()"
});
formatter.result({
  "duration": 232889488,
  "status": "passed"
});
formatter.match({
  "location": "Testapp.i_should_be_taken_to_singUp_page()"
});
formatter.result({
  "duration": 17878,
  "status": "passed"
});
});