package com.sqa.academy.actions.SDETA54;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class RedirectToTheViewItemView extends Hooks {
    //by clicking the link under ItemId, user should be redirected to the ViewItem View
    //PRECONDITION The user is on the Subspecies View
    @Test
    public static void RedirectToViewItemView(){
        ComputerDatabaseElements elements = new ComputerDatabaseElements(driver);
        String url = ConfigurationReader.get("speciesSubView");
        driver.get(url);
    }

}
