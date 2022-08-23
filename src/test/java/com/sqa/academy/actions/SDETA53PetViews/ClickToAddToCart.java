package com.sqa.academy.actions.SDETA53PetViews;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickToAddToCart extends Hooks {

    @Test
    public static void clickToAddToCart(){

        String url= ConfigurationReader.get("speciesSubView");
        driver.get(url);





    }
}
