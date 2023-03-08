package com.frameksen.pages;

import com.frameksen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="user")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="submit-form")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }


    public void loginMethod(){
        this.userName.sendKeys("user1");
        this.password.sendKeys("Userpass123");
        this.submit.click();
    }
}
