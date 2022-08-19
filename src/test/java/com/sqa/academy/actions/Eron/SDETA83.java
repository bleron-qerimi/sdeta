package com.sqa.academy.actions.Eron;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SDETA83 {
    WebDriver driver=null;
    String url="https://petstore.octoperf.com/";
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tareDown(){
        driver.quit();
        driver=null;
    }
    public static void main(String[] args) {

    }
    @Test
    public void wrongCredentials() throws Exception{
        driver.get(url);
        WebElement enterStore=driver.findElement(By.xpath("//p/a"));
        Thread.sleep(1000);
        enterStore.click();
        Thread.sleep(1000);
        WebElement signIn=driver.findElement(By.xpath("//div/a[2]"));
        Thread.sleep(1000);
        signIn.click();
        Thread.sleep(1000);

        WebElement register=driver.findElement(By.xpath("//form/following-sibling::a"));
        Thread.sleep(1000);
        register.click();
        Thread.sleep(1000);


        //////

        WebElement userId= driver.findElement(By.name("username"));
        WebElement passWord=driver.findElement(By.name("password"));
        WebElement repeatPassword=driver.findElement(By.name("repeatedPassword"));
        WebElement registerButton=driver.findElement(By.name("newAccount"));

        Thread.sleep(1000);
        userId.sendKeys("522");
        passWord.sendKeys("Eron1234");
        repeatPassword.sendKeys("Eron1234");
        Thread.sleep(1000);
        registerButton.click();
        Thread.sleep(1000);



    }


}
