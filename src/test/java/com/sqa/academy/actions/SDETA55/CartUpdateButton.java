//package com.sqa.academy.actions.SDETA55;
//
//import com.sqa.academy.actions.GeneralSteps;
//import com.sqa.academy.actions.Hooks;
//import com.sqa.academy.pages.jPetStore.Category;
//import com.sqa.academy.pages.jPetStore.HomePage;
//import org.openqa.selenium.WindowType;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import java.util.Random;
//
//public class CartUpdateButton extends Hooks {
//
//    @Test
//    public static void updateCart(){
//        GeneralSteps.gotToEnv("JPetStore");
//        HomePage home = new HomePage(driver);
//        //Open the shopping cart and switch to new tab
//        String originalWindow = driver.getWindowHandle();
//        home.shoppingCart.click();
//        driver.switchTo().newWindow(WindowType.TAB);
//        GeneralSteps.gotToEnv("JPetStore");
//        ////Navigate to the ‘category view’ by clicking on the name at the left or top of the page, or on the picture of the desired animal.
//        int max = home.leftSideMenu.size() - 1;
//        Random rand = new Random();
//        int randomNum = rand.nextInt(max);
//        home.leftSideMenu.get(randomNum).click();
//        Category animalsies = new Category(driver);
//        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
//        Assert.assertTrue(animalsies.productId.getText().contains("Product ID"));
//        Assert.assertTrue(animalsies.productName.getText().contains("Name"));
//        //Click on the productID of the desired animal
//        int animalMax = animalsies.productLinks.size() - 1;
//        int animalNumber = rand.nextInt(animalMax);
//        animalsies.productLinks.get(animalNumber).click();
//        //Click on the ItemID of the desired animal
//        int itemIDMax=animalsies.itemLinks.size();
//        int itemIDNumber = rand.nextInt(itemIDMax);
//        animalsies.itemLinks.get(itemIDNumber).click();
//        //Click on te Add to Cart button
//        HomePage addToCart = new HomePage(driver);
//        addToCart.addToCartItemView.click();
//        //Go back to the original tab and update the cart
//        driver.switchTo().window(originalWindow);
//        home.updateCart.click();
//
//    }
//}
