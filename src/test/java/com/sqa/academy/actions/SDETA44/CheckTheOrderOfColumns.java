package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.GenerlSteps;
import com.sqa.academy.actions.Hooks;


import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CheckTheOrderOfColumns extends Hooks {

    @Test
    public void checkTheOrderOfColumns() throws Exception{
        GenerlSteps.gotToEnv("Computer");
        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);
        List<WebElement>arrangedButtons=databaseElements.arrangedButtons;

        List<String> expected = Arrays.asList("Computer name", "Introduced", "Discontinued","Company");
        int i=0;
        for(WebElement row:arrangedButtons){
            Assert.assertEquals(row.getText(),expected.get(i));
            i++;
        }
    }
}
