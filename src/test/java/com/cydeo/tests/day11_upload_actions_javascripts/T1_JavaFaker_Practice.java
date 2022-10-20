package com.cydeo.tests.day11_upload_actions_javascripts;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T1_JavaFaker_Practice {
    @Test
    public void registration_form() {
//        1. Open browser
//        2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.for.url"));

//        3. Enter first name

        Faker faker = new Faker();

        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

//        4. Enter last name
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@placeholder='last name']"));
        lastName.sendKeys(faker.name().lastName());
//        5. Enter username
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@placeholder='username']"));
        userName.sendKeys(faker.name().username().replace(".", ""));
//        6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());

//        7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());


//        8. Enter phone number
        WebElement phoneNum = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNum.sendKeys(faker.numerify("###-###-####"));

//        9. Select a gender from radio buttons
        List<WebElement> genders = Driver.getDriver().findElements(By.xpath("//input[@type='radio']"));

        for (int i = 1; i <= 3; i++) {
            genders.get(faker.number().numberBetween(1, 3)).click();
        }
//        10. Enter date of birth
        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys("10/03/1987");
        //Select Department Office

        Select departmentDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropDown.selectByIndex(faker.number().numberBetween(1, 9));
        //        12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1, 8));

        //        13. Select programming language from checkboxes
        List<WebElement> languages = Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 1; i <= 3; i++) {
            languages.get(faker.number().numberBetween(0, 2)).click();
        }

//        14. Click to sign up button
        WebElement signBtn = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signBtn.click();


//        15. Verify success message “You’ve successfully completed registration.” is
//        displayed.

        String expectedMsg = "You’ve successfully completed registration";

        WebElement msg = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']/p"));
        String actualMsg = msg.getText();

        Assert.assertEquals(actualMsg, expectedMsg);


    }


}
