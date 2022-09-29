package com.cydeo.tests.day5_testNG_dropDown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    @Test
    public void googleTitle(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

            String actualTitle=driver.getTitle();
            String expectedTitle="Google";

        Assert.assertEquals(actualTitle,expectedTitle);// if statement
    }











































}
