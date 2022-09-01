package com.sqa.academy.actions.SDETA53PetViews;

import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.Category;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SubCategory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;


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

        String[] expectedHeaders = {"Item ID", "Product ID", "Description", "List Price"};

        SubCategory subCategory=new SubCategory(driver);
        ArrayList<String> actualHeaders = subCategory.getTableHeaders();
        actualHeaders.remove(actualHeaders.size()-1);

        //Visual purposes
        System.out.println("Actual headers length: " + actualHeaders.size() + ". Elements:");
        for (int i=0;i<actualHeaders.size();i++){
            System.out.println(actualHeaders.get(i));
        }

        //Visual purposes
        System.out.println("Expected headers length: " + expectedHeaders.length + ". Elements:");
        for (int i=0;i<expectedHeaders.length;i++){

            System.out.println(expectedHeaders[i]);
        }

        //Thread.sleep(1234546);
        for(int i=0;i<expectedHeaders.length;i++) {
            Assert.assertEquals(expectedHeaders[i],actualHeaders.get(i));
        }
    }

}
