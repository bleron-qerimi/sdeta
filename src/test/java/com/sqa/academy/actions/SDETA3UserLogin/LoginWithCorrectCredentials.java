package com.sqa.academy.actions.SDETA3UserLogin;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.Category;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SubCategory;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithCorrectCredentials extends Hooks {


        public static void loginWithCorrectCredentials() {
                //Go to env
                GeneralSteps.goToEnv("JPetStore");
                HomePage homePage = new HomePage(driver);
                homePage.signInButton.click();

                //TODO - assert we're on sign in page

        }
}
