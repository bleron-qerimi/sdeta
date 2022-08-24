package com.sqa.academy.pages.jPetStore;

import com.sqa.academy.pages.jPetStore.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignedInPage {

    @FindBy(name = "username")
    public WebElement usernameInputField;


}
