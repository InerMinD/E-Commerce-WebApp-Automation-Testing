@regression
Feature: guest user could follow social media links
     Background: user open browser and go to Homepage



  Scenario: user opens facebook link

     When user clicks on facebook link
     Then user gets directed to facebook page


  Scenario: user opens twitter link

    When user clicks on twitter link
    Then user gets directed to twitter page


  Scenario: user opens rss link

    When user clicks on rss link
    Then user gets directed to rss page



  Scenario: user opens youtube link

    When user clicks on youtube link
    Then user gets directed to youtube page




