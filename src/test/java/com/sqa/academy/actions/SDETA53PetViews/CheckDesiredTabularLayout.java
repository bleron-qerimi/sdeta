package com.sqa.academy.actions.SDETA53PetViews;

import com.sqa.academy.actions.GenerlSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.Category;
import com.sqa.academy.pages.jPetStore.HomePage;
import com.sqa.academy.pages.jPetStore.SubCategory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDesiredTabularLayout extends Hooks {


    @Test
    public static void checkDesiredTabularLayout(){

        //Go to env
        GenerlSteps.gotToEnv("JPetStore");
        // Click on a pet  from homePage
        HomePage hp=new HomePage(driver);

        hp.getPet("fish").click();
        Category category=new Category(driver);
        Assert.assertEquals("Fish", category.categoryName.getText());

       String productId= category.clickOnProductIdLink(2);

        // click on te Prodct
        String[] expectedResult = {"Item ID", "Product ID", "Description", "List Price"};

        SubCategory subCategory =new SubCategory();
        String[] actualResult= subCategory.getHeaders();

        for(int i=0;i<expectedResult.length;i++)
            Assert.assertEquals(expectedResult[i],actualResult[i]);







    }


}
