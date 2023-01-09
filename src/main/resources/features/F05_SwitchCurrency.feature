@regression
Feature: user should be able to switch between currencies

  Scenario: Logged User could switch between currencies US-Euro
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user press on currency drop list and select Euro
    Then the four featured products prices changes to Euro