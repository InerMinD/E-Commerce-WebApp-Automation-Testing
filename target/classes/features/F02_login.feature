@regression
Feature: guest user should be able to login with valid data
     Background: user open browser and go to Homepage



  Scenario: guest user could login with valid data
    Given At homepage user clicks on login
    When user enter "testing8@example.com" and "P@sswOrd"
    And user clicks on login button
    Then user gets directed to Homepage
    And user should see my Account tab








