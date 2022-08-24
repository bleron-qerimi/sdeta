package com.sqa.academy.actions.SDETA55;

import com.sqa.academy.actions.GenerlSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.ShoppingCart;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ShoppingCartView extends Hooks {
    @Test
    public static void shoppingCartView(){
        GenerlSteps.gotToEnv("JPetStore");
        HomePage home = new HomePage(driver);
        home.shoppingCart.click();
        String[] expectedResult = {"Item ID", "Product ID", "Description","In Stock?","Quantity","List Price","Total Cost"};
        ShoppingCart shoppingCart = new ShoppingCart();
        String[] actualResult =  shoppingCart.getHeaders(driver);
        for (int i = 0; i<actualResult.length-1;i++)
            for (String s : expectedResult) Assert.assertEquals(actualResult[i], s);
    }
}