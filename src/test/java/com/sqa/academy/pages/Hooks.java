package com.sqa.academy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hooks {
    protected WebDriver driver;
    String url="https://petstore.octoperf.com/";
    @BeforeMethod
    public void setUp(){
        //driver= driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tareDown(){
        driver.close();
        driver.quit();
    }
    public static void main(String[] args) {

    }

    @Test
    public  void signIn() throws Exception {

        WebElement enterStore=driver.findElement(By.xpath("//p/a"));
        Thread.sleep(1000);
        enterStore.click();
        Thread.sleep(1000);
        WebElement signingIn=driver.findElement(By.xpath("//div/a[2]"));
        Thread.sleep(1000);
        signingIn.click();
        Thread.sleep(1000);

        WebElement register=driver.findElement(By.xpath("//form/following-sibling::a"));
        Thread.sleep(1000);
        register.click();
        Thread.sleep(1000);

    }
}
