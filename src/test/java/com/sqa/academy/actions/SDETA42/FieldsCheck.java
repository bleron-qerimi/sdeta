package com.sqa.academy.actions.SDETA42;
import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FieldsCheck extends Hooks {
    @Test
    public void fieldsCheck() throws Exception {
//      go to the environment
        GeneralSteps.gotToEnv("Computer");
        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);

        WebElement firstPage = driver.findElement(By.xpath("//td/a"));
        Thread.sleep(1000);
        firstPage.click();
        Thread.sleep(1000);

//        Boolean compName = driver.findElement(By.xpath("//input[ @type=\"text\"]")).isEnabled();
//        if (compName == true) {
//            System.out.println("Computer Name element is present");
//        } else {
//            System.out.println("Computer Name element is not present");
//        }
//
//        Boolean introduced = driver.findElement(By.xpath("//*[@id=\"introduced\"]")).isEnabled();
//        if (introduced == true) {
//            System.out.println("Introduced element is present");
//        } else {
//            System.out.println("Introduced element is not present");
//        }
//
//        Boolean discontinued = driver.findElement(By.xpath("//*[@id=\"discontinued\"]")).isEnabled();
//        if (discontinued == true) {
//            System.out.println("Discontinued element is present");
//        } else {
//            System.out.println("Discontinued element is not present");
//        }
//
//        Boolean company = driver.findElement(By.xpath("//*[@id=\"company\"]")).isEnabled();
//        if (company == true) {
//            System.out.println("Company element is present");
//        } else {
//            System.out.println("Company element is not present");
//        }

        boolean compName = driver.findElement(By.xpath("//input[ @type=\"text\"]")).isEnabled();
        Assert.assertEquals(compName,true);
        boolean introduced = driver.findElement(By.xpath("//*[@id=\"introduced\"]")).isEnabled();
        Assert.assertEquals(introduced,true);
        boolean discontinued = driver.findElement(By.xpath("//*[@id=\"discontinued\"]")).isEnabled();
        Assert.assertEquals(discontinued,true);
        boolean company = driver.findElement(By.xpath("//*[@id=\"company\"]")).isEnabled();
        Assert.assertEquals(company,true);

//if they have the same path
//        int count = driver.findElements(By.xpath("input[type=\"text\"]")).size();

//        for (int i=1; i <= count; i++){
//            WebElement element = driver.findElement(By.xpath("(input[type=\"text\"])[i]"));
//            if (element.isEnabled()){
//                System.out.println("This element is enabled");
//            }
//            else{
//                System.out.println("This element is disabled");
//            }
//        }
    }
}