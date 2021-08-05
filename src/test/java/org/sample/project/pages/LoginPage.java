package org.sample.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.project.Drivers;
import org.sample.project.MyActions;

public class LoginPage {
    @FindBy (id = "username") private WebElement usernameFld;
    @FindBy (id = "password") private WebElement passwordFld;
    @FindBy (name = "login") private WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(Drivers.getDriver(), this);
    }

    public LoginPage enterUserName(String username){
        MyActions.sendKeys(usernameFld, username);
        return this;
    }

    public LoginPage enterPassword(String password){
        MyActions.sendKeys(passwordFld, password);
        return this;
    }

    public void clickLoginBtn(){
        MyActions.click(loginBtn);
    }
}
