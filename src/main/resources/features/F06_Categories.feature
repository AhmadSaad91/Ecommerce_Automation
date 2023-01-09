@regression
Feature: user should be able to select Categories

  Scenario: Logged user could select different Categories
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user hover on category "Computers" and select sub category "Notebooks"
    Then Notebooks products display