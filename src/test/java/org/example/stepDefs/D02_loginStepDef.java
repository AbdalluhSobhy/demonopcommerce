package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login=new P02_login();

    @Given("user go to login page")
    public  void openLoginPage (){

     login.LoginIcon().click();
    }
    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void  loginData(String s  ,String email ,String passWord) throws InterruptedException {
        Thread.sleep(2000);
        login.email().clear();
      login.email().sendKeys(email);
      login.password().sendKeys(passWord);

    }
    @And("user press on login button")
    public void LoginButton(){
    login.login_button().sendKeys(Keys.ENTER);

    }
    @Then("user login to the system successfully")
    public void LoginSuccessfully(){
        String actualUrl = Hooks.driver.getCurrentUrl();
        String expectedUrl="https://demo.nopcommerce.com/";
        SoftAssert soft =new SoftAssert();
        soft.assertEquals(actualUrl,expectedUrl);

        login.ico_account().isDisplayed();

        soft.assertAll();

    }

    @Then("user could not login to the system")
    public void notLogin(){
     String Expected = "Login was unsuccessful" ;

     String actual = login.message_error().getText();

        SoftAssert soft =new SoftAssert();
        soft.assertTrue(actual.contains(Expected));

        String colorExpected = Color.fromString("rgba(228, 67, 75, 1)").asHex();
        String colorActual="#e4434b";
        soft.assertEquals(colorActual,colorExpected);
        soft.assertAll();

    }

}
