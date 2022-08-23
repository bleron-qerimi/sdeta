package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
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
    }
}