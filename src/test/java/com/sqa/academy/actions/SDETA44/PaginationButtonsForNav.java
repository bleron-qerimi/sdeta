//package com.sqa.academy.actions.SDETA44;
//import com.sqa.academy.actions.GeneralSteps;
//import com.sqa.academy.actions.Hooks;
//import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
//import com.sqa.academy.utils.ConfigurationReader;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class PaginationButtonsForNav extends Hooks {
//
//    @Test
//    public void getCoordinates() throws Exception {
//        //go to the enviornment
//        GeneralSteps.gotToEnv("Computer");
//        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);
//        //check the order of the buttons
//        Point points=databaseElements.paginBtn.getLocation();
//        int x=points.getX();
//
//        Assert.assertTrue(databaseElements.nxtBtn.getLocation().getX()<databaseElements.dispBtn.getLocation().getX());
//        Assert.assertTrue(databaseElements.dispBtn.getLocation().getX()<databaseElements.prevBtn.getLocation().getX());
//
//   }
//}
