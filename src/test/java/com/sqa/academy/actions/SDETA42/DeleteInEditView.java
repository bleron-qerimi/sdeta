package com.sqa.academy.actions.SDETA42;
import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import org.testng.annotations.Test;

public class DeleteInEditView extends Hooks{

    ComputerDatabaseElements objdeleteInEditViewPage;
    @Test
    public void deletebtn() throws Exception {
        GeneralSteps.gotToEnv("Computer");
        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);

        objdeleteInEditViewPage= new ComputerDatabaseElements(driver);
        objdeleteInEditViewPage.clickOnFirstPage();
        objdeleteInEditViewPage.clickOnEditPage();




    }
}
