package com.cydeo.tests.homeWork.Day5Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Select_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void myTest1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown  ");
        Select dropDownState=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //Select Illinois
        dropDownState.selectByIndex(14);
        //Select Virginia
        dropDownState.selectByValue("VA");

        //   Verify final selected option is California. Use all Select options. (visible text, value, index)

       // dropDownState.selectByVisibleText("California");
       dropDownState.selectByIndex(5);
       // dropDownState.selectByValue("CA");

        String actual=dropDownState.getFirstSelectedOption().getText();
        String expected="California";

        Assert.assertEquals(actual,expected);
        Thread.sleep(3000);

    }

































}
