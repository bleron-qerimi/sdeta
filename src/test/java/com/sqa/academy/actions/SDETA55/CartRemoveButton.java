package com.sqa.academy.actions.SDETA55;


import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;

public class CartRemoveButton extends Hooks {
    @Test
    public static void removeFromCart(){
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
        int maxProduct = addToCart.addToCartProductView.size();
        int addToCartOption = rand.nextInt(maxProduct);
        addToCart.addToCartProductView.get(addToCartOption).click();
        //Remove item from Cart
        HomePage remove = new HomePage(driver);
        int removeMax = remove.removeFromCart.size();
        int removeOption = rand.nextInt(removeMax);
        remove.removeFromCart.get(removeOption).click();
    }
}