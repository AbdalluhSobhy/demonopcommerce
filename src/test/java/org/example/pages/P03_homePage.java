package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {


    public WebElement customerCurrencyDropdownList() {

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> productsInHomePage() {

        List<WebElement> list = Hooks.driver.findElements(By.className("product-item"));
        return list;
    }

    public WebElement small_searchterms() {

        return Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }

    public WebElement searchButton() {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));

    }

    public WebElement searchFeild() {

        return Hooks.driver.findElement(By.cssSelector("input[id=\"q\"]"));
    }

    public List<WebElement> top_menu() {

        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }

    public WebElement pageTitle() {

        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

    public WebElement Nokia() {

        return Hooks.driver.findElement(By.cssSelector("a[style=\"display: none;\"]"));
    }

    public WebElement iphone() {

        return Hooks.driver.findElement(By.cssSelector("a[style=\"display: block;\"]"));
    }

    public WebElement Facebook() {

        return Hooks.driver.findElement(By.linkText("Facebook"));
    }

    public WebElement Twitter() {
        return Hooks.driver.findElement(By.linkText("Twitter"));
    }

    public WebElement RSS() {

        return Hooks.driver.findElement(By.linkText("RSS"));
    }

    public WebElement YouTube() {

        return Hooks.driver.findElement(By.linkText("YouTube"));
    }

    public List<WebElement> wishlist_button() {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishlist_successMassage() {

        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public List<WebElement> wishlist_label() {

        return Hooks.driver.findElements(By.xpath("//a[@href=\"/wishlist\"]"));
    }
      public WebElement  itemquantity11225 (){
    return  Hooks.driver.findElement(By.className("qty-input"));
    }
}