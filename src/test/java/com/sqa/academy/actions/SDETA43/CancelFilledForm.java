package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class CancelFilledForm extends Hooks {
    @Test
    public static void CancelForm() throws Exception{
        ComputerDatabaseElements elements = new ComputerDatabaseElements(driver);
        String url = ConfigurationReader.get("formUrl");
        driver.get(url);
        WebElement computerName = elements.addName;
        computerName.sendKeys("HP1");
        WebElement introduced = elements.addIntroduced;
        introduced.sendKeys("2006-04-23");
        WebElement discontinued = elements.addDiscontinued;
        discontinued.sendKeys("2022-05-08");
        WebElement selectCompany = elements.selectCompany;
        Select select = new Select(selectCompany);
        select.selectByVisibleText("Hewlett-Packard");
        elements.cancelBtn.click();
        Thread.sleep(2000);
    }
}
