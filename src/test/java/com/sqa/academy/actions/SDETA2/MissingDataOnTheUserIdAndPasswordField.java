package com.sqa.academy.actions.SDETA2;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.SignUpPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingDataOnTheUserIdAndPasswordField extends Hooks {
    SignUpPage objSignUpPage;
    @Test
    public void absentInput() throws Exception {
        String url=ConfigurationReader.get("petstoreurl1");
        driver.get(url);
        objSignUpPage= new SignUpPage(driver);

        Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        Assert.assertEquals(objSignUpPage.userInformation.getText(),"User Information");
        Assert.assertEquals(objSignUpPage.userId.getText(),"User ID:");
        Assert.assertEquals(objSignUpPage.newPassword.getText(),"New password:");
        Assert.assertEquals(objSignUpPage.rePassword.getText(),"Repeat password:");
        objSignUpPage.clickRegisterButton();
        Assert.assertEquals(objSignUpPage.userIdInput.isEnabled(),true);
        Assert.assertEquals(objSignUpPage.newPasswordInput.isEnabled(),true);
        Assert.assertEquals(objSignUpPage.rePasswordInput.isEnabled(),true);
        objSignUpPage.clickAbleButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?newAccountFor");

    }
}
