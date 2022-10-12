package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.WebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTablePractice extends TestBase {


    //Verify Bob’s name is listed as expected.   Expected: “Bob Martin”
            // Verify Bob Martin’s order date is as expecte .Expected: 12/31/2021
    @Test
    public void order_name_verify_test() throws InterruptedException {
        WebElement bobMartinName= driver.findElement(By.xpath("//td[text()='Bob Martin']"));
        String expectedBobName="Bob Martin";
        String actualBobName=bobMartinName.getText();
        Assert.assertEquals(actualBobName,expectedBobName);

        // Verify Bob Martin’s order date is as expecte .Expected: 12/31/2021
        WebElement martinOrderNumber=driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedOrder="12/31/2021";
        String actualOrder=martinOrderNumber.getText();
        Assert.assertEquals(actualOrder,expectedOrder);
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {

        String customerOrderDate1= WebTablesUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);
        Thread.sleep(3000);
    }
    @Test
    public void test3(){

        WebTablesUtils.orderVerify(driver,"Ned Stark","05/12/2021");
    }









































































}
