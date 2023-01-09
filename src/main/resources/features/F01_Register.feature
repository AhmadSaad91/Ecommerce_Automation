@regression
Feature: user should be able to register to the system

  Scenario: user could register with valid data
    #Given user open browser and navigate to home page
    When user press register
    And user enter first name and last name
    And user enter valid Email
    And user enter password
    And user click on register button
    Then success message displayed