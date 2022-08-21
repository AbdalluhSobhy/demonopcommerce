package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {


    public WebElement regisIco() {

   return  Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement maleRadio(){

    return Hooks.driver.findElement(By.cssSelector("input[id=\"gender-male\"]"));
    }

    public WebElement femaleRadio(){

   return Hooks.driver.findElement(By.cssSelector("input[id=\"gender-female\"]"));
    }
    public  WebElement firstName(){

        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public  WebElement lastName(){

        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement DateOfBirthYear(){

        return  Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement DateOfBirthMonth(){

       return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement DateOfBirthDay(){

        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement email (){

        return Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement Password(){

        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement register_button(){

        return Hooks.driver.findElement(By.name("register-button"));
    }
    public  WebElement successMassage(){

        return Hooks.driver.findElement(By.className("result"));
    }
}
