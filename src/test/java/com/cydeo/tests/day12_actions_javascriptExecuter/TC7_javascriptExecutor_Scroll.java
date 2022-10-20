package com.cydeo.tests.day12_actions_javascriptExecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC7_javascriptExecutor_Scroll {

    @Test
   public void javascript_executor_test(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        // we have to downCasting (typeCasting) to JavaScriptExecutor interface
        // for using methods coming from this interface


        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();



        WebElement cyLink= Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));

        BrowserUtils.sleep(3);
        //3- Scroll down to “Cydeo” link
        js.executeScript("arguments[0].scrollIntoView(true) ",cyLink,homeLink);
        //4- Scroll up to “Home” link
        js.executeScript("arguments[1].scrollIntoView(true) ",cyLink,homeLink);








































    }
















}
