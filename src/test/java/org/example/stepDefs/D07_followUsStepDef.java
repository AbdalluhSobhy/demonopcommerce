package org.example.stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.P03_homePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {
    P03_homePage homePage =new P03_homePage();

    
    @When("user opens facebook link")
    public void user_opens_facebookP_link () throws InterruptedException {
        homePage.Facebook().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }


    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        homePage.Twitter().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        homePage.RSS().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        homePage.YouTube().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }


    @Then("facebook link is opened in new tab")
    public void facebookLinkIsOpenedInNewTab() {
        String Actual = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(Actual,"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
    }

    @Then("twitter link is opened in new tab")
    public void twitterLinkIsOpenedInNewTab() {
     String Actual = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(Actual,"https://twitter.com/nopCommerce");
        Hooks.driver.close();
    }

    @Then("demo.nopcommerce link is opened in new tab")
    public void demoNopcommerceLinkIsOpenedInNewTab() {
        String Actual = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(Actual,"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
    }

    @Then("youtube link is opened in new tab")
    public void youtubeLinkIsOpenedInNewTab() {
        String Actual = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(Actual,"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
    }
}
