package com.cydeo.tests.day5_testNG_dropDown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void googleTitle(){

        driver.get("https://www.google.com/");

            String actualTitle=driver.getTitle();
            String expectedTitle="Google";

        Assert.assertEquals(actualTitle,expectedTitle,"Title is not matching");// if statement
    }

    @AfterMethod
    public void  tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }










































}
