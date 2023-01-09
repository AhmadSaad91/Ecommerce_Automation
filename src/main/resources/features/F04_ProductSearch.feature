@regression
Feature: user should be able to search for products

  Scenario: Logged User could search for any product
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user enter "laptop" in search bar
    And user press search button
    Then user navigate to search page
    And laptop items display