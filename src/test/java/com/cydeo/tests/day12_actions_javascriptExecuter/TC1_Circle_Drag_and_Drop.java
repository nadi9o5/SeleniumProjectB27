package com.cydeo.tests.day12_actions_javascriptExecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop_test(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    // locate small and big circle
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        // click accept cookies button to stop not having any issue in our test
        WebElement acceptCookies=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookies.click();
        BrowserUtils.sleep(2);

        // create actions object
        Actions actions=new Actions(Driver.getDriver());
        //2. Drag and drop the small circle to bigger circle.--->actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle)
               .pause(2000)
                .moveToElement(bigCircle)
                . pause(2000)
                .release()
                .  perform();
        //3. Assert: -Text in big circle changed to: “You did great!”

        String actualTextBigCircle=bigCircle.getText();
        String expectedText="You did great!";
        Assert.assertEquals(actualTextBigCircle,expectedText);



















    }










}
