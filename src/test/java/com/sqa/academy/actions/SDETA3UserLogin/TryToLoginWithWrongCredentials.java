package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;

import static org.openqa.selenium.Keys.ENTER;

public class TryToLoginWithWrongCredentials extends Hooks {

    public static void loginWithWrongCredentials() {
        //Go to env
        GeneralSteps.goToEnv("JPetStore");
        HomePage homePage = new HomePage(driver);
        homePage.signInButton.click();

        //TODO - assert we're on sign in page

        SignInPage signInPage = new SignInPage();
        signInPage.usernameInputField.sendKeys("notjohndoe");
        signInPage.passwordInputField.sendKeys("notjohndoe");
        signInPage.signInButton.sendKeys(ENTER);

        //TODO - assert we're on the same page
    }
}
