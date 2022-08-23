package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class ButtonAddNewComputer extends Hooks {
    //on the main page locate add new computer button
    @Test
    public static void AddNewComp() {
        String url = ConfigurationReader(url);
        driver.get(url);
        String expectedTitle=driver.getTitle();
        Assert.assertTrue(expectedTitle.contains("Add a new computer"));
        }
    }
