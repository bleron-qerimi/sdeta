//package com.sqa.academy.actions.SDETA42;
//import com.sqa.academy.actions.GeneralSteps;
//import com.sqa.academy.actions.Hooks;
//import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
//import com.sqa.academy.utils.ConfigurationReader;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class EditsInEditView extends Hooks{
//
//        @Test
//        public void editsEditView() throws Exception {
//            //go to the enviornment
//            GeneralSteps.gotToEnv("Computer");
//            ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);
//            //edit the fields
//            databaseElements.clickCmp();
//            databaseElements.addName("Dell");
//            databaseElements.addIntroduced("2001-01-01");
//            //save the edits
//            databaseElements.svBtn();
//            Assert.assertEquals(databaseElements.clickCmp.getText(),"Dell");
//
//        }
//}
