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

    @FindBy(xpath = "//*[@id=\"main\"]/table/tbody/tr/td/a")
    public List<WebElement> records;
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
    @FindBy(xpath = "//*[@id=\"main\"]/form[1]/div/input")
    WebElement saveBtn;

    public void svBtn(){
        saveBtn.click();
    }
    @FindBy(xpath = "//td/a")
    public WebElement clickCmp;

    // fields check
    @FindBy(xpath = "//a[text()='Computer name']")
    public WebElement compNameTable;

    @FindBy(xpath = "//a[text()='Introduced']")
    public WebElement introducedTable;

    @FindBy(xpath = "//a[text()='Discontinued']")
    public WebElement discontedTable;

    @FindBy(xpath = "//a[text()='Company']")
    public WebElement companyTable;
    // end of fields check

    //pagination buttons
    @FindBy(xpath = "//*[@id=\"pagination\"]/ul")
    public WebElement paginBtn;

    @FindBy(xpath = "//a[contains(text(), 'Previous')]")
    public  WebElement prevBtn;
    @FindBy(xpath = "//a[contains(text(), 'Displaying')]")
    public  WebElement dispBtn;
    @FindBy(xpath = "//a[contains(text(), 'Next')]")
    public  WebElement nxtBtn;
    // end of it

    public void clickCmp(){
        clickCmp.click();
    }

    public void addName(String arg1){
        addName.clear();
        addName.sendKeys(arg1);
    }
    public void addIntroduced(String arg1){
        addIntroduced.clear();
        addIntroduced.sendKeys(arg1);
    }


}
