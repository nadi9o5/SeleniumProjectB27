package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage_1 {
    public DynamicallyLoadedPage_1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Start']")
    public WebElement startBtn;
    @FindBy(css = "div#loading")
    public WebElement loadingBar;
    @FindBy(css = "#username")
    public WebElement inputUsername;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitBtn;


}
