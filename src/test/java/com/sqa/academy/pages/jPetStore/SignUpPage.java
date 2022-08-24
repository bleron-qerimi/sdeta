package com.sqa.academy.pages.jPetStore;

import com.sqa.academy.actions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignUpPage {

    WebDriver driver;
// Go to sign in form

    @FindBy(xpath = "//h2")
    public WebElement enterTheStore;
    @FindBy(xpath = "//p/a")
    public WebElement enterStore;

    @FindBy(xpath = "//div/a[2]")
    public WebElement logIn;

    @FindBy(xpath = "//form/following-sibling::a")
    public WebElement signInButton;

    // wrong credentials on sign up form
    @FindBy(name="username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "repeatedPassword")
    public WebElement repeatPassword;

    @FindBy(name = "newAccount")
    public WebElement registerButton;

//  missing data to the required fields

    @FindBy(xpath = "//h3[1]")
    public WebElement userInformation;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[1]/td[1]")
    public WebElement userId;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[1]")
    public WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[1]")
    public WebElement rePassword;

    @FindBy(name="username")
    public WebElement userIdInput;

    @FindBy(name = "password")
    public WebElement newPasswordInput;

    @FindBy(name = "repeatedPassword")
    public WebElement rePasswordInput;

    public SignUpPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    public void enterUsername(String arg1){
        userName.sendKeys(arg1);
    }

    public void enterPassword(String arg1){
        password.sendKeys(arg1);
    }

    public void enterRepeatPassword(String arg1){
        repeatPassword.sendKeys(arg1);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
    public void goTosignInForm(){
        enterStore.click();
        logIn.click();
        signInButton.click();
    }

    public void clickAbleButton(){
        WebElement element = driver.findElement(By.name("newAccount"));
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();

        }
    }

}
