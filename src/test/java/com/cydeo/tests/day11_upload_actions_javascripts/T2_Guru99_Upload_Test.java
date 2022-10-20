package com.cydeo.tests.day11_upload_actions_javascripts;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {
    @Test
    public void guru99_upload_test() {

        //        1. Go to  “http://demo.guru99.com/test/upload”
        Driver.getDriver().get("https://demo.guru99.com/test/upload");
        //        2. Upload file into Choose File

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));

        chooseFile.sendKeys("C:\\Users\\Nadi\\Downloads\\Software_Testing_Life_Cycle.docx");


        //        3. Click terms of service check box

        WebElement termOfService = Driver.getDriver().findElement(By.id("terms"));
        termOfService.click();

        //        4. Click Submit File button
        Driver.getDriver().findElement(By.id("submitbutton")).click();


        //        5. Verify expected message appeared. Expected: “1 file has been successfully uploaded.”

        WebElement resultMessage=Driver.getDriver().findElement(By.id("res"));
        String expectedMessage="1 file\nhas been successfully uploaded";
        BrowserUtils.sleep(4);

        String actualMessage=resultMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);





    }


}
