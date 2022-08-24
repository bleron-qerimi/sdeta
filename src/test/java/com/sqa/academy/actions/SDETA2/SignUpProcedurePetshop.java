package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignUpPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpProcedurePetshop extends Hooks {
    SignUpPage objSignUpPage;
    HomePage objHomePage;

    @Test
    public  void signIn() throws Exception {
        String url=ConfigurationReader.get("petstoreurl");
        driver.get(url);

        objSignUpPage= new SignUpPage(driver);
        objHomePage=new HomePage(driver);
        Assert.assertEquals(objSignUpPage.enterTheStore.getText(), "Welcome to JPetStore 6");
        Assert.assertEquals(objSignUpPage.enterStore.getText(),"Enter the Store");

        objSignUpPage.goTosignInForm();
        Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?newAccountForm=");




    }
}
