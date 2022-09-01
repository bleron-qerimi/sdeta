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
//public class FieldsCheck extends Hooks {
//    @Test
//    public void fieldsCheck() throws Exception {
////      go to the environment
//        GeneralSteps.gotToEnv("Computer");
//        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);
//        //Check if the columns are there
//       Assert.assertEquals(databaseElements.compNameTable.getText(),"Computer name");
//       Assert.assertEquals(databaseElements.introducedTable.getText(),"Introduced");
//        Assert.assertEquals(databaseElements.discontedTable.getText(),"Discontinued");
//        Assert.assertEquals(databaseElements.companyTable.getText(),"Company");
//
//    }
//}