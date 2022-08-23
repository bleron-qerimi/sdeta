package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RedirectToNewView extends Hooks {
    @Test
    public static void Redirect()
    //When click the Add new computer button, user should redirect to a new View.
    {
        String computerHome = ConfigurationReader.get("computerHome");
        driver.get(computerHome);
       driver.findElement(By.id("add")).click();
    }
}
