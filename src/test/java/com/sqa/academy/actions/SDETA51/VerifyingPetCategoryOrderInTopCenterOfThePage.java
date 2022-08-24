package com.sqa.academy.actions.SDETA51;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.HomePage;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyingPetCategoryOrderInTopCenterOfThePage extends Hooks {
    @Test
    public void checkOrderTopMid(){

        HomePage basePage=new HomePage(driver);

        String[] expectedOrder={"fish","dogs","reptiles","cats","birds"};

        driver.get(ConfigurationReader.get("url2"));
        //{


        System.out.println(basePage.middleTopMenu.get(0).getLocation().getX());
        System.out.println(basePage.middleTopMenu.get(1).getLocation().getX());
        System.out.println(basePage.middleTopMenu.get(2).getLocation().getX());
        System.out.println(basePage.middleTopMenu.get(3).getLocation().getX());
        System.out.println(basePage.middleTopMenu.get(4).getLocation().getX());



        for(int i=0;i<basePage.middleTopMenu.size();i++){
            System.out.println(basePage.middleTopMenu.get(i).getAttribute("src"));
            Assert.assertTrue(basePage.middleTopMenu.get(i).getAttribute("src").contains(expectedOrder[i]));
        }

        for (int i = 0; i <basePage.middleTopMenu.size()-1 ; i++) {

            Assert.assertTrue(basePage.middleTopMenu.get(i).getLocation().getY()<basePage.middleTopMenu.get(i+1).getLocation().getY());
        }
    }
}
