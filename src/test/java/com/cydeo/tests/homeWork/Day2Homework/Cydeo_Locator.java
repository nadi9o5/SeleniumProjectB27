package com.cydeo.tests.homeWork.Day2Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo_Locator {
    public static void main(String[] args) throws InterruptedException {
// 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


     //   2- Go to: https://practice.cydeo.com/inputs
     driver.get("https://practice.cydeo.com/inputs");
     Thread.sleep(3000);

     //   3- Click to “Home” link

        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();
        Thread.sleep(3000);



        //   4- Verify title is as expected: Expected: Practice


        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        Thread.sleep(3000);
        driver.quit();



      //  PS: Locate “Home” link using “className” locator




















































    }
}
