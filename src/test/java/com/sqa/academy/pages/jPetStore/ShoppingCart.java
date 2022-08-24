package com.sqa.academy.pages.jPetStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ShoppingCart {
    public String[] getHeaders(WebDriver driver) {
        String order = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th")).getText();
        return new String[]{order};
    }
}


