@regression
Feature: guest user should be able to search the store
  Background: user open browser and go to Homepage

  Scenario: guest user search for any product

    Given user clicks on search bar
    And user enter a product name
    Then user gets relative results in store