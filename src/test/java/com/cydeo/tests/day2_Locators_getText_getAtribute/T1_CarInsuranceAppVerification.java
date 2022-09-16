package com.cydeo.tests.day2_Locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CarInsuranceAppVerification {

    public static void main(String[] args) throws InterruptedException {

        // first 3 step: set up and open chrome
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        // go to link
        driver.get("https://www.qa1.excelsoirinsurance.com/login ");

        Thread.sleep(3000);

        // verify url contains expected
        String expected1 = "excelsoirinsurance";
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains(expected1)) {
            System.out.println("Verification is Passed");
        } else {
            System.out.println("Verification is Failed");
        }

        Thread.sleep(3000);


        // verify title expected
        String expected2 = "Login | Excelsoir Insurance";
        String currentTitle = driver.getTitle();

        if (currentTitle.equals(expected2)) {
            System.out.println("Verification is Passed");
        } else {
            System.out.println("Verification is Failed");
        }




        Thread.sleep(3000);
        driver.quit();


    }


}
/*
1. Open Chrome browser
2. Go to
https://www.qa1.excelsoirinsurance.com/login
3. Verify URL contains
     Expected: "excelsoirinsurance"
4. Verify title:
       Expected: "Login | Excelsoir Insurance"
 */