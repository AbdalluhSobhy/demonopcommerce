@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
     When user select gender type
      And user enter first name "automation" last name "tester"
      And user enter date of birth
      And user enter email "test@example.com" field
      And user enter password fields "P@ssw0rd" "P@ssw0rd"
      And user click in register button
      Then success massage displayed
      Then success massage displayed
