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

public class InformationAlertPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertPractice() throws InterruptedException {
       // Click to “Click for JS Prompt” button
        WebElement clickPrompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        clickPrompt.click();
   //Send “hello” text to alert
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");
        Thread.sleep(3000);

   //Click to OK button from the alert
        alert.accept();

 // Verify “You entered:  hello” text is displayed.
        WebElement text=driver.findElement(By.xpath("//p[text()='You entered: hello']"));

        Assert.assertTrue(text.isDisplayed());












    }






































}
