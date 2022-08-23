package com.sqa.academy.actions.SDETA53PetViews;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SpeciesSubViewRedirection extends Hooks {

    @Test
    public static void clickSpeciesProductID(){

        String url= ConfigurationReader.get("petView");
        driver.get(url);
        WebElement productId= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
        productId.click();



    }


}
