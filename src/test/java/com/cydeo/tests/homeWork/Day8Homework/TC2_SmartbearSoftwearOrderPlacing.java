package com.cydeo.tests.homeWork.Day8Homework;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC2_SmartbearSoftwearOrderPlacing extends TestBase {
    //2. Go to website:
    //3. Enter username: “Tester”
    //4. Enter password: “test”
    //5. Click on Login button
    //6. Click on Order
    //7. Select familyAlbum from product, set quantity to 2
    //8. Click to “Calculate” button
    //9. Fill address Info with JavaFaker
    //• Generate: name, street, city, state, zip code
    //10. Click on “visa” radio button
    //11. Generate card number using JavaFaker
    //12. Click on “Process”
    //13. Verify success message “New order has been successfully added.”

    @Test
    public void test1(){
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

        WebElement userName=driver.findElement(By.xpath("//div[@class='login']//input[1]"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//div[@class='login']//input[2]"));
        password.sendKeys("test");
        WebElement loginBtn=driver.findElement(By.xpath("//div[@class='login']//input[3]"));
        loginBtn.click();

        WebElement orderBtn=driver.findElement(By.xpath("//a[text()='Order']"));
        orderBtn.click();

        Select dropDownProduct=new Select(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
         dropDownProduct.selectByVisibleText("FamilyAlbum");

         WebElement dropDownQuantity=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
         dropDownQuantity.sendKeys("2");

         WebElement calculateBtn=driver.findElement(By.xpath("//input[@value='Calculate']"));
         calculateBtn.click();
















    }























}
