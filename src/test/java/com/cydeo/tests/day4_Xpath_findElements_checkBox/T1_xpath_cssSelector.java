package com.cydeo.tests.day4_Xpath_findElements_checkBox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        //  1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password ");

        /*  3. Locate all the WebElements on the page using XPATH and/or CSS
               locator only (total of 6) */



    //a. “Home” link
        // locate using cssSelector with class Attribute: syntax#1   & syntax#2
        WebElement homeLink=driver.findElement(By.cssSelector("a.nav-link"));
       WebElement homeLink2=driver.findElement(By.cssSelector("a[class='nav-link']"));
       // locate using xpath Relative
        WebElement homeLink3=driver.findElement(By.xpath("//a[@class='nav-link']"));



    //   b. “Forgot password” header

        // using cssSelector with class attribute syntax#1 & syntax#2
        WebElement forgotPassword1=driver.findElement(By.cssSelector("div[class='example']>h2"));
        WebElement forgotPassword2=driver.findElement(By.cssSelector("div.example>h2"));
        // using xpath with classAttribute
        WebElement forgotPassword3=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        // xpath class attiribute Parent to child
        WebElement forgotPassword4=driver.findElement(By.xpath("//div[@class='example']/h2"));

    //  c. “E-mail” text
        WebElement email=driver.findElement(By.xpath("//label[text()='E-mail']"));
        WebElement email2=driver.findElement(By.xpath("//label[contains(@for,'email')]"));

    //  d. E-mail input box
        WebElement emailInput=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
    //   e. “Retrieve password” button--> xpath Class Attribute
        WebElement button=driver.findElement(By.xpath("//button[@id='form_submit']"));

        //  f. “Powered by Cydeo text
        // cssSelector style Attribute
        WebElement cydeoText=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        //xpath style Attribute
        WebElement cydeoText2=driver.findElement(By.xpath("//div[@style='text-align: center;']"));



    //   4. Verify all web elements are displayed.


        System.out.println("homeLink.isDisplayed()=  "+ homeLink.isDisplayed());
        System.out.println("  forgotPassword1.isDisplayed()= "+  forgotPassword1.isDisplayed());
        System.out.println();
        System.out.println("email.isDisplayed()=  "+email.isDisplayed());
        System.out.println("emailInput.isDisplayed()=  "+emailInput.isDisplayed());
        System.out.println("cydeoText.isDisplayed()= "+cydeoText.isDisplayed());
        System.out.println(" button.isDisplayed()= "+ button.isDisplayed());

Thread.sleep(3000);
driver.quit();





































































    }
}

































































