package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

public class CheckPromptAfterSessionExpiration extends Hooks {

    @Test
    public static void checkPromptAfterSessionExpiration() {

        //Go to env
        GeneralSteps.goToEnv("JPetStore");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePage.click();

        //TODO - assert we're on sign in page

        SignInPage signInPage = new SignInPage();
        signInPage.usernameInputField.sendKeys("johndoe");
        signInPage.passwordInputField.sendKeys("johndoe");
        signInPage.signInButtonSignInPage.click();

        //TODO - assert we've logged in(maybe get the welcome text)

        //TODO - sleep thread to wait for 30 min

        //TODO - reload page to check if we're still logged in

        //TODO - check if we're still logged in


    }
}
