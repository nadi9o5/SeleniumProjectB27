package com.cydeo.tests.homeWork.Day5Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_SelectDropDown_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void dropDown(){
        driver.get("http://practice.cydeo.com/dropdown ");



        //     Select “December 1st, 1923” and verify it is selected.
        //        Select year using   : visible text
        //  Select month using    : value attribute Select
       //     day using : index number

        Select yearDropDown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropDown.selectByVisibleText("1923");

        Select monthDropDown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropDown.selectByValue("11");

        Select dayDropDown=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropDown.selectByIndex(0);


        String expectedMonth="December";
        String actualMonth=monthDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth,expectedMonth);


        String expectedDay="1";
        String actualDay=dayDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay,expectedDay);

        String expectedYear="1923";
        String actualYear=yearDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualYear,expectedYear);
























    }















































}
