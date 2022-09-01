package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;


public class LoginWithCorrectCredentials extends Hooks {

        @Test
        public static void loginWithCorrectCredentials() throws InterruptedException {

                //Go to env
                GeneralSteps.goToEnv("JPetStore");
                HomePage homePage = new HomePage(driver);
                homePage.signInButtonHomePage.click();

                // assert we're on sign in page
                SignInPage signInPage = new SignInPage(driver);
                Assert.assertTrue(signInPage.isSignInButtonSignInPageDisplayed());

                //Check if elements are located
                //WebDriverWait wait = new WebDriverWait( driver , Duration.ofSeconds(3) );
                //wait .until(ExpectedConditions. presenceOfElementLocated(By.name("username")));
                //wait .until(ExpectedConditions. presenceOfElementLocated(By.name("password")));
                //wait .until(ExpectedConditions. presenceOfElementLocated(By.name("signon")));

                //Input the correct credentials and click
                signInPage.enterUsername("johndoe");
                signInPage.passwordInputField.clear();
                signInPage.enterPassword("johndoe");
                signInPage.signInButtonClick();

                //assert we've logged in
                SignedInPage signedInPage = new SignedInPage(driver);
                Assert.assertEquals(signedInPage.getWelcomeText(),"Welcome John!");

        }

}
