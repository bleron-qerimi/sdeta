package com.sqa.academy.actions.SDETA42;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.EditViewPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CancelInEditView extends Hooks{

   // EditViewPage objcancelInEditViewPage;
    @Test
    public void editsInEditView() throws Exception {
        String url= ConfigurationReader.get("url");
        driver.get(url);

        WebElement firstPage=driver.findElement(By.xpath("//td/a"));
        firstPage.click();

        WebElement compName = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        compName.clear();
        compName.sendKeys("Dell");

        WebElement introduce = driver.findElement(By.xpath("//*[@id=\"introduced\"]"));
        introduce.clear();
        introduce.sendKeys("2001-01-01");

        WebElement cancelButton=driver.findElement(By.xpath("//*[@id=\"main\"]/form[1]/div/a"));
        cancelButton.click();

        //    Assert.assertEquals(tableForm3.getText(),expectedTable3);
    }
}
