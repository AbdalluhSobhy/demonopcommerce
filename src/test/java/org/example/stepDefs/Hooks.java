package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
 public static ChromeDriver driver=null;


    @Before
    public static void openBrowser(){
      // Browser bridge
        WebDriverManager.chromedriver().setup();
      // create new web-driver object ;
         driver =new ChromeDriver();
      // configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


  @After
    public static void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
