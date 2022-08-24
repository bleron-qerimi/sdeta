package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

public class CheckErrorMessageAfterWrongCredentials extends Hooks {

    @Test
    public static void checkErrorPromptAfterWrongCredentials() {
        //Go to env
        GeneralSteps.goToEnv("JPetStore");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePage.click();

        //assert we're on sign in page
        Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?signonForm=");

        SignInPage signInPage = new SignInPage();
        signInPage.usernameInputField.sendKeys("notjohndoe");
        signInPage.passwordInputField.sendKeys("notjohndoe");
        signInPage.signInButtonSignInPage.click();

        //check if error message shows up

        Assert.assertEquals(signInPage.getloginFailedErrorMesage(),"Invalid username or password. Signon failed.");

    }
}
