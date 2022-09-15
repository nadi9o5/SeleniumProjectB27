package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1.set up web driver manager
        WebDriverManager.chromedriver().setup();
        // 2.opening empty browser with creating instance driver
        WebDriver driver =new ChromeDriver();
        // 3. go to :" htps://www.tesla.com"
        driver.get("https://www.tesla.com");

        // navigate().to()method is loading to url in browser
        driver.navigate().to("http://www.tesla.com");

        Thread.sleep(3000);

        //navigate().back()method will take previous page
        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();

//close() method will close current opened page
        driver.close();





    }
}
