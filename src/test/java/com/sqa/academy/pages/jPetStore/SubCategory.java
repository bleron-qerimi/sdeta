package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SubCategory {

    public SubCategory(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//th)[1]")
    public WebElement productId;

    @FindBy(xpath = "//th")
    public List<WebElement> fetchedTableHeaders;

    @FindBy(xpath = "//*[@id=\"BackLink\"]/a")
    public WebElement returnToPetViewButton;

    public void clickOnReturnButton(){
        returnToPetViewButton.click();
    }

    @FindBy(xpath = "//td/a[text()='Add to Cart']")
    List<WebElement> addToCartButtons;

    public void clickOnAddToCartButton(int index){

            addToCartButtons.get(index).click();

       // return addToCartButtons.get(index).getText();

    }

    public String[] getHeaders(){

        String[] tableHeaders= new String[4];
        for (int i = 0; i <tableHeaders.length; i++){
            tableHeaders[i] = fetchedTableHeaders.get(i).getText();
        }

        return tableHeaders;
    }
}
