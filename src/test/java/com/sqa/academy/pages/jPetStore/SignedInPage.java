package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignedInPage {

    public SignedInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    public WebElement signOutButton;

    public String getSignOutButtonText(){
        return String.valueOf(signOutButton);
    }

    @FindBy(id = "WelcomeContent")
    public WebElement welcomeText;

    public String getWelcomeText(){
        return welcomeText.getText();
    }
}
