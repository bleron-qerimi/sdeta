package com.sqa.academy.actions.SDETA42;
import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RedirectToCompEditView extends Hooks {


    @Test
    public void CompView() throws Exception {
        GeneralSteps.gotToEnv("Computer");
        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);

        WebElement firstPage=driver.findElement(By.xpath("//td/a"));
        Thread.sleep(1000);
        firstPage.click();
        Thread.sleep(1000);

    }
}
