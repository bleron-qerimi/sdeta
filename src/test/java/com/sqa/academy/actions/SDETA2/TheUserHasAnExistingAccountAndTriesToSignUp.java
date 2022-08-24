package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.SignUpPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TheUserHasAnExistingAccountAndTriesToSignUp extends Hooks {


    SignUpPage objSignUpPage;
    @Test
    public void wrongCredentials() throws Exception{
        String url=ConfigurationReader.get("petstoreurl1");
        driver.get(url);
        objSignUpPage=new SignUpPage(driver);
        objSignUpPage.clickAbleButton();
        //Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        Assert.assertEquals(objSignUpPage.userInformation.getText(),"User Information");
        Assert.assertEquals(objSignUpPage.userId.getText(),"User ID:");
        Assert.assertEquals(objSignUpPage.newPassword.getText(),"New password:");
        Assert.assertEquals(objSignUpPage.rePassword.getText(),"Repeat password:");
        Assert.assertEquals(objSignUpPage.userIdInput.isEnabled(),true);
        Assert.assertEquals(objSignUpPage.newPasswordInput.isEnabled(),true);
        Assert.assertEquals(objSignUpPage.rePasswordInput.isEnabled(),true);
        objSignUpPage.enterUsername("522");
        objSignUpPage.enterPassword("Eron1234");
        objSignUpPage.enterRepeatPassword("Eron1234");
        objSignUpPage.clickRegisterButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?newAccountF");
    }
}
