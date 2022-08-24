package com.sqa.academy.actions.SDETA53PetViews;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.Category;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SubCategory;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickToAddToCart extends Hooks {

    @Test
    public static void clickToAddToCart(){

        //Go to env
        GeneralSteps.goToEnv("JPetStore");
        // Click on a pet  from homePage
        HomePage hp=new HomePage(driver);
        hp.getPet("fish").click();

        //assert we're on fish category view
        Category category=new Category(driver);
        Assert.assertEquals("Fish", category.categoryName.getText());

        // click on the product
        category.clickOnProductIdLink(2);

        SubCategory subCategory = new SubCategory();
        subCategory.clickOnAddToCartButton(1);

        //assert we're on add-to-cart page
        Assert.assertEquals("Shopping Cart", category.categoryName.getText());

    }
}
