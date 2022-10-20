package com.cydeo.tests.day10_javafaker_driver_util;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Singleton_driver_test {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // set up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Test(priority = 1)
    public void googleTitle(){
        Driver.getDriver().get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }

    @Test(priority = 2)
    public void yahooTitle(){
        Driver.getDriver().get("https://yahoo.com");
        System.out.println("yahoo test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }


    @Test (priority = 3)
    public void etsyTitle(){
        Driver.getDriver().get("https://etsy.com");
        System.out.println("etsy test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }














































}














