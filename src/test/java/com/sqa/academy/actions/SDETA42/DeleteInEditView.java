package com.sqa.academy.actions.SDETA42;
import com.sqa.academy.actions.GeneralSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.computerDatabase.ComputerDatabaseElements;
import org.testng.annotations.Test;

public class DeleteInEditView extends Hooks{

    ComputerDatabaseElements objdeleteInEditViewPage;
    @Test
    public void deletebtn() throws Exception {
        GeneralSteps.gotToEnv("Computer");
        ComputerDatabaseElements databaseElements=new ComputerDatabaseElements(driver);

        objdeleteInEditViewPage= new ComputerDatabaseElements(driver);
        objdeleteInEditViewPage.clickOnFirstPage();
        objdeleteInEditViewPage.clickOnEditPage();


//        WebElement firstPage=driver.findElement(By.xpath("//td/a"));
//        Thread.sleep(1000);
//        firstPage.click();
//        Thread.sleep(1000);
//
//        WebElement editView=driver.findElement(By.xpath("//*[@id=\"main\"]/form[2]/input"));
//        Thread.sleep(1000);
//        editView.click();
//        Thread.sleep(3000);



    }
}
