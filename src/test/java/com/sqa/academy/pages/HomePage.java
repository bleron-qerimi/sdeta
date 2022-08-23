package com.sqa.academy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends AbstractBasePage {
    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void search(String searchTest) {
        searchInput.sendKeys(searchTest);
        searchButton.click();
    }

    @Override
    public void clicLogo() {
        logo.click();
    }

    @FindBy(xpath = "//div[@id='SidebarContent']/a/img")
    public List<WebElement> leftSideMenu;
    @FindBy(xpath = " //div[@id=\"QuickLinks\"]/a")
    public List<WebElement> middleTopMenu;



}
