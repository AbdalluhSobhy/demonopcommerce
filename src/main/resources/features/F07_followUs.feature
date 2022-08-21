
   @smoke

  Feature: F07_followUs | users could open followUs links

    Scenario: user opens facebook link
      When user opens facebook link
      Then facebook link is opened in new tab

    Scenario: user opens twitter link
      When user opens twitter link
      Then twitter link is opened in new tab

    Scenario: user opens rss link
      When user opens rss link
      Then demo.nopcommerce link is opened in new tab

    Scenario: user opens youtube link
      When  user opens youtube link
      Then youtube link is opened in new tab