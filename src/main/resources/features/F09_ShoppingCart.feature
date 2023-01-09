@regression
Feature: user should be able to add products to shopping cart

  Scenario: Logged user could add different products to shopping cart
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user press add to cart on product "HTC One M8 Android L 5.0 Lollipop"
    Then message "The product has been added to your shopping cart" display

  Scenario: Logged user could add different products to shopping cart after filling mandatory fields
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user press add to cart on product "$25 Virtual Gift Card"
    And user enter Recipient's Name
    And user enter Recipient's Email
    And user enter his Name
    And user enter his Email
    And user click on add to cart
    Then message "The product has been added to your shopping cart" display


