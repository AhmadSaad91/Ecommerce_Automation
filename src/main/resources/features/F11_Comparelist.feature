@regression
Feature: user should be able to add products to compare list

  Scenario: Logged user could add different products to compare list
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user press compare list icon on product "Build your own computer"
    And user press compare list icon on product "Apple MacBook Pro 13-inch"
    And user press on the link product comparison in the displayed message
    Then user navigate to compare products page
    And the two added products display