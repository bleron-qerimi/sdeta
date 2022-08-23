package com.sqa.academy.actions.SDETA55;


import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import com.sqa.academy.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;
import java.util.Objects;
import java.util.Random;
public class ItemsInCartAfterClosingBrowser extends Hooks {

    @Test
    public static void addToCart(){
        String url = ConfigurationReader.get("url");
        driver.get(url);
        List<WebElement> animaSpecies = driver.findElements(By.xpath("//*[@id=\"SidebarContent\"]/a"));
        int min = 1;
        int max = animaSpecies.size();
        Random rand = new Random();
        int randomNum = rand.nextInt(max - min + 1) + min;
        WebElement animalCategory = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a["+randomNum+"]/img"));
        animalCategory.click();
        int fishNumber;
        int dogsNumber;
        int catsNumber;
        int birdsNumber;
        int reptilesNumber;
        if (randomNum == 1) {
            int fishMin = 2;
            int fishMax = 5;
            fishNumber = rand.nextInt(fishMax - fishMin + 1) + fishMin;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+fishNumber+"]/td[1]/a"));
            animalProduct.click();
        } else if (randomNum == 2) {
            int dogsMin = 2;
            int dogsMax = 7;
            dogsNumber = rand.nextInt(dogsMax - dogsMin +1)+dogsMin;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+dogsNumber+"]/td[1]/a"));
            animalProduct.click();
        }
        else if (randomNum == 3) {
            int catsMin = 2;
            int catsMax = 3;
            catsNumber = rand.nextInt(catsMax - catsMin +1)+catsMin;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+catsNumber+"]/td[1]/a"));
            animalProduct.click();
        }
        else if (randomNum== 4) {
            int reptilesMin = 2;
            int reptilesMax = 3;
            reptilesNumber = rand.nextInt(reptilesMax - reptilesMin +1)+reptilesMin;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+reptilesNumber+"]/td[1]/a"));
            animalProduct.click();
        }
        else if (randomNum == 5) {
            int birdsMin = 2;
            int birdsMax = 3;
            birdsNumber = rand.nextInt(birdsMax - birdsMin +1)+birdsMin;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+birdsNumber+"]/td[1]/a"));
            animalProduct.click();
        }
        WebElement animalToCart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
        animalToCart.click();
        driver.quit();
        driver = null;
        driver = new ChromeDriver();
        driver.get(url);
        WebElement openCart = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]"));
        openCart.click();
        WebElement cartUpdate = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input"));
        cartUpdate.click();
        String cartEmptyCheck = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td/b")).getText();
        if (Objects.equals(cartEmptyCheck, "Your cart is empty.")) {
            Assert.fail();
        }
        WebElement backHome = driver.findElement(By.xpath("//*[@id=\"LogoContent\"]/a/img"));
        backHome.click();
        List<WebElement> animalSpecies = driver.findElements(By.xpath("//*[@id=\"SidebarContent\"]/a"));
        int min1 = 1;
        int max1 = animalSpecies.size();
        Random rand1 = new Random();
        int randomNum1 = rand1.nextInt(max1 - min1 + 1) + min1;
        WebElement animalCategory1 = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a["+randomNum1+"]/img"));
        animalCategory1.click();
        int fishNumber1;
        int dogsNumber1;
        int catsNumber1;
        int birdsNumber1;
        int reptilesNumber1;
        if (randomNum1 == 1) {
            int fishMin1 = 2;
            int fishMax1 = 5;
            fishNumber1 = rand.nextInt(fishMax1 - fishMin1 + 1) + fishMin1;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+fishNumber1+"]/td[1]/a"));
            animalProduct.click();
        } else if (randomNum1 == 2) {
            int dogsMin1 = 2;
            int dogsMax1 = 7;
            dogsNumber1 = rand1.nextInt(dogsMax1 - dogsMin1 +1)+dogsMin1;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+dogsNumber1+"]/td[1]/a"));
            animalProduct.click();
        }
        else if (randomNum1 == 3) {
            int catsMin1 = 2;
            int catsMax1 = 3;
            catsNumber1 = rand1.nextInt(catsMax1 - catsMin1 +1)+catsMin1;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+catsNumber1+"]/td[1]/a"));
            animalProduct.click();
        }
        else if (randomNum1== 4) {
            int reptilesMin1 = 2;
            int reptilesMax1 = 3;
            reptilesNumber1 = rand1.nextInt(reptilesMax1 - reptilesMin1 +1)+reptilesMin1;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+reptilesNumber1+"]/td[1]/a"));
            animalProduct.click();
        }
        else if (randomNum1 == 5) {
            int birdsMin1 = 2;
            int birdsMax1 = 3;
            birdsNumber1 = rand1.nextInt(birdsMax1 - birdsMin1 +1)+birdsMin1;
            WebElement animalProduct = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+birdsNumber1+"]/td[1]/a"));
            animalProduct.click();
        }
        WebElement animalToCart1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
        animalToCart1.click();
    }
}