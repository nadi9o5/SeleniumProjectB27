package com.cydeo.tests.day2_Locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearchButton {
    public static void main(String[] args) throws InterruptedException {


        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com/
        driver.get("https://google.com/");


        //3- Write “apple” in search box

        WebElement searchBox=driver.findElement(By.name("q"));
        Thread.sleep(3000);
        // 4-  use Keys.ENTER  to search



        searchBox.sendKeys("apple"+ Keys.ENTER);





        //5- Verify title: Expected: Title should start with “apple” word



        String expectedTitle="apple";
        String actualTitle=driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("verification  passed");
        }else{
            System.out.println(" verification failed");
        }







        Thread.sleep(3000);

        driver.quit();





















































    }
}
