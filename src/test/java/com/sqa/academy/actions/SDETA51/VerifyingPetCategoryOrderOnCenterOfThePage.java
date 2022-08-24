package com.sqa.academy.actions.SDETA51;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.HomePage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyingPetCategoryOrderOnCenterOfThePage extends Hooks {
    @Test
    public void checkOrderTopMid(){

        HomePage basePage=new HomePage(driver);

        String[] expectedOrder={"fish","dogs","reptiles","cats","birds"};


    }
}
