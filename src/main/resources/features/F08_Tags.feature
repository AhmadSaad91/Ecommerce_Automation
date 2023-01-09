@regression
Feature: user should be able to select different tags

  Scenario: Logged user could select different tags
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user select "Comuters" category
    And user select "Awesome" tag
    Then products tagged with 'Awesome' displays