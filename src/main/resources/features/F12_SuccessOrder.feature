@regression
Feature: user should be able to create successful order

  Scenario: Create successful order
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user press add to cart on product "HTC One M8 Android L 5.0 Lollipop"
    And user click on shopping cart
    And user click on agree terms
    And user press checkout
    And user fill billing address
    And user select shipping method
    And user select payment method
    And user confirm order
    Then success message display