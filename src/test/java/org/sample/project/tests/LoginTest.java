package org.sample.project.tests;

import org.sample.project.Drivers;
import org.sample.project.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @AfterMethod
    public void quitDriver(){
        Drivers.quitDriver();
    }

    @Test
    public void shouldBeAbleToLogin(){
        Drivers.getDriver().navigate().to("https://askomdch.com/account");
        new LoginPage().
                enterUserName("demouser").
                enterPassword("password").
                clickLoginBtn();
    }
}
