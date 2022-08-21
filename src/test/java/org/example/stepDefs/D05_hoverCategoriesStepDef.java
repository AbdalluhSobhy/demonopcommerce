package org.example.stepDefs;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {

    P03_homePage homePage2 = new P03_homePage();

    @When("user could hover on categories")
    public void hover_on_categories() throws InterruptedException {

        Actions actions = new Actions(Hooks.driver);

        List<WebElement> list = homePage2.top_menu();
        int size = list.size();
        System.out.println("size" + size);
        Random ra =new Random();
        int selectedCategory = ra.nextInt(size);

        actions.moveToElement(list.get(selectedCategory)).perform();

        String selectedCategoryText = list.get(selectedCategory).getText();
        System.out.println("to know which category is selected:   " + selectedCategoryText);
        Thread.sleep(2000);


        int selectedCategory2 = selectedCategory + 1;
        String locator = "(//ul[@class='top-menu notmobile']//ul)[" + selectedCategory2 + "]/li";

        List<WebElement> subCategoryLinks = Hooks.driver.findElements(By.xpath(locator));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         String  selectedSubCategoryText = null;
        if (!subCategoryLinks.isEmpty()) {

            int subCategoryCount = subCategoryLinks.size();

            int selectedSubCategory  =ra.nextInt(subCategoryCount);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText().toLowerCase().trim();
            subCategoryLinks.get(selectedSubCategory).click();
            String Actual =homePage2.pageTitle().getText().toLowerCase().trim();
            Assert.assertTrue(Actual.contains(selectedSubCategoryText));
        }
        else {
            list.get(selectedCategory).click();
        }


    }
}