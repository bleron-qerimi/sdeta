package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginWithCorrectCredentials extends Hooks {

        @Test
        public static void loginWithCorrectCredentials() throws InterruptedException {

                //Go to env
                GeneralSteps.goToEnv("JPetStore");
                HomePage homePage = new HomePage(driver);
                homePage.signInButtonHomePage.click();
                //JavascriptExecutor jse=(JavascriptExecutor) driver;

                //assert we're on sign in page
                Assert.assertTrue(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Account.action"));

                SignInPage signInPage = new SignInPage(driver);

                signInPage.enterUsername("johndoe");
                signInPage.enterPassword("johndoe");
                signInPage.signInButtonClick();

                //assert we've logged in
                SignedInPage signedInPage = new SignedInPage(driver);
                Assert.assertEquals(signedInPage.getWelcomeText(),"Welcome John!");


        }

}
