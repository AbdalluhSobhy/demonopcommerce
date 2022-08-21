   @smoke

  Feature: > F04_Search |user could use Search Functionality to find The any product


     #  Scenario Outline 1
     Scenario Outline: user could search using product name
      When User could enter the product by <name>
      And press on Search button
      Then user go to productPage successfully by name
      Examples:
       |name|
       |book|
       |laptop|
       |nike|

      # Scenario Outline 2
    Scenario Outline: user could search for product using sku
      When User could enter the product by <sku>
      And press on Search button
      Then user go to productPage successfully by Sku
      Examples:
        | sku |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |


