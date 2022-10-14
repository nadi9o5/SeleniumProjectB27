package com.cydeo.tests.homeWork.day9Homework;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utils;
import com.cydeo.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginScenario_ConfigurationReader extends TestBase {

    @Test
    public void crm_project(){
        driver.get(ConfigurationReader.getProperty("env"));
        CRM_Utils.login_crm(driver);
        BrowserUtils.verifyTitle(driver,"Portal");





    }



















}
