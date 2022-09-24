package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getText_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        // 1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get(" https://login1.nextbasecrm.com/?forgot_password=yes");


      //  3- Verify “Reset password” button text is as expected:Expected: Reset password

        WebElement resetBtn=driver.findElement(By.cssSelector("button[class='login-btn']"));

        String expected="Reset password";
        String actual= resetBtn.getText();
        if (actual.equals(expected)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



        Thread.sleep(3000);
        driver.quit();





































































































    }
}
