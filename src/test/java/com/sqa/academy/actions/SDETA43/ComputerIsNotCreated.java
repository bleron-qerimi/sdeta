package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class ComputerIsNotCreated extends Hooks {
    //computer is not stored, it is a bug
    @Test
    public static void ComputerIsNotStored() {

        {
            String url = ConfigurationReader.get("url");
            driver.get(url);
            driver.findElement(By.id("searchbox")).sendKeys("HP");
            driver.findElement(By.id("searchsubmit")).click();
            driver.findElement(By.linkText("Introduced")).click();
            WebElement search = driver.findElement(By.xpath("//*[@id=\"searchbox\"]"));
            WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"searchsubmit\"]"));
            searchBtn.click();
            if (!Objects.equals(search, "HP")) {
                Assert.fail();
            }
        }
    }
}
