package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.AbsentInputPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class MissingDataOnTheUserIdAndPasswordField extends Hooks {
    AbsentInputPage objabsentInputPage;
    @Test
    public void absentInput() throws Exception {
        String url=ConfigurationReader.get("url4");
        driver.get(url);
        Thread.sleep(1000);
        objabsentInputPage= new AbsentInputPage(driver);
        objabsentInputPage.clickOnSaveAccount();
        Thread.sleep(2000);
    }
}
