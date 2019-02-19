Feature: login to website

  @run
  Scenario: user logs into website
   # Given user is on the homepage
    When user logs in with valid credentials
    Then page title should be "CRMPRO"