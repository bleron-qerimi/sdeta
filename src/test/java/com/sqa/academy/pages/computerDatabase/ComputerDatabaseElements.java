package com.sqa.academy.pages.computerDatabase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  class ComputerDatabaseElements {
    public ComputerDatabaseElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]")
    public WebElement addBtn;
    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement addName;
    @FindBy(xpath = "//*[@id=\"introduced\"]")
    public WebElement addIntroduced;
    @FindBy(xpath = "//*[@id=\"discontinued\"]")
    public WebElement addDiscontinued;
    @FindBy(xpath = "//*[@id=\"company\"]")
    public WebElement selectCompany;
    @FindBy(xpath = "//*[@id=\"searchbox\"]")
    public WebElement search;
    @FindBy(xpath = "//*[@id=\"searchsubmit\"]")
    public WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"main\"]/table/thead/tr/th/a")
    public List<WebElement> arrangedButtons;
}
