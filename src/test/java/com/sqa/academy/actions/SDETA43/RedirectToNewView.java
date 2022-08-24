package com.sqa.academy.actions.SDETA43;

import com.github.javafaker.Company;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

import java.awt.*;

public class RedirectToNewView extends Hooks {
    @Test
    public static void Redirect() throws Exception
    /*When I click the Add new Computer Button
    Then I should be redirected to a new View That has these input fields:
            | Computer name| Text field|
            | Introduced | Date field|
            | Discontinued | Date field|
            | Company | Dropdown field|
            |Save/ cancel | java.awt.Button|
            After the clicking on Add new Computer Button, user should be redirected to a new View that has these input fields:
Computer name,
Computer name- Text field,
Introduced-Date field,
Discontinued-Date field,
Company-Dropdown field,
Save/ cancel- Button*/ {
        String url = ConfigurationReader.get("url");
        driver.get(url);
        ComputerDatabaseElements elements = new ComputerDatabaseElements(driver);
        Assert.assertEquals(elements.computerName.getText(), "Computer name");
        Assert.assertEquals(elements.introduced.getText(), "Introduced");
        Assert.assertEquals(elements.discontinued.getText(), "Discontinued");
        Assert.assertEquals(elements.company.getText(), "Company");
        driver.findElement(By.id("add")).click();
        Assert.assertEquals(elements.addBtn.getText(), "Add a new computer");
    }
}
