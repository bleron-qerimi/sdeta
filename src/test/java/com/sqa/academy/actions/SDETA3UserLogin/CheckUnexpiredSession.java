package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import com.sqa.academy.pages.jPetStore.SignedInPage;
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?signonForm=");

        SignInPage signInPage = new SignInPage();
        signInPage.usernameInputField.sendKeys("johndoe");
        signInPage.passwordInputField.sendKeys("johndoe");
        signInPage.signInButtonSignInPage.click();

        //assert we've logged in
        Assert.assertEquals(SignedInPage.getWelcomeText(),"Welcome John!");

        //sleep thread to wait for 15 min
        Thread.sleep(900000);

        // reload page to check session
        driver.navigate().refresh();

        //check if we're still logged in
        Assert.assertEquals(SignedInPage.getWelcomeText(),"Welcome John!");

    }

}
