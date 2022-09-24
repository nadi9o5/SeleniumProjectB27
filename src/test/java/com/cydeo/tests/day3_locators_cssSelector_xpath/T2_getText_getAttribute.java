package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) throws InterruptedException {


        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/  ");

        Thread.sleep(3000);


        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement remembermeLaBEL = driver.findElement(By.className("login-item-checkbox-label"));
        String expect = "Remember me on this computer";
        String actual = remembermeLaBEL.getText();

        if (actual.equals(expect)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        Thread.sleep(3000);

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?


        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expected2 = "FORGOT YOUR PASSWORD?";
        String actual2 = forgotPassword.getText();

        if (actual2.equals(expected2)) {
            System.out.println("Passed");
        } else {
            System.out.println("failed");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes


        String expected3=" forgot_password=yes";
        String actual3=forgotPassword.getAttribute("href");

        if (actual3.contains(expected3)) {

            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }

        Thread.sleep(3000);
        driver.quit();

















    }
}
