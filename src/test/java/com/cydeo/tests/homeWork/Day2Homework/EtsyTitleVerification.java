package com.cydeo.tests.homeWork.Day2Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //   1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();



        //   2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com ");

     //   3. Search for “wooden spoon”

        WebElement searchBox=driver.findElement(By.name("search_query"));
        Thread.sleep(3000);
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

    //    4. Verify title:  Expected: “Wooden spoon | Etsy”


        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("verification passed");
        }else{
            System.out.println("failed");
        }

        Thread.sleep(3000);
        driver.quit();















    }
}
