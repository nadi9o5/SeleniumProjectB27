package com.cydeo.tests.day6_alerts_Iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void alertTask1(){
        driver.get(" http://practice.cydeo.com/javascript_alerts ");

    //     Click to “Click for JS Alert” button
        WebElement informationAlertButton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationAlertButton.click();


    //    Click to OK button from the alert--> To handle JS alerts we have to use Alert for switching driver to alert form
        Alert alert=driver.switchTo().alert();
        alert.accept();// accept() -->method will click OK button
    //    Verify “You successfully clicked an alert” text is displayed.


        String actualText=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText="You successfully clicked an alert";
        Assert.assertEquals(actualText,expectedText);






    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

























































}
