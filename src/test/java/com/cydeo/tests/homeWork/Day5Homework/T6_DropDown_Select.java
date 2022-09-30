package com.cydeo.tests.homeWork.Day5Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_DropDown_Select {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void dropDown(){

       driver.get("https://practice.cydeo.com/dropdown  ");
      //  3. Click to non-select dropdown
     //   4. Select Facebook from dropdown
     //   5. Verify title is “Facebook - Log In or Sign Up”


        WebElement dropDownLink=driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropDownLink.click();
       WebElement faceBook=driver.findElement(By.linkText("Facebook"));
        faceBook.click();
        String actual=driver.getTitle();
        String expected="Facebook - log in or sign up";
        Assert.assertEquals(actual,expected);












    }




















































}
