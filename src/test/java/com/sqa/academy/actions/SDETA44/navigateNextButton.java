package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class navigateNextButton extends Hooks {

    @Test
    public void getCoordinates() throws Exception {
        String url= ConfigurationReader.get("url");
        driver.get(url);
        Thread.sleep(1000);

        WebElement nextButton=driver.findElement(By.xpath("//*[@id=\"pagination\"]/ul/li[3]/a"));
        Thread.sleep(1000);
        nextButton.click();
        Thread.sleep(1000);

        List<WebElement> rowsLim=driver.findElements(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td/a"));
        System.out.println("Nr of rows on the second page of the table "+rowsLim.size());

        for(WebElement row:rowsLim){
            System.out.println("Computer name: "+row.getText());
        }
    }
}
