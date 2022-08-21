package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class D08_WishlistStepDef {

P03_homePage homePage = new P03_homePage();

    @When("user click on wishlist button ❤️")
    public void userClickOnWishlistButton️() {

        List<WebElement> list = homePage.wishlist_button();
           list.get(2).click();

    }


    @Then("Verify  success message is displayed correctly")
    public void verifySuccessMessageIsDisplayedCorrectly() {

    homePage.wishlist_successMassage().isDisplayed();

        SoftAssert soft = new SoftAssert();

        String Actual = homePage.wishlist_successMassage().getCssValue("background-color");
         String expected = "rgba(75,176,122)";

         soft.assertTrue(Actual.contains(expected));

    }


    @When("user click on wishlist button ❤")
    public void userClickOnWishlistButton() throws InterruptedException {
        List<WebElement> list = homePage.wishlist_button();
        list.get(2).click();
        Thread.sleep(2000);
    }


    @And("click on Wishlist Tab on the top of the page")
    public void clickOnWishlistTabOnTheTopOfThePage() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.wishlist_successMassage()));
        List<WebElement> list = homePage.wishlist_label();
        list.get(0).click();

    }

    @Then("get Qty value and verify it's bigger than 0")
    public void getQtyValueAndVerifyItSBiggerThan() {

      String countStr =  homePage.itemquantity11225().getAttribute("value");
        System.out.println("countStr :"+countStr );
      int count = Integer.parseInt( countStr);

        Assert.assertTrue(count>0);

    }
}
