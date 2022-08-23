package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.SignUpPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpProcedurePetshop extends Hooks {
    SignUpPage objSignUpPage;

    @Test
    public  void signIn() throws Exception {
        String url=ConfigurationReader.get("url3");
        driver.get(url);

        objSignUpPage= new SignUpPage(driver);
        objSignUpPage.goTosignInForm();



    }
}
