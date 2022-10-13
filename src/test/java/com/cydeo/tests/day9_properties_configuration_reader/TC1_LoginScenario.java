package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
/*
    String expectedTitle=" Portal";
    String actualTitle= driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle);

 */
    BrowserUtils.verifyTitle(driver,"Portal");
}





@Test
    public void test2(){
    driver.get("http://login1.nextbasecrm.com/");

    CRM_Utils.login_crm(driver);
    BrowserUtils.verifyTitle(driver,"Portal");

}

@Test
    public void test3(){
    driver.get("http://login1.nextbasecrm.com/");
    CRM_Utils.login_crm(driver,"hr3@cydeo.com","UserUser");
    BrowserUtils.sleep(2);
    // verification pf title is failing sometimes, it is a bug
    BrowserUtils.verifyTitle(driver,"Portal");
}












































}
