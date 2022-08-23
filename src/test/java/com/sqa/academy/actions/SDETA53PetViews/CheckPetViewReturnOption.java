package com.sqa.academy.actions.SDETA53PetViews;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckPetViewReturnOption extends Hooks {

    @Test
    public static void checkReturnButtonAvailability() {
        String url = ConfigurationReader.get("speciesSubView");
        driver.get(url);

        WebElement returnToMenuButton= driver.findElement(By.partialLinkText("Return"));

    }

}
