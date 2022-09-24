package com.cydeo.tests.day2_Locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {
    public static void main(String[] args) {

     //   1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to https://library2.cydeo.com/login.html
        driver.get("https://library2.cydeo.com/login.html");


        //  3. Enter username: “incorrect@email.com”
        WebElement userNameInput=driver.findElement(By.id("inputEmail"));
        userNameInput.sendKeys("incorrect@email");

        // 4. Enter password: “incorrect password”
      WebElement passwordInput=driver.findElement(By.id("inputPassword"));
      passwordInput.sendKeys("incorrect@password");


      // 5-    click to sign in botton
        WebElement signinBotton=driver.findElement(By.tagName("button"));
        signinBotton.click();



       // 6. Verify: visually “Sorry, Wrong Email or Password”displayed




























































    }
}
