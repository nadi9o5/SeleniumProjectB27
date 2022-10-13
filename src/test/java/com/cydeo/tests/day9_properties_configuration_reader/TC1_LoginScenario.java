package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_LoginScenario extends TestBase {
//1. Create new test and make set ups
//2. Go to : http://login1.nextbasecrm.com/
//3. Enter valid username
//4. Enter valid password
//5. Click to Log In button
//6. Verify title is as expected:
//Expected: Portal

@Test
    public void test1(){
    driver.get("http://login1.nextbasecrm.com/");
    WebElement userName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    userName.sendKeys("hr2@cydeo.com");

    WebElement password=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
   password.sendKeys("UserUser");

    WebElement logInBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
    logInBtn.click();

    String expectedTitle=" Portal";
    String actualTitle= driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle);

}




















































}
