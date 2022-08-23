package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractBasePage {
    public AbstractBasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"LogoContent\"]/a/img")
    WebElement logo;

    @FindBy(xpath = "somexpath")
    WebElement searchInput;

    @FindBy(xpath = "somexpath")
    WebElement searchButton;

    public abstract void search(String searchTest);
    public abstract void clicLogo();
}
