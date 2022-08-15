package com.sqa.academy.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;
    private Driver(){
    }
    public static WebDriver getDriver(){
        String browser=ConfigurationReader.get("browser");
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            case "fireFox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
        }
        return driver;
    }
    public static void  close(){
        if(driver!=null) {
            driver.quit();
            driver = null;
        }
    }
}
