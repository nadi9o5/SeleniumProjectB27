package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector {
    public static void main(String[] args) throws InterruptedException {


       // - Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        Thread.sleep(3000);

        //  3- Verify “Log in” button text is as expected:Expected: Log In

        // locate using cssSelector by class attribute:
        WebElement logInBtn=driver.findElement(By.cssSelector("input[class='login-btn']"));


        /*locate with using cssSelector by type attibute:
              WebElement logInBtn=driver.findElement(By.cssSelector("input[type='submit']"));
        locate using cssSelector by Value attribute:
             WebElement logInBtn2=driver.findElement(By.cssSelector("input[value='Log In']"));
        locate using cssSelector by  Syntax #2
              WebElement logInBtn4=driver.findElement(By.cssSelector("input.login-btn"));  */

        String expectedLoginBtnText="Log In";
        String actualLoginBtnText=logInBtn.getAttribute("value");
        if(actualLoginBtnText.equals(expectedLoginBtnText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


        Thread.sleep(3000);
        driver.quit();


    }
}
