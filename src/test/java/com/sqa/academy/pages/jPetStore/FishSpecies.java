package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FishSpecies {
    public FishSpecies(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//td/a")
    public List<WebElement> fishProductIDLinks;
    @FindBy(xpath = "//th[contains(text(),'Product ID')]")
    public WebElement fishHasProductID;
    @FindBy(xpath = "//th[contains(text(),'Name')]")
    public  WebElement fishHasName;
}
