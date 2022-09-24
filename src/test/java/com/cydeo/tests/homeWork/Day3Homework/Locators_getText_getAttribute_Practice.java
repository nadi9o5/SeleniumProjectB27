package com.cydeo.tests.homeWork.Day3Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators_getText_getAttribute_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");// go to link

        //Enter incorrect username into login box:
        WebElement loginBox=driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginBox.sendKeys("incorrect");
        Thread.sleep(3000);

        WebElement resetPassword=driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPassword.click();
        Thread.sleep(3000);

        String expected="Login or E-mail not found";
        WebElement errorMessage=driver.findElement(By.cssSelector("div[class='errortext']"));
       String actualMessage= errorMessage.getText();

        if(actualMessage.equals(expected)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

Thread.sleep(3000);
driver.quit();


/*

5- Verify “error” label is as expected
Expected: Login or E-mail not found





 */




































































    }
}
