package com.sqa.academy.actions.SDETA53PetViews;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.Category;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SubCategory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDesiredTabularLayout extends Hooks {


    @Test
    public static void checkDesiredTabularLayout() throws InterruptedException {

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
        Thread.sleep(3000);

        String[] expectedHeaders = {"Item ID", "Product ID", "Description", "List Price"};

        SubCategory subCategory=new SubCategory(driver);
        String[] actualHeaders=subCategory.getHeaders();

        for(int i=0;i<expectedHeaders.length;i++) {
            Assert.assertEquals(expectedHeaders[i], actualHeaders[i]);
        }
    }

}
