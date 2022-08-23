package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class NewComputerCreated extends Hooks {
    //new computer should be created
    @Test
    public static void ComputerCreated(){
        String ComputerForm= ConfigurationReader.get("ComputerForm");
        driver.get(ComputerForm);
        driver.findElement(By.id("name")).sendKeys("HP");
        driver.findElement(By.id("introduced")).sendKeys("2006-09-17");
        driver.findElement(By.id("discontinued")).sendKeys("2022-03-22");
        WebElement selectCompany = driver.findElement(By.id("company"));
        Select select = new Select(selectCompany);
        select.selectByVisibleText("Hewlett-Packard");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Create this computer']")).click();
        String alertMsg= driver.findElement(By.xpath("/html/body/section/div[1]")).getText();
        if(!Objects.equals(alertMsg, "Done ! Computer HP has been created")){
            Assert.fail();
        }
    }
}
