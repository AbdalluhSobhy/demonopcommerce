package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register reg = new P01_register();

    @Given("user go to register page")
   public void  openPage(){
   reg.regisIco().click();
    }

   @When("user select gender type")
    public void selectGender(){
        reg.femaleRadio().click();
        reg.maleRadio().click();


   }
    @And("^user enter first name \"(.*)\" last name \"(.*)\"$")
    public void  enterName (String first_name,String last_name){

    reg.firstName().sendKeys(first_name);
    reg.lastName().sendKeys(last_name);

    }
    @And("user enter date of birth")
     public void enterBirth() throws InterruptedException {
        WebElement list1 = reg.DateOfBirthYear();
        Select YearList = new Select(list1);
        YearList.selectByValue("2002");
        Thread.sleep(2000);

        WebElement list2 = reg.DateOfBirthMonth();
        Select monthList = new Select(list2);
        monthList.selectByValue("2");
        Thread.sleep(2000);

        WebElement list3 = reg.DateOfBirthDay();
        Select dayList = new Select(list3);
        dayList.selectByValue("10");
        Thread.sleep(2000);
    }
    @And("^user enter email \"(.*)\" field$")
    public void enterEmail(String email){
    reg.email().sendKeys(email);

    }
    @And("^user enter password fields \"(.*)\" \"(.*)\"$")
    public void enterPassword(String password,String ConfirmPassword ){
    reg.Password().sendKeys(password);
    reg.ConfirmPassword().sendKeys(ConfirmPassword);
    }
    @And("user click in register button")
    public void registerButton(){
    reg.register_button().click();
    }



    @Then("success massage displayed")
    public void displayedMassage() throws InterruptedException {
        Thread.sleep(3000);
        reg.successMassage().isDisplayed();

        String Actual =reg.successMassage().getText();
        String expected= "Your registration completed";
        SoftAssert soft =new SoftAssert();
        soft.assertEquals(Actual,expected);

        String colorExpected ="rgba(76, 177, 124, 1)";
        String colorActual = reg.successMassage().getCssValue("color");
        soft.assertEquals(colorActual,colorExpected);
        soft.assertAll();

    }

}
