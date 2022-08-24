package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SubCategory {

    @FindBy(xpath = "(//th)[1]")
    public WebElement productId;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[1]/th")
    public List<WebElement> fetchedTableHeaders;

    @FindBy(linkText = "Return to fish")
    public WebElement returnToPetViewButton;

    public void clickOnReturnButton(){
        returnToPetViewButton.click();
    }

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr/td[5]/a")
    List<WebElement> addToCartButtons;

    public String clickOnAddToCartButton(int index){
        try{
            addToCartButtons.get(index).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return addToCartButtons.get(index).getText();

    }

    public String[] getHeaders(){

        String[] tableHeaders= new String[4];
        for (int i = 0; i <tableHeaders.length; i++){
            tableHeaders[i] = fetchedTableHeaders.get(i).getText();
        }

        return tableHeaders;
    }
}
