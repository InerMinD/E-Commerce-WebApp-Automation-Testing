@regression
Feature: guest user will be able to open sliders in home page
  Background: user open browser and go to Homepage

  Scenario: guest user select a slider

    When user select slider one
    Then user gets directed to product page in slider





  Scenario: user select  another slider
    When user select slider two
    Then user gets directed to  other product page in slider



