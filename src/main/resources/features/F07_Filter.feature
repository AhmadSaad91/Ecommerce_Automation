@regression
Feature: user should be able to filter with color

  Scenario: Logged user could filter with color
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user hover on category "Apparel" and select sub category "Shoes"
    And user select "red" filter
    Then only one product display