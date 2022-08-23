package com.sqa.academy.actions.SDETA43;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Objects;

public class ComputerIsNotCreated extends Hooks {
    //computer is not stored, it is a bug

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void ComputerIsNotStored() {
        {
            ComputerDatabaseElements elements = new ComputerDatabaseElements(driver);
            String url = ConfigurationReader.get("url");
            driver.get(url);
            WebElement searchBox= elements.search;
            searchBox.sendKeys("HP");
            WebElement searchBtn= elements.searchBtn;
            searchBtn.click();
            Assert.assertNotEquals(searchBox.getText(), "HP");
            if (!Objects.equals(searchBox, "HP")) {
                throw new IllegalArgumentException();
            }
        }
    }
}
