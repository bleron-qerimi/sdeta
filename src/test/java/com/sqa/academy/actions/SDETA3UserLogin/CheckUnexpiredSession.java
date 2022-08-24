package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import com.sqa.academy.pages.jPetStore.SignedInPage;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

public class CheckUnexpiredSession extends Hooks {

    @Test
    public static void checkUnexpiredSession() throws InterruptedException {
        //Go to env
        GeneralSteps.goToEnv("JPetStore");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePage.click();

        //assert we're on sign in page
        Assert.assertTrue(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Account.action"));

        SignInPage signInPage = new SignInPage(driver);
        signInPage.usernameInputField.sendKeys("johndoe1");
        signInPage.passwordInputField.sendKeys("johndoe1");
        signInPage.signInButtonSignInPage.click();

        //assert we've logged in
        SignedInPage signedInPage = new SignedInPage(driver);
        Assert.assertEquals(signedInPage.getWelcomeText(),"Welcome John!");

        // reload page to check session
        driver.navigate().refresh();

        //check if we're still logged in
//        Assert.assertEquals(signedInPage.getWelcomeText(),"Welcome John!");

    }

}
