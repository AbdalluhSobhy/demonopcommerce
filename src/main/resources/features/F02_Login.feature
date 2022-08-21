@smoke
Feature: F02_Login | user could use login functionality to use their account



      #  Scenario: 1
   Scenario: user could login whit valid email and password
     Given user go to login page
    When user login with "valid" "test@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

     #  Scenario: 2
   Scenario: user could login with invalid email and password
     Given user go to login page
     When user login with "invalid" "wrong@example.com" and "P@ssw0rd"
     And user press on login button
     Then user could not login to the system