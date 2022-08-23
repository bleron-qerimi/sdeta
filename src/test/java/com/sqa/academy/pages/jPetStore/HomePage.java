package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@id='SidebarContent']/a")
    public List<WebElement> leftSideMenu;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[1]")
    public  WebElement shoppingCart;
    @FindBy(xpath = "//td[5]/a")
    public List<WebElement> addToCartProductView;
    @FindBy(xpath = "//td/a")
    public WebElement addToCartItemView;
    public WebElement getPet(String petName){
        if(petName.equalsIgnoreCase("fish"))
            return leftSideMenu.get(0);
        else if (petName.equalsIgnoreCase("dog"))
            return leftSideMenu.get(1);
        else
            return null;
    }
}
