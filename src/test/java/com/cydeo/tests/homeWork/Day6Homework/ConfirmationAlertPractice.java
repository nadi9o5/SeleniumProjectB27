package com.cydeo.tests.homeWork.Day6Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ConfirmationAlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }

    @Test
    public void alertPractice() {
        //Click to “Click for JS Confirm” button

        WebElement clickJs = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        clickJs.click();

        //Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //Verify “You clicked: Ok” text is displayed.

        WebElement text = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(text.isDisplayed());

    }






}
