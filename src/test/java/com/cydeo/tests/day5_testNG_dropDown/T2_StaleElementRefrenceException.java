package com.cydeo.tests.day5_testNG_dropDown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_StaleElementRefrenceException {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //  3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();
        //   4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));


        //   5. Click to “Delete” button.
        deleteButton.click();
        //    6. Verify “Delete” button is NOT displayed after clicking.
       try{
           System.out.println("Delete Button is Displayed=  "+ deleteButton.isDisplayed());
       }catch(StaleElementReferenceException e){
           System.out.println("Stale Element Refrence Exception is thrown and this is already expected");

        }



        Thread.sleep(3000);
        driver.quit();


    }
}
