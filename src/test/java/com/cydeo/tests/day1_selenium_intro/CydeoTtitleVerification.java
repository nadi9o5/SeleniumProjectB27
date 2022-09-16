package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTtitleVerification {
    public static void main(String[] args) throws InterruptedException {
      /*
      Open Chrome browser
      Go to http://www.cydeo.com
      verify title: Expected: Cydeo
       */

        // set up web drive manager
        WebDriverManager.chromedriver().setup();
        // creating instance driver on empty browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();



        // go to http:www.cydeo.com
        driver.get("http://www.cydeo.com");


        //verify title:Expected:Cydeo
        String expectedTitle="Cydeo";
        String actualTtitle=driver.getTitle();
    if(actualTtitle.equals(expectedTitle)){
        System.out.println("Title Verificantion is Passed");
    }else{
        System.out.println("Verification is failed");
    }

    Thread.sleep(3000);

driver.quit();















    }
}
