package com.sqa.academy.actions.Eron;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SDETA63 {

    protected WebDriver driver;
    String url="https://petstore.octoperf.com/";
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
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
        driver.get(url);
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
