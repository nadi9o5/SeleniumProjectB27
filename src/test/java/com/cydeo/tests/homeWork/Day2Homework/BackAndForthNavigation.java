package com.cydeo.tests.homeWork.Day2Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {

        //  1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //    2- Go to: https://google.com

        driver.get("https://google.com ");
        Thread.sleep(3000);

        //   3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.linkText("Gmail"));
        gmailButton.click();
        Thread.sleep(3000);


        //    4- Verify title contains:Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {

            System.out.println("Verification passed");
        } else {
            System.out.println("Failed /Sorry");
        }

        //   5- Go back to Google by using the .back();

        driver.navigate().back();
        Thread.sleep(3000);

        //    6- Verify title equals: Expected: Google
        expectedTitle = "Google";
        actualTitle = driver.getTitle();
        if (actualTitle.equals(actualTitle)) {

            System.out.println("Verification Passed");
        } else {
            System.out.println("Failed/Sorry");
        }


        Thread.sleep(3000);
        driver.quit();


    }
}
