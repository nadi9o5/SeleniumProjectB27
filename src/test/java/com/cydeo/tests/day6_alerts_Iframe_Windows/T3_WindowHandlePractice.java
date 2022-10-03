package com.cydeo.tests.day6_alerts_Iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_WindowHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("  https://practice.cydeo.com/windows ");
    }

    @Test
    public void windowsTask() {

        // Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Before opening new window= "+actualTitle);

        // Click to: “Click Here” link
        WebElement clickBtn=driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickBtn.click();
        actualTitle=driver.getTitle();
        System.out.println("After opening new window= "+actualTitle);

        // Switch to new Window
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow= "+eachWindow);
            System.out.println("driver.getTitle()=  "+ driver.getTitle());
        }

        // Assert: Title is “New Window”
        actualTitle= clickBtn.getText();
        String expectedTitleAfterClick="New Window";
        Assert.assertEquals(actualTitle,expectedTitleAfterClick);


    }


}
