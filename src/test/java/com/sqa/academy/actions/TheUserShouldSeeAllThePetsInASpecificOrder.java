package com.sqa.academy.actions;

import com.sqa.academy.pages.HomePage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TheUserShouldSeeAllThePetsInASpecificOrder extends Hooks{

    @Test
    public void mainPage(){


        //Navigate to the main page
        driver.get(ConfigurationReader.get("url"));
//        SoftAssert softAssert=new SoftAssert();
//        softAssert.assertEquals();
        Assert.assertEquals(driver.getTitle(),"JPetStore Demo");

    }

    @Test
    public void checkOrderLeft(){
        //
        HomePage homePage =new HomePage(driver);
        String[] expectedOrder={"Fish","Dogs","Reptiles","Cats", "Birds"};
        driver.get(ConfigurationReader.get("url"));
       // for(int i=0;i<basePage.leftSideMenu.size();i++){
            System.out.println(homePage.leftSideMenu.get(0).getLocation().getY());
             System.out.println(homePage.leftSideMenu.get(1).getLocation().getY());
           // Assert.assertEquals(basePage.leftSideMenu.get(i).getAttribute("src").get,expectedOrder[i]);        }
   }
}
