package com.cydeo.tests.homeWork.Day7Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC1_checkingNumbers {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.openxcell.com");
    }
   @Test
   public void test1(){
//Count the number of the links on the page and verify
//Expected: 332

       List<WebElement>links=driver.findElements(By.tagName("a"));
       System.out.println("links.size() = " + links.size());
       int expectedNum=355;
       int actualNum=links.size();
       Assert.assertEquals(actualNum,expectedNum);


   }












@AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
}



































}
