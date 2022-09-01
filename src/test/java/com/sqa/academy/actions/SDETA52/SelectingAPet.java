//package com.sqa.academy.actions.SDETA52;
//
//import com.sqa.academy.actions.GeneralSteps;
//import com.sqa.academy.actions.Hooks;
//import com.sqa.academy.pages.jPetStore.Category;
//import com.sqa.academy.pages.jPetStore.HomePage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class SelectingAPet extends Hooks {
//
//
//@Test
//public void SelectingPet () throws Exception {
//    GeneralSteps.gotToEnv("JPetStore");
//
//    HomePage homePage=new HomePage(driver);
//     homePage.getPet("fish").click();
//
//    Category category=new Category(driver);
//
//    category.clickOnProductIdLink(2);
//
//
//    Assert.assertTrue(driver.getCurrentUrl().contains("https://petstore.octoperf.com/actions/Catalog.action?viewProduc"));
//
//}
//}
//
