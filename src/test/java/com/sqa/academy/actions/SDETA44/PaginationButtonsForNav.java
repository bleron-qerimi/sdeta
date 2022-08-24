package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PaginationButtonsForNav extends Hooks {

    @Test
    public void getCoordinates() throws Exception {
        GeneralSteps.gotToEnv("Computer");
        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);


        WebElement coordinates=driver.findElement(By.xpath("//*[@id=\"pagination\"]/ul"));
        Point points=coordinates.getLocation();
        int x=points.getX();

        System.out.println("Buttons are arranged under the table with these coordinates :"+x+", ");


        WebElement prevBtn =driver.findElement(By.xpath("//a[contains(text(), 'Previous')]"));

        WebElement dispBtn =driver.findElement(By.xpath("//a[contains(text(), 'Displaying')]"));

        WebElement nxtBtn =driver.findElement(By.xpath("//a[contains(text(), 'Next')]"));
        //System.out.println("Buttons arranged from left to right: "+arrangedButtons.size());

        Assert.assertTrue(nxtBtn.getLocation().getX()<dispBtn.getLocation().getX());
        Assert.assertTrue(dispBtn.getLocation().getX()<prevBtn.getLocation().getX());




    }
}
