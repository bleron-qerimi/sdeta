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

        // assert we're on sign in page
        SignInPage signInPage = new SignInPage(driver);
        Assert.assertTrue(signInPage.isSignInButtonSignInPageDisplayed());

        //Input incorrect credentials and click
        signInPage.enterUsername("notjohndoe");
        signInPage.passwordInputField.clear();
        signInPage.enterPassword("notjohndoe");
        signInPage.signInButtonClick();

        //check if error message shows up
        Assert.assertEquals(signInPage.getLoginFailedErrorMessage(),"Invalid username or password. Signon failed.");

    }
}
