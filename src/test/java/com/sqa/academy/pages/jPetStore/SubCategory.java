package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SubCategory {

    public SubCategory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//th)[1]")
    public WebElement productId;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[1]/th")
    public List<WebElement> fetchedTableHeaders;

    public ArrayList<String> getTableHeaders(){


        ArrayList<String> tableHeaders = new ArrayList<>();
        for (int i = 0; i < fetchedTableHeaders.size(); i++){
            tableHeaders.add(fetchedTableHeaders.get(i).getText());
        }
        return tableHeaders;
    }

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


}
