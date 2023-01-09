@regression
Feature: user should be able to reset his password

  Scenario: user could reset his/her password successfully
    #Given user open browser and navigate to homepage
    When user press login
    And user press forgot password
    And user enter valid email address
    And user click on recover button
    Then message "Email with instructions has been sent to you." display