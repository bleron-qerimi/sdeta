package com.sqa.academy.actions;

import com.sqa.academy.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @BeforeMethod
    public static void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = Driver.getDriver();
    driver.manage().window().maximize();

}
    @AfterMethod
    public static void tearDown(){
    driver.quit();
    if (driver!=null){
        Driver.close();
        driver=null;
    }
    }
}