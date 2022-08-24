package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SignInPage;
import com.sqa.academy.pages.jPetStore.SignedInPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class CheckPromptAfterSessionExpiration extends Hooks {

    @Test
    public static void checkPromptAfterSessionExpiration() {

        //Go to env
        GeneralSteps.goToEnv("JPetStore");
        HomePage homePage = new HomePage(driver);
        homePage.signInButtonHomePage.click();

        // assert we're on sign in page
        Assert.assertTrue(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Account.action"));

        SignInPage signInPage = new SignInPage(driver);
        signInPage.enterUsername("johndoe");
        signInPage.enterPassword("johndoe");
        signInPage.signInButtonClick();


        //assert we've logged in
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        SignedInPage signedInPage = new SignedInPage(driver);

        //wait.until(ExpectedConditions.visibilityOf(signedInPage.welcomeTextElement));
        Assert.assertEquals(signedInPage.getWelcomeText(),"Welcome John!");

        Cookie cookie=driver.manage().getCookieNamed("JSESSIONID");

        //System.out.printf(cookie.getValue());

        driver.manage().deleteAllCookies();

        // reload page to check session
        driver.navigate().refresh();

        //assert we're on sign in page
        Assert.assertTrue(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Account.action?signonForm="));

    }
}
