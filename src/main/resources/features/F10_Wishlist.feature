@regression
Feature: user should be able to add products to wishlist

  Scenario: Logged user could add different products to Wishlist
    #Given user open browser and navigate to homepage
    When user press login
    And user enter Email
    And user enter valid password
    And user click on login button
    And user press wishlist icon on product "HTC One M8 Android L 5.0 Lollipop"
    Then message "The product has been added to your wishlist" display
    When user press the wishlist icon beside the login icon in website header
    Then user navigate to wishlist page
    And the product added is found
