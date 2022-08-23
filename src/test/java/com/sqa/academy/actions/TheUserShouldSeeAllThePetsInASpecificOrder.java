package com.sqa.academy.actions;


import com.sqa.academy.pages.HomePage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class TheUserShouldSeeAllThePetsInASpecificOrder extends Hooks{

    @Test
    public void checkOrderLeft(){

        HomePage basePage=new HomePage(driver);
        String[] expectedOrder={"fish","dogs","cats","reptiles", "birds"};
        driver.get(ConfigurationReader.get("url2"));
       //{


            System.out.println(basePage.leftSideMenu.get(0).getLocation().getY());
             System.out.println(basePage.leftSideMenu.get(1).getLocation().getY());



        for(int i=0;i<basePage.leftSideMenu.size();i++){
            System.out.println(basePage.leftSideMenu.get(i).getAttribute("src"));
             Assert.assertTrue(basePage.leftSideMenu.get(i).getAttribute("src").contains(expectedOrder[i]));
             }

        for (int i = 0; i <basePage.leftSideMenu.size()-1 ; i++) {

            Assert.assertTrue(basePage.leftSideMenu.get(i).getLocation().getY()<basePage.leftSideMenu.get(i+1).getLocation().getY());
        }
   }
}
