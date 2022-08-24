package com.sqa.academy.pages.jPetStore;

import com.sqa.academy.pages.jPetStore.AbstractBasePage;
import com.sqa.academy.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignedInPage {

    public SignedInPage(WebDriver driver){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='WelcomeContent']")
    public WebElement welcomeTextElement;

    public String getWelcomeText(){

        String welcomeText = welcomeTextElement.getText();

        return welcomeText;
    }


}
