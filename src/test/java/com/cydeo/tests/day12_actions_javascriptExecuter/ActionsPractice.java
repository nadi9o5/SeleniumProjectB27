package com.cydeo.tests.day12_actions_javascriptExecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void task4_task5(){
   //           TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/

        Driver.getDriver().get("https://practice.cydeo.com/");

        //Creating actions object to use methods coming from Actions class
        Actions actions=new Actions(Driver.getDriver());
        //4- Scroll using Actions class “moveTo(element)” method
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLink).perform();


        //          TC #5: Scroll practice 2


        //1- Continue from where the Task 4 is left in the same test.





        //2- Scroll back up to “Home” link using PageUP button

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();
      //  WebElement homeBtn=Driver.getDriver().findElement();----> actions.moveToElement(homeBtn).perform();











































    }





















































}
