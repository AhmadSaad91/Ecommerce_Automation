@regression
Feature: user should be able to login to the system

  Scenario: user could login with valid Email and password
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    Then user go to home page