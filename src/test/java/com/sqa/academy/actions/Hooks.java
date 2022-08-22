package com.sqa.academy.actions;

import com.sqa.academy.utils.ConfigurationReader;
import com.sqa.academy.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Hooks {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        //Navigate to the main page
        driver.get(ConfigurationReader.get("url"));
//        SoftAssert softAssert=new SoftAssert();
//        softAssert.assertEquals();
        Assert.assertEquals(driver.getTitle(), "JPetStore Demo");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        if (driver != null) {
            Driver.close();
            driver = null;
        }

    }
}