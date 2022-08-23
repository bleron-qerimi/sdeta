package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.WrongCredentialsPage;
import com.sqa.academy.utils.ConfigurationReader;
import com.sqa.academy.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TheUserHasAnExistingAccountAndTriesToSignUp extends Hooks {


    WrongCredentialsPage objWrongCredentialPage;
    @Test
    public void wrongCredentials() throws Exception{
        String url=ConfigurationReader.get("url4");
        driver.get(url);

        objWrongCredentialPage=new WrongCredentialsPage(driver);
        objWrongCredentialPage.enterUsername("522");
        objWrongCredentialPage.enterPassword("Eron1234");
        objWrongCredentialPage.enterRepeatPassword("Eron1234");
        objWrongCredentialPage.clickRegisterButton();
    }
}
