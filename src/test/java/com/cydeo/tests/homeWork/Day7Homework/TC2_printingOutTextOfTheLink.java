package com.cydeo.tests.homeWork.Day7Homework;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC2_printingOutTextOfTheLink {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.openxcell.com ");
    }
@Test
    public void test1(){
    // Print out all of the texts of the links on the page
    List<WebElement>texts=driver.findElements(By.tagName("a"));
    for (WebElement each:texts){
       // System.out.println(each.getText());
    }

}

@AfterMethod
    public void tearDown(){
        driver.close();
}



















}
