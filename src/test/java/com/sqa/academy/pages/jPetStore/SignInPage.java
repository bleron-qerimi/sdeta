package com.sqa.academy.pages.jPetStore;

import com.sqa.academy.pages.jPetStore.AbstractBasePage;
import com.sqa.academy.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="username")
    public WebElement usernameInputField;

    public void enterUsername(String arg1){
        usernameInputField.sendKeys(arg1);
    }

    @FindBy(name = "password")
    public WebElement passwordInputField;

    public void enterPassword(String arg1){
        passwordInputField.sendKeys(arg1);
    }

    @FindBy(name = "signon")
    public WebElement signInButtonSignInPage;

    public void signInButtonClick(){
        signInButtonSignInPage.click();
    }

    public boolean isSignInButtonSignInPageDisplayed(){
        return signInButtonSignInPage.isDisplayed();
    }

    @FindBy(xpath = "//*[@id='Content']/ul/li")
    public  WebElement loginFailedErrorMessage;

    public String getLoginFailedErrorMessage(){
        return loginFailedErrorMessage.getText();
    }


}
