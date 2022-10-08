package com.cydeo.tests.day7_windows_Webtables;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //   1. Open a chrome browser

     driver=WebDriverFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to : https://practice.cydeo.com/windows
     driver.get("https://practice.cydeo.com/windows ");
    }

    @Test
    public void multiple_windows_test(){


      //  3. Assert: Title is “Windows”

        String actualTitle=driver.getTitle();
        String expectedTitle="Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

     //   4. Click to: “Click Here” link

        WebElement clickLink= driver.findElement(By.linkText("Click Here"));
        clickLink.click();

        //   5. Click to: “CYDEO” link
        WebElement cydeoClick=driver.findElement(By.xpath("//a[text()='CYDEO']"));
        cydeoClick.click();

     //    6. Switch to Cydeo page.

        Set<String>allWindows=driver.getWindowHandles();// store all the windows Set of String
        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if(driver.getTitle().equals("Cydeo")){
                break;// stop on cydeo page
            }

        }


        //    7. Assert: Title is “Cydeo”
        actualTitle=driver.getTitle();
        expectedTitle="Cydeo";
        Assert.assertEquals(actualTitle,expectedTitle);


    }
    @AfterMethod
    public void tearDown(){
        driver.close();

      //  driver.quit(); close everything
}







































}
