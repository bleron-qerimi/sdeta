package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NavigateNextButton extends Hooks {

    ComputerDatabaseElements objdeleteInEditViewPage;
    @Test
    public void recordsOnSecondPage() throws Exception {
        GeneralSteps.gotToEnv("Computer");
        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);

        objdeleteInEditViewPage= new ComputerDatabaseElements(driver);
        objdeleteInEditViewPage.clickOnFirstPage();
//        objdeleteInEditViewPage.nextBtn();

        List<WebElement>records=databaseElements.records;

        Assert.assertEquals(records.size(),10);

    }
}
