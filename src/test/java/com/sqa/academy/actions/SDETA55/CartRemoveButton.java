package com.sqa.academy.actions.SDETA55;



import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.*;
import com.sqa.academy.utils.ConfigurationReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class CartRemoveButton extends Hooks {

    @Test
    public static void removeFromCart(){
        String url = ConfigurationReader.get("url2");
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

        HomePage home = new HomePage(driver);
        home.clicLogo();
        HomePage cart = new HomePage(driver);
        cart.shoppingCart();
        WebElement animalRemove = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a"));
        animalRemove.click();
    }
}