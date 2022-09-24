package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    public static void main(String[] args) throws InterruptedException {

        /*
        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

         */
       WebDriver driver=WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        Thread.sleep(3000);

        //3- Enter incorrect username: “incorrect”

     WebElement inputUserName= driver.findElement(By.name("USER_LOGIN"));
     inputUserName.sendKeys("incorrect");

     Thread.sleep(3000);

        //  4- Enter incorrect password: “incorrect”
        WebElement inputPassWord=driver.findElement(By.name("USER_PASSWORD"));
        inputPassWord.sendKeys("incorrect");
        Thread.sleep(3000);


        //  5- Click to login button.
        WebElement loginButton=driver.findElement(By.className("login-btn"));
        loginButton.click();

        Thread.sleep(3000);





       // 6- Verify error message text is as expected: Expected: Incorrect login or password
        WebElement errorMessage=driver.findElement(By.className("errortext"));

        String expectedErrorMessage="Incorrect login or password";
        String actualErrorMessage=errorMessage.getText();
        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");

        }




        Thread.sleep(3000);
        driver.quit();































































    }
}
