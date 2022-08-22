package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class ButtonAddNewComputer extends Hooks {
    //on the main page locate add new computer button
    @Test
    public static void AddNewComp() {
        String url = ConfigurationReader.get("url");
        driver.get(url);
        String buttonAdd = driver.findElement(By.id("add")).getText();
        if(!Objects.equals(buttonAdd, "Add a new computer")){
            Assert.fail();
        }
    }
}
