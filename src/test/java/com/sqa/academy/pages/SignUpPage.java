package com.sqa.academy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
    WebDriver driver;

    @FindBy(xpath = "//p/a")
    WebElement enterStore;

    @FindBy(xpath = "//div/a[2]")
    WebElement haha;
}
