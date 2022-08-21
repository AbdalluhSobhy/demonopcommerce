@smoke
  Feature: F03_currencies | user could use currencies Functionality to select the Kind of Currency

    Scenario: User could select the kind of currency
      When Select Euro currency from the dropdown list on the top left of home page
      And Use hard assertion to verify Euro Symbol "€" is shown on the 4 products displayed in Home page