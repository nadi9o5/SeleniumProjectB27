package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_LoginPage {
    public Library_LoginPage() {
        /*
        Page factory class is a selenium class that support POM
        it has method initElements
        once it called it will store all elements specified using @FindBy
        method accept 2 arguments
        WebDriver instance
        Page class instance
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public WebElement fieldRequiredErrorMsg;

    @FindBy(xpath = "//div[text()='Please enter a valid email address.']")
    public WebElement emailErrorMsg;



}










