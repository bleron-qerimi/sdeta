package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import com.sqa.academy.pages.jPetStore.SignedInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUnexpiredSession extends Hooks {

    @Test
    public static void checkUnexpiredSession() throws InterruptedException {

        //Go to env
        GeneralSteps.goToEnv("JPetStore");

        //Go to sign in page
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePageClick();

        // assert we're on sign in page
        SignInPage signInPage = new SignInPage(driver);
        Assert.assertTrue(signInPage.isSignInButtonSignInPageDisplayed());

        //Input the correct credentials and click
        signInPage.enterUsername("johndoe");
        signInPage.passwordInputField.clear();
        signInPage.enterPassword("johndoe");
        signInPage.signInButtonClick();

        // assert we've logged in by checking if there is a welcoming text
        SignedInPage signedInPage = new SignedInPage(driver);
        Assert.assertEquals(signedInPage.getWelcomeText(), "Welcome John!");

        // reload page to check session
        driver.navigate().refresh();

        //assert session hasn't expired
        Assert.assertEquals(signedInPage.getWelcomeText(), "Welcome John!");

    }

}
