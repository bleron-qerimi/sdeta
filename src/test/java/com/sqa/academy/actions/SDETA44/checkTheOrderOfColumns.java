package com.sqa.academy.actions.SDETA44;
import com.sqa.academy.actions.Hooks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkTheOrderOfColumns extends Hooks {

    @Test
    public void checkTheOrderOfColumns() throws Exception{
        List<WebElement> arrangedButtons=driver.findElements(By.xpath("//*[@id=\"main\"]/table/thead/tr/th/a"));
        System.out.println("There are "+arrangedButtons.size()+" arranged like below:");

      //  List<String> expected = Arrays.asList("fee", "fi", "foe");

        for(WebElement row:arrangedButtons){
            System.out.println(row.getText());
        }
    }
}
