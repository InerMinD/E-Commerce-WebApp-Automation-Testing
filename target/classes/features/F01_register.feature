@regression
Feature: guest user should be able to register with valid data
     Background: user open browser and go to Homepage



  Scenario: guest user could register with valid data
    Given At homepage user clicks on register
     When user fill required fields with valid data
     And user clicks on register button
    Then user gets directed to register success page
    And  user should be able to register successfully








