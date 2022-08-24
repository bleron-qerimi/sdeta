package com.sqa.academy.pages.jPetStore;

import com.sqa.academy.pages.jPetStore.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignedInPage {

    @FindBy(name = "username")
    public WebElement usernameInputField;

    @FindBy(xpath = "//*[@id='WelcomeContent']")
    public static WebElement welcomeTextElement;

    public static String getWelcomeText(){

        String welcomeText = welcomeTextElement.getText();

        return welcomeText;
    }


}
