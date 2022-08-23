package com.sqa.academy.actions.SDETA55;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.actions.TheUserShouldSeeAllThePetsInASpecificOrder;
import com.sqa.academy.pages.jPetStore.*;
import com.sqa.academy.utils.ConfigurationReader;
import com.sqa.academy.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class AddingToCartFromItemView extends Hooks {

    @Test
    public static void addToCart(){

        TheUserShouldSeeAllThePetsInASpecificOrder.mainPage();
        HomePage home = new HomePage(driver);

        ////Navigate to the ‘category view’ by clicking on the name at the left or top of the page, or on the picture of the desired animal.
        int min = 1;
        int max = home.leftSideMenu.size()-1;
        Random rand = new Random();
        int randomNum = rand.nextInt(max - min + 1)+min;
        System.out.println(randomNum);
        home.leftSideMenu.get(randomNum).click();
        String expectedTitle = driver.getTitle();
        FishSpecies fishies = new FishSpecies(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(fishies.fishHasProductID.getText().contains("Product ID"));
        Assert.assertTrue(fishies.fishHasName.getText().contains("Name"));
        DogSpecies doggos = new DogSpecies(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(doggos.dogHasProductID.getText().contains("Product ID"));
        Assert.assertTrue(doggos.dogHasName.getText().contains("Name"));
        CatSpecies catto = new CatSpecies(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(catto.catHasProductID.getText().contains("Product ID"));
        Assert.assertTrue(catto.catHasName.getText().contains("Name"));
        ReptileSpecies snek = new ReptileSpecies(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(snek.reptileHasProductID.getText().contains("Product ID"));
        Assert.assertTrue(snek.reptileHasName.getText().contains("Name"));
        BirdSpecies birb = new BirdSpecies(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(birb.birdHasProductID.getText().contains("Product ID"));
        Assert.assertTrue(birb.birdHasName.getText().contains("Name"));
        //Click on the productID of the desired animal
        int fishNumber;
        int dogsNumber;
        int catsNumber;
        int birdsNumber;
        int reptilesNumber;
        if (randomNum == 1) {
            int fishMin = 2;
            int fishMax = 5-1;
            fishNumber = rand.nextInt(fishMax - fishMin + 1) + fishMin;
            fishies.fishProductIDLinks.get(fishNumber).click();
        } else if (randomNum == 2) {
            int dogsMin = 2;
            int dogsMax = 7-1;
            dogsNumber = rand.nextInt(dogsMax - dogsMin +1) + dogsMin;
            doggos.dogProductIDLinks.get(dogsNumber).click();
        }
        else if (randomNum == 3) {
            int catsMin = 2;
            int catsMax = 3-1;
            catsNumber = rand.nextInt(catsMax - catsMin +1)+catsMin;
            catto.catProductIDLinks.get(catsNumber).click();
        }
        else if (randomNum== 4) {
            int reptilesMin = 2;
            int reptilesMax = 3-1;
            reptilesNumber = rand.nextInt(reptilesMax - reptilesMin +1)+reptilesMin;
            snek.reptileProductIDLinks.get(reptilesNumber).click();
        }
        else if (randomNum == 5) {
            int birdsMin = 2;
            int birdsMax = 3-1;
            birdsNumber = rand.nextInt(birdsMax - birdsMin +1)+birdsMin;
            birb.birdProductIDLinks.get(birdsNumber).click();
        }
        WebElement animalItem = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
        animalItem.click();

    }
}

