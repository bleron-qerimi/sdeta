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

public class SignUpProcedurePetshop extends Hooks {


    @Test
    public  void signIn() throws Exception {
        String url=ConfigurationReader.get("url3");
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
