package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1.set up web driver manager
        WebDriverManager.chromedriver().setup();
        // 2.opening empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();
        // making window full screen maximizing
        driver.manage().window().maximize();


        // 3. go to :" htps://www.tesla.com"
        driver.get("https://www.tesla.com");
        // navigate().to()method is loading to url in browser
        driver.navigate().to("http://www.tesla.com");

        String currentTitle=driver.getTitle();
        System.out.println("Tite: "+currentTitle);

        String currentUrl=driver.getCurrentUrl();
        System.out.println("Url : "+currentUrl);

        Thread.sleep(3000);

        //navigate().back()method will take previous page
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();


        driver.navigate().to("https://www.google.com");


        // System.out.println( "driver.getTitle()= "+driver.getTitle());
         currentTitle=driver.getTitle();
        System.out.println("Tite: "+currentTitle);
        Thread.sleep(3000);
     //   System.out.println("driver.getCurrentUrl()= "+driver.getCurrentUrl());
         currentUrl=driver.getCurrentUrl();
        System.out.println("Url : "+currentUrl);

        Thread.sleep(3000);



        //close() method will close current opened page
        // driver.close(); driver.quit(); we will put at the end

        driver.quit();


    }
}