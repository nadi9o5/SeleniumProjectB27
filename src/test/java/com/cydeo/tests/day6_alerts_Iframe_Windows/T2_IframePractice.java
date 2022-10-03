package com.cydeo.tests.day6_alerts_Iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get(" https://practice.cydeo.com/iframe   ");
    }
    @Test
    public void iframeTask(){

        // switchTo iframe with using Index Number--->driver.switchTo().frame(0);

       // switchTo iframe with using iD value --->driver.switchTo().frame("mce_0_ifr");

  // switchTo iframe using iframe locator

   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


        // Assert: “Your content goes here.” Text is displayed.
        WebElement textArea=driver.findElement(By.xpath("//p"));
        Assert.assertTrue(textArea.isDisplayed());

        //after finish child frame we need to go back to Main HTML
        driver.switchTo().defaultContent();

   // Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

        WebElement headerText=driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());



    }








}
