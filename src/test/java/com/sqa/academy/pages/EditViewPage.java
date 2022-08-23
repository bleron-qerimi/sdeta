package com.sqa.academy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditViewPage {
    WebDriver driver;

    public EditViewPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//td/a")
    WebElement firstPage;
    public void clickOnFirstPage(){
        firstPage.click();
    }
    @FindBy(xpath = "//*[@id=\"main\"]/form[2]/input")
    WebElement editView;

    public void clickOnEditPage(){
        editView.click();
    }

}
