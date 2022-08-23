package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    WebDriver driver;

    @FindBy(xpath = "//p/a")
    WebElement enterStore;

    @FindBy(xpath = "//div/a[2]")
    WebElement logIn;

    @FindBy(xpath = "//form/following-sibling::a")
    WebElement signInButton;

    public void goTosignInForm(){
        enterStore.click();
        logIn.click();
        signInButton.click();
    }


    @FindBy(name="username")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "repeatedPassword")
    WebElement repeatPassword;

    @FindBy(name = "newAccount")
    WebElement registerButton;


    @FindBy(name="newAccount")
    WebElement register;

    public SignUpPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnSaveAccount(){
        register.click();
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
