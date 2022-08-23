package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  class Categories {
    private String name;
    private String id;

    public Categories(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@id='Catalog']/h2")
    public WebElement categoryName;

    @FindBy(xpath = "//td/a")
    public List<WebElement> categoryLinks;

    public String getName(){
        this.name=categoryName.getText();
        return name;
    }

    //public abstract List<WebElement> getCategoryLinks();

}
