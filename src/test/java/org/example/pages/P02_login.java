package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {



    public WebElement LoginIcon(){
     return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement email(){
        return Hooks.driver.findElement(By.className("email"));
    }
    public WebElement password(){

        return Hooks.driver.findElement(By.className("password"));
    }
     public WebElement login_button(){

        return Hooks.driver.findElement(By.className("password"));
     }
     public WebElement message_error (){

      return Hooks.driver.findElement(By.className("message-error"))  ;
     }
     public WebElement ico_account(){

        return Hooks.driver.findElement(By.className("ico-account"));
    }

}
