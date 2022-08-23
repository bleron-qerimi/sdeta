package com.sqa.academy.actions.SDETA42;
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

public class cancelInEditView extends Hooks{
    @Test
    public void editsInEditView() throws Exception {
        String url= ConfigurationReader.get("url");
        driver.get(url);
        WebElement firstPage=driver.findElement(By.xpath("//td/a"));
        Thread.sleep(1000);
        firstPage.click();
        Thread.sleep(1000);

        WebElement compName = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        compName.clear();
        compName.sendKeys("Dell");
        Thread.sleep(1000);

        WebElement introduce = driver.findElement(By.xpath("//*[@id=\"introduced\"]"));
        introduce.clear();
        introduce.sendKeys("2001-01-01");
        Thread.sleep(2000);

        WebElement cancelButton=driver.findElement(By.xpath("//*[@id=\"main\"]/form[1]/div/a"));
        cancelButton.click();
        Thread.sleep(2000);

    }
}
