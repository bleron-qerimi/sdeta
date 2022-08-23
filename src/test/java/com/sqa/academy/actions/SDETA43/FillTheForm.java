package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FillTheForm extends Hooks {
    //user should be able to fill the form
    @Test
            public static void FillForm(){
    String url2 = ConfigurationReader.get("url2");
        driver.get(url2);
        driver.findElement(By.id("name")).sendKeys("HP");
        driver.findElement(By.id("introduced")).sendKeys("2006-09-17");
        driver.findElement(By.id("discontinued")).sendKeys("2022-03-22");
        WebElement selectCompany = driver.findElement(By.id("company"));
        Select select = new Select(selectCompany);
        select.selectByVisibleText("Hewlett-Packard");
    }
}