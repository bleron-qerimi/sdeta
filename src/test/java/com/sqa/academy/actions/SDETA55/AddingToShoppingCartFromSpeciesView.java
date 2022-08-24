package com.sqa.academy.actions.SDETA55;

//import com.sqa.academy.actions.GenerlPetStore;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.*;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Random;

public class AddingToShoppingCartFromSpeciesView extends Hooks {

    @Test
    public static void addToCart(){
     //   GenerlPetStore.gotToEnv("JPetStore");
        HomePage home = new HomePage(driver);
        ////Navigate to the ‘category view’ by clicking on the name at the left or top of the page, or on the picture of the desired animal.
        int max = home.leftSideMenu.size()-1;
        Random rand = new Random();
        int randomNum = rand.nextInt(max);
        home.leftSideMenu.get(randomNum).click();
        Category fishies = new Category(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(fishies.productId.getText().contains("Product ID"));
        Assert.assertTrue(fishies.productName.getText().contains("Name"));
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
        if (randomNum == 0) {
            int fishMax = fishies.productLinks.size()-1;
            int fishNumber = rand.nextInt(fishMax);
            fishies.productLinks.get(fishNumber).click();
        }
        else if (randomNum == 1) {
            int fishMax = fishies.productLinks.size()-1;
            int fishNumber = rand.nextInt(fishMax);
            fishies.productLinks.get(fishNumber).click();
        }
        else if (randomNum == 2) {
            int fishMin = 0;
            int fishMax = fishies.productLinks.size()-1;
            int fishNumber = (int)(Math.random()*(fishMax-fishMin+1)+fishMin);
            fishies.productLinks.get(fishNumber).click();
        }
        else if (randomNum== 3) {
            int reptilesMin = 0;
            int reptilesMax = snek.reptileProductIDLinks.size()-1;
            int reptilesNumber = (int)(Math.random()*(reptilesMax-reptilesMin+1)+reptilesMin);
            snek.reptileProductIDLinks.get(reptilesNumber).click();
        }
        else if (randomNum == 4) {
            int fishMin = 0;
            int fishMax = fishies.productLinks.size()-1;
            int fishNumber = (int)(Math.random()*(fishMax-fishMin+1)+fishMin);
            fishies.productLinks.get(fishNumber).click();
        }
        HomePage addToCart = new HomePage(driver);
        int minProduct = 0;
        int maxProduct = addToCart.addToCartProductView.size()-1;
        int addToCartOption = rand.nextInt(maxProduct - minProduct + 1) + minProduct;
        addToCart.addToCartProductView.get(addToCartOption).click();
    }
}