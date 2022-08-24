package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.*;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

public class LoginWithCorrectCredentials extends Hooks {

        @Test
        public static void loginWithCorrectCredentials() throws InterruptedException {
                //Go to env
                GeneralSteps.goToEnv("JPetStore");
                HomePage homePage = new HomePage(driver);
                homePage.signInButtonHomePage.click();

                //assert we're on sign in page
                Assert.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Account.action?signonForm=");

                SignInPage signInPage = new SignInPage();
                signInPage.enterUsername("johndoe");
                signInPage.enterPassword("johndoe");
                signInPage.signInButtonClick();

                //assert we've logged in
                Assert.assertEquals(SignedInPage.getWelcomeText(),"Welcome John!");


        }

}
