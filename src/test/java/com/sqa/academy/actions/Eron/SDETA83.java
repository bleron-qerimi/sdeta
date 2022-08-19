package com.sqa.academy.actions.Eron;

import com.sqa.academy.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SDETA83 {
    static WebDriver driver = null;
    static String url="https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
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
        driver.manage().window().maximize();

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
