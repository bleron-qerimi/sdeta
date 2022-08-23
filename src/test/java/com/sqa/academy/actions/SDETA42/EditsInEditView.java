package com.sqa.academy.actions.SDETA42;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditsInEditView extends Hooks{
        @Test
        public void editsEditView() throws Exception {
            String url = ConfigurationReader.get("url");
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

            WebElement saveButton=driver.findElement(By.xpath("//*[@id=\"main\"]/form[1]/div/input")); //GABIM
            saveButton.click();
            Thread.sleep(2000);


//        WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
//        company.selectByVisibleText("White");

//        String text = driver.findElement(By.xpath("//*[@id=\"company\"]")).getText();
//        new Select(driver.findElement(By.id("company"))).selectByVisibleText(text);


//        int compName = driver.findElement(By.xpath("//input[ @type=\"text\"]"));
//        compName.click();
//        compName.sendKeys(Keys.BACK_SPACE );


        }
}
