package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PaginationButtonsForNav extends Hooks {

    @Test
    public void getCoordinates() throws Exception {
        String url= ConfigurationReader.get("url");
        driver.get(url);
        Thread.sleep(1000);

        WebElement coordinates=driver.findElement(By.xpath("//*[@id=\"pagination\"]/ul"));
        Point points=coordinates.getLocation();
        int x=points.getX();
        int y=points.getY();
        System.out.println("Buttons are arranged under the table with these coordinates :"+x+", "+y);


        List<WebElement> arrangedButtons=driver.findElements(By.xpath("//*[@id=\"pagination\"]/ul/li/a"));
        System.out.println("Buttons arranged from left to right: "+arrangedButtons.size());

        for(WebElement row:arrangedButtons){
            System.out.println("Button: "+row.getText());
        }
    }
}
