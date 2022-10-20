package com.cydeo.tests.day11_upload_actions_javascripts;

import com.cydeo.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_Scroll_JavaScriptExecutor {
    @Test
    public void javascript_executor() {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/infinite_scroll
        driver.get("https://practice.cydeo.com/infinite_scroll");

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,750) ");
        //a. 750 pixels down 10 times.
        //b. 750 pixels up 10 times
        for (int i = 0; i < 750; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,750)");
        }


    }


}
