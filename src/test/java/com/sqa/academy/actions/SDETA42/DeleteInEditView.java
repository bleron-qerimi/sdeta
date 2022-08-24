package com.sqa.academy.actions.SDETA42;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.EditViewPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class DeleteInEditView extends Hooks{

    EditViewPage objdeleteInEditViewPage;
    @Test
    public void X() throws Exception {
        String url= ConfigurationReader.get("url");
        driver.get(url);
        objdeleteInEditViewPage= new EditViewPage(driver);
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
