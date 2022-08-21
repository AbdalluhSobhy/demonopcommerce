package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.asynchttpclient.ClientStats;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {

    P03_homePage homePage =new P03_homePage();

   @When("Select Euro currency from the dropdown list on the top left of home page")
    public void dropdown() throws InterruptedException {

   WebElement list =    homePage.customerCurrencyDropdownList();
       Select DropdownList = new Select(list);
       DropdownList.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
       Thread.sleep(1000);
   }
   @And("^Use hard assertion to verify Euro Symbol \"(.*)\" is shown on the 4 products displayed in Home page$")
   public void verifyEuroSymbol(String Symbol){
       List<WebElement> productList = homePage.productsInHomePage();
       int size =   homePage.productsInHomePage().size();
       System.out.println("size"+size);

       for (int i=0; i<size;i++){
           String text = productList.get(i).getText();
           Assert.assertTrue(text.contains(Symbol));

       }

   }


}
