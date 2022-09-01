//package com.sqa.academy.actions.SDETA44;
//import com.sqa.academy.actions.GeneralSteps;
//import com.sqa.academy.actions.Hooks;
//
//
//import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
//import org.openqa.selenium.WebElement;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class CheckTheOrderOfColumns extends Hooks {
//
//    @Test
//    public void checkTheOrderOfColumns() throws Exception{
//        //Navigate to the environment
//        GeneralSteps.gotToEnv("Computer");
//        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);
//        //The user should be able to see the columns listed as in the expected array
//        List<String> expected = Arrays.asList("Computer name", "Introduced", "Discontinued","Company");
//        List<WebElement>arrangedButtons=databaseElements.arrangedButtons;
//
//        int i=0;
//        for(WebElement row:arrangedButtons){
//            Assert.assertEquals(row.getText(),expected.get(i));
//            i++;
//        }
//    }
//}
