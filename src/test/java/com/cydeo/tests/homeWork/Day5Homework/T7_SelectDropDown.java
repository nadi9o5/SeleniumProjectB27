package com.cydeo.tests.homeWork.Day5Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T7_SelectDropDown {
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


       // Select all the options from multiple select dropdown.
       //  Print out all selected values.
        // Deselect all values.

        WebElement multiOption=driver.findElement(By.name("Languages"));
        Select multiOptionSelect=new Select(multiOption);
        multiOptionSelect.selectByIndex(0);
        multiOptionSelect.selectByValue("js");
        multiOptionSelect.selectByVisibleText("C#");
        multiOptionSelect.selectByValue("python");
        multiOptionSelect.selectByValue("ruby");
        multiOptionSelect.selectByValue("c");


        List<WebElement>languages=new ArrayList<>();
        languages.addAll(multiOptionSelect.getAllSelectedOptions());

        for(WebElement each:languages){
            System.out.println(each.getText());
        }


        multiOptionSelect.deselectAll();




    }















}
