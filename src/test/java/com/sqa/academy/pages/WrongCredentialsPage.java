package com.sqa.academy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WrongCredentialsPage {
    WebDriver driver;

    @FindBy(name="username")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "repeatedPassword")
    WebElement repeatPassword;

    @FindBy(name = "newAccount")
    WebElement registerButton;

    public WrongCredentialsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String arg1){
        userName.sendKeys(arg1);
    }

    public void enterPassword(String arg1){
        password.sendKeys(arg1);
    }

    public void enterRepeatPassword(String arg1){
        repeatPassword.sendKeys(arg1);
    }

    public void clickRegisterButton(){
        repeatPassword.click();
    }
}
