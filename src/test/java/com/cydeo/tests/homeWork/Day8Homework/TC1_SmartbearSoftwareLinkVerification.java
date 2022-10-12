package com.cydeo.tests.homeWork.Day8Homework;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TC1_SmartbearSoftwareLinkVerification extends TestBase {
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3. Enter username: “Tester”
    //4. Enter password: “test”
    //5. Click to Login button
    //6. Print out count of all the links on landing page
    //7. Print out each link text on this page

@Test (priority = 1)
    public void test1(){
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    WebElement userName=driver.findElement(By.xpath("//div[@class='login']//input[1]"));
    userName.sendKeys("Tester");

    WebElement password=driver.findElement(By.xpath("//div[@class='login']//input[2]"));
    password.sendKeys("test");

    WebElement loginBtn=driver.findElement(By.xpath("//div[@class='login']//input[3]"));
    loginBtn.click();

    List<WebElement>links=driver.findElements(By.tagName("a"));
    System.out.println("links.size() = " + links.size());
    for(WebElement each:links){
        System.out.println("each.getText() : "+each.getText());
    }


}






















}
