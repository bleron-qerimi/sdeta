package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import com.sqa.academy.pages.jPetStore.SignedInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

public class TryToLoginWithWrongCredentials extends Hooks {

    @Test
    public static void loginWithWrongCredentials() {

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

        //Input incorrect credentials and click
        signInPage.enterUsername("notjohndoe");
        signInPage.passwordInputField.clear();
        signInPage.enterPassword("notjohndoe");
        signInPage.signInButtonClick();

        //assert we haven't been able to log in by checking if we're still on sign in page
        Assert.assertTrue(signInPage.isSignInButtonSignInPageDisplayed());
    }
}
