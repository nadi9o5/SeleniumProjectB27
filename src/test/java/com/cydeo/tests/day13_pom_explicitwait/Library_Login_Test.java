package com.cydeo.tests.day13_pom_explicitwait;

import com.cydeo.pages.Library_LoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Library_Login_Test {
    Library_LoginPage library_loginPage=new Library_LoginPage();// make it visible
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://library1.cydeo.com");


    }
    @Test
    public void required_field_error_message_test() {
      //TC #1: Required field error message test
      //1- Open a chrome browser
     //2- Go to: https://library1.cydeo.com

        //3- Do not enter any information
        // 4- Click to “Sign in” button

        library_loginPage.signInBtn.click();
       // 5- Verify expected error is displayed: Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN
        Assert.assertTrue(library_loginPage.fieldRequiredErrorMsg.isDisplayed());
    }

    @Test
    public void required_valid_email_address(){
        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com/

        //3- Enter invalid email format
        //4- Verify expected error is displayed: Expected: Please enter a valid email address.


        library_loginPage.emailErrorMsg.sendKeys("something");// libraryLoginPage.inputUsername.sendKeys(faker.name().username());
        library_loginPage.signInBtn.click();
        Assert.assertTrue(library_loginPage.emailErrorMsg.isDisplayed());
    }


    @Test
    public void library_positive_login_test(){








    }













    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }





}
