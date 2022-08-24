package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReptileSpecies {
    public ReptileSpecies(WebDriver driver){ PageFactory.initElements(driver,this);}
    @FindBy(xpath = "//td/a")
    public List<WebElement> reptileProductIDLinks;
    @FindBy(xpath = "//th[contains(text(),'Product ID')]")
    public WebElement reptileHasProductID;
    @FindBy(xpath = "//th[contains(text(), 'Name')]")
    public WebElement reptileHasName;
}
