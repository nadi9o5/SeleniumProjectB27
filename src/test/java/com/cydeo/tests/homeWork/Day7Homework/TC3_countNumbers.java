package com.cydeo.tests.homeWork.Day7Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC3_countNumbers {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.openxcell.com ");
    }
@Test
    public void myTest3(){
        //Count the number of links that does not have text and verify
    //Expected: 109
    List<WebElement>lists=driver.findElements(By.tagName("//a[contains(@href,'https')]"));
    int count=0;
    for(int i=0;i< lists.size();i++){
        if(lists.isEmpty()){
            count++;
        }
    }
    System.out.println("count = " + count);



}








































}
