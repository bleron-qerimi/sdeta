package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectPetPage {
    public WebDriver driver;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a")
    public WebElement selectAPet;
    List<WebElement> myList= (List<WebElement>) selectAPet;
    List<String> allElements=new ArrayList<>();


    @FindBy(xpath = "//td/a")
    public  WebElement productId;

    public SelectPetPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void clickPet(){
        for(int i=0; i<myList.size(); i++){

            //loading text of each element in to array all_elements_text
            allElements.add(myList.get(i).getText());

            //to print directly
            System.out.println(myList.get(i).getText());

        }
        
    }

}
