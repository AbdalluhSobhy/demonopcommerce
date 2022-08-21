package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {

 P03_homePage homePage = new P03_homePage();


 @When("^User could enter the product by ([^\"]*)$")
 public void userCouldEnterTheProduct(String Product) throws InterruptedException {
  Thread.sleep(2000);
  homePage.small_searchterms().sendKeys(Product);
 Thread.sleep(2000);
 }


 @And("press on Search button")

 public void pressOnSearchButton() {

  homePage.searchButton().click();
 }


 @Then("user go to productPage successfully by name")
 public void userGoToProductPageSuccessfullyByName() {
  String actualUrl = Hooks.driver.getCurrentUrl();
  String expectedUrl = "https://demo.nopcommerce.com/search?q=";

  SoftAssert soft = new SoftAssert();
  soft.assertTrue(actualUrl.contains(expectedUrl));

  List<WebElement> list = homePage.productsInHomePage();
  int size = homePage.productsInHomePage().size();
   for (int i = 0; i < size; i++) {
   String text = list.get(i).getText().toLowerCase();
   String value=  homePage.searchFeild().getAttribute("value").toLowerCase();
   soft.assertTrue(text.contains(value));
  }
   soft.assertAll();
 }

 @Then("user go to productPage successfully by Sku")
 public void userGoToProductPageSuccessfullyBySku() {

  String text = homePage.customerCurrencyDropdownList().getAttribute("value");
  String value = homePage.searchFeild().getAttribute("value");

  Assert.assertTrue(text.contains(value));
 }

}
