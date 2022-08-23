package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import com.sqa.academy.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MissingDataOnTheUserIdAndPasswordField extends Hooks {


    @Test
    public void absentInput() throws Exception {
        String url=ConfigurationReader.get("url2");
        driver.get(url);
        WebElement registerButton=driver.findElement(By.name("newAccount"));
        Thread.sleep(1000);
        registerButton.click();
        Thread.sleep(2000);
    }
}
