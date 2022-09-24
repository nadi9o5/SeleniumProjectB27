package com.cydeo.tests.homeWork.Day2Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoPracticeToolVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com");

        String expected="cydeo";
        String currentUrl=driver.getCurrentUrl();
        if(currentUrl.contains(expected)){
            System.out.println("url verification passed");
        }else{
            System.out.println("Verification is failed");
        }


        Thread.sleep(3000);

        String expected2="Practice";
        String currentTitle=driver.getTitle();
        if(currentTitle.equals(expected2)){
            System.out.println("Verification Passed");
        }else {
            System.out.println("Verification failed");
        }

        Thread.sleep(3000);
        driver.quit();








    }
}
