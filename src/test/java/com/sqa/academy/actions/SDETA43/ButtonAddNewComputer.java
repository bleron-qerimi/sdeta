package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class ButtonAddNewComputer extends Hooks {
    //on the main page locate add new computer button
    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void AddNewComp() throws Exception {
        //PRECONDITION User should be on the main page
        String url = ConfigurationReader.get("url");
        driver.get(url);
        String buttonAdd = driver.findElement(By.id("add")).getText();
        if(!Objects.equals(buttonAdd, "Create this computer")){
            throw new IllegalArgumentException();
        }
        Thread.sleep(2000);
    }
}
