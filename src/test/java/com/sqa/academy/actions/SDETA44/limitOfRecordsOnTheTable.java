package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class limitOfRecordsOnTheTable extends Hooks {

    @Test
    public void limitOfRecords() throws Exception {
        String url= ConfigurationReader.get("url");
        driver.get(url);
        Thread.sleep(1000);
        List<WebElement> rowsLim=driver.findElements(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td/a"));
        System.out.println("Nr of rows on the first page of the table "+rowsLim.size());

        for(WebElement row:rowsLim){
            System.out.println("Computer name: "+row.getText());
        }



    }
}
