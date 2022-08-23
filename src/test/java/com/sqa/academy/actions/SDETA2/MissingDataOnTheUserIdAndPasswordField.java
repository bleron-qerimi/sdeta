package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.SignUpPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class MissingDataOnTheUserIdAndPasswordField extends Hooks {
    SignUpPage objSignUpPage;
    @Test
    public void absentInput() throws Exception {
        String url=ConfigurationReader.get("url4");
        driver.get(url);
        objSignUpPage= new SignUpPage(driver);
        objSignUpPage.clickOnSaveAccount();
    }
}
