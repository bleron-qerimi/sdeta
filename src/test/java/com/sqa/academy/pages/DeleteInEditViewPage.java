package com.sqa.academy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteInEditViewPage {
    WebDriver driver;

    public DeleteInEditViewPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//td/a")
    WebElement firstPage;

    @FindBy(xpath = "//*[@id=\"main\"]/form[2]/input")
    WebElement editView;

    public void clickOnFirstPage(){
        firstPage.click();
    }
    public void clickOnEditPage(){
        editView.click();
    }

}
