package com.sqa.academy.pages.jPetStore;

import com.sqa.academy.pages.jPetStore.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {

    @FindBy(name = "username")
    public WebElement usernameInputField;

    @FindBy(name = "password")
    public WebElement passwordInputField;

    @FindBy(name = "signon")
    public WebElement signInButtonSignInPage;

    public void enterUsername(String arg1){
        usernameInputField.sendKeys(arg1);
    }

    public void enterPassword(String arg1){
        passwordInputField.sendKeys(arg1);
    }

    public void signInButtonClick(){
        signInButtonSignInPage.click();
    }

    @FindBy(xpath = "//*[@id=\"Content\"]/ul/li/text()")
    public static WebElement loginFailedErrorMesage;

    public static String getloginFailedErrorMesage(){

        String loginFailedErrorString = loginFailedErrorMesage.getText();

        return loginFailedErrorString;
    }
}
