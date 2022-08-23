package com.sqa.academy.pages.jPetStore;

import com.github.javafaker.Cat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Category {
    public Category(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h2")
    public WebElement categoryName;

    @FindBy(xpath = "(//th)[1]")
    public WebElement productId;

    @FindBy(xpath = "(//th)[2]")
    public WebElement productName;

    @FindBy(xpath = "//td/a")
    public List<WebElement> productLinks;

    public List<WebElement> productNames;


    public String clickOnProductIdLink(int index){
        try{
            productLinks.get(index).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return productLinks.get(index).getText();

    }




}
