package com.sqa.academy.actions.SDETA55;


import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Objects;

public class ShoppingCartView extends Hooks {


    @Test
    public static void shoppingCartView(){
        String url = ConfigurationReader.get("url");
        driver.get(url);
        WebElement goToShoppingCart = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]"));
        goToShoppingCart.click();
        String tableRow1 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[1]")).getText();
        String tableRow2 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[2]")).getText();
        String tableRow3 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[3]")).getText();
        String tableRow4 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[4]")).getText();
        String tableRow5 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[5]")).getText();
        String tableRow6 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[6]")).getText();
        String tableRow7 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[7]")).getText();
        if (!Objects.equals(tableRow1, "Item ID")) {
            Assert.fail();
        }
        if (!Objects.equals(tableRow2, "Product ID")) {
            Assert.fail();
        }
        if (!Objects.equals(tableRow3, "Description")) {
            Assert.fail();
        }
        if (!Objects.equals(tableRow4, "In Stock?")) {
            Assert.fail();
        }
        if (!Objects.equals(tableRow5, "Quantity")) {
            Assert.fail();
        }
        if (!Objects.equals(tableRow6, "List Price")) {
            Assert.fail();
        }
        if (!Objects.equals(tableRow7, "Total Cost")) {
            Assert.fail();
        }
    }
}