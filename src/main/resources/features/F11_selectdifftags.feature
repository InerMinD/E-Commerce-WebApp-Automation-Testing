@regression
Feature: guest user could select different tags
  Background: user open browser and go to Homepage

  Scenario: guest user select different tags
    When user enter product name in search bar and press Enter
    Then user get results in store
    And  user can select different tags to show different products