package com.cydeo.tests.day5_testNG_dropDown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_SimpleDropDown {
    //1. Open Chrome browser
    WebDriver driver;
@BeforeMethod
    public void setUpMethod(){
    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



}

@Test
    public void simpleDropDown(){
    driver.get("http://practice.cybertekschool.com/dropdown");
    //    3. Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
   Select simpleDropDown=new Select(driver.findElement(By.id("dropdown")));


   String actualSimpleDropDown=simpleDropDown.getFirstSelectedOption().getText();
   String expectedSimpleDropDown="Please select an option";

    Assert.assertEquals(actualSimpleDropDown,expectedSimpleDropDown);
    //   4. Verify “State selection” default selected value is correctExpected: “Select a State”

    Select stateDropDown=new Select(driver.findElement(By.xpath("//select[@id='state']")));

    String actualStateDropDown=stateDropDown.getFirstSelectedOption().getText();
    String expectedStateDropDown="Select a State";
    Assert.assertEquals(actualStateDropDown,expectedStateDropDown);









}






























}
