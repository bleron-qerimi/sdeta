package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.Category;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import com.sqa.academy.pages.jPetStore.SubCategory;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

public class LoginWithCorrectCredentials extends Hooks {

        @Test
        public static void loginWithCorrectCredentials() {
                //Go to env
                GeneralSteps.goToEnv("JPetStore");
                HomePage homePage = new HomePage(driver);
                homePage.signInButton.click();

                //TODO - assert we're on sign in page

                SignInPage signInPage = new SignInPage();
                signInPage.usernameInputField.sendKeys("johndoe");
                signInPage.passwordInputField.sendKeys("johndoe");
                signInPage.signInButton.sendKeys(ENTER);

                //TODO - assert we've logged in
                // maybe get the welcome text
        }

}
