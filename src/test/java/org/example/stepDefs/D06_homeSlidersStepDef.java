package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

    P03_homePage homePage=new P03_homePage();


    @When("user click on first slider Nokia Lumia 1020")
    public void click_on_first_slider (){
       homePage.Nokia().click();

    }


    @When("user click on second slider \\(iPhone)")
    public void userClickOnSecondSliderIPhone() {
       homePage.iphone().click();
    }


    @Then("user go to iPhone  page")
    public void userGoToIPhonePage() {
        Assert.assertEquals("https://demo.nopcommerce.com/","https://demo.nopcommerce.com/iphone-6");

    }

    @Then("user go to Nokia Lumia 1020 page")
    public void userGoToNokiaLumiaPage() {
        Assert.assertEquals("https://demo.nopcommerce.com/","https://demo.nopcommerce.com/nokia-lumia-1020");

    }
}
