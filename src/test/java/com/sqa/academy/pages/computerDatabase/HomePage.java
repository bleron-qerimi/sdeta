package com.sqa.academy.pages.computerDatabase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends ComputerDatabaseElements {
        public HomePage(WebDriver driver){
            super(driver);
            PageFactory.initElements(driver, this);
        }

        @Override
        public void search(String searchTest) {
            addName.sendKeys("HP");
            addIntroduced.sendKeys("2006-12-03");
            addDiscontinued.sendKeys("2022-05-25");
            Select select = new Select(selectCompany);
            select.selectByVisibleText("Hewlett-Packard");
            addBtn.click();
        }

    }
