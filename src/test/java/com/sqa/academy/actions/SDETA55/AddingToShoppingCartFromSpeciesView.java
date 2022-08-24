package com.sqa.academy.actions.SDETA55;

<<<<<<< HEAD
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class AddingToShoppingCartFromSpeciesView extends Hooks {

    @Test
    public static void addToCart() {
        String url = ConfigurationReader.get("url");
        driver.get(url);
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
=======
import com.sqa.academy.actions.GenerlSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;
public class AddingToShoppingCartFromSpeciesView extends Hooks {
    @Test
    public static void addToCart(){
        GenerlSteps.gotToEnv("JPetStore");
        HomePage home = new HomePage(driver);
        ////Navigate to the ‘category view’ by clicking on the name at the left or top of the page, or on the picture of the desired animal.
        int max = home.leftSideMenu.size()-1;
        Random rand = new Random();
        int randomNum = rand.nextInt(max);
        home.leftSideMenu.get(randomNum).click();
        Category animalsies = new Category(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(animalsies.productId.getText().contains("Product ID"));
        Assert.assertTrue(animalsies.productName.getText().contains("Name"));
        //Click on the productID of the desired animal
        int animalMax = animalsies.productLinks.size()-1;
        int animalNumber = rand.nextInt(animalMax);
        animalsies.productLinks.get(animalNumber).click();
        //Click on the add to cart button
        HomePage addToCart = new HomePage(driver);
        int maxProduct = addToCart.addToCartProductView.size()-1;
        int addToCartOption = rand.nextInt(maxProduct);
        addToCart.addToCartProductView.get(addToCartOption).click();
>>>>>>> ddee69c8d5f3692d74fd610af6a69d1c9f75ede9
    }
}