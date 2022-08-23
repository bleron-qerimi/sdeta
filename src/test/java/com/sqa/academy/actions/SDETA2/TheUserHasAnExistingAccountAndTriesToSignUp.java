package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.SignUpPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class TheUserHasAnExistingAccountAndTriesToSignUp extends Hooks {


    SignUpPage objSignUpPage;
    @Test
    public void wrongCredentials() throws Exception{
        String url=ConfigurationReader.get("url4");
        driver.get(url);

        objSignUpPage=new SignUpPage(driver);
        objSignUpPage.enterUsername("522");
        objSignUpPage.enterPassword("Eron1234");
        objSignUpPage.enterRepeatPassword("Eron1234");
        objSignUpPage.clickRegisterButton();
    }
}
