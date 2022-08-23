package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class checkTheOrderOfColumns extends Hooks {

    @Test
    public void checkTheOrderOfColumns() throws Exception{
        List<WebElement> arrangedButtons=driver.findElements(By.xpath("//*[@id=\"main\"]/table/thead/tr/th/a"));
        System.out.println("There are "+arrangedButtons.size()+" arranged like below:");

        for(WebElement row:arrangedButtons){
            System.out.println(row.getText());
        }
    }
}
