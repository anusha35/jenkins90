Feature: Booking a flight ticket.

  Scenario: Signup and book a flight ticket.
    Given user navigating to Test Triangle App
    When user tick on the check Box
    And user click on next button
    Then user should be taken to singUp page
    And user enters all the details in signup page
    Then user click on submit button
    Then user should be taken to filght booking page
    And user book the fight ticket
    Then user click on confirm button
    Then user should be taken to payment gateway
    And user provide all the details in payment page
    Then use click on paynow button
    Then Message displayed payment was Successfully
