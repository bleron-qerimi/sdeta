package com.sqa.academy.pages.jPetStore;

import com.sqa.academy.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractBasePage {
    public AbstractBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"LogoContent\"]/a/img")
    public WebElement logo;

    @FindBy(xpath = "somexpath")
    public WebElement searchInput;

    @FindBy(xpath = "somexpath")
    WebElement searchButton;

    @FindBy(xpath ="//div/a[2]" )
    public WebElement signInButton;
    public abstract void search(String searchTest);
    public abstract void clicLogo();
}
