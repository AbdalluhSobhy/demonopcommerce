
@smoke
  Feature: F08_Wishlist | user could use wishlist Functionality

    Scenario: user could click on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop"
      When user click on wishlist button ❤️
      Then Verify  success message is displayed correctly


      Scenario: user click on wishlist in Success massage
        When user click on wishlist button ❤
         And click on Wishlist Tab on the top of the page
        Then get Qty value and verify it's bigger than 0


