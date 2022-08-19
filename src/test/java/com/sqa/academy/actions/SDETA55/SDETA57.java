package com.sqa.academy.actions.SDETA55;

import com.sqa.academy.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SDETA57{
    static WebDriver driver = null;
    static String url="https://petstore.octoperf.com/actions/Catalog.action";
    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @Test
    public static void addToCart() {
        List<WebElement> animalSpecies = driver.findElements(By.xpath("//*[@id=\"SidebarContent\"]/a"));
        int min = 1;
        int max = animalSpecies.size();
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
    }
}