package com.sqa.academy.pages.computerDatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  class ComputerDatabaseElements {
    public ComputerDatabaseElements(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[@id=\"main\"]/form/div/input")
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
    @FindBy(xpath = "//*[@id=\"main\"]/form/div/a")
    public WebElement cancelBtn;
    @FindBy(xpath="//*[@id=\"main\"]/form/fieldset/div[1]/label")
    public WebElement computerName;
    @FindBy(xpath = "//*[@id=\"main\"]/form/fieldset/div[2]/label")
    public WebElement introduced;
    @FindBy(xpath="//*[@id=\"main\"]/form/fieldset/div[3]/label")
    public WebElement discontinued;
    @FindBy(xpath="//*[@id=\"main\"]/form/fieldset/div[4]/label")
    public WebElement company;

    @FindBy(xpath = "//*[@id=\"main\"]/table/thead/tr/th/a")
    public List<WebElement> arrangedButtons;
}
