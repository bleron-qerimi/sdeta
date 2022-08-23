package com.sqa.academy.pages.computerDatabase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends ComputerDatabaseElements {
        public HomePage(WebDriver driver) {
            super(driver);
            PageFactory.initElements(driver, this);
        }
    }
