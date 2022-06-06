@regression
Feature: guest user can reset password successfully
     Background: user open browser and go to Homepage



  Scenario: user can reset password from password recovery

     Given user navigates to password recovery page
     And user types a valid email
     Then user receives email with instructions to reset password









