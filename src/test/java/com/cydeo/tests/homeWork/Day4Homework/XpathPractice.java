package com.cydeo.tests.homeWork.Day4Homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class XpathPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/multiple_buttons ");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        WebElement clickText = driver.findElement(By.xpath("//p[@id='result']"));

        String actual = clickText.getText();
        String expected = "Clicked on button one!";
        if(actual.equals(expected)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
