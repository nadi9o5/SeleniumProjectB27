package com.cydeo.tests.day5_testNG_dropDown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_RadioButton {
    public static void main(String[] args) throws InterruptedException {

      //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



      //  2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

      //  3. Click to “Hockey” radio button
        WebElement HockeyButton=driver.findElement(By.xpath("//input[@id='hockey']"));
        HockeyButton.click();

        //  4. Verify “Hockey” radio button is selected after clicking.

        if(HockeyButton.isSelected()){
            System.out.println("Hockey Button is Selected");
        }else{
            System.out.println("Hockey Button is Not Selected");
        }



        Thread.sleep(3000);
        driver.quit();












    }
}
